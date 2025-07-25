package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k72 {
    @NotNull

    /* renamed from: a */
    private final z72 f81328a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30707a f81329b;
    @NotNull

    /* renamed from: c */
    private final Handler f81330c;

    /* renamed from: d */
    private boolean f81331d;

    /* renamed from: e */
    private boolean f81332e;

    /* renamed from: com.yandex.mobile.ads.impl.k72$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30707a {
        /* renamed from: b */
        void mo29834b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.k72$b */
    /* loaded from: classes8.dex */
    private final class RunnableC30708b implements Runnable {
        public RunnableC30708b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!k72.this.f81331d && k72.this.f81328a.m26323a(y72.f88091d)) {
                k72.this.f81329b.mo29834b();
                k72.this.f81331d = true;
                k72.this.m32633b();
                return;
            }
            k72.this.f81330c.postDelayed(this, 200L);
        }
    }

    public k72(@NotNull z72 statusController, @NotNull InterfaceC30707a preparedListener) {
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(preparedListener, "preparedListener");
        this.f81328a = statusController;
        this.f81329b = preparedListener;
        this.f81330c = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void m32635a() {
        if (this.f81332e || this.f81331d) {
            return;
        }
        this.f81332e = true;
        this.f81330c.post(new RunnableC30708b());
    }

    /* renamed from: b */
    public final void m32633b() {
        this.f81330c.removeCallbacksAndMessages(null);
        this.f81332e = false;
    }
}
