package com.commercetoolAP.commercetoolAP.taxrate;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryDraft;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.tax_category.TaxRateDraft;

public class TaxRateDataProvider {
    ProjectApiRoot apiRoot= Client.createApiClient();
    public TaxCategory createtaxrate(TaxCategoryDraft taxCategoryDraft) {
        return apiRoot.taxCategories().post(taxCategoryDraft).executeBlocking().getBody();
    }
}
