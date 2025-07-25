package com.smaato.sdk.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public class InterstitialRequestError {
    @Nullable
    private final String adSpaceId;
    @NonNull
    private final InterstitialError interstitialError;
    @Nullable
    private final String publisherId;

    public InterstitialRequestError(@NonNull InterstitialError interstitialError, @Nullable String str, @Nullable String str2) {
        this.interstitialError = (InterstitialError) Objects.requireNonNull(interstitialError);
        this.publisherId = str;
        this.adSpaceId = str2;
    }

    @Nullable
    public String getAdSpaceId() {
        return this.adSpaceId;
    }

    @NonNull
    public InterstitialError getInterstitialError() {
        return this.interstitialError;
    }

    @Nullable
    public String getPublisherId() {
        return this.publisherId;
    }
}
