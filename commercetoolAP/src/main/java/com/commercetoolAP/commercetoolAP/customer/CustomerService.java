package com.commercetoolAP.commercetoolAP.customer;

import com.commercetools.api.models.common.AddressDraft;
import com.commercetools.api.models.common.Update;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.message.CustomerPasswordUpdatedMessage;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Configuration
public class CustomerService {

    CustomerDataProvider cdp = new CustomerDataProvider();
    public Customer createcustomer(CustomerData customerData) {
        AddressDraft addressDraft=AddressDraft.builder()
                .streetName(CustomerDraft.builder().getCompanyName())
                .build();
        CustomerDraft customerDraft= CustomerDraft
                .builder()
                .firstName(customerData.getFirstname())
                .lastName(customerData.getLastname())
                .password(customerData.getPassword())
                .email(customerData.getEmail())
                .addresses(addressDraft)
                .custom(customFieldsDraftBuilder -> customFieldsDraftBuilder)
                .key(customerData.getFirstname())
                .build();
      return cdp.createcustomer(customerDraft);
    }
    public Customer updatecustomer(CustomerData customerData) {
        CustomerDraft customerDraft=CustomerDraft
                .builder()
                .firstName(customerData.getFirstname())
                .email(customerData.getEmail())
                .build();
        return cdp.updatecustomer(customerDraft);
    }
}
