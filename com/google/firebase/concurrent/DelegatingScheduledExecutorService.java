package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class DelegatingScheduledExecutorService implements ScheduledExecutorService {

    /* renamed from: b */
    private final ExecutorService f42163b;

    /* renamed from: c */
    private final ScheduledExecutorService f42164c;

    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f42163b = executorService;
        this.f42164c = scheduledExecutorService;
    }

    /* renamed from: a */
    public static /* synthetic */ ScheduledFuture m67310a(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.m67296o(runnable, j, timeUnit, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m67309b(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        m67298m(runnable, completer);
    }

    /* renamed from: c */
    public static /* synthetic */ void m67308c(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.m67297n(runnable, completer);
    }

    /* renamed from: d */
    public static /* synthetic */ Future m67307d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.m67294q(callable, completer);
    }

    /* renamed from: e */
    public static /* synthetic */ ScheduledFuture m67306e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.m67290u(runnable, j, j2, timeUnit, completer);
    }

    /* renamed from: f */
    public static /* synthetic */ void m67305f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.m67291t(runnable, completer);
    }

    /* renamed from: i */
    public static /* synthetic */ ScheduledFuture m67302i(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.m67288w(runnable, j, j2, timeUnit, completer);
    }

    /* renamed from: j */
    public static /* synthetic */ void m67301j(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        m67287x(runnable, completer);
    }

    /* renamed from: k */
    public static /* synthetic */ void m67300k(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.m67289v(runnable, completer);
    }

    /* renamed from: l */
    public static /* synthetic */ void m67299l(Callable callable, DelegatingScheduledFuture.Completer completer) {
        m67295p(callable, completer);
    }

    /* renamed from: m */
    public static /* synthetic */ void m67298m(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    /* renamed from: n */
    public /* synthetic */ void m67297n(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.f42163b.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.m67309b(runnable, completer);
            }
        });
    }

    /* renamed from: o */
    public /* synthetic */ ScheduledFuture m67296o(final Runnable runnable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.f42164c.schedule(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.m67308c(DelegatingScheduledExecutorService.this, runnable, completer);
            }
        }, j, timeUnit);
    }

    /* renamed from: p */
    public static /* synthetic */ void m67295p(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    /* renamed from: q */
    public /* synthetic */ Future m67294q(final Callable callable, final DelegatingScheduledFuture.Completer completer) throws Exception {
        return this.f42163b.submit(new Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.m67299l(callable, completer);
            }
        });
    }

    /* renamed from: r */
    public /* synthetic */ ScheduledFuture m67293r(final Callable callable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.f42164c.schedule(new Callable() { // from class: com.google.firebase.concurrent.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DelegatingScheduledExecutorService.m67307d(DelegatingScheduledExecutorService.this, callable, completer);
            }
        }, j, timeUnit);
    }

    /* renamed from: s */
    public static /* synthetic */ void m67292s(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
            throw e;
        }
    }

    /* renamed from: t */
    public /* synthetic */ void m67291t(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.f42163b.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.m67292s(runnable, completer);
            }
        });
    }

    /* renamed from: u */
    public /* synthetic */ ScheduledFuture m67290u(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.f42164c.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.h
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.m67305f(DelegatingScheduledExecutorService.this, runnable, completer);
            }
        }, j, j2, timeUnit);
    }

    /* renamed from: v */
    public /* synthetic */ void m67289v(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.f42163b.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.m67301j(runnable, completer);
            }
        });
    }

    /* renamed from: w */
    public /* synthetic */ ScheduledFuture m67288w(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.f42164c.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.m67300k(DelegatingScheduledExecutorService.this, runnable, completer);
            }
        }, j, j2, timeUnit);
    }

    /* renamed from: x */
    public static /* synthetic */ void m67287x(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f42163b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f42163b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f42163b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f42163b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f42163b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f42163b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.e
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return DelegatingScheduledExecutorService.m67310a(DelegatingScheduledExecutorService.this, runnable, j, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return DelegatingScheduledExecutorService.m67306e(DelegatingScheduledExecutorService.this, runnable, j, j2, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return DelegatingScheduledExecutorService.m67302i(DelegatingScheduledExecutorService.this, runnable, j, j2, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f42163b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f42163b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f42163b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.b
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture m67293r;
                m67293r = DelegatingScheduledExecutorService.this.m67293r(callable, j, timeUnit, completer);
                return m67293r;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f42163b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f42163b.submit(runnable);
    }
}
