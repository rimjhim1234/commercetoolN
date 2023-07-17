package com.commercetoolAP.commercetoolAP.channel;

import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelDraft;
import com.commercetools.api.models.common.LocalizedString;
import org.springframework.stereotype.Service;

@Service
public class ChannelService {

    ChannelDataProvider obc=new ChannelDataProvider();
   public Channel createchannel(ChannelData channelData) {
      ChannelDraft channelDraft=ChannelDraft
              .builder()
              .key(channelData.getKey())
              .name(LocalizedString.ofEnglish(channelData.getName()))
              .description(LocalizedString.ofEnglish(channelData.getDiscription()))
               .build();
       return obc.createchannel(channelDraft);
   }
}
