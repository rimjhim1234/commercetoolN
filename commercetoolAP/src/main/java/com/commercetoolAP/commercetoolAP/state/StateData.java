package com.commercetoolAP.commercetoolAP.state;

import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
     public class StateData {

     public String key;

     public StateTypeEnum type;
     public String initial;

     public String name;

}
