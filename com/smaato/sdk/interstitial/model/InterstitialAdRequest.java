package com.smaato.sdk.interstitial.model;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.mvvm.model.AdRequest;
import com.smaato.sdk.core.mvvm.model.soma.SomaAdRequest;

/* loaded from: classes7.dex */
public class InterstitialAdRequest extends SomaAdRequest {
    int displayHeightInDp;
    int displayWidthInDp;
    @NonNull
    String fullscreenDimension;
    private final boolean isSplash;
    private final boolean richMediaIsRewarded;
    private final String videoType;

    public InterstitialAdRequest(@NonNull AdRequest adRequest, String str, @NonNull String str2, int i, int i2, boolean z, boolean z2) {
        super(adRequest);
        this.videoType = str;
        this.fullscreenDimension = str2;
        this.displayWidthInDp = i;
        this.displayHeightInDp = i2;
        this.isSplash = z;
        this.richMediaIsRewarded = z2;
    }

    public int getDisplayHeightInDp() {
        return this.displayHeightInDp;
    }

    public int getDisplayWidthInDp() {
        return this.displayWidthInDp;
    }

    @NonNull
    public String getFullscreenDimension() {
        return this.fullscreenDimension;
    }

    public boolean getIsSplash() {
        return this.isSplash;
    }

    public boolean getRichMediaIsRewarded() {
        return this.richMediaIsRewarded;
    }

    public String getVideoType() {
        return this.videoType;
    }
}
