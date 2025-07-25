package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class CombinedFuture<V> extends AggregateFuture<Object, V> {

    /* renamed from: r */
    private CombinedFuture<V>.CombinedFutureInterruptibleTask<?> f41782r;

    /* loaded from: classes4.dex */
    private final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {

        /* renamed from: g */
        private final AsyncCallable<V> f41783g;

        AsyncCallableInterruptibleTask(AsyncCallable<V> asyncCallable, Executor executor) {
            super(executor);
            this.f41783g = (AsyncCallable) Preconditions.checkNotNull(asyncCallable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: f */
        String mo67433f() {
            return this.f41783g.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: j */
        public ListenableFuture<V> mo67434e() throws Exception {
            return (ListenableFuture) Preconditions.checkNotNull(this.f41783g.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f41783g);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        /* renamed from: k */
        public void mo67625i(ListenableFuture<V> listenableFuture) {
            CombinedFuture.this.setFuture(listenableFuture);
        }
    }

    /* loaded from: classes4.dex */
    private final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {

        /* renamed from: g */
        private final Callable<V> f41785g;

        CallableInterruptibleTask(Callable<V> callable, Executor executor) {
            super(executor);
            this.f41785g = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @ParametricNullness
        /* renamed from: e */
        V mo67434e() throws Exception {
            return this.f41785g.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: f */
        String mo67433f() {
            return this.f41785g.toString();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        /* renamed from: i */
        void mo67625i(@ParametricNullness V v) {
            CombinedFuture.this.set(v);
        }
    }

    /* loaded from: classes4.dex */
    private abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {

        /* renamed from: d */
        private final Executor f41787d;

        CombinedFutureInterruptibleTask(Executor executor) {
            this.f41787d = (Executor) Preconditions.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: a */
        final void mo67437a(Throwable th) {
            CombinedFuture.this.f41782r = null;
            if (th instanceof ExecutionException) {
                CombinedFuture.this.setException(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                CombinedFuture.this.cancel(false);
            } else {
                CombinedFuture.this.setException(th);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: b */
        final void mo67436b(@ParametricNullness T t) {
            CombinedFuture.this.f41782r = null;
            mo67625i(t);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: d */
        final boolean mo67435d() {
            return CombinedFuture.this.isDone();
        }

        /* renamed from: h */
        final void m67626h() {
            try {
                this.f41787d.execute(this);
            } catch (RejectedExecutionException e) {
                CombinedFuture.this.setException(e);
            }
        }

        /* renamed from: i */
        abstract void mo67625i(@ParametricNullness T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CombinedFuture(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, Executor executor, AsyncCallable<V> asyncCallable) {
        super(immutableCollection, z, false);
        this.f41782r = new AsyncCallableInterruptibleTask(asyncCallable, executor);
        m67704R();
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: P */
    void mo67632P() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.f41782r;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.m67626h();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: W */
    void mo67631W(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo67631W(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.f41782r = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: w */
    protected void mo67629w() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.f41782r;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.m67567c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CombinedFuture(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, Executor executor, Callable<V> callable) {
        super(immutableCollection, z, false);
        this.f41782r = new CallableInterruptibleTask(callable, executor);
        m67704R();
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: M */
    void mo67633M(int i, Object obj) {
    }
}
