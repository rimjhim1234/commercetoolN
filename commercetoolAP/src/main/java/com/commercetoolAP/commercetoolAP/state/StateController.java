package com.commercetoolAP.commercetoolAP.state;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.state.StatePagedQueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commercetools.api.models.state.State;

@RestController
public class StateController {
   @Autowired
   ProjectApiRoot apiRoot;
   @Autowired
    StateService stateService;
   @PostMapping("/state")
    public State createstate(@RequestBody StateData stateData){
       return stateService.createstate(stateData);
    }
}
