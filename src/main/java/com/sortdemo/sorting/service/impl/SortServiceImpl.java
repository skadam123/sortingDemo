package com.sortdemo.sorting.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sortdemo.sorting.dao.SortDataModel;
import com.sortdemo.sorting.dto.HistoryDTO;
import com.sortdemo.sorting.dto.SortedDataDTO;
import com.sortdemo.sorting.dto.SortingOutputDTO;
import com.sortdemo.sorting.repository.SortDataRepository;
import com.sortdemo.sorting.service.SortService;

/**
 * The Class SortServiceImpl.
 */
@Service
public class SortServiceImpl implements SortService {

	/** The sort data repository. */
	@Autowired
	private SortDataRepository sortDataRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.acme.sorting.service.SortService#selectionSort(java.lang.Integer[])
	 */
	@Override
	@Transactional
	public SortingOutputDTO selectionSort(Integer[] arrayToSort) {

		HashMap<Integer, Integer> swapTracker = new HashMap<Integer, Integer>();

		Long startTime = System.currentTimeMillis();
		startTime = TimeUnit.MILLISECONDS.toMicros(startTime);
		Integer index[] = new Integer[1];

	    IntStream.range(0, arrayToSort.length - 1).forEach(x -> {
	      index[0] = x;
	      IntStream.range(x + 1, arrayToSort.length).forEach(y -> {
	        if (arrayToSort[y] < arrayToSort[index[0]]) {
	          index[0] = y;
	        }
	      });

	      int smallerNumber = arrayToSort[index[0]];
	      arrayToSort[index[0]] = arrayToSort[x];
	      arrayToSort[x] = smallerNumber;

	      if (swapTracker.get(smallerNumber) != null) {
	        swapTracker.put(smallerNumber, swapTracker.get(smallerNumber) + 1);
	      } else {
	        swapTracker.put(smallerNumber, new Integer(1));
	      }
	      if (swapTracker.get(arrayToSort[index[0]]) != null) {
	        swapTracker.put(arrayToSort[index[0]], swapTracker.get(arrayToSort[index[0]]) + 1);
	      } else {
	        swapTracker.put(arrayToSort[index[0]], new Integer(1));
	      }
	    });
		// non swapped numbers
		List<Integer> originalList = new LinkedList<Integer>(Arrays.asList(arrayToSort));
		originalList.removeAll(swapTracker.keySet());
		originalList.stream().forEach(x-> swapTracker.put(x,new Integer(0)));
		
		Long endTime = System.currentTimeMillis();
		endTime = TimeUnit.MILLISECONDS.toMicros(endTime);

		Long timeToSort = endTime - startTime;

		SortingOutputDTO dto = new SortingOutputDTO();
		dto.setTimeTakenInMilliSeconds(timeToSort);
		dto.setData(arrayToSort);
		dto.setSwapTracker(swapTracker);
		persistData(arrayToSort, dto);
		return dto;

	}

	/**
	 * Persist data.
	 *
	 * @param arr
	 *            the arr
	 * @param dto
	 *            the dto
	 */
	private void persistData(Integer[] arr, SortingOutputDTO dto) {
		SortDataModel model = new SortDataModel();
		model.setOrignalInput(Arrays.toString(arr));
		model.setSortedArray(Arrays.toString(dto.getData()));
		model.setSwapTracking(dto.getSwapTracker().toString());
		model.setTimeTakenToSort(dto.getTimeTakenInMilliSeconds().toString());
		sortDataRepository.save(model);
	}

	/**
	 * Gets the all saved data.
	 *
	 * @return the all saved data
	 */
	private List<SortDataModel> getAllSavedData() {
		List<SortDataModel> allRecords = sortDataRepository.findAll();
		return allRecords;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acme.sorting.service.SortService#generateHistory()
	 */
	@Override
	public HistoryDTO generateHistory() {
		List<SortDataModel> modelList = getAllSavedData();
		List<SortedDataDTO> sortedDataList = new ArrayList<SortedDataDTO>(modelList.size());
		modelList.stream().forEach(model->{
			SortedDataDTO dto = new SortedDataDTO();
			BeanUtils.copyProperties(model, dto);
			sortedDataList.add(dto);
		});
		/*for (SortDataModel model : modelList) {
			SortedDataDTO dto = new SortedDataDTO();
			BeanUtils.copyProperties(model, dto);
			sortedDataList.add(dto);
		}*/
		HistoryDTO hitoryDTO = new HistoryDTO();
		hitoryDTO.setSortedList(sortedDataList);
		return hitoryDTO;
	}

}
