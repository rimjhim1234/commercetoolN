package com.commercetoolAP.commercetoolAP.cart;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartDataProvider {
    ProjectApiRoot apiRoot= Client.createApiClient();
    public Cart createcart(CartDraft cartDraft) {
        return apiRoot.carts().post(cartDraft).executeBlocking().getBody();
    }
}
