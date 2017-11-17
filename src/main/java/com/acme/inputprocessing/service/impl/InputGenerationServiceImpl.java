package com.acme.inputprocessing.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acme.inputprocessing.exceptions.InvalidInputException;
import com.acme.inputprocessing.service.InputGenerationService;

/**
 * The Class InputGenerationServiceImpl.
 */
@Service
public class InputGenerationServiceImpl implements InputGenerationService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.acme.inputprocessing.service.InputGenerationService#
	 * generateRandomNumbers(int)
	 */
	@Override
	public List<Integer> generateRandomNumbers(int numbersToGenerate) {
		if(numbersToGenerate > MAX_RANDOM_NUMBER) {
			throw new InvalidInputException("Numbers to generate can't be more than "+ MAX_RANDOM_NUMBER);
		}
		List<Integer> randomNumbers = new ArrayList<Integer>(numbersToGenerate);
		for (int i = 0; i < numbersToGenerate; i++) {
			randomNumbers.add((int) (Math.random() * MAX_RANDOM_NUMBER + 1));
		}
		return randomNumbers;
	}

}
