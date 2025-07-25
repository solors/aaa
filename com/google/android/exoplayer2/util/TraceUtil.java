package com.google.android.exoplayer2.util;

import android.os.Trace;
import androidx.annotation.RequiresApi;

/* loaded from: classes4.dex */
public final class TraceUtil {
    private TraceUtil() {
    }

    @RequiresApi(18)
    /* renamed from: a */
    private static void m72542a(String str) {
        Trace.beginSection(str);
    }

    @RequiresApi(18)
    /* renamed from: b */
    private static void m72541b() {
        Trace.endSection();
    }

    public static void beginSection(String str) {
        if (Util.SDK_INT >= 18) {
            m72542a(str);
        }
    }

    public static void endSection() {
        if (Util.SDK_INT >= 18) {
            m72541b();
        }
    }
}
