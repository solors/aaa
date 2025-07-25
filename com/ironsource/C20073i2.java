package com.ironsource;

import com.ironsource.C19950g2;
import com.ironsource.lifecycle.C20271b;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.i2 */
/* loaded from: classes6.dex */
public class C20073i2 {

    /* renamed from: a */
    private final C19950g2 f50513a;

    /* renamed from: b */
    private final InterfaceC21228xk f50514b;

    /* renamed from: c */
    private final C20644pk f50515c = m58049c();

    /* renamed from: d */
    private Timer f50516d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.i2$a */
    /* loaded from: classes6.dex */
    public class RunnableC20074a implements Runnable {
        RunnableC20074a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C20073i2.this.f50514b.mo53896a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.i2$b */
    /* loaded from: classes6.dex */
    public class C20075b extends TimerTask {
        C20075b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C20073i2.this.f50514b.mo53896a();
        }
    }

    public C20073i2(C19950g2 c19950g2, @NotNull InterfaceC21228xk interfaceC21228xk) {
        this.f50513a = c19950g2;
        this.f50514b = interfaceC21228xk;
    }

    /* renamed from: c */
    private C20644pk m58049c() {
        return new C20644pk(new RunnableC20074a(), C20271b.m57448d(), new C20547nt());
    }

    /* renamed from: j */
    private synchronized void m58042j() {
        Timer timer = this.f50516d;
        if (timer != null) {
            timer.cancel();
            this.f50516d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C19950g2 m58051b() {
        return this.f50513a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public boolean m58048d() {
        if (this.f50513a.m58478c() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m58047e() {
        if (this.f50513a.m58476e()) {
            IronLog.INTERNAL.verbose();
            m58050b(this.f50513a.m58478c());
        }
    }

    /* renamed from: f */
    public void m58046f() {
        if (this.f50513a.m58480a() == C19950g2.EnumC19951a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            m58050b(this.f50513a.m58477d());
        }
    }

    /* renamed from: g */
    public void m58045g() {
        if (this.f50513a.m58476e()) {
            IronLog.INTERNAL.verbose();
            m58050b(0L);
        }
    }

    /* renamed from: h */
    public void m58044h() {
        if (this.f50513a.m58480a() == C19950g2.EnumC19951a.AUTOMATIC_LOAD_WHILE_SHOW && this.f50513a.m58477d() >= 0) {
            IronLog.INTERNAL.verbose();
            m58050b(this.f50513a.m58477d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void m58043i() {
        C20644pk c20644pk = this.f50515c;
        if (c20644pk != null) {
            c20644pk.m55786b();
        }
    }

    /* renamed from: k */
    public void m58041k() {
        if (this.f50513a.m58480a() == C19950g2.EnumC19951a.MANUAL_WITH_AUTOMATIC_RELOAD && this.f50513a.m58479b() > 0) {
            IronLog.INTERNAL.verbose();
            m58053a(this.f50513a.m58479b());
        }
    }

    /* renamed from: b */
    private synchronized void m58050b(long j) {
        m58042j();
        Timer timer = new Timer();
        this.f50516d = timer;
        timer.schedule(new C20075b(), j);
    }

    /* renamed from: a */
    public void m58054a() {
        if (this.f50513a.m58480a() == C19950g2.EnumC19951a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            m58043i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m58053a(long j) {
        C20644pk c20644pk = this.f50515c;
        if (c20644pk != null) {
            c20644pk.m55789a(j);
        }
    }
}
