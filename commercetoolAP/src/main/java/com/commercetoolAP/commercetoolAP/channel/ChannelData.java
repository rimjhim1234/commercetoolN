package com.commercetoolAP.commercetoolAP.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.common.LocalizedString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChannelData {

     public String key;
    public String name;
    public String discription;

}
