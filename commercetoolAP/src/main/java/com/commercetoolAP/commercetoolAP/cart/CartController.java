package com.commercetoolAP.commercetoolAP.cart;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartAddLineItemAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    CartService cartService;
//   @PostMapping("/CART")
//    public Cart createcart(@RequestBody CartData cartData){
//       return CartService.createcart(cartData);
//  }
}
