package com.acme.sorting.dto;

import java.util.Arrays;
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
	 * @param timeTakenInMilliSeconds
	 *            the new time taken in milli seconds
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
	 * @param data
	 *            the new data
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
	 * @param swapTracker
	 *            the swap tracker
	 */
	public void setSwapTracker(HashMap<Integer, Integer> swapTracker) {
		this.swapTracker = swapTracker;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(data);
		result = prime * result + ((swapTracker == null) ? 0 : swapTracker.hashCode());
		result = prime * result + ((timeTakenInMilliSeconds == null) ? 0 : timeTakenInMilliSeconds.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SortingOutputDTO other = (SortingOutputDTO) obj;
		if (!Arrays.equals(data, other.data))
			return false;
		if (swapTracker == null) {
			if (other.swapTracker != null)
				return false;
		} else if (!swapTracker.equals(other.swapTracker))
			return false;
		if (timeTakenInMilliSeconds == null) {
			if (other.timeTakenInMilliSeconds != null)
				return false;
		} else if (!timeTakenInMilliSeconds.equals(other.timeTakenInMilliSeconds))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("SortingOutputDTO [data=%s, swapTracker=%s, timeTakenInMilliSeconds=%s]",
				Arrays.toString(data), swapTracker, timeTakenInMilliSeconds);
	}

}
