package com.sortdemo.sorting.service;

import com.sortdemo.sorting.dto.HistoryDTO;
import com.sortdemo.sorting.dto.SortingOutputDTO;

/**
 * The Interface SortService.
 */
public interface SortService {

	/**
	 * Selection sort.
	 *
	 * @param arrayToSort
	 *            the array to sort
	 * @return the sorting output DTO
	 */
	public SortingOutputDTO selectionSort(Integer[] arrayToSort);

	/**
	 * Generate history.
	 *
	 * @return the history DTO
	 */
	public HistoryDTO generateHistory();

}
