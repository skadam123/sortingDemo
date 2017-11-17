package com.tcs.hnm.sorting.dto;

import java.util.List;

/**
 * The Class HistoryDTO.
 */
public class HistoryDTO {

	/** The sorted list. */
	private List<SortedDataDTO> sortedList;

	/**
	 * Gets the sorted list.
	 *
	 * @return the sorted list
	 */
	public List<SortedDataDTO> getSortedList() {
		return sortedList;
	}

	/**
	 * Sets the sorted list.
	 *
	 * @param sortedList
	 *            the new sorted list
	 */
	public void setSortedList(List<SortedDataDTO> sortedList) {
		this.sortedList = sortedList;
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
		result = prime * result + ((sortedList == null) ? 0 : sortedList.hashCode());
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
		HistoryDTO other = (HistoryDTO) obj;
		if (sortedList == null) {
			if (other.sortedList != null)
				return false;
		} else if (!sortedList.equals(other.sortedList))
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
		return String.format("HistoryDTO [sortedList=%s]", sortedList);
	}

}
