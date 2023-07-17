package com.commercetoolAP.commercetoolAP.product;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product_discount.*;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import io.vrap.rmf.base.client.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  static   ProductDataProvider cdp = new ProductDataProvider();
    public static ProductType createproducttype(ProductData productData){
        ProductTypeDraft productTypeDraft=ProductTypeDraft
                .builder()
                .key(productData.getKey())
                .name(productData.getName())
                .description(productData.getDiscription())
                .build();
        return cdp.createproducttype(productTypeDraft);
    }
    public ProductDiscount productdiscount(DiscountData discountData){
        ProductDiscountDraft productDiscountDraft=ProductDiscountDraft
                .builder()
                .key(discountData.getKey())
                .name(LocalizedString.ofEnglish(discountData.getName()))
                .description(LocalizedString.ofEnglish(discountData.getDiscription()))
                .sortOrder(discountData.getSortOrder())
                .isActive(discountData.getIsActive())
                .predicate(discountData.getPredicate())
                .value(productDiscountValueDraftBuilder -> productDiscountValueDraftBuilder.absoluteBuilder())
                .build();
        return cdp.productdiscount(productDiscountDraft);
    }
}
