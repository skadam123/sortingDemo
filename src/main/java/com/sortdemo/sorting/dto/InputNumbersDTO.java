package com.acme.sorting.dto;

import java.util.Arrays;

/**
 * The Class InputNumbersDTO.
 */
 public class InputNumbersDTO {

	/** The data. */
	private Integer data[];

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(data);
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
		InputNumbersDTO other = (InputNumbersDTO) obj;
		if (!Arrays.equals(data, other.data))
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
		return String.format("InputNumbersDTO [data=%s]", Arrays.toString(data));
	}

}
