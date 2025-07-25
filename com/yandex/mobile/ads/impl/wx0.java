package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wx0 {
    @NotNull

    /* renamed from: a */
    private final Executor f87434a;
    @NotNull

    /* renamed from: b */
    private final Executor f87435b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ wx0() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.l03 r0 = new com.yandex.mobile.ads.impl.l03
            r0.<init>()
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            int r1 = r1 + (-1)
            r2 = 2
            r3 = 4
            int r1 = kotlin.ranges.C37635g.m16930n(r1, r2, r3)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1)
            java.lang.String r2 = "newFixedThreadPool(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r4.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wx0.<init>():void");
    }

    /* renamed from: a */
    public static final void m27730a(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        new Handler(Looper.getMainLooper()).post(r);
    }

    /* renamed from: b */
    public static /* synthetic */ void m27728b(Runnable runnable) {
        m27730a(runnable);
    }

    @NotNull
    /* renamed from: b */
    public final Executor m27729b() {
        return this.f87434a;
    }

    @NotNull
    /* renamed from: a */
    public final Executor m27731a() {
        return this.f87435b;
    }

    public wx0(@NotNull Executor mainThreadExecutor, @NotNull Executor backgroundExecutor) {
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.f87434a = mainThreadExecutor;
        this.f87435b = backgroundExecutor;
    }
}
