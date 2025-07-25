package com.google.android.gms.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);
    
    private final int zzb;

    AdFormat(int i) {
        this.zzb = i;
    }

    @Nullable
    public static AdFormat getAdFormat(int i) {
        AdFormat[] values;
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zzb;
    }
}
