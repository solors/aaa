package com.inmobi.ads;

import com.inmobi.ads.InMobiBanner;

/* renamed from: com.inmobi.ads.a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC18833a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f47044a;

    static {
        int[] iArr = new int[InMobiBanner.AnimationType.values().length];
        try {
            iArr[InMobiBanner.AnimationType.ANIMATION_ALPHA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InMobiBanner.AnimationType.ROTATE_HORIZONTAL_AXIS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InMobiBanner.AnimationType.ROTATE_VERTICAL_AXIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f47044a = iArr;
    }
}
