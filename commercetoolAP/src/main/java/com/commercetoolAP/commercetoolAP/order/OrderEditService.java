package com.commercetoolAP.commercetoolAP.order;

import com.commercetoolAP.commercetoolAP.ordershippingaddress.Order;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.OrderReferenceBuilder;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditApply;
import com.commercetools.api.models.order_edit.OrderEditDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.type.CustomFieldsDraftBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.AbstractQueue;

@Service
public class OrderEditService {
    OrderEditDataProvider obc= new OrderEditDataProvider();
    public OrderEdit createorderedit(OrderEditData orderEditData) {
        OrderEditDraft orderEditDraft = OrderEditDraft
                .builder()
                .key(orderEditData.getKey())
                .resource(OrderReferenceBuilder.of().id(orderEditData.getId()).build())
                .build();
        return obc.createorderedit(orderEditDraft) ;
    }
   public OrderEdit ApplyorderEdit(OrderEditData orderEditData,String id){
           OrderEditApply orderEditApply = OrderEditApply
                   .builder()
                   .editVersion(orderEditData.getEditVersion())
                   .resourceVersion(orderEditData.getResourceVersion())
                   .build();
           return obc.ApplyOrderEdit(orderEditApply, id);
   }
}
