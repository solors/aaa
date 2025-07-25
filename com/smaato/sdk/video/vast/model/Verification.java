package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public final class Verification {
    public static final String JAVASCRIPT_RESOURCE = "JavaScriptResource";
    public static final String NAME = "Verification";
    public static final String VENDOR = "vendor";
    public static final String VERIFICATION_PARAMETERS = "VerificationParameters";
    public static final String VIEWABLE_IMPRESSION = "ViewableImpression";
    @NonNull
    public final List<JavaScriptResource> javaScriptResources;
    @NonNull
    public final String vendor;
    @Nullable
    public final String verificationParameters;
    @Nullable
    public final ViewableImpression viewableImpression;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private List<JavaScriptResource> javaScriptResource;
        @Nullable
        private String vendor;
        @Nullable
        private String verificationParameters;
        @Nullable
        private ViewableImpression viewableImpression;

        @NonNull
        public Verification build() throws VastElementMissingException {
            this.javaScriptResource = VastModels.toImmutableList(this.javaScriptResource);
            VastModels.requireNonNull(this.vendor, "Cannot build Verification: vendor is missing");
            return new Verification(this.javaScriptResource, this.vendor, this.verificationParameters, this.viewableImpression);
        }

        @NonNull
        public Builder setJavaScriptResources(@Nullable List<JavaScriptResource> list) {
            this.javaScriptResource = list;
            return this;
        }

        @NonNull
        public Builder setVendor(@Nullable String str) {
            this.vendor = str;
            return this;
        }

        @NonNull
        public Builder setVerificationParameters(@Nullable String str) {
            this.verificationParameters = str;
            return this;
        }

        @NonNull
        public Builder setViewableImpression(@Nullable ViewableImpression viewableImpression) {
            this.viewableImpression = viewableImpression;
            return this;
        }
    }

    private Verification(@NonNull List<JavaScriptResource> list, @NonNull String str, @Nullable String str2, @Nullable ViewableImpression viewableImpression) {
        this.vendor = str;
        this.javaScriptResources = list;
        this.verificationParameters = str2;
        this.viewableImpression = viewableImpression;
    }
}
