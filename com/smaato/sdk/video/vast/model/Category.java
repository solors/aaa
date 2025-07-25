package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;

/* loaded from: classes7.dex */
public class Category {
    public static final String AUTHORITY = "authority";
    public static final String NAME = "Category";
    @Nullable
    public final String authority;
    @NonNull
    public final String categoryCode;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String authority;
        @Nullable
        private String categoryCode;

        @NonNull
        public Category build() throws VastElementMissingException {
            VastModels.requireNonNull(this.categoryCode, "Cannot build Category: categoryCode is missing");
            return new Category(this.categoryCode, this.authority);
        }

        @NonNull
        public Builder setAuthority(@Nullable String str) {
            this.authority = str;
            return this;
        }

        @NonNull
        public Builder setCategoryCode(@Nullable String str) {
            this.categoryCode = str;
            return this;
        }
    }

    Category(@NonNull String str, @Nullable String str2) {
        this.categoryCode = str;
        this.authority = str2;
    }
}
