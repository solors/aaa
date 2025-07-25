package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.Di */
/* loaded from: classes9.dex */
public final class C33849Di {

    /* renamed from: a */
    public final String f92731a;

    /* renamed from: b */
    public final Context f92732b;

    /* renamed from: c */
    public final CounterConfigurationReporterType f92733c;

    /* renamed from: d */
    public final C33924Gi f92734d;

    public C33849Di(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C33924Gi c33924Gi) {
        this.f92731a = str;
        this.f92732b = context;
        int i = AbstractC33824Ci.f92676a[counterConfigurationReporterType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.f92733c = null;
            } else {
                this.f92733c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
            }
        } else {
            this.f92733c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        }
        this.f92734d = c33924Gi;
    }
}
