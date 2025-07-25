package com.amazon.aps.ads.model;

import kotlin.Metadata;

/* compiled from: ApsAdFormat.kt */
@Metadata
/* loaded from: classes2.dex */
public enum ApsAdFormat {
    BANNER,
    MREC,
    LEADERBOARD,
    BANNER_SMART,
    INTERSTITIAL,
    REWARDED_VIDEO,
    INSTREAM_VIDEO;

    /* compiled from: ApsAdFormat.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApsAdFormat.values().length];
            iArr[ApsAdFormat.BANNER.ordinal()] = 1;
            iArr[ApsAdFormat.BANNER_SMART.ordinal()] = 2;
            iArr[ApsAdFormat.MREC.ordinal()] = 3;
            iArr[ApsAdFormat.LEADERBOARD.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean isBanner() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return true;
        }
        return false;
    }
}
