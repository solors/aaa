package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class AdSystem {
    public static final String NAME = "AdSystem";
    public static final String VERSION = "version";
    @Nullable
    public final String adServerName;
    @Nullable
    public final String version;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String adServerName;
        @Nullable
        private String version;

        @NonNull
        public AdSystem build() {
            return new AdSystem(this.adServerName, this.version);
        }

        @NonNull
        public Builder setServerName(@Nullable String str) {
            this.adServerName = str;
            return this;
        }

        @NonNull
        public Builder setVersion(@Nullable String str) {
            this.version = str;
            return this;
        }
    }

    AdSystem(@Nullable String str, @Nullable String str2) {
        this.adServerName = str;
        this.version = str2;
    }
}
