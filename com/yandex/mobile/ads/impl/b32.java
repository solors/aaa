package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b32 {

    /* renamed from: a */
    private static volatile boolean f77084a;
    @NotNull

    /* renamed from: b */
    private static final Object f77085b = new Object();

    /* renamed from: c */
    public static final /* synthetic */ int f77086c = 0;

    private b32() {
    }

    /* renamed from: a */
    public static void m35657a(Context context, jl1 reporter) {
        yz1 threadUtils = new yz1();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(threadUtils, "threadUtils");
        if (!f77084a) {
            synchronized (f77085b) {
                if (!f77084a) {
                    int i = as1.f76895l;
                    yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
                    if (m35796a != null && m35796a.m26736r()) {
                        a32 handler = new a32(reporter, Thread.getDefaultUncaughtExceptionHandler(), m35796a);
                        Intrinsics.checkNotNullParameter(handler, "handler");
                        Thread.setDefaultUncaughtExceptionHandler(handler);
                        f77084a = true;
                    }
                }
                Unit unit = Unit.f99208a;
            }
        }
    }
}
