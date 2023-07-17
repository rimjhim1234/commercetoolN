package com.commercetoolAP.commercetoolAP.taxrate;

import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryDraft;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.tax_category.TaxRateDraft;
import org.springframework.stereotype.Service;

@Service
public class TaxRateService {

    TaxRateDataProvider obc=new TaxRateDataProvider();
    public TaxCategory createtaxrate(TaxRateDto taxRateDto) {
        TaxCategoryDraft taxCategoryDraft= TaxCategoryDraft
                .builder()
                .name(taxRateDto.getName())
                .key(taxRateDto.getKey())
                .description(taxRateDto.getDiscripation())
                .build();
        return obc.createtaxrate(taxCategoryDraft);
    }
}
