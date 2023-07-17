package com.commercetoolAP.commercetoolAP.state;
import com.commercetools.api.models.state.State;
import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.state.StateDraft;
import org.springframework.web.bind.annotation.RequestBody;



public class StateDataProvider {
    ProjectApiRoot apiRoot= Client.createApiClient();
    public State createstate(StateDraft stateDraft) {
        return apiRoot.states().post(stateDraft).executeBlocking().getBody();
    }
}
