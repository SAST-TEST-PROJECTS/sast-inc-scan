package io.mend.analysis.repo.test.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Model1 {

    public void logUserInput(String userInput){
        log.info("userInput= {}", userInput);
    }

}
