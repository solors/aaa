package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.flow.r */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14536r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f27539a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f27539a = iArr;
        try {
            iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27539a[UnitDisplayType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
