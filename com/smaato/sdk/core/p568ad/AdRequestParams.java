package com.smaato.sdk.core.p568ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.p568ad.AutoValue_AdRequestParams;

@AutoValue.CopyAnnotations
@AutoValue
/* renamed from: com.smaato.sdk.core.ad.AdRequestParams */
/* loaded from: classes7.dex */
public abstract class AdRequestParams {

    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.core.ad.AdRequestParams$Builder */
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract AdRequestParams build();

        public abstract Builder setUBUniqueId(@Nullable String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AdRequestParams.C27008b();
    }

    @Nullable
    public abstract String getUBUniqueId();

    @NonNull
    public Builder newBuilder() {
        return builder().setUBUniqueId(getUBUniqueId());
    }
}
