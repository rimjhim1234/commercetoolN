package com.commercetoolAP.commercetoolAP.product;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_type.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    ProductService productService;
    @PostMapping("/product")
    public ProductType createproducttype(@RequestBody ProductData productData){
        return ProductService.createproducttype(productData);
    }
    @PostMapping("/discount")
    public ProductDiscount productdiscount(@RequestBody DiscountData discountData){
        return productService.productdiscount(discountData);
    }
}
