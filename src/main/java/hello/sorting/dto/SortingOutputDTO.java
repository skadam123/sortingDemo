package hello.sorting.dto;

import java.util.HashMap;


/**
 * The Class SortingOutputDTO.
 */
public class SortingOutputDTO {

  
  /** The data. */
  private Integer data[];
  
  /** The swap tracker. */
  private HashMap<Integer, Integer> swapTracker;
  
  /** The time taken in milli seconds. */
  private Long timeTakenInMilliSeconds;

  /**
   * Gets the time taken in milli seconds.
   *
   * @return the time taken in milli seconds
   */
  public Long getTimeTakenInMilliSeconds() {
    return timeTakenInMilliSeconds;
  }

  /**
   * Sets the time taken in milli seconds.
   *
   * @param timeTakenInMilliSeconds the new time taken in milli seconds
   */
  public void setTimeTakenInMilliSeconds(Long timeTakenInMilliSeconds) {
    this.timeTakenInMilliSeconds = timeTakenInMilliSeconds;
  }

  /**
   * Gets the data.
   *
   * @return the data
   */
  public Integer[] getData() {
    return data;
  }

  /**
   * Sets the data.
   *
   * @param data the new data
   */
  public void setData(Integer[] data) {
    this.data = data;
  }

  /**
   * Gets the swap tracker.
   *
   * @return the swap tracker
   */
  public HashMap<Integer, Integer> getSwapTracker() {
    return swapTracker;
  }

  /**
   * Sets the swap tracker.
   *
   * @param swapTracker the swap tracker
   */
  public void setSwapTracker(HashMap<Integer, Integer> swapTracker) {
    this.swapTracker = swapTracker;
  }
  
  
}
