package com.commercetoolAP.commercetoolAP.shopping;


import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Shipping;
import com.commercetools.api.models.shopping_list.ShoppingList;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shoppinglist")
public class ShoppingController{
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    ShoppingService shoppingService;
    @PostMapping
    public ShoppingList createshoppinglist(@RequestBody ShoppingData shoppingData){
        return shoppingService.createshoppinglist(shoppingData);
    }
}
