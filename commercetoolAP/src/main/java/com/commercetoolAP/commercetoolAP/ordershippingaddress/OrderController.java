package com.commercetoolAP.commercetoolAP.ordershippingaddress;


import com.commercetoolAP.commercetoolAP.order.OrderEditService;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.Order;
import io.vrap.rmf.base.client.ApiHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.money.MonetaryOperator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    ProjectApiRoot apiRoot;

    @GetMapping("/{orderId}")
    public ShippingAddressData getShippingAddress(@PathVariable String orderId) {
        Address ads = apiRoot.orders().withId(orderId).get().executeBlocking().getBody().getShippingAddress();

        ShippingAddressData shippingAddressData = new ShippingAddressData();
        shippingAddressData.setFirstName(ads.getFirstName());
        shippingAddressData.setLastname(ads.getLastName());
        shippingAddressData.setStreetName(ads.getStreetName());
        shippingAddressData.setStreetNumber(ads.getStreetNumber());
        shippingAddressData.setCity(ads.getCity());
        shippingAddressData.setMobile(ads.getMobile());
        return shippingAddressData;
    }
   /* @GetMapping("/{id}")
    public Address getOrder(@PathVariable String id){
        return apiRoot.orders().withId(id).get().executeBlocking().getBody().getShippingAddress();
    }*/
}

