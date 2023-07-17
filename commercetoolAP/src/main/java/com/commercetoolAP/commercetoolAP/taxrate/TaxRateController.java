package com.commercetoolAP.commercetoolAP.taxrate;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxRateController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    TaxRateService taxRateService;
@PostMapping("/TAXRATE")
    public TaxCategory createtaxrate(@RequestBody TaxRateDto taxRateDto){
        return taxRateService.createtaxrate(taxRateDto);
    }
}
