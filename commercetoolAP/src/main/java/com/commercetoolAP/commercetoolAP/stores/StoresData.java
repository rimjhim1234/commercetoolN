package com.commercetoolAP.commercetoolAP.stores;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.ProductSelectionSettingDraft;
import com.commercetools.api.models.store_country.StoreCountry;
import com.commercetools.api.models.type.CustomFieldsDraft;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoresData {

    public String key;

    public String name;
    public String countries;
    public String languages;
    public String distributionChannelsID;
    public String supplyChannelsID;

}
