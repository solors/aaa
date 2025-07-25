package com.applovin.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* renamed from: com.applovin.impl.rh */
/* loaded from: classes2.dex */
public final class C5266rh {

    /* renamed from: a */
    private final InterfaceC5268b f9440a;

    /* renamed from: b */
    private final InterfaceC5267a f9441b;

    /* renamed from: c */
    private final InterfaceC4747l3 f9442c;

    /* renamed from: d */
    private final AbstractC4406fo f9443d;

    /* renamed from: e */
    private int f9444e;

    /* renamed from: f */
    private Object f9445f;

    /* renamed from: g */
    private Looper f9446g;

    /* renamed from: h */
    private int f9447h;

    /* renamed from: i */
    private long f9448i = -9223372036854775807L;

    /* renamed from: j */
    private boolean f9449j = true;

    /* renamed from: k */
    private boolean f9450k;

    /* renamed from: l */
    private boolean f9451l;

    /* renamed from: m */
    private boolean f9452m;

    /* renamed from: n */
    private boolean f9453n;

    /* renamed from: com.applovin.impl.rh$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5267a {
        /* renamed from: a */
        void mo95844a(C5266rh c5266rh);
    }

    /* renamed from: com.applovin.impl.rh$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5268b {
        /* renamed from: a */
        void mo93753a(int i, Object obj);
    }

    public C5266rh(InterfaceC5267a interfaceC5267a, InterfaceC5268b interfaceC5268b, AbstractC4406fo abstractC4406fo, int i, InterfaceC4747l3 interfaceC4747l3, Looper looper) {
        this.f9441b = interfaceC5267a;
        this.f9440a = interfaceC5268b;
        this.f9443d = abstractC4406fo;
        this.f9446g = looper;
        this.f9442c = interfaceC4747l3;
        this.f9447h = i;
    }

    /* renamed from: a */
    public synchronized boolean m95856a(long j) {
        boolean z;
        AbstractC4100b1.m100577b(this.f9450k);
        AbstractC4100b1.m100577b(this.f9446g.getThread() != Thread.currentThread());
        long mo93849c = this.f9442c.mo93849c() + j;
        while (true) {
            z = this.f9452m;
            if (z || j <= 0) {
                break;
            }
            this.f9442c.mo93850b();
            wait(j);
            j = mo93849c - this.f9442c.mo93849c();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f9451l;
    }

    /* renamed from: b */
    public Looper m95853b() {
        return this.f9446g;
    }

    /* renamed from: c */
    public Object m95852c() {
        return this.f9445f;
    }

    /* renamed from: d */
    public long m95851d() {
        return this.f9448i;
    }

    /* renamed from: e */
    public InterfaceC5268b m95850e() {
        return this.f9440a;
    }

    /* renamed from: f */
    public AbstractC4406fo m95849f() {
        return this.f9443d;
    }

    /* renamed from: g */
    public int m95848g() {
        return this.f9444e;
    }

    /* renamed from: h */
    public int m95847h() {
        return this.f9447h;
    }

    /* renamed from: i */
    public synchronized boolean m95846i() {
        return this.f9453n;
    }

    /* renamed from: j */
    public C5266rh m95845j() {
        AbstractC4100b1.m100577b(!this.f9450k);
        if (this.f9448i == -9223372036854775807L) {
            AbstractC4100b1.m100580a(this.f9449j);
        }
        this.f9450k = true;
        this.f9441b.mo95844a(this);
        return this;
    }

    /* renamed from: a */
    public boolean m95858a() {
        return this.f9449j;
    }

    /* renamed from: a */
    public synchronized void m95854a(boolean z) {
        this.f9451l = z | this.f9451l;
        this.f9452m = true;
        notifyAll();
    }

    /* renamed from: a */
    public C5266rh m95855a(Object obj) {
        AbstractC4100b1.m100577b(!this.f9450k);
        this.f9445f = obj;
        return this;
    }

    /* renamed from: a */
    public C5266rh m95857a(int i) {
        AbstractC4100b1.m100577b(!this.f9450k);
        this.f9444e = i;
        return this;
    }
}
