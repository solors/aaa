package io.appmetrica.analytics.adrevenue.fyber.p721v3.impl;

import com.fyber.fairbid.ads.PlacementType;

/* renamed from: io.appmetrica.analytics.adrevenue.fyber.v3.impl.a */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC33681a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f92259a;

    static {
        int[] iArr = new int[PlacementType.values().length];
        f92259a = iArr;
        try {
            iArr[PlacementType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f92259a[PlacementType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f92259a[PlacementType.INTERSTITIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
