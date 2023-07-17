package com.commercetoolAP.commercetoolAP.cart;
import com.commercetools.api.models.cart.TaxMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartData {
        public String currency;

        public String key;
        public TaxMode taxMode;
        public String supplyChannel;
        public String distributionChannel;

}







