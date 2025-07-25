package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lq0 {
    @NotNull

    /* renamed from: a */
    private final Handler f81885a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.lq0$a */
    /* loaded from: classes8.dex */
    public final class RunnableC30802a implements Runnable {

        /* renamed from: b */
        private final long f81886b;
        @NotNull

        /* renamed from: c */
        private final AbstractRunnableC31828xm f81887c;

        /* renamed from: d */
        final /* synthetic */ lq0 f81888d;

        public RunnableC30802a(lq0 lq0Var, long j, @NotNull a01 periodicJob) {
            Intrinsics.checkNotNullParameter(periodicJob, "periodicJob");
            this.f81888d = lq0Var;
            this.f81886b = j;
            this.f81887c = periodicJob;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f81887c.m27457b()) {
                this.f81887c.run();
                this.f81888d.f81885a.postDelayed(this, this.f81886b);
            }
        }
    }

    public lq0(@NotNull Handler mainThreadHandler) {
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        this.f81885a = mainThreadHandler;
    }

    /* renamed from: a */
    public final void m32215a() {
        this.f81885a.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void m32214a(long j, @NotNull a01 periodicJob) {
        Intrinsics.checkNotNullParameter(periodicJob, "periodicJob");
        if (periodicJob.m27457b()) {
            this.f81885a.postDelayed(new RunnableC30802a(this, j, periodicJob), j);
        }
    }
}
