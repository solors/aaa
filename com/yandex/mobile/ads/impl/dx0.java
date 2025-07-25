package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.StatFs;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dx0 {

    /* renamed from: com.yandex.mobile.ads.impl.dx0$a */
    /* loaded from: classes8.dex */
    public static final class C30197a {
        /* renamed from: a */
        public static long m34837a(@NotNull Context context, long j, long j2) {
            long m16911k;
            long j3;
            long m16911k2;
            long m16911k3;
            long m16916f;
            Intrinsics.checkNotNullParameter(context, "context");
            m16911k = _Ranges.m16911k(j, j2);
            try {
                StatFs statFs = new StatFs(b00.m35724a(context, "").getAbsolutePath());
                j3 = statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (IllegalArgumentException unused) {
                um0.m28726c(new Object[0]);
                j3 = m16911k;
            }
            long j4 = 100;
            m16911k2 = _Ranges.m16911k(m16911k, (j3 * 50) / j4);
            m16911k3 = _Ranges.m16911k((2 * j3) / j4, j2);
            m16916f = _Ranges.m16916f(m16911k3, m16911k2);
            return m16916f;
        }
    }

    /* renamed from: a */
    public static long m34838a() {
        Runtime runtime = Runtime.getRuntime();
        return Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }
}
