package com.smaato.sdk.core.mvvm.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.mvvm.model.AutoValue_AdRequest;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.smaato.sdk.core.p568ad.KeyValuePairs;
import java.util.Map;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class AdRequest {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract AdRequest build();

        public abstract Builder setAdFormat(AdFormat adFormat);

        public abstract Builder setAdSpaceId(String str);

        public abstract Builder setKeyValuePairs(KeyValuePairs keyValuePairs);

        public abstract Builder setMediationAdapterVersion(String str);

        public abstract Builder setMediationNetworkName(String str);

        public abstract Builder setMediationNetworkSdkVersion(String str);

        public abstract Builder setObjectExtras(Map<String, Object> map);

        public abstract Builder setOnCsmAdClicked(Runnable runnable);

        public abstract Builder setOnCsmAdExpired(Runnable runnable);

        public abstract Builder setUBUniqueId(String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AdRequest.C27171b();
    }

    @NonNull
    public abstract AdFormat getAdFormat();

    @NonNull
    public abstract String getAdSpaceId();

    @Nullable
    public abstract KeyValuePairs getKeyValuePairs();

    @Nullable
    public abstract String getMediationAdapterVersion();

    @Nullable
    public abstract String getMediationNetworkName();

    @Nullable
    public abstract String getMediationNetworkSdkVersion();

    @Nullable
    public abstract Map<String, Object> getObjectExtras();

    @NonNull
    public abstract Runnable getOnCsmAdClicked();

    @NonNull
    public abstract Runnable getOnCsmAdExpired();

    @Nullable
    public abstract String getUBUniqueId();
}
