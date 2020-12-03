// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Immutable;
import com.azure.core.serde.JsonFlatten;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/** An empty object that represents the default cognitive service resource for a skillset. */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.DefaultCognitiveServices")
@JsonFlatten
@Immutable
public class DefaultCognitiveServicesAccount extends CognitiveServicesAccount {}