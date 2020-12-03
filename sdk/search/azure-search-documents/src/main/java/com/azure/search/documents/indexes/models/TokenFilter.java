// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.rest.annotation.Fluent;
import com.azure.core.serde.SerdeToPojo;
import com.azure.core.serde.SerdeProperty;
import com.azure.core.serde.SerdeSubTypes;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

/**
 * Base type for token filters.
 */
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME, include = SerdeTypeInfo.As.PROPERTY, property = "@odata.type",
    defaultImpl = TokenFilter.class)
@SerdeTypeName("TokenFilter")
@SerdeSubTypes({
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.AsciiFoldingTokenFilter", value = AsciiFoldingTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.CjkBigramTokenFilter", value = CjkBigramTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.CommonGramTokenFilter", value = CommonGramTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter",
        value = DictionaryDecompounderTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.EdgeNGramTokenFilter", value = EdgeNGramTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.ElisionTokenFilter", value = ElisionTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.KeepTokenFilter", value = KeepTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.KeywordMarkerTokenFilter",
        value = KeywordMarkerTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.LengthTokenFilter", value = LengthTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.LimitTokenFilter", value = LimitTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.NGramTokenFilter", value = NGramTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.PatternCaptureTokenFilter",
        value = PatternCaptureTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.PatternReplaceTokenFilter",
        value = PatternReplaceTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.PhoneticTokenFilter", value = PhoneticTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.ShingleTokenFilter", value = ShingleTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.SnowballTokenFilter", value = SnowballTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.StemmerTokenFilter", value = StemmerTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.StemmerOverrideTokenFilter",
        value = StemmerOverrideTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.StopwordsTokenFilter", value = StopwordsTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.SynonymTokenFilter", value = SynonymTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.TruncateTokenFilter", value = TruncateTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.UniqueTokenFilter", value = UniqueTokenFilter.class),
    @SerdeSubTypes.Type(name = "#Microsoft.Azure.Search.WordDelimiterTokenFilter",
        value = WordDelimiterTokenFilter.class)
})
@Fluent
public abstract class TokenFilter {
    /*
     * The name of the token filter. It must only contain letters, digits,
     * spaces, dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    @SerdeProperty(value = "name")
    private String name;

    /**
     * Constructor of {@link TokenFilter}.
     *
     * @param name The name of the token filter. It must only contain letters, digits,
     * spaces, dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    @SerdeToPojo
    public TokenFilter(@SerdeProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the token filter. It must only
     * contain letters, digits, spaces, dashes or underscores, can only start
     * and end with alphanumeric characters, and is limited to 128 characters.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

}