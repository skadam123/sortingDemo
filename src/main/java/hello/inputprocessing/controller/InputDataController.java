package hello.inputprocessing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.inputprocessing.service.InputGenerationService;

@RestController
@RequestMapping("/api/v1/")
public class InputDataController {
 
 @Autowired
 private InputGenerationService inputGenerationService;
  
 @RequestMapping(value = "generateRandomNumbers/{numbersToGenerate}", method = RequestMethod.GET)
   public ResponseEntity<Object> generateRandomNumbers(@PathVariable("numbersToGenerate") String numbersToGenerate) {
    
    List<Integer>  result = inputGenerationService.generateRandomNumbers(Integer.parseInt(numbersToGenerate));
     return new ResponseEntity<Object>(result, HttpStatus.OK);
  }
 
}
