package com.apm.insight.p119b;

import com.apm.insight.NpthBus;
import com.apm.insight.p124f.EnsureInitInner;
import com.apm.insight.p124f.EnsureReporter;

/* renamed from: com.apm.insight.b.a */
/* loaded from: classes2.dex */
public final class ANRInfoHelper {
    public ANRInfoHelper() {
        EnsureInitInner.m101921a();
    }

    /* renamed from: a */
    public static void m102138a(String str) {
        if (NpthBus.m102009i().isEnsureEnable()) {
            EnsureReporter.m101908a(Thread.currentThread().getStackTrace(), str, "EnsureNotReachHere");
        }
    }
}
