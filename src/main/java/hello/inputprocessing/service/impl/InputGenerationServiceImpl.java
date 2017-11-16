package hello.inputprocessing.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hello.inputprocessing.service.InputGenerationService;

@Service
public class InputGenerationServiceImpl implements InputGenerationService{

  public static final int MAX_RANDOM_NUMBER = 500; 
  @Override
  public List<Integer> generateRandomNumbers(int numbersToGenerate) {
    List<Integer> randomNumbers = new ArrayList<Integer>(numbersToGenerate);
    for(int i=0;i<numbersToGenerate;i++) {
        randomNumbers.add((int )(Math.random() * MAX_RANDOM_NUMBER + 1));
    }
    return randomNumbers;
  }

}
