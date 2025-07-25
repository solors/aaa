package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.bidder.g */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14244g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f26963a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f26963a = iArr;
        try {
            iArr[UnitDisplayType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26963a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26963a[UnitDisplayType.REWARDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26963a[UnitDisplayType.MRECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
