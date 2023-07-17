package com.commercetoolAP.commercetoolAP.customer;


import com.commercetools.api.client.ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeRequestBuilder;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CustomerController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    CustomerService customerService;
   @PostMapping
    public Customer Createcustomer(CustomerData customerData){
      return customerService.createcustomer(customerData);
    }
    @GetMapping("/{id}")
    public Customer getallcustomer(@PathVariable String id) {
        return apiRoot.customers().withId(id).get().executeBlocking().getBody();
    }
    @PostMapping("/update")
    public Customer updatecustomer(CustomerData customerData){
       return customerService.updatecustomer(customerData);
    }
}
