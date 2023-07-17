package com.commercetoolAP.commercetoolAP.categories;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryDraft;
import org.springframework.context.annotation.Configuration;


public class CategoryDataProvider {

    ProjectApiRoot apiRoot= Client.createApiClient();
    public Category createcategory(CategoryDraft categoryDraft) {
        return apiRoot.categories().post(categoryDraft).executeBlocking().getBody();
    }
}
