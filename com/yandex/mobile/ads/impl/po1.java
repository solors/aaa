package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public abstract class po1<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b */
    private final C30112cq f84031b = new C30112cq();

    /* renamed from: c */
    private final C30112cq f84032c = new C30112cq();

    /* renamed from: d */
    private final Object f84033d = new Object();
    @Nullable

    /* renamed from: e */
    private Exception f84034e;
    @Nullable

    /* renamed from: f */
    private Thread f84035f;

    /* renamed from: g */
    private boolean f84036g;

    /* renamed from: a */
    public final void m30609a() {
        this.f84032c.m35184b();
    }

    /* renamed from: b */
    protected abstract void mo30608b();

    /* renamed from: c */
    protected abstract void mo30607c() throws Exception;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f84033d) {
            if (!this.f84036g && !this.f84032c.m35182d()) {
                this.f84036g = true;
                mo30608b();
                Thread thread = this.f84035f;
                if (thread != null) {
                    if (z) {
                        thread.interrupt();
                    }
                } else {
                    this.f84031b.m35181e();
                    this.f84032c.m35181e();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.f84032c.m35186a();
        if (!this.f84036g) {
            if (this.f84034e == null) {
                return null;
            }
            throw new ExecutionException(this.f84034e);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f84036g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f84032c.m35182d();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f84033d) {
            if (this.f84036g) {
                return;
            }
            this.f84035f = Thread.currentThread();
            this.f84031b.m35181e();
            try {
                try {
                    mo30607c();
                    synchronized (this.f84033d) {
                        this.f84032c.m35181e();
                        this.f84035f = null;
                        Thread.interrupted();
                    }
                } catch (Exception e) {
                    this.f84034e = e;
                    synchronized (this.f84033d) {
                        this.f84032c.m35181e();
                        this.f84035f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f84033d) {
                    this.f84032c.m35181e();
                    this.f84035f = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f84032c.m35185a(TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            if (!this.f84036g) {
                if (this.f84034e == null) {
                    return null;
                }
                throw new ExecutionException(this.f84034e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
