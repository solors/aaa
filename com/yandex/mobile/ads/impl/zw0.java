package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ax0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class zw0 {
    /* renamed from: a */
    public static final void m25979a(@NotNull ArrayList report) {
        Intrinsics.checkNotNullParameter(report, "report");
        Iterator it = report.iterator();
        while (it.hasNext()) {
            ax0.C29970a c29970a = (ax0.C29970a) it.next();
            int ordinal = c29970a.m35742b().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    km0.m32488a(c29970a.m35743a(), new Object[0]);
                }
            } else {
                km0.m32486b(c29970a.m35743a(), new Object[0]);
            }
        }
    }
}
