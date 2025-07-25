package com.apm.insight.p130l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* renamed from: com.apm.insight.l.i */
/* loaded from: classes2.dex */
public final class JellyBeanV16Compat {

    /* renamed from: a */
    private static C3824a f3934a = new C3825b((byte) 0);

    /* compiled from: JellyBeanV16Compat.java */
    /* renamed from: com.apm.insight.l.i$a */
    /* loaded from: classes2.dex */
    static class C3824a {
        private C3824a() {
        }

        /* synthetic */ C3824a(byte b) {
            this();
        }

        /* renamed from: a */
        public long mo101681a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    /* compiled from: JellyBeanV16Compat.java */
    @TargetApi(16)
    /* renamed from: com.apm.insight.l.i$b */
    /* loaded from: classes2.dex */
    static class C3825b extends C3824a {
        private C3825b() {
            super((byte) 0);
        }

        @Override // com.apm.insight.p130l.JellyBeanV16Compat.C3824a
        /* renamed from: a */
        public final long mo101681a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }

        /* synthetic */ C3825b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static long m101682a(ActivityManager.MemoryInfo memoryInfo) {
        return f3934a.mo101681a(memoryInfo);
    }
}
