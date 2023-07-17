package com.commercetoolAP.commercetoolAP.stores;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreDraft;

public class StoresDataProvider {
    ProjectApiRoot apiRoot= Client.createApiClient();
    public Store createstore(StoreDraft storeDraft) {
        return apiRoot.stores().post(storeDraft).executeBlocking().getBody();
    }
}
