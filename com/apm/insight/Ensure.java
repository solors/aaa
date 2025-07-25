package com.apm.insight;

import com.apm.insight.p119b.ANRInfoHelper;
import com.apm.insight.p124f.EnsureReporter;
import com.apm.insight.p130l.Filters;

/* renamed from: com.apm.insight.c */
/* loaded from: classes2.dex */
public final class Ensure {

    /* renamed from: a */
    private static ANRInfoHelper f3695a = new ANRInfoHelper();

    /* renamed from: a */
    public static ANRInfoHelper m102051a() {
        return f3695a;
    }

    /* renamed from: a */
    public static void m102050a(Throwable th, String str) {
        if (NpthBus.m102009i().isEnsureEnable() && !Filters.m101699a(th)) {
            EnsureReporter.m101915a(th, str, "core_exception_monitor");
        }
    }
}
