package com.commercetoolAP.commercetoolAP.customtype;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse;
import com.commercetools.api.models.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Control;

@RestController
public class CustomTypeController {
@Autowired
ProjectApiRoot apiRoot;
//@Autowired
// CustomTypeService customTypeService;
//@PostMapping("/CUSTOMTYPE")
//  public Type createcustomtype(@RequestBody CustomTypeData customTypeData){
//    return customTypeService.Createcustomtype(customTypeData);
//    }
}

