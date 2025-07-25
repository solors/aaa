package com.fyber.inneractive.sdk.p374dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.dv.b */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14423b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f27292a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f27292a = iArr;
        try {
            iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27292a[UnitDisplayType.BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27292a[UnitDisplayType.MRECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f27292a[UnitDisplayType.REWARDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
