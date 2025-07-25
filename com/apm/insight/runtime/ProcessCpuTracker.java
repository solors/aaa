package com.apm.insight.runtime;

import android.system.Os;
import android.system.OsConstants;

/* renamed from: com.apm.insight.runtime.o */
/* loaded from: classes2.dex */
public final class ProcessCpuTracker {

    /* renamed from: a */
    private static long f4084a = -1;

    /* compiled from: ProcessCpuTracker.java */
    /* renamed from: com.apm.insight.runtime.o$a */
    /* loaded from: classes2.dex */
    public static class C3859a {

        /* renamed from: a */
        private static long f4085a = -1;

        /* renamed from: a */
        public static long m101335a() {
            if (ProcessCpuTracker.f4084a == -1) {
                long j = f4085a;
                if (j <= 0) {
                    j = Os.sysconf(OsConstants._SC_CLK_TCK);
                    if (j <= 0) {
                        j = 100;
                    }
                    f4085a = j;
                }
                long unused = ProcessCpuTracker.f4084a = 1000 / j;
            }
            return ProcessCpuTracker.f4084a;
        }

        /* renamed from: a */
        private static long m101334a(String str) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField("os").get(null), Integer.valueOf(i))).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return 100L;
            }
        }
    }
}
