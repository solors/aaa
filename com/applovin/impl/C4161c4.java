package com.applovin.impl;

/* renamed from: com.applovin.impl.c4 */
/* loaded from: classes2.dex */
public class C4161c4 {

    /* renamed from: a */
    private final InterfaceC4747l3 f5188a;

    /* renamed from: b */
    private boolean f5189b;

    public C4161c4() {
        this(InterfaceC4747l3.f7619a);
    }

    /* renamed from: a */
    public synchronized void m100273a() {
        while (!this.f5189b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized void m100272b() {
        boolean z = false;
        while (!this.f5189b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public synchronized boolean m100271c() {
        boolean z;
        z = this.f5189b;
        this.f5189b = false;
        return z;
    }

    /* renamed from: d */
    public synchronized boolean m100270d() {
        return this.f5189b;
    }

    /* renamed from: e */
    public synchronized boolean m100269e() {
        if (this.f5189b) {
            return false;
        }
        this.f5189b = true;
        notifyAll();
        return true;
    }

    public C4161c4(InterfaceC4747l3 interfaceC4747l3) {
        this.f5188a = interfaceC4747l3;
    }
}
