package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class VastTree {

    /* renamed from: AD */
    public static final String f72493AD = "Ad";
    public static final String ERROR = "Error";
    public static final String VAST = "VAST";
    public static final String VERSION = "version";
    @NonNull
    public final List<C27719Ad> ads;
    @NonNull
    public final List<String> errors;
    @Nullable
    public final String version;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private List<C27719Ad> ads;
        @Nullable
        private List<String> errors;
        @Nullable
        private String version;

        public Builder() {
        }

        @NonNull
        public VastTree build() {
            return new VastTree(VastModels.toImmutableList(this.ads), VastModels.toImmutableList(this.errors), this.version);
        }

        @NonNull
        public Builder setAds(@Nullable List<C27719Ad> list) {
            this.ads = list;
            return this;
        }

        @NonNull
        public Builder setErrors(@Nullable List<String> list) {
            this.errors = list;
            return this;
        }

        @NonNull
        public Builder setVersion(@Nullable String str) {
            this.version = str;
            return this;
        }

        public Builder(@NonNull VastTree vastTree) {
            this.version = vastTree.version;
            this.errors = vastTree.errors;
            this.ads = vastTree.ads;
        }
    }

    VastTree(@NonNull List<C27719Ad> list, @NonNull List<String> list2, @Nullable String str) {
        this.ads = (List) Objects.requireNonNull(list);
        this.errors = (List) Objects.requireNonNull(list2);
        this.version = str;
    }

    @NonNull
    public Builder newBuilder() {
        return new Builder(this);
    }
}
