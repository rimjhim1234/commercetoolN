package com.commercetoolAP.commercetoolAP.order;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditApply;
import com.commercetools.api.models.order_edit.OrderEditDraft;

public class OrderEditDataProvider {

    ProjectApiRoot apiRoot= Client.createApiClient();
    public OrderEdit createorderedit(OrderEditDraft orderEditDraft) {
       return apiRoot.orders().edits().post(orderEditDraft).executeBlocking().getBody();
    }
    public OrderEdit ApplyOrderEdit(OrderEditApply orderEditApply, String id) {
        return apiRoot.orders().edits().withId(id).apply().post(orderEditApply).executeBlocking().getBody();
    }
}
