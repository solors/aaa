package com.ironsource;

import android.util.Log;
import com.ironsource.lifecycle.C20271b;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.pk */
/* loaded from: classes6.dex */
public class C20644pk {

    /* renamed from: g */
    private static final String f52425g = "pk";

    /* renamed from: a */
    private final C20271b f52426a;

    /* renamed from: b */
    private final Runnable f52427b;

    /* renamed from: c */
    private final C20547nt f52428c;

    /* renamed from: e */
    private Timer f52430e;

    /* renamed from: d */
    private final Object f52429d = new Object();

    /* renamed from: f */
    private final InterfaceC20105ij f52431f = new C20645a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.pk$b */
    /* loaded from: classes6.dex */
    public class C20646b extends TimerTask {
        C20646b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C20644pk.this.f52426a.m57453b(C20644pk.this.f52431f);
            C20644pk.this.f52428c.m56087b();
            C20644pk.this.f52427b.run();
        }
    }

    public C20644pk(Runnable runnable, C20271b c20271b, C20547nt c20547nt) {
        this.f52427b = runnable;
        this.f52426a = c20271b;
        this.f52428c = c20547nt;
    }

    /* renamed from: b */
    public void m55786b() {
        m55783c();
        this.f52426a.m57453b(this.f52431f);
        this.f52428c.m56087b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m55785b(long j) {
        synchronized (this.f52429d) {
            m55783c();
            Timer timer = new Timer();
            this.f52430e = timer;
            timer.schedule(new C20646b(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m55783c() {
        synchronized (this.f52429d) {
            Timer timer = this.f52430e;
            if (timer != null) {
                timer.cancel();
                this.f52430e = null;
            }
        }
    }

    /* renamed from: a */
    public void m55790a() {
        m55789a(0L);
    }

    /* renamed from: a */
    public void m55789a(long j) {
        if (j < 0) {
            Log.d(f52425g, "cannot start timer with delay < 0");
            return;
        }
        this.f52426a.m57457a(this.f52431f);
        this.f52428c.m56088a(j);
        if (this.f52426a.m57445e()) {
            this.f52428c.m56085c(System.currentTimeMillis());
        } else {
            m55785b(j);
        }
    }

    /* renamed from: com.ironsource.pk$a */
    /* loaded from: classes6.dex */
    class C20645a implements InterfaceC20105ij {
        C20645a() {
        }

        @Override // com.ironsource.InterfaceC20105ij
        /* renamed from: b */
        public void mo55607b() {
            C20644pk.this.f52428c.m56085c(System.currentTimeMillis());
            C20644pk.this.m55783c();
        }

        @Override // com.ironsource.InterfaceC20105ij
        /* renamed from: c */
        public void mo55606c() {
            C20644pk.this.f52428c.m56086b(System.currentTimeMillis());
            C20644pk c20644pk = C20644pk.this;
            c20644pk.m55785b(c20644pk.f52428c.m56089a());
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
}
