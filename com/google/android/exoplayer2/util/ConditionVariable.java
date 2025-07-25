package com.google.android.exoplayer2.util;

/* loaded from: classes4.dex */
public class ConditionVariable {

    /* renamed from: a */
    private final Clock f36052a;

    /* renamed from: b */
    private boolean f36053b;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.f36053b) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.f36053b) {
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

    public synchronized boolean close() {
        boolean z;
        z = this.f36053b;
        this.f36053b = false;
        return z;
    }

    public synchronized boolean isOpen() {
        return this.f36053b;
    }

    public synchronized boolean open() {
        if (this.f36053b) {
            return false;
        }
        this.f36053b = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.f36052a = clock;
    }

    public synchronized boolean block(long j) throws InterruptedException {
        if (j <= 0) {
            return this.f36053b;
        }
        long elapsedRealtime = this.f36052a.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            block();
        } else {
            while (!this.f36053b && elapsedRealtime < j2) {
                wait(j2 - elapsedRealtime);
                elapsedRealtime = this.f36052a.elapsedRealtime();
            }
        }
        return this.f36053b;
    }
}
