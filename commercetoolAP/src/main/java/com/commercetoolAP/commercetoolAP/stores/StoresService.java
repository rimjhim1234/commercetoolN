package com.commercetoolAP.commercetoolAP.stores;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreDraft;
import org.springframework.stereotype.Service;
@Service
public class StoresService {

    StoresDataProvider obc=new StoresDataProvider();
    public Store createstore(StoresData storesData) {
        StoreDraft storeDraft= StoreDraft
                .builder()
                .name(LocalizedString.ofEnglish(storesData.getName()))
                .key(storesData.getKey())
                .languages(storesData.getLanguages())
                .distributionChannels(ChannelResourceIdentifier.builder().id(storesData.getDistributionChannelsID()).build())
                .supplyChannels(ChannelResourceIdentifier.builder().id(storesData.getSupplyChannelsID()).build())
                .build();
        return obc.createstore(storeDraft);
    }
}
