package com.commercetoolAP.commercetoolAP.channel;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController {
    @Autowired
    ChannelService channelService;
    @Autowired
    ProjectApiRoot projectApiRoot;
   @PostMapping ("/channel")
    public Channel createchannel(@RequestBody ChannelData channelData){
        return channelService.createchannel(channelData);
    }
}
