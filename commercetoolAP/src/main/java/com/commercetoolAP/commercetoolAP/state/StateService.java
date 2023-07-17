package com.commercetoolAP.commercetoolAP.state;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.AttributeEnumType;
import com.commercetools.api.models.state.StateDraft;
import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateTypeEnum;
import org.springframework.stereotype.Service;

import com.commercetools.api.models.state.State;

@Service
public class StateService {
    StateDataProvider obc = new StateDataProvider();
   public  State createstate(StateData stateData) {
        StateDraft stateDraft=StateDraft
                .builder()
                .key(stateData.getKey())
                .type(stateData.getType())
               // .roles(stateData.)
                .name(LocalizedString.ofEnglish(stateData.getName()))
                .build();

        return obc.createstate(stateDraft);
   }
}