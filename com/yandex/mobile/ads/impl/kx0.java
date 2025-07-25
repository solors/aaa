package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class kx0 implements InterfaceC31438td {
    @NotNull

    /* renamed from: b */
    private static final Object f81602b = new Object();
    @NotNull

    /* renamed from: a */
    private final Executor f81603a;

    public kx0(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f81603a = executor;
    }

    /* renamed from: b */
    public static /* synthetic */ void m32410b(kx0 kx0Var, C31276rd c31276rd) {
        m32411a(kx0Var, c31276rd);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31438td
    /* renamed from: a */
    public final void mo29225a(@NotNull final C31276rd report) {
        Intrinsics.checkNotNullParameter(report, "report");
        this.f81603a.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.ds2
            @Override // java.lang.Runnable
            public final void run() {
                kx0.m32410b(kx0.this, report);
            }
        });
    }

    /* renamed from: b */
    private static void m32409b(C31276rd c31276rd) {
        c31276rd.m30075a();
        c31276rd.m30074b();
        um0.m28728a(new Object[0]);
    }

    /* renamed from: a */
    public static final void m32411a(kx0 this$0, C31276rd report) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(report, "$report");
        try {
            this$0.getClass();
            m32409b(report);
            AppMetricaLibraryAdapter.reportEvent("ads_sdk", report.m30075a(), report.m30074b());
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }
}
