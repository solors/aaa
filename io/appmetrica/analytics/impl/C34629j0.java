package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.j0 */
/* loaded from: classes9.dex */
public final class C34629j0 {

    /* renamed from: j */
    public static final long f94646j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    public final Context f94647a;

    /* renamed from: b */
    public final ICommonExecutor f94648b;

    /* renamed from: e */
    public CountDownLatch f94651e;

    /* renamed from: g */
    public final C34004K1 f94653g;

    /* renamed from: d */
    public IAppMetricaService f94650d = null;

    /* renamed from: f */
    public final Object f94652f = new Object();

    /* renamed from: h */
    public final RunnableC34575h0 f94654h = new RunnableC34575h0(this);

    /* renamed from: i */
    public final ServiceConnectionC34602i0 f94655i = new ServiceConnectionC34602i0(this);

    /* renamed from: c */
    public boolean f94649c = false;

    public C34629j0(Context context, ICommonExecutor iCommonExecutor, C34004K1 c34004k1) {
        this.f94647a = context.getApplicationContext();
        this.f94648b = iCommonExecutor;
        this.f94653g = c34004k1;
    }

    /* renamed from: a */
    public final synchronized boolean m21532a() {
        return this.f94650d != null;
    }

    /* renamed from: b */
    public final void m21530b() {
        synchronized (this.f94652f) {
            this.f94648b.remove(this.f94654h);
        }
    }

    /* renamed from: c */
    public final void m21529c() {
        ICommonExecutor iCommonExecutor = this.f94648b;
        synchronized (this.f94652f) {
            iCommonExecutor.remove(this.f94654h);
            if (!this.f94649c) {
                iCommonExecutor.executeDelayed(this.f94654h, f94646j);
            }
        }
    }

    /* renamed from: a */
    public final void m21531a(Long l) {
        try {
            synchronized (this) {
                CountDownLatch countDownLatch = this.f94651e;
                if (countDownLatch == null) {
                    return;
                }
                countDownLatch.await(l.longValue(), TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused) {
        }
    }
}
