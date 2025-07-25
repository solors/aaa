package com.smaato.sdk.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.p568ad.UserInfo;

/* loaded from: classes7.dex */
public final class SdkConfiguration {
    @Nullable
    public AdContentRating getAdContentRating() {
        return SmaatoSdk.getAdContentRating();
    }

    @Nullable
    public String getPublisherId() {
        return SmaatoSdk.getPublisherId();
    }

    @Nullable
    public String getUnityVersion() {
        return SmaatoSdk.getUnityVersion();
    }

    @NonNull
    public String getUsPrivacyString() {
        return SmaatoSdk.getUsPrivacyString();
    }

    @NonNull
    public UserInfo getUserInfo() {
        return new UserInfo.Builder().setKeywords(SmaatoSdk.getKeywords()).setSearchQuery(SmaatoSdk.getSearchQuery()).setGender(SmaatoSdk.getGender()).setAge(SmaatoSdk.getAge()).setLatLng(SmaatoSdk.getLatLng()).setRegion(SmaatoSdk.getRegion()).setZip(SmaatoSdk.getZip()).setLanguage(SmaatoSdk.getLanguage()).setCoppa(SmaatoSdk.getCoppa()).build();
    }

    @NonNull
    public String getVersion() {
        return SmaatoSdk.getVersion();
    }

    public boolean isCompanionAdSkippable() {
        return SmaatoSdk.isCompanionAdSkippable();
    }

    public boolean isCoppaEnabled() {
        return SmaatoSdk.getCoppa();
    }

    public boolean isGpsEnabled() {
        return SmaatoSdk.isGPSEnabled();
    }

    @Nullable
    public Boolean isLgpdConsentEnabled() {
        return SmaatoSdk.isLGPDConsentEnabled();
    }

    public boolean isWatermarkEnabled() {
        return SmaatoSdk.isWatermarkEnabled();
    }
}
