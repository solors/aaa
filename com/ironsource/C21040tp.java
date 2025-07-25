package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.tp */
/* loaded from: classes6.dex */
public class C21040tp {

    /* renamed from: a */
    private C20028h5 f53618a;

    /* renamed from: b */
    private InterfaceC21092up f53619b;

    /* renamed from: c */
    private Timer f53620c = null;

    /* renamed from: com.ironsource.tp$a */
    /* loaded from: classes6.dex */
    class C21041a extends TimerTask {
        C21041a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C21040tp.this.f53619b.mo54588a();
        }
    }

    /* renamed from: com.ironsource.tp$b */
    /* loaded from: classes6.dex */
    class C21042b extends TimerTask {
        C21042b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C21040tp.this.f53619b.mo54588a();
        }
    }

    public C21040tp(C20028h5 c20028h5, InterfaceC21092up interfaceC21092up) {
        this.f53618a = c20028h5;
        this.f53619b = interfaceC21092up;
    }

    /* renamed from: d */
    private void m54730d() {
        Timer timer = this.f53620c;
        if (timer != null) {
            timer.cancel();
            this.f53620c = null;
        }
    }

    /* renamed from: b */
    public void m54732b() {
        synchronized (this) {
            m54730d();
        }
        this.f53619b.mo54588a();
    }

    /* renamed from: c */
    public synchronized void m54731c() {
        m54730d();
        Timer timer = new Timer();
        this.f53620c = timer;
        timer.schedule(new C21041a(), this.f53618a.m58289j());
    }

    /* renamed from: a */
    public synchronized void m54734a() {
        m54730d();
        Timer timer = new Timer();
        this.f53620c = timer;
        timer.schedule(new C21042b(), this.f53618a.m58297b());
    }
}
