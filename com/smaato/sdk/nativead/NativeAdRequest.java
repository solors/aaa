package com.smaato.sdk.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.nativead.AutoValue_NativeAdRequest;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class NativeAdRequest {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract Builder adSpaceId(String str);

        public abstract NativeAdRequest build();

        public abstract Builder mediationAdapterVersion(String str);

        public abstract Builder mediationNetworkName(String str);

        public abstract Builder mediationNetworkSdkVersion(String str);

        public abstract Builder shouldFetchPrivacy(boolean z);

        public abstract Builder shouldReturnUrlsForImageAssets(boolean z);

        public abstract Builder uniqueUBId(String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_NativeAdRequest.C27459b().shouldFetchPrivacy(true).shouldReturnUrlsForImageAssets(false);
    }

    @NonNull
    public abstract String adSpaceId();

    @Nullable
    public abstract String mediationAdapterVersion();

    @Nullable
    public abstract String mediationNetworkName();

    @Nullable
    public abstract String mediationNetworkSdkVersion();

    public abstract boolean shouldFetchPrivacy();

    public abstract boolean shouldReturnUrlsForImageAssets();

    @Nullable
    public abstract String uniqueUBId();
}
