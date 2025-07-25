package com.smaato.sdk.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public abstract class InterstitialAdBase {
    @NonNull
    public abstract String getAdSpaceId();

    @Nullable
    public abstract String getCreativeId();

    @NonNull
    public abstract String getSessionId();

    public abstract boolean isAvailableForPresentation();
}
