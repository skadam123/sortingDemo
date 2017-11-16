package hello.sorting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hello.sorting.dto.HistoryDTO;
import hello.sorting.dto.InputNumbersDTO;
import hello.sorting.dto.SortingOutputDTO;
import hello.sorting.service.SortService;

@RestController
@RequestMapping("/api/v1/")
public class SortingController {

  @Autowired
  private SortService sortService;
  
  @RequestMapping(value = "sortNumbers", method = RequestMethod.POST, headers = "Accept=application/json",
      produces = "application/json")
  public ResponseEntity<Object> generateRandomNumbers(@RequestBody InputNumbersDTO dto ) {
   
    SortingOutputDTO outPutDTO = sortService.selectionSort(dto.getData());
    
    return new ResponseEntity<Object>(outPutDTO,HttpStatus.OK);
  
 }
  

  @RequestMapping(value = "history", method = RequestMethod.GET, headers = "Accept=application/json",
      produces = "application/json")
  public ResponseEntity<Object> generateHistory( ) {
   
    HistoryDTO historyDTO = sortService.generateHistory();
    
    return new ResponseEntity<Object>(historyDTO,HttpStatus.OK);
  
 }
  
}
