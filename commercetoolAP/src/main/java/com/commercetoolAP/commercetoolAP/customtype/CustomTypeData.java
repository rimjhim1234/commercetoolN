package com.commercetoolAP.commercetoolAP.customtype;

import com.commercetools.api.models.type.FieldDefinition;
import com.commercetools.api.models.type.ResourceTypeId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomTypeData {

public String name;

public String key;
public String resourceTypeIds;
public String fieldDefinitions;
public String type;
public String required;
public String inputHint;
}
