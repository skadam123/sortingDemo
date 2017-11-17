package com.acme.sorting.dto;

/**
 * The Class SortedDataDTO.
 */
public class SortedDataDTO {

	/** The orignal input. */
	private String orignalInput;

	/** The time taken to sort. */
	private String timeTakenToSort;

	/** The sorted array. */
	private String sortedArray;

	/** The swap tracking. */
	private String swapTracking;

	/**
	 * Gets the orignal input.
	 *
	 * @return the orignal input
	 */
	public String getOrignalInput() {
		return orignalInput;
	}

	/**
	 * Sets the orignal input.
	 *
	 * @param orignalInput
	 *            the new orignal input
	 */
	public void setOrignalInput(String orignalInput) {
		this.orignalInput = orignalInput;
	}

	/**
	 * Gets the time taken to sort.
	 *
	 * @return the time taken to sort
	 */
	public String getTimeTakenToSort() {
		return timeTakenToSort;
	}

	/**
	 * Sets the time taken to sort.
	 *
	 * @param timeTakenToSort
	 *            the new time taken to sort
	 */
	public void setTimeTakenToSort(String timeTakenToSort) {
		this.timeTakenToSort = timeTakenToSort;
	}

	/**
	 * Gets the sorted array.
	 *
	 * @return the sorted array
	 */
	public String getSortedArray() {
		return sortedArray;
	}

	/**
	 * Sets the sorted array.
	 *
	 * @param sortedArray
	 *            the new sorted array
	 */
	public void setSortedArray(String sortedArray) {
		this.sortedArray = sortedArray;
	}

	/**
	 * Gets the swap tracking.
	 *
	 * @return the swap tracking
	 */
	public String getSwapTracking() {
		return swapTracking;
	}

	/**
	 * Sets the swap tracking.
	 *
	 * @param swapTracking
	 *            the new swap tracking
	 */
	public void setSwapTracking(String swapTracking) {
		this.swapTracking = swapTracking;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orignalInput == null) ? 0 : orignalInput.hashCode());
		result = prime * result + ((sortedArray == null) ? 0 : sortedArray.hashCode());
		result = prime * result + ((swapTracking == null) ? 0 : swapTracking.hashCode());
		result = prime * result + ((timeTakenToSort == null) ? 0 : timeTakenToSort.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		SortedDataDTO other = (SortedDataDTO) obj;
		if (orignalInput == null) {
			if (other.orignalInput != null)
				return false;
		} else if (!orignalInput.equals(other.orignalInput))
			return false;
		if (sortedArray == null) {
			if (other.sortedArray != null)
				return false;
		} else if (!sortedArray.equals(other.sortedArray))
			return false;
		if (swapTracking == null) {
			if (other.swapTracking != null)
				return false;
		} else if (!swapTracking.equals(other.swapTracking))
			return false;
		if (timeTakenToSort == null) {
			if (other.timeTakenToSort != null)
				return false;
		} else if (!timeTakenToSort.equals(other.timeTakenToSort))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("SortedDataDTO [orignalInput=%s, timeTakenToSort=%s, sortedArray=%s, swapTracking=%s]",
				orignalInput, timeTakenToSort, sortedArray, swapTracking);
	}

}
