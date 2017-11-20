package com.sortdemo.inputprocessing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sortdemo.inputprocessing.service.InputGenerationService;

/**
 * The Class InputDataController.
 */
@RestController
@RequestMapping("/api/v1/")
public class InputDataController {
 
 /** The input generation service. */
 @Autowired
 private InputGenerationService inputGenerationService;
  
 /**
  * Generate random numbers.
  *
  * @param numbersToGenerate the numbers to generate
  * @return the response entity
  */
 @RequestMapping(value = "generateRandomNumbers/{numbersToGenerate}", method = RequestMethod.GET)
   public ResponseEntity<Object> generateRandomNumbers(@PathVariable("numbersToGenerate") String numbersToGenerate) {
    
    List<Integer>  result = inputGenerationService.generateRandomNumbers(Integer.parseInt(numbersToGenerate));
     return new ResponseEntity<Object>(result, HttpStatus.OK);
  }
 
}
