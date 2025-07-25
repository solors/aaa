package com.apm.insight.p128j;

import android.os.Handler;

/* renamed from: com.apm.insight.j.a */
/* loaded from: classes2.dex */
public abstract class BaseTask implements Runnable {

    /* renamed from: a */
    private Handler f3820a;

    /* renamed from: b */
    private final long f3821b = 0;

    /* renamed from: c */
    private final long f3822c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseTask(Handler handler, long j) {
        this.f3820a = handler;
        this.f3822c = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m101860a() {
        this.f3820a.post(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final long m101858b() {
        return this.f3822c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m101859a(long j) {
        if (j > 0) {
            this.f3820a.postDelayed(this, j);
        } else {
            this.f3820a.post(this);
        }
    }
}
