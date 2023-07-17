package com.commercetoolAP.commercetoolAP.categories;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryDraft;
import com.commercetools.api.models.common.LocalizedString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@Configuration
public class CategoryService {

    CategoryDataProvider obc=new CategoryDataProvider();
    public Category createcategory(CategoryData categoryData){
        CategoryDraft categoryDraft=CategoryDraft
                .builder()
                .name(LocalizedString.ofEnglish(categoryData.getName()))
                .key(categoryData.getKey())
                .slug(LocalizedString.ofEnglish(categoryData.getSlug()))
                .description(LocalizedString.ofEnglish(categoryData.getDiscripation()))
                .orderHint(categoryData.getOrderHint())
                .externalId(categoryData.getExternalId())
                .build();
        return obc.createcategory(categoryDraft);
    }
}
