package com.taurusx.tax.p597g.p599b;

import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p597g.p598a.C28392b;
import com.taurusx.tax.p597g.p598a.C28393c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taurusx.tax.g.b.l */
/* loaded from: classes7.dex */
public class C28409l {

    /* renamed from: i */
    public static final C28392b f73825i = C28393c.m38142a("ProxyCache");

    /* renamed from: a */
    public final InterfaceC28413o f73826a;

    /* renamed from: b */
    public final InterfaceC28394a f73827b;

    /* renamed from: f */
    public volatile Thread f73831f;

    /* renamed from: g */
    public volatile boolean f73832g;

    /* renamed from: c */
    public final Object f73828c = new Object();

    /* renamed from: d */
    public final Object f73829d = new Object();

    /* renamed from: h */
    public volatile int f73833h = -1;

    /* renamed from: e */
    public final AtomicInteger f73830e = new AtomicInteger();

    /* renamed from: com.taurusx.tax.g.b.l$a */
    /* loaded from: classes7.dex */
    public class RunnableC28410a implements Runnable {
        public RunnableC28410a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C28409l c28409l = C28409l.this;
            c28409l.getClass();
            long j = -1;
            long j2 = 0;
            try {
                j2 = c28409l.f73827b.mo38105b();
                c28409l.f73826a.mo38111a(j2);
                j = c28409l.f73826a.mo38112a();
                byte[] bArr = new byte[8192];
                while (true) {
                    int mo38110a = c28409l.f73826a.mo38110a(bArr);
                    boolean z = false;
                    if (mo38110a != -1) {
                        synchronized (c28409l.f73829d) {
                            if (Thread.currentThread().isInterrupted() || c28409l.f73832g) {
                                z = true;
                            }
                            if (!z) {
                                c28409l.f73827b.mo38107a(bArr, mo38110a);
                            } else {
                                return;
                            }
                        }
                        j2 += mo38110a;
                        c28409l.m38120a(j2, j);
                    } else {
                        synchronized (c28409l.f73829d) {
                            if (Thread.currentThread().isInterrupted() || c28409l.f73832g) {
                                z = true;
                            }
                            if (!z && c28409l.f73827b.mo38105b() == c28409l.f73826a.mo38112a()) {
                                c28409l.f73827b.mo38108a();
                            }
                        }
                        c28409l.f73833h = 100;
                        c28409l.mo38121a(c28409l.f73833h);
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public C28409l(InterfaceC28413o interfaceC28413o, InterfaceC28394a interfaceC28394a) {
        this.f73826a = (InterfaceC28413o) C28207b.m38455a(interfaceC28413o);
        this.f73827b = (InterfaceC28394a) C28207b.m38455a(interfaceC28394a);
    }

    /* renamed from: a */
    public void mo38121a(int i) {
        throw null;
    }

    /* renamed from: a */
    public final void m38120a(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        int i2 = i == 0 ? 100 : (int) ((((float) j) / ((float) j2)) * 100.0f);
        boolean z = i2 != this.f73833h;
        if ((i >= 0) && z) {
            mo38121a(i2);
        }
        this.f73833h = i2;
        synchronized (this.f73828c) {
            this.f73828c.notifyAll();
        }
    }

    /* renamed from: a */
    public final void m38122a() {
        try {
            this.f73826a.close();
        } catch (C28411m e) {
            m38119a(new C28411m("Error closing source " + this.f73826a, e));
        }
    }

    /* renamed from: a */
    public final void m38119a(Throwable th) {
        if (th instanceof C28406j) {
            f73825i.m38148a(3, "ProxyCache is interrupted", (Throwable) null);
        } else {
            f73825i.m38148a(6, "ProxyCache error", th);
        }
    }
}
