package com.commercetoolAP.commercetoolAP.shopping;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Shipping;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListDraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShoppingDataProvider {

    ProjectApiRoot apiRoot= Client.createApiClient();

    public ShoppingList createshoppinglist(ShoppingListDraft shoppingListDraft) {
        return apiRoot.shoppingLists().post(shoppingListDraft).executeBlocking().getBody();
    }
}
