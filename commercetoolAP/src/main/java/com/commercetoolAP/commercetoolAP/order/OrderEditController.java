package com.commercetoolAP.commercetoolAP.order;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditPagedQueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderEditController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    OrderEditService orderEditService;
    @PostMapping("/orderedit")
    public OrderEdit createorderedit(@RequestBody OrderEditData orderEditData){
        return orderEditService.createorderedit(orderEditData);
    }
    @GetMapping("/order/{id}")
    public OrderEditPagedQueryResponse getbyid(@RequestBody OrderEditData orderEditData ,@PathVariable String id){
        return apiRoot.orders().edits().get().executeBlocking().getBody();
    }
}
