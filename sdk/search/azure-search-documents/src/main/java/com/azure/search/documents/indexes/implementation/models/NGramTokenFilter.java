// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.JsonFlatten;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/** Generates n-grams of the given size(s). This token filter is implemented using Apache Lucene. */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata\\.type")
@SerdeTypeName("#Microsoft.Azure.Search.NGramTokenFilter")
@JsonFlatten
@Fluent
public class NGramTokenFilter extends TokenFilter {
    /*
     * The minimum n-gram length. Default is 1. Must be less than the value of
     * maxGram.
     */
    @SerdeProperty(value = "minGram")
    private Integer minGram;

    /*
     * The maximum n-gram length. Default is 2.
     */
    @SerdeProperty(value = "maxGram")
    private Integer maxGram;

    /**
     * Creates an instance of NGramTokenFilter class.
     *
     * @param name the name value to set.
     */
    @SerdeToPojo
    public NGramTokenFilter(@SerdeProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the minGram property: The minimum n-gram length. Default is 1. Must be less than the value of maxGram.
     *
     * @return the minGram value.
     */
    public Integer getMinGram() {
        return this.minGram;
    }

    /**
     * Set the minGram property: The minimum n-gram length. Default is 1. Must be less than the value of maxGram.
     *
     * @param minGram the minGram value to set.
     * @return the NGramTokenFilter object itself.
     */
    public NGramTokenFilter setMinGram(Integer minGram) {
        this.minGram = minGram;
        return this;
    }

    /**
     * Get the maxGram property: The maximum n-gram length. Default is 2.
     *
     * @return the maxGram value.
     */
    public Integer getMaxGram() {
        return this.maxGram;
    }

    /**
     * Set the maxGram property: The maximum n-gram length. Default is 2.
     *
     * @param maxGram the maxGram value to set.
     * @return the NGramTokenFilter object itself.
     */
    public NGramTokenFilter setMaxGram(Integer maxGram) {
        this.maxGram = maxGram;
        return this;
    }
}