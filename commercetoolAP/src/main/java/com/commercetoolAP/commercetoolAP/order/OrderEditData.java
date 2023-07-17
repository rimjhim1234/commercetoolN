package com.commercetoolAP.commercetoolAP.order;

import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEditData {

    public String key;
    public OrderReference resource;
//   public String stagedActions;
//
   public String id;
public long editVersion;
public long resourceVersion;

}
