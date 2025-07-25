package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;

/* loaded from: classes7.dex */
public class AdParameters {
    public static final String NAME = "AdParameters";
    public static final String XML_ENCODED = "xmlEncoded";
    @NonNull
    public final String parameters;
    @Nullable
    public final Boolean xmlEncoded;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String parameters;
        @Nullable
        private Boolean xmlEncoded;

        @NonNull
        public AdParameters build() throws VastElementMissingException {
            VastModels.requireNonNull(this.parameters, "Cannot build AdParameters: parameters are missing");
            return new AdParameters(this.parameters, this.xmlEncoded);
        }

        @NonNull
        public Builder setParameters(@Nullable String str) {
            this.parameters = str;
            return this;
        }

        @NonNull
        public Builder setXmlEncoded(@Nullable Boolean bool) {
            this.xmlEncoded = bool;
            return this;
        }
    }

    AdParameters(@NonNull String str, @Nullable Boolean bool) {
        this.parameters = str;
        this.xmlEncoded = bool;
    }
}
