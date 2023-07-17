package com.commercetoolAP.commercetoolAP.channel;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelDraft;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChannelDataProvider {

    ProjectApiRoot apiRoot= Client.createApiClient();
    public Channel createchannel(ChannelDraft channelDraft) {
        return apiRoot.channels().post(channelDraft).executeBlocking().getBody();
    }
}
