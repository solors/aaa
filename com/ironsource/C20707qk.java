package com.ironsource;

import com.ironsource.lifecycle.C20271b;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.qk */
/* loaded from: classes6.dex */
public class C20707qk implements InterfaceC20105ij {

    /* renamed from: b */
    private Timer f52606b;

    /* renamed from: e */
    private long f52609e;

    /* renamed from: f */
    private Runnable f52610f;

    /* renamed from: a */
    private String f52605a = "INTERNAL";

    /* renamed from: c */
    private boolean f52607c = false;

    /* renamed from: d */
    private Long f52608d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.qk$a */
    /* loaded from: classes6.dex */
    public class C20708a extends TimerTask {
        C20708a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C20707qk.this.f52610f.run();
        }
    }

    public C20707qk(long j, Runnable runnable, boolean z) {
        this.f52609e = j;
        this.f52610f = runnable;
        if (z) {
            m55602g();
        }
    }

    /* renamed from: f */
    private synchronized void m55603f() {
        Timer timer = this.f52606b;
        if (timer != null) {
            timer.cancel();
            this.f52606b = null;
        }
    }

    /* renamed from: h */
    private synchronized void m55601h() {
        if (this.f52606b == null) {
            Timer timer = new Timer();
            this.f52606b = timer;
            timer.schedule(new C20708a(), this.f52609e);
            Calendar.getInstance().setTimeInMillis(this.f52608d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC20105ij
    /* renamed from: b */
    public void mo55607b() {
        if (this.f52606b != null) {
            m55603f();
        }
    }

    @Override // com.ironsource.InterfaceC20105ij
    /* renamed from: c */
    public void mo55606c() {
        Long l;
        if (this.f52606b == null && (l = this.f52608d) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.f52609e = longValue;
            if (longValue <= 0) {
                m55604e();
                this.f52610f.run();
                return;
            }
            m55601h();
        }
    }

    /* renamed from: e */
    public void m55604e() {
        m55603f();
        this.f52607c = false;
        this.f52608d = null;
        C20271b.m57448d().m57453b(this);
    }

    /* renamed from: g */
    public void m55602g() {
        if (this.f52607c) {
            return;
        }
        this.f52607c = true;
        C20271b.m57448d().m57457a(this);
        this.f52608d = Long.valueOf(System.currentTimeMillis() + this.f52609e);
        if (!C20271b.m57448d().m57445e()) {
            m55601h();
        }
    }

    @Override // com.ironsource.InterfaceC20105ij
    /* renamed from: a */
    public void mo55609a() {
    }

    @Override // com.ironsource.InterfaceC20105ij
    /* renamed from: d */
    public void mo55605d() {
    }
}
