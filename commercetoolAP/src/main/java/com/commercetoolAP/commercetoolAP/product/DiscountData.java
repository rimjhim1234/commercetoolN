package com.commercetoolAP.commercetoolAP.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiscountData {

    public String key;

    public String name;
    public String discription;
    public String sortOrder;
    public Boolean isActive;
    public String predicate;

    public String type;
    public Long centAmount;
    public String currencyCode;
    public String value;
}
