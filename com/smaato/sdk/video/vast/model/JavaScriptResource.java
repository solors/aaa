package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;

/* loaded from: classes7.dex */
public class JavaScriptResource {
    public static final String API_FRAMEWORK = "apiFramework";
    public static final String BROWSER_OPTIONAL = "browserOptional";
    public static final String NAME = "JavaScriptResource";
    public static final String URI = "uri";
    @NonNull
    public final String apiFramework;
    public final boolean browserOptional;
    @NonNull
    public final String uri;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String apiFramework;
        private boolean browserOptional;
        @Nullable
        private String uri;

        @NonNull
        public JavaScriptResource build() throws VastElementMissingException {
            VastModels.requireNonNull(this.uri, "Cannot build JavaScriptResource: uri is missing");
            VastModels.requireNonNull(this.apiFramework, "Cannot build JavaScriptResource: apiFramework is missing");
            return new JavaScriptResource(this.uri, this.apiFramework, this.browserOptional);
        }

        @NonNull
        public Builder setApiFramework(@NonNull String str) {
            this.apiFramework = str;
            return this;
        }

        @NonNull
        public Builder setBrowserOptional(@NonNull String str) {
            this.browserOptional = Boolean.valueOf(str).booleanValue();
            return this;
        }

        @NonNull
        public Builder setUri(@NonNull String str) {
            this.uri = str;
            return this;
        }
    }

    public JavaScriptResource(@NonNull String str, @NonNull String str2, boolean z) {
        this.uri = str;
        this.apiFramework = str2;
        this.browserOptional = z;
    }
}
