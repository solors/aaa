package com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.interstitialad.CreativeOrientation */
/* loaded from: classes8.dex */
public enum CreativeOrientation {
    PORTRAIT,
    LANDSCAPE,
    UNDEFINED;

    @NonNull
    public static CreativeOrientation fromHeader(@Nullable int i) {
        if (i == 1) {
            return PORTRAIT;
        }
        if (i == 2) {
            return LANDSCAPE;
        }
        return UNDEFINED;
    }
}
