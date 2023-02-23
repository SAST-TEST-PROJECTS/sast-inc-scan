package io.mend.analysis.repo.test.service;

import io.mend.analysis.repo.test.model.Model1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

    @Autowired private Model1 model1;

    public void logUserInput(String userInput){
        model1.logUserInput(userInput);
    }

}
