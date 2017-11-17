/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.acme;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.acme.Application;
import com.acme.inputprocessing.exceptions.InvalidInputException;
import com.acme.inputprocessing.service.InputGenerationService;

/**
 * The Class GreetingControllerTests.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class InputDataServiceTests {

	/** The input generation service. */
	@Autowired
	private InputGenerationService inputGenerationService;

	/**
	 * Test random number generation.
	 */
	@Test
	public void testRandomNumberGeneration() {
		List<Integer> randomNumbers = inputGenerationService.generateRandomNumbers(5);
		Assert.assertTrue(randomNumbers.size() == 5);
	}

	/**
	 * Test random number generation upper limit.
	 */
	@Test(expected = InvalidInputException.class)
	public void testRandomNumberGenerationUpperLimit() {

		List<Integer> randomNumbers = inputGenerationService
				.generateRandomNumbers(inputGenerationService.MAX_RANDOM_NUMBER + 1);

	}

}
