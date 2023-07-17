package com.commercetoolAP.commercetoolAP.ordershippingaddress;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String shippingAddress;
    public String firstName;
    public String lastname;
    public String streetnumber;
    public String streetname;
    public String city;
    public String mobile;



}
