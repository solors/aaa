package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.f */
/* loaded from: classes6.dex */
public abstract class AbstractC19861f<T> {

    /* renamed from: a */
    private Object f49973a = new Object();

    /* renamed from: b */
    private Timer f49974b;

    /* renamed from: c */
    protected long f49975c;

    /* renamed from: d */
    protected T f49976d;

    /* renamed from: com.ironsource.f$a */
    /* loaded from: classes6.dex */
    class C19862a extends TimerTask {
        C19862a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC19861f.this.mo55899b();
        }
    }

    public AbstractC19861f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m58739a(T t) {
        if (m58740a() || t == null) {
            return;
        }
        this.f49976d = t;
        m58738c();
        synchronized (this.f49973a) {
            Timer timer = new Timer();
            this.f49974b = timer;
            timer.schedule(new C19862a(), this.f49975c);
        }
    }

    /* renamed from: b */
    protected abstract void mo55899b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m58738c() {
        synchronized (this.f49973a) {
            Timer timer = this.f49974b;
            if (timer != null) {
                timer.cancel();
                this.f49974b = null;
            }
        }
    }

    /* renamed from: d */
    public void m58737d() {
        this.f49976d = null;
    }

    public AbstractC19861f(long j) {
        this.f49975c = j;
    }

    /* renamed from: a */
    protected boolean m58740a() {
        return this.f49975c <= 0;
    }
}
