package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
abstract class WrappingExecutorService implements ExecutorService {

    /* renamed from: b */
    private final ExecutorService f41987b;

    public WrappingExecutorService(ExecutorService executorService) {
        this.f41987b = (ExecutorService) Preconditions.checkNotNull(executorService);
    }

    /* renamed from: a */
    public static /* synthetic */ void m67432a(Callable callable) {
        m67431b(callable);
    }

    /* renamed from: b */
    public static /* synthetic */ void m67431b(Callable callable) {
        try {
            callable.call();
        } catch (Exception e) {
            Throwables.throwIfUnchecked(e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    private <T> ImmutableList<Callable<T>> m67428e(Collection<? extends Callable<T>> collection) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Callable<T> callable : collection) {
            builder.add((ImmutableList.Builder) mo67429d(callable));
        }
        return builder.build();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f41987b.awaitTermination(j, timeUnit);
    }

    /* renamed from: c */
    public Runnable mo67430c(Runnable runnable) {
        final Callable mo67429d = mo67429d(Executors.callable(runnable, null));
        return new Runnable() { // from class: com.google.common.util.concurrent.q
            @Override // java.lang.Runnable
            public final void run() {
                WrappingExecutorService.m67432a(mo67429d);
            }
        };
    }

    /* renamed from: d */
    public abstract <T> Callable<T> mo67429d(Callable<T> callable);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f41987b.execute(mo67430c(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f41987b.invokeAll(m67428e(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f41987b.invokeAny(m67428e(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f41987b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f41987b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f41987b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f41987b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f41987b.submit(mo67429d((Callable) Preconditions.checkNotNull(callable)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f41987b.invokeAll(m67428e(collection), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f41987b.invokeAny(m67428e(collection), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f41987b.submit(mo67430c(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, @ParametricNullness T t) {
        return this.f41987b.submit(mo67430c(runnable), t);
    }
}
