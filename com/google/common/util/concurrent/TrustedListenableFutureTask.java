package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.ironsource.C21114v8;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {

    /* renamed from: j */
    private volatile InterruptibleTask<?> f41980j;

    /* loaded from: classes4.dex */
    private final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {

        /* renamed from: d */
        private final AsyncCallable<V> f41981d;

        TrustedFutureInterruptibleAsyncTask(AsyncCallable<V> asyncCallable) {
            this.f41981d = (AsyncCallable) Preconditions.checkNotNull(asyncCallable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: a */
        void mo67437a(Throwable th) {
            TrustedListenableFutureTask.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: d */
        final boolean mo67435d() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: f */
        String mo67433f() {
            return this.f41981d.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: h */
        public void mo67436b(ListenableFuture<V> listenableFuture) {
            TrustedListenableFutureTask.this.setFuture(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: i */
        public ListenableFuture<V> mo67434e() throws Exception {
            return (ListenableFuture) Preconditions.checkNotNull(this.f41981d.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f41981d);
        }
    }

    /* loaded from: classes4.dex */
    private final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {

        /* renamed from: d */
        private final Callable<V> f41983d;

        TrustedFutureInterruptibleTask(Callable<V> callable) {
            this.f41983d = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: a */
        void mo67437a(Throwable th) {
            TrustedListenableFutureTask.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: b */
        void mo67436b(@ParametricNullness V v) {
            TrustedListenableFutureTask.this.set(v);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: d */
        final boolean mo67435d() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @ParametricNullness
        /* renamed from: e */
        V mo67434e() throws Exception {
            return this.f41983d.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: f */
        String mo67433f() {
            return this.f41983d.toString();
        }
    }

    TrustedListenableFutureTask(Callable<V> callable) {
        this.f41980j = new TrustedFutureInterruptibleTask(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static <V> TrustedListenableFutureTask<V> m67444C(AsyncCallable<V> asyncCallable) {
        return new TrustedListenableFutureTask<>(asyncCallable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static <V> TrustedListenableFutureTask<V> m67443D(Runnable runnable, @ParametricNullness V v) {
        return new TrustedListenableFutureTask<>(Executors.callable(runnable, v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static <V> TrustedListenableFutureTask<V> m67442E(Callable<V> callable) {
        return new TrustedListenableFutureTask<>(callable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: m */
    public void mo67441m() {
        InterruptibleTask<?> interruptibleTask;
        super.mo67441m();
        if (m67790B() && (interruptibleTask = this.f41980j) != null) {
            interruptibleTask.m67567c();
        }
        this.f41980j = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        InterruptibleTask<?> interruptibleTask = this.f41980j;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.f41980j = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: y */
    public String mo67440y() {
        InterruptibleTask<?> interruptibleTask = this.f41980j;
        if (interruptibleTask != null) {
            String valueOf = String.valueOf(interruptibleTask);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
            sb2.append("task=[");
            sb2.append(valueOf);
            sb2.append(C21114v8.C21123i.f54139e);
            return sb2.toString();
        }
        return super.mo67440y();
    }

    TrustedListenableFutureTask(AsyncCallable<V> asyncCallable) {
        this.f41980j = new TrustedFutureInterruptibleAsyncTask(asyncCallable);
    }
}
