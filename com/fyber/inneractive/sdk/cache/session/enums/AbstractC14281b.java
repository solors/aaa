package com.fyber.inneractive.sdk.cache.session.enums;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.cache.session.enums.b */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC14281b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f26991a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f26991a = iArr;
        try {
            iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26991a[UnitDisplayType.MRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26991a[UnitDisplayType.BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26991a[UnitDisplayType.INTERSTITIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
