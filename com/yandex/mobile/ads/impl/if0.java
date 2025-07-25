package com.yandex.mobile.ads.impl;

import ee.DurationUnitJvm;
import kotlin.time.C37700c;
import kotlin.time.Duration;

/* loaded from: classes8.dex */
public final class if0 {

    /* renamed from: a */
    private static final int f80443a;

    /* renamed from: b */
    public static final int f80444b;

    static {
        Duration.C37699a c37699a = Duration.f99494c;
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.f90130g;
        long m16452s = C37700c.m16452s(10, durationUnitJvm);
        DurationUnitJvm durationUnitJvm2 = DurationUnitJvm.f90129f;
        f80443a = Duration.m16505H(m16452s, durationUnitJvm2);
        f80444b = Duration.m16505H(C37700c.m16452s(30, durationUnitJvm), durationUnitJvm2);
        Duration.m16505H(C37700c.m16452s(3, durationUnitJvm), durationUnitJvm2);
    }

    /* renamed from: a */
    public static int m33283a() {
        return f80443a;
    }
}
