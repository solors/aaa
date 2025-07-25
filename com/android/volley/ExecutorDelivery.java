package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.android.volley.f */
/* loaded from: classes2.dex */
public class ExecutorDelivery implements ResponseDelivery {

    /* renamed from: a */
    private final Executor f3466a;

    /* compiled from: ExecutorDelivery.java */
    /* renamed from: com.android.volley.f$a */
    /* loaded from: classes2.dex */
    class ExecutorC3746a implements Executor {

        /* renamed from: b */
        final /* synthetic */ Handler f3467b;

        ExecutorC3746a(Handler handler) {
            this.f3467b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f3467b.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExecutorDelivery.java */
    /* renamed from: com.android.volley.f$b */
    /* loaded from: classes2.dex */
    public static class RunnableC3747b implements Runnable {

        /* renamed from: b */
        private final Request f3469b;

        /* renamed from: c */
        private final Response f3470c;

        /* renamed from: d */
        private final Runnable f3471d;

        public RunnableC3747b(Request request, Response response, Runnable runnable) {
            this.f3469b = request;
            this.f3470c = response;
            this.f3471d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3469b.isCanceled()) {
                this.f3469b.finish("canceled-at-delivery");
                return;
            }
            if (this.f3470c.m102283b()) {
                this.f3469b.deliverResponse(this.f3470c.f3495a);
            } else {
                this.f3469b.deliverError(this.f3470c.f3497c);
            }
            if (this.f3470c.f3498d) {
                this.f3469b.addMarker("intermediate-response");
            } else {
                this.f3469b.finish("done");
            }
            Runnable runnable = this.f3471d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ExecutorDelivery(Handler handler) {
        this.f3466a = new ExecutorC3746a(handler);
    }

    @Override // com.android.volley.ResponseDelivery
    /* renamed from: a */
    public void mo102281a(Request<?> request, Response<?> response) {
        mo102280b(request, response, null);
    }

    @Override // com.android.volley.ResponseDelivery
    /* renamed from: b */
    public void mo102280b(Request<?> request, Response<?> response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.f3466a.execute(new RunnableC3747b(request, response, runnable));
    }

    @Override // com.android.volley.ResponseDelivery
    /* renamed from: c */
    public void mo102279c(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.f3466a.execute(new RunnableC3747b(request, Response.m102284a(volleyError), null));
    }
}
