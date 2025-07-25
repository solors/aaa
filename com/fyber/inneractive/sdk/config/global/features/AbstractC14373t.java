package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.t */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14373t {

    /* renamed from: a */
    public static final /* synthetic */ int[] f27201a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f27201a = iArr;
        try {
            iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27201a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
