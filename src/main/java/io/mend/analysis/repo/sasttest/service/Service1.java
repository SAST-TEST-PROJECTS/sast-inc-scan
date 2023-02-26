package io.mend.analysis.repo.sasttest.service;

import io.mend.analysis.repo.sasttest.model.Model2;
import io.mend.analysis.repo.sasttest.model.Model1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

    @Autowired private Model1 model1;
    @Autowired private Model2 model2;

    public String logInfoUserInput(String userInput){
        return model1.logInfoUserInput(userInput);
    }

    public String logDebugUserInput(String userInput){
        return model2.logDebugUserInput(userInput);
    }

}
