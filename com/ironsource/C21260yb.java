package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.yb */
/* loaded from: classes6.dex */
public class C21260yb {

    /* renamed from: e */
    public static final int f54568e = -1;

    /* renamed from: a */
    private Runnable f54569a = new RunnableC21261a();

    /* renamed from: b */
    private int f54570b;

    /* renamed from: c */
    private InterfaceC20554o f54571c;

    /* renamed from: d */
    private C20707qk f54572d;

    /* renamed from: com.ironsource.yb$a */
    /* loaded from: classes6.dex */
    class RunnableC21261a implements Runnable {
        RunnableC21261a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            if (C21260yb.this.f54571c != null) {
                C21260yb.this.f54571c.mo56077b();
            }
        }
    }

    public C21260yb(int i, InterfaceC20554o interfaceC20554o) {
        this.f54571c = interfaceC20554o;
        this.f54570b = i;
    }

    /* renamed from: b */
    public boolean m54010b() {
        if (this.f54570b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m54013a() {
        if (!m54010b() || this.f54572d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f54572d.m55604e();
        this.f54572d = null;
    }

    /* renamed from: a */
    public void m54012a(long j) {
        if (m54010b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f54570b) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f54571c.mo56077b();
                return;
            }
            m54013a();
            this.f54572d = new C20707qk(millis, this.f54569a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }
}
