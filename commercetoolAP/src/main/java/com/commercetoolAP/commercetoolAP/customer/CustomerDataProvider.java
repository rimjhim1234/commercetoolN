package com.commercetoolAP.commercetoolAP.customer;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CustomerDataProvider {

    ProjectApiRoot apiRoot= Client.createApiClient();
    public Customer createcustomer(CustomerDraft customerDraft) {
        return apiRoot.customers().post(customerDraft).executeBlocking().getBody().getCustomer();
    }
    public Customer updatecustomer(CustomerDraft customerDraft) {
        return apiRoot.customers().post(customerDraft).executeBlocking().getBody().getCustomer();
    }
}

