package com.commercetoolAP.commercetoolAP.customtype;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.type.TypeDraft;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomTypeDataProvider {
    ProjectApiRoot apiRoot= Client.createApiClient();
    public Type createcustomtype(TypeDraft typeDraft){
        return apiRoot.types().post(typeDraft).executeBlocking().getBody();
    }
}
