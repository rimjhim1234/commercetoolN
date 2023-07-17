package com.commercetoolAP.commercetoolAP.product;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductDraft;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_discount.ProductDiscountDraft;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductDataProvider {

    ProjectApiRoot apiRoot= Client.createApiClient();
    public ProductType createproducttype(ProductTypeDraft productTypeDraft) {
        return apiRoot.productTypes().post(productTypeDraft).executeBlocking().getBody();
    }
    public ProductDiscount productdiscount(ProductDiscountDraft productDiscountDraft) {
        return apiRoot.productDiscounts().post(productDiscountDraft).executeBlocking().getBody();

    }
}
