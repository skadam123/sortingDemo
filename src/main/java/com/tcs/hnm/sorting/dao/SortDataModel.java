package com.tcs.hnm.sorting.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Class SortDataModel.
 */
@Entity
public class SortDataModel {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** The orignal input. */
	@Column(length = 5000)
	private String orignalInput;

	/** The time taken to sort. */
	@Column(length = 5000)
	private String timeTakenToSort;

	/** The sorted array. */
	@Column(length = 5000)
	private String sortedArray;

	/** The swap tracking. */
	@Column(length = 5000)
	private String swapTracking;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"SortDataModel [id=%s, orignalInput=%s, timeTakenToSort=%s, sortedArray=%s, swapTracking=%s]", id,
				orignalInput, timeTakenToSort, sortedArray, swapTracking);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orignalInput == null) ? 0 : orignalInput.hashCode());
		result = prime * result + ((sortedArray == null) ? 0 : sortedArray.hashCode());
		result = prime * result + ((swapTracking == null) ? 0 : swapTracking.hashCode());
		result = prime * result + ((timeTakenToSort == null) ? 0 : timeTakenToSort.hashCode());
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
		SortDataModel other = (SortDataModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
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

}
