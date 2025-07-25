package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.ProcessCpuTracker;
import java.util.Comparator;

/* renamed from: com.apm.insight.runtime.f */
/* loaded from: classes2.dex */
public final class CpuInfo {
    static {
        new Comparator<Object>() { // from class: com.apm.insight.runtime.f.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        };
    }

    /* renamed from: a */
    public static long m101409a(int i) {
        return NativeImpl.m101586c(i) * ProcessCpuTracker.C3859a.m101335a();
    }
}
