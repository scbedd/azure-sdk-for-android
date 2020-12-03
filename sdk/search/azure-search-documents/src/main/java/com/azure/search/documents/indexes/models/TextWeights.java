// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import java.util.Map;

/** Defines weights on index fields for which matches should boost scoring in search queries. */
@Fluent
public final class TextWeights {
    /*
     * The dictionary of per-field weights to boost document scoring. The keys
     * are field names and the values are the weights for each field.
     */
    @SerdeProperty(value = "weights")
    private Map<String, Double> weights;

    /**
     * Creates an instance of TextWeights class.
     *
     * @param weights the weights value to set.
     */
    @SerdeToPojo
    public TextWeights(@SerdeProperty(value = "weights") Map<String, Double> weights) {
        this.weights = weights;
    }

    /**
     * Get the weights property: The dictionary of per-field weights to boost document scoring. The keys are field names
     * and the values are the weights for each field.
     *
     * @return the weights value.
     */
    public Map<String, Double> getWeights() {
        return this.weights;
    }
}