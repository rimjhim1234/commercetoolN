package com.commercetoolAP.commercetoolAP.shopping;

import com.commercetools.api.models.cart.Shipping;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListDraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {

    ShoppingDataProvider obc=new ShoppingDataProvider();
    public ShoppingList createshoppinglist(ShoppingData shoppingData) {
        ShoppingListDraft shoppingListDraft=ShoppingListDraft
                .builder()
                .name(LocalizedString.ofEnglish(shoppingData.getName()))
                .key(shoppingData.getKey())
                .description(LocalizedString.ofEnglish(shoppingData.getDescription()))
                .build();
        return obc.createshoppinglist(shoppingListDraft);

    }
}
