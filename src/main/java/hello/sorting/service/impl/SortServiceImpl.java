package hello.sorting.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.sorting.dao.SortDataModel;
import hello.sorting.dto.HistoryDTO;
import hello.sorting.dto.SortedDataDTO;
import hello.sorting.dto.SortingOutputDTO;
import hello.sorting.repository.SortDataRepository;
import hello.sorting.service.SortService;

@Service
public class SortServiceImpl implements SortService {
 
  @Autowired
  private SortDataRepository sortDataRepository;

  @Override
  @Transactional
  public SortingOutputDTO selectionSort(Integer[] arrayToSort) {


    HashMap<Integer, Integer> swapTracker = new HashMap<Integer, Integer>();

    Long startTime = System.currentTimeMillis();
    startTime = TimeUnit.MILLISECONDS.toMicros(startTime);

    for (int i = 0; i < arrayToSort.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arrayToSort.length; j++) {
        if (arrayToSort[j] < arrayToSort[index]) {
          index = j;
        }
      }

      int smallerNumber = arrayToSort[index];
      arrayToSort[index] = arrayToSort[i];
      arrayToSort[i] = smallerNumber;

      if (swapTracker.get(smallerNumber) != null) {
        swapTracker.put(smallerNumber, swapTracker.get(smallerNumber) + 1);
      } else {
        swapTracker.put(smallerNumber, new Integer(1));
      }
      if (swapTracker.get(arrayToSort[index]) != null) {
        swapTracker.put(arrayToSort[index], swapTracker.get(arrayToSort[index]) + 1);
      } else {
        swapTracker.put(arrayToSort[index], new Integer(1));
      }


    }
    // non swapped numbers
    List<Integer> originalList = new LinkedList<Integer>(Arrays.asList(arrayToSort));
    originalList.removeAll(swapTracker.keySet());
    for (Integer nonswapped : originalList) {
      swapTracker.put(nonswapped, new Integer(0));
    }
    Long endTime = System.currentTimeMillis();
    endTime = TimeUnit.MILLISECONDS.toMicros(endTime);

    Long timeToSort = endTime - startTime;


    SortingOutputDTO dto = new SortingOutputDTO();
    dto.setTimeTakenInMilliSeconds(timeToSort);
    dto.setData(arrayToSort);
    dto.setSwapTracker(swapTracker);
    persistData(arrayToSort, dto);
    
    System.out.println(getAllSavedData());

    return dto;

  }

  private void persistData(Integer[] arr, SortingOutputDTO dto) {
    SortDataModel model = new SortDataModel();
    model.setOrignalInput(Arrays.toString(arr));
    model.setSortedArray(Arrays.toString(dto.getData()));
    model.setSwapTracking(dto.getSwapTracker().toString());
    model.setTimeTakenToSort(dto.getTimeTakenInMilliSeconds().toString());
    sortDataRepository.save(model);
  }
  
  private List <SortDataModel> getAllSavedData(){
    List <SortDataModel> allRecords =  sortDataRepository.findAll();
    return allRecords;
  }

  @Override
  public HistoryDTO generateHistory() {
      List<SortDataModel> modelList = getAllSavedData();
      List<SortedDataDTO> sortedDataList = new ArrayList<SortedDataDTO>(modelList.size());  
      for (SortDataModel model : modelList) {
        SortedDataDTO dto = new SortedDataDTO();
        BeanUtils.copyProperties(model, dto);
        sortedDataList.add(dto);
      }
      HistoryDTO hitoryDTO = new HistoryDTO();
      hitoryDTO.setSortedList(sortedDataList);
      return hitoryDTO;
  }


}
