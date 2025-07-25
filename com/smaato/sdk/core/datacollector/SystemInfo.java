package com.smaato.sdk.core.datacollector;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.network.NetworkConnectionType;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class SystemInfo {
    @Nullable
    private final String carrierCode;
    @Nullable
    private final String carrierName;
    @Nullable
    private final String deviceModelName;
    @Nullable
    private final String googleAdvertisingId;
    @Nullable
    private final Boolean isGoogleLimitAdTrackingEnabled;
    @NonNull
    private final String language;
    @Nullable
    private final NetworkConnectionType networkConnectionType;
    @NonNull
    private final String packageName;
    @NonNull
    private final String userAgent;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SystemInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable NetworkConnectionType networkConnectionType, @NonNull String str5, @NonNull String str6, @NonNull String str7) {
        this.carrierName = str;
        this.carrierCode = str2;
        this.googleAdvertisingId = str3;
        this.isGoogleLimitAdTrackingEnabled = bool;
        this.deviceModelName = str4;
        this.networkConnectionType = networkConnectionType;
        this.userAgent = (String) Objects.requireNonNull(str5, "Parameter userAgent cannot be null for SystemInfo::SystemInfo");
        this.packageName = (String) Objects.requireNonNull(str6, "Parameter packageName cannot be null for SystemInfo::SystemInfo");
        this.language = (String) Objects.requireNonNull(str7, "Parameter language cannot be null for SystemInfo::SystemInfo");
    }

    @Nullable
    public String getCarrierCode() {
        return this.carrierCode;
    }

    @Nullable
    public String getCarrierName() {
        return this.carrierName;
    }

    @Nullable
    public String getDeviceModelName() {
        return this.deviceModelName;
    }

    @Nullable
    public String getGoogleAdvertisingId() {
        return this.googleAdvertisingId;
    }

    @NonNull
    public String getLanguage() {
        return this.language;
    }

    @Nullable
    public NetworkConnectionType getNetworkConnectionType() {
        return this.networkConnectionType;
    }

    @NonNull
    public String getPackageName() {
        return this.packageName;
    }

    @NonNull
    public String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    public Boolean isGoogleLimitAdTrackingEnabled() {
        return this.isGoogleLimitAdTrackingEnabled;
    }
}
