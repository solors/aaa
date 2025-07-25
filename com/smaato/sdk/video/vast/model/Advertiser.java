package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class Advertiser {

    /* renamed from: ID */
    public static final String f72473ID = "id";
    public static final String NAME = "Advertiser";
    @Nullable

    /* renamed from: id */
    public final String f72474id;
    @Nullable
    public final String name;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable

        /* renamed from: id */
        private String f72475id;
        @Nullable
        private String name;

        @NonNull
        public Advertiser build() {
            return new Advertiser(this.f72475id, this.name);
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72475id = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable String str) {
            this.name = str;
            return this;
        }
    }

    Advertiser(@Nullable String str, @Nullable String str2) {
        this.f72474id = str;
        this.name = str2;
    }
}
