package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class VastError {
    @Nullable
    public final String assetUrl;
    public final int code;
    public final long offsetMillis;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String assetUrl;
        private final int code;
        private long offsetMillis;

        public Builder(int i) {
            this.code = i;
        }

        @NonNull
        public VastError build() {
            return new VastError(this.code, this.offsetMillis, this.assetUrl);
        }

        @NonNull
        public Builder setAssetUrl(@Nullable String str) {
            this.assetUrl = str;
            return this;
        }

        @NonNull
        public Builder setOffsetMillis(long j) {
            this.offsetMillis = j;
            return this;
        }
    }

    private VastError(int i, long j, @Nullable String str) {
        this.code = i;
        this.offsetMillis = j;
        this.assetUrl = str;
    }
}
