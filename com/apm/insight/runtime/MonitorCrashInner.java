package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;
import com.apm.insight.NpthBus;

/* renamed from: com.apm.insight.runtime.k */
/* loaded from: classes2.dex */
public final class MonitorCrashInner {

    /* renamed from: a */
    private static MonitorCrash f4066a = null;

    /* renamed from: b */
    private static int f4067b = -1;

    /* renamed from: c */
    private static int f4068c;

    /* renamed from: a */
    public static MonitorCrash m101392a() {
        if (f4066a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(NpthBus.m102011g(), "239017", 1030851L, "1.3.8.nourl-rc.1", "com.apm.insight");
            f4066a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f4066a;
    }

    /* renamed from: a */
    public static void m101391a(Throwable th, String str) {
        boolean z;
        if (NpthBus.m102011g() == null) {
            return;
        }
        if (f4067b == -1) {
            f4067b = 5;
        }
        int i = f4068c;
        if (i < f4067b) {
            z = true;
            f4068c = i + 1;
        } else {
            z = false;
        }
        if (z) {
            m101392a().reportCustomErr(str, "INNER", th);
        }
    }
}
