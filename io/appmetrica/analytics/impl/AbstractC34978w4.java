package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.w4 */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC34978w4 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f95539a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        f95539a = iArr;
        try {
            iArr[CounterConfigurationReporterType.COMMUTATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f95539a[CounterConfigurationReporterType.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f95539a[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f95539a[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f95539a[CounterConfigurationReporterType.MANUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f95539a[CounterConfigurationReporterType.SELF_SDK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
