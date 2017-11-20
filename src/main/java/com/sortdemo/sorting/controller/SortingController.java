package com.sortdemo.sorting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sortdemo.sorting.dto.HistoryDTO;
import com.sortdemo.sorting.dto.InputNumbersDTO;
import com.sortdemo.sorting.dto.SortingOutputDTO;
import com.sortdemo.sorting.service.SortService;

/**
 * The Class SortingController.
 */
@RestController
@RequestMapping("/api/v1/")
public class SortingController {

	/** The sort service. */
	@Autowired
	private SortService sortService;

	/**
	 * Generate random numbers.
	 *
	 * @param dto
	 *            the dto
	 * @return the response entity
	 */
	@RequestMapping(value = "sortNumbers", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")
	public ResponseEntity<Object> generateRandomNumbers(@RequestBody InputNumbersDTO dto) {

		SortingOutputDTO outPutDTO = sortService.selectionSort(dto.getData());

		return new ResponseEntity<Object>(outPutDTO, HttpStatus.OK);

	}

	/**
	 * Generate history.
	 *
	 * @return the response entity
	 */
	@RequestMapping(value = "history", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
	public ResponseEntity<Object> generateHistory() {

		HistoryDTO historyDTO = sortService.generateHistory();

		return new ResponseEntity<Object>(historyDTO, HttpStatus.OK);

	}

}
