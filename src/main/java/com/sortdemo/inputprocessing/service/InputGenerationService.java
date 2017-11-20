package com.sortdemo.inputprocessing.service;

import java.util.List;

/**
 * The Interface InputGenerationService.
 */
public interface InputGenerationService {

	/** The Constant MAX_RANDOM_NUMBER. */
	public static final int MAX_RANDOM_NUMBER = 500;

  /**
   * Generate random numbers.
   *
   * @param numbersToGenerate the numbers to generate
   * @return the list
   */
  public List<Integer> generateRandomNumbers(int numbersToGenerate);
  
}
