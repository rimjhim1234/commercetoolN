package com.commercetoolAP.commercetoolAP.stores;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.store.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoresController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    StoresService storesService;
    @PostMapping("/STORE")
    public Store createstore(@RequestBody StoresData  storesData){
        return storesService.createstore(storesData);
    }
}
