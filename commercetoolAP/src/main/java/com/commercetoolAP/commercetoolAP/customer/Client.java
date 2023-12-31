package com.commercetoolAP.commercetoolAP.customer;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Client {
    @Bean
    public static ProjectApiRoot createApiClient() {
        final ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                                .withClientId("sqi-5IqjMlndIGlG8H7tnJsP")
                                .withClientSecret("tb40aSVrEUcyWpBehwWGrnW6bTMekcLv")
                                .build(),
                        ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1)
                .build("sunrisedata-new");
        return apiRoot;
    }
}









