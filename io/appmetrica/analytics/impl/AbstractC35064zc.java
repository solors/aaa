package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* renamed from: io.appmetrica.analytics.impl.zc */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC35064zc {

    /* renamed from: a */
    public static final /* synthetic */ int[] f95691a;

    static {
        int[] iArr = new int[ModuleAdType.values().length];
        iArr[ModuleAdType.NATIVE.ordinal()] = 1;
        iArr[ModuleAdType.BANNER.ordinal()] = 2;
        iArr[ModuleAdType.REWARDED.ordinal()] = 3;
        iArr[ModuleAdType.INTERSTITIAL.ordinal()] = 4;
        iArr[ModuleAdType.MREC.ordinal()] = 5;
        iArr[ModuleAdType.OTHER.ordinal()] = 6;
        f95691a = iArr;
    }
}
