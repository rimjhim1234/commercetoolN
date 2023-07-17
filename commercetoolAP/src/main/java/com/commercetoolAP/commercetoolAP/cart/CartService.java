package com.commercetoolAP.commercetoolAP.cart;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartAddLineItemAction;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.LineItemDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
 public class CartService {
  static CartDataProvider obc= new CartDataProvider();
//  public static Cart createcart(CartData cartData) {
//     CartDraft cartDraft=CartDraft
//               .builder()
//             .key(cartData.getKey())
//             .currency(cartData.getCurrency())
//              .taxMode(cartData.getTaxMode())
//              .lineItems(LineItemDraft
//                      .builder()
//                      .productId("6733b429-bff6-47da-916b-08629a41f9d7")
//                      .supplyChannel()
//                      .distributionChannel()
//                       .build())
//              .build();
//     return obc.createcart(cartDraft);
//  }
}
