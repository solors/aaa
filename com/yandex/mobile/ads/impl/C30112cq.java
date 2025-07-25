package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* renamed from: com.yandex.mobile.ads.impl.cq */
/* loaded from: classes8.dex */
public final class C30112cq {

    /* renamed from: a */
    private boolean f77724a;

    public C30112cq() {
        this(0);
    }

    /* renamed from: a */
    public final synchronized void m35186a() throws InterruptedException {
        while (!this.f77724a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void m35184b() {
        boolean z = false;
        while (!this.f77724a) {
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
    public final synchronized void m35183c() {
        this.f77724a = false;
    }

    /* renamed from: d */
    public final synchronized boolean m35182d() {
        return this.f77724a;
    }

    /* renamed from: e */
    public final synchronized boolean m35181e() {
        if (this.f77724a) {
            return false;
        }
        this.f77724a = true;
        notifyAll();
        return true;
    }

    public C30112cq(int i) {
    }

    /* renamed from: a */
    public final synchronized boolean m35185a(long j) throws InterruptedException {
        if (j <= 0) {
            return this.f77724a;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            m35186a();
        } else {
            while (!this.f77724a && elapsedRealtime < j2) {
                wait(j2 - elapsedRealtime);
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return this.f77724a;
    }
}
