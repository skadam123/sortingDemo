package hello.sorting.service;

import hello.sorting.dto.HistoryDTO;
import hello.sorting.dto.SortingOutputDTO;

public interface SortService {

  public SortingOutputDTO selectionSort(Integer[] arrayToSort);
  
  public HistoryDTO generateHistory();
  
  
}
