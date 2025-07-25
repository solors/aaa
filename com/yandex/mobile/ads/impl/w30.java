package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class w30 implements wm1 {

    /* renamed from: a */
    private final Executor f87097a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.w30$a */
    /* loaded from: classes8.dex */
    public final class ExecutorC31719a implements Executor {

        /* renamed from: a */
        final /* synthetic */ Handler f87098a;

        ExecutorC31719a(Handler handler) {
            this.f87098a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f87098a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.w30$b */
    /* loaded from: classes8.dex */
    public static class RunnableC31720b implements Runnable {

        /* renamed from: b */
        private final ml1 f87099b;

        /* renamed from: c */
        private final om1 f87100c;

        /* renamed from: d */
        private final Runnable f87101d;

        public RunnableC31720b(ml1 ml1Var, om1 om1Var, Runnable runnable) {
            this.f87099b = ml1Var;
            this.f87100c = om1Var;
            this.f87101d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f87099b.m31941n()) {
                this.f87099b.m31951c("canceled-at-delivery");
                return;
            }
            om1 om1Var = this.f87100c;
            yc2 yc2Var = om1Var.f83559c;
            if (yc2Var == null) {
                this.f87099b.mo27505a((ml1) om1Var.f83557a);
            } else {
                this.f87099b.m31959a(yc2Var);
            }
            if (this.f87100c.f83560d) {
                this.f87099b.m31958a("intermediate-response");
            } else {
                this.f87099b.m31951c("done");
            }
            Runnable runnable = this.f87101d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public w30(Handler handler) {
        this.f87097a = new ExecutorC31719a(handler);
    }

    /* renamed from: a */
    public final void m28057a(ml1<?> ml1Var, yc2 yc2Var) {
        ml1Var.m31958a("post-error");
        om1 m30957a = om1.m30957a(yc2Var);
        Executor executor = this.f87097a;
        ((ExecutorC31719a) executor).f87098a.post(new RunnableC31720b(ml1Var, m30957a, null));
    }

    /* renamed from: a */
    public final void m28058a(ml1<?> ml1Var, om1<?> om1Var, Runnable runnable) {
        ml1Var.m31940o();
        ml1Var.m31958a("post-response");
        Executor executor = this.f87097a;
        ((ExecutorC31719a) executor).f87098a.post(new RunnableC31720b(ml1Var, om1Var, runnable));
    }
}
