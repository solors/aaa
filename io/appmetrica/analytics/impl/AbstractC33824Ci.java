package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.Ci */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC33824Ci {

    /* renamed from: a */
    public static final /* synthetic */ int[] f92676a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        f92676a = iArr;
        try {
            iArr[CounterConfigurationReporterType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f92676a[CounterConfigurationReporterType.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
