package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class VastScenarioCreativeData {
    @Nullable
    public final String adId;
    @Nullable
    public final String apiFramework;
    @Nullable

    /* renamed from: id */
    public final String f72491id;
    @Nullable
    public final Integer sequence;
    @NonNull
    public final UniversalAdId universalAdId;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String adId;
        @Nullable
        private String apiFramework;
        @Nullable

        /* renamed from: id */
        private String f72492id;
        @Nullable
        private Integer sequence;
        @Nullable
        private UniversalAdId universalAdId;

        @NonNull
        public VastScenarioCreativeData build() {
            if (this.universalAdId == null) {
                this.universalAdId = UniversalAdId.DEFAULT;
            }
            return new VastScenarioCreativeData(this.universalAdId, this.f72492id, this.adId, this.sequence, this.apiFramework);
        }

        @NonNull
        public Builder setAdId(@Nullable String str) {
            this.adId = str;
            return this;
        }

        @NonNull
        public Builder setApiFramework(@Nullable String str) {
            this.apiFramework = str;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72492id = str;
            return this;
        }

        @NonNull
        public Builder setSequence(@Nullable Integer num) {
            this.sequence = num;
            return this;
        }

        @NonNull
        public Builder setUniversalAdId(@Nullable UniversalAdId universalAdId) {
            this.universalAdId = universalAdId;
            return this;
        }
    }

    private VastScenarioCreativeData(@NonNull UniversalAdId universalAdId, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
        this.universalAdId = universalAdId;
        this.f72491id = str;
        this.adId = str2;
        this.sequence = num;
        this.apiFramework = str3;
    }
}
