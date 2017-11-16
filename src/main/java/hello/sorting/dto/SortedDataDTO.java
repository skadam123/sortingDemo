package hello.sorting.dto;

public class SortedDataDTO {

 private String orignalInput;
  
  /** The time taken to sort. */
  private String timeTakenToSort;
  
  /** The sorted array. */
  private String sortedArray;
  
  /** The swap tracking. */
  private String swapTracking;

  public String getOrignalInput() {
    return orignalInput;
  }

  public void setOrignalInput(String orignalInput) {
    this.orignalInput = orignalInput;
  }

  public String getTimeTakenToSort() {
    return timeTakenToSort;
  }

  public void setTimeTakenToSort(String timeTakenToSort) {
    this.timeTakenToSort = timeTakenToSort;
  }

  public String getSortedArray() {
    return sortedArray;
  }

  public void setSortedArray(String sortedArray) {
    this.sortedArray = sortedArray;
  }

  public String getSwapTracking() {
    return swapTracking;
  }

  public void setSwapTracking(String swapTracking) {
    this.swapTracking = swapTracking;
  }
  
  
}
