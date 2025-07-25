package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

import java.util.Locale;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.PlacementType */
/* loaded from: classes8.dex */
public enum PlacementType {
    INLINE,
    INTERSTITIAL;

    public String toJavascriptString() {
        return toString().toLowerCase(Locale.US);
    }
}
