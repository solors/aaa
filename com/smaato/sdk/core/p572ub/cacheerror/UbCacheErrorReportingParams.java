package com.smaato.sdk.core.p572ub.cacheerror;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.smaato.sdk.core.p572ub.cacheerror.AutoValue_UbCacheErrorReportingParams;

@AutoValue
/* renamed from: com.smaato.sdk.core.ub.cacheerror.UbCacheErrorReportingParams */
/* loaded from: classes7.dex */
public abstract class UbCacheErrorReportingParams {

    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.core.ub.cacheerror.UbCacheErrorReportingParams$Builder */
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        @NonNull
        public abstract UbCacheErrorReportingParams build();

        @NonNull
        public abstract Builder setAdFormat(@Nullable AdFormat adFormat);

        @NonNull
        public abstract Builder setAdSpaceId(@Nullable String str);

        @NonNull
        public abstract Builder setCreativeId(@Nullable String str);

        @NonNull
        public abstract Builder setPublisherId(@Nullable String str);

        @NonNull
        public abstract Builder setRequestTimestamp(@Nullable Long l);

        @NonNull
        public abstract Builder setSessionId(@Nullable String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_UbCacheErrorReportingParams.C27284b();
    }

    @Nullable
    public abstract AdFormat adFormat();

    @NonNull
    public abstract String adSpaceId();

    @Nullable
    public abstract String creativeId();

    @NonNull
    public abstract String publisherId();

    @Nullable
    public abstract Long requestTimestamp();

    @Nullable
    public abstract String sessionId();
}
