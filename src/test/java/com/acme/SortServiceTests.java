package com.acme;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.acme.Application;
import com.acme.sorting.dto.SortingOutputDTO;
import com.acme.sorting.service.SortService;


/**
 * The Class SortServiceTests.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class SortServiceTests {

	/** The sort service. */
	@Autowired
	private SortService sortService;
	
	/**
	 * Test sorting.
	 */
	@Test
	public void testSorting() {
		Integer []arrayToSort = new Integer[5];
		arrayToSort[0] = 12;
		arrayToSort[1] = 1;
		arrayToSort[2] = 11;
		arrayToSort[3] = 17;
		arrayToSort[4] = 14;
		
		Integer [] sortedArray = new Integer[5];
		sortedArray[0] = 1;
		sortedArray[1] = 11;
		sortedArray[2] = 12;
		sortedArray[3] = 14;
		sortedArray[4] = 17;
		
		SortingOutputDTO dto = sortService.selectionSort(arrayToSort);
		Assert.assertArrayEquals(sortedArray, dto.getData());
	}
}
