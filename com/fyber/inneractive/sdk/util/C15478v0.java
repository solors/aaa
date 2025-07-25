package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.util.v0 */
/* loaded from: classes4.dex */
public final class C15478v0 {

    /* renamed from: a */
    public final TimeUnit f30623a;

    /* renamed from: b */
    public final long f30624b;

    /* renamed from: c */
    public HandlerC15474t0 f30625c;

    /* renamed from: d */
    public boolean f30626d;

    /* renamed from: e */
    public InterfaceC15476u0 f30627e;

    /* renamed from: f */
    public long f30628f;

    public C15478v0(TimeUnit timeUnit, long j) {
        this.f30626d = false;
        this.f30628f = 0L;
        this.f30624b = j;
        this.f30623a = timeUnit;
        IAlog.m76529a("Visible time counter init - time %d", Long.valueOf(j));
    }

    /* renamed from: a */
    public final void m76450a(long j) {
        long uptimeMillis = (SystemClock.uptimeMillis() - j) + 50 + this.f30628f;
        this.f30628f = uptimeMillis;
        if (this.f30627e != null && uptimeMillis > this.f30623a.toMillis(this.f30624b)) {
            this.f30627e.mo76451a();
            return;
        }
        HandlerC15474t0 handlerC15474t0 = this.f30625c;
        if (handlerC15474t0 != null && this.f30627e != null) {
            handlerC15474t0.removeMessages(1932593528);
            this.f30625c.sendEmptyMessageDelayed(1932593528, 50L);
        }
    }

    public C15478v0(TimeUnit timeUnit, long j, long j2) {
        this.f30626d = false;
        this.f30624b = j;
        this.f30623a = timeUnit;
        this.f30628f = j2;
        IAlog.m76529a("Visible time counter init - time %d", Long.valueOf(j));
    }
}
