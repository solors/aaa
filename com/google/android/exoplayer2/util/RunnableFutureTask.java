package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b */
    private final ConditionVariable f36145b = new ConditionVariable();

    /* renamed from: c */
    private final ConditionVariable f36146c = new ConditionVariable();

    /* renamed from: d */
    private final Object f36147d = new Object();
    @Nullable

    /* renamed from: f */
    private Exception f36148f;
    @Nullable

    /* renamed from: g */
    private R f36149g;
    @Nullable

    /* renamed from: h */
    private Thread f36150h;

    /* renamed from: i */
    private boolean f36151i;

    @UnknownNull
    /* renamed from: c */
    private R m72564c() throws ExecutionException {
        if (!this.f36151i) {
            if (this.f36148f == null) {
                return this.f36149g;
            }
            throw new ExecutionException(this.f36148f);
        }
        throw new CancellationException();
    }

    @UnknownNull
    /* renamed from: b */
    protected abstract R mo72565b() throws Exception;

    public final void blockUntilFinished() {
        this.f36146c.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.f36145b.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f36147d) {
            if (!this.f36151i && !this.f36146c.isOpen()) {
                this.f36151i = true;
                mo72566a();
                Thread thread = this.f36150h;
                if (thread != null) {
                    if (z) {
                        thread.interrupt();
                    }
                } else {
                    this.f36145b.open();
                    this.f36146c.open();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get() throws ExecutionException, InterruptedException {
        this.f36146c.block();
        return m72564c();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36151i;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f36146c.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f36147d) {
            if (this.f36151i) {
                return;
            }
            this.f36150h = Thread.currentThread();
            this.f36145b.open();
            try {
                try {
                    this.f36149g = mo72565b();
                    synchronized (this.f36147d) {
                        this.f36146c.open();
                        this.f36150h = null;
                        Thread.interrupted();
                    }
                } catch (Exception e) {
                    this.f36148f = e;
                    synchronized (this.f36147d) {
                        this.f36146c.open();
                        this.f36150h = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f36147d) {
                    this.f36146c.open();
                    this.f36150h = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f36146c.block(TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            return m72564c();
        }
        throw new TimeoutException();
    }

    /* renamed from: a */
    protected void mo72566a() {
    }
}
