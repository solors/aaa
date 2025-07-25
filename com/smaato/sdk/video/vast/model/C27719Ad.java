package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.smaato.sdk.video.vast.model.Ad */
/* loaded from: classes7.dex */
public class C27719Ad {
    public static final String AD_TYPE = "adType";
    public static final String CONDITIONAL_AD = "conditionalAd";

    /* renamed from: ID */
    public static final String f72470ID = "id";
    public static final String INLINE = "InLine";
    public static final String NAME = "Ad";
    public static final String SEQUENCE = "sequence";
    public static final String WRAPPER = "Wrapper";
    @NonNull
    public final VideoAdType adType;
    @Nullable
    public final Boolean conditionalAd;
    @Nullable

    /* renamed from: id */
    public final String f72471id;
    @Nullable
    public final InLine inLine;
    @Nullable
    public final Integer sequence;
    @Nullable
    public final Wrapper wrapper;

    C27719Ad(@Nullable String str, @Nullable InLine inLine, @Nullable Wrapper wrapper, @Nullable Integer num, @Nullable Boolean bool, @NonNull VideoAdType videoAdType) {
        this.inLine = inLine;
        this.wrapper = wrapper;
        this.f72471id = str;
        this.sequence = num;
        this.conditionalAd = bool;
        this.adType = videoAdType;
    }

    @NonNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.smaato.sdk.video.vast.model.Ad$Builder */
    /* loaded from: classes7.dex */
    public static class Builder {
        @NonNull
        private VideoAdType adType;
        @Nullable
        private Boolean conditionalAd;
        @Nullable

        /* renamed from: id */
        private String f72472id;
        @Nullable
        private InLine inLine;
        @Nullable
        private Integer sequence;
        @Nullable
        private Wrapper wrapper;

        public Builder() {
            this.adType = VideoAdType.VIDEO;
        }

        @NonNull
        public C27719Ad build() {
            return new C27719Ad(this.f72472id, this.inLine, this.wrapper, this.sequence, this.conditionalAd, this.adType);
        }

        @NonNull
        public Builder setAdType(@Nullable String str) {
            VideoAdType parse = VideoAdType.parse(str);
            if (parse == null) {
                parse = this.adType;
            }
            this.adType = parse;
            return this;
        }

        @NonNull
        public Builder setConditionalAd(@Nullable Boolean bool) {
            this.conditionalAd = bool;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72472id = str;
            return this;
        }

        @NonNull
        public Builder setInLine(@Nullable InLine inLine) {
            this.inLine = inLine;
            return this;
        }

        @NonNull
        public Builder setSequence(@Nullable Integer num) {
            this.sequence = num;
            return this;
        }

        @NonNull
        public Builder setWrapper(@Nullable Wrapper wrapper) {
            this.wrapper = wrapper;
            return this;
        }

        public Builder(@NonNull C27719Ad c27719Ad) {
            this.adType = VideoAdType.VIDEO;
            this.inLine = c27719Ad.inLine;
            this.wrapper = c27719Ad.wrapper;
            this.f72472id = c27719Ad.f72471id;
            this.sequence = c27719Ad.sequence;
            this.conditionalAd = c27719Ad.conditionalAd;
            this.adType = c27719Ad.adType;
        }
    }
}
