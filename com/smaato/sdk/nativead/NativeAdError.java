package com.smaato.sdk.nativead;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes7.dex */
public enum NativeAdError {
    NO_AD_AVAILABLE("No ad is currently available matching the requested parameters."),
    INVALID_REQUEST("Invalid ad request (e.g. PublisherId or AdSpaceId is incorrect)."),
    NETWORK_ERROR("The ad request has not been completed due to a network connectivity issue."),
    INTERNAL_ERROR("An internal error happened (e.g. the ad server responded with an invalid response)."),
    CACHE_LIMIT_REACHED("Cache limit reached. Please use one of previous AD."),
    SDK_INITIALISATION_ERROR("Smaato SDK is not initialised"),
    AGE_RESTRICTED("Age restricted user.");
    
    @NonNull
    private final String description;

    NativeAdError(String str) {
        Objects.requireNonNull(str);
        this.description = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format("[%s]: %s", name(), this.description);
    }
}
