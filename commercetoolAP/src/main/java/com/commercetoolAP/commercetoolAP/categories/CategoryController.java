package com.commercetoolAP.commercetoolAP.categories;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
   ProjectApiRoot apiRoot;
    @Autowired
   CategoryService categoryService;
    @PostMapping
   public Category createcategory(@RequestBody CategoryData categoryData) {
       return categoryService.createcategory(categoryData);
   }
}
