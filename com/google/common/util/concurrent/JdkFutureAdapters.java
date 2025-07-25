package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.JdkFutureAdapters;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class JdkFutureAdapters {

    /* loaded from: classes4.dex */
    public static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

        /* renamed from: g */
        private static final ThreadFactory f41862g;

        /* renamed from: h */
        private static final Executor f41863h;

        /* renamed from: b */
        private final Executor f41864b;

        /* renamed from: c */
        private final ExecutionList f41865c;

        /* renamed from: d */
        private final AtomicBoolean f41866d;

        /* renamed from: f */
        private final Future<V> f41867f;

        static {
            ThreadFactory build = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
            f41862g = build;
            f41863h = Executors.newCachedThreadPool(build);
        }

        ListenableFutureAdapter(Future<V> future) {
            this(future, f41863h);
        }

        /* renamed from: d */
        public static /* synthetic */ void m67562d(ListenableFutureAdapter listenableFutureAdapter) {
            listenableFutureAdapter.m67561f();
        }

        /* renamed from: f */
        public /* synthetic */ void m67561f() {
            try {
                Uninterruptibles.getUninterruptibly(this.f41867f);
            } catch (Throwable unused) {
            }
            this.f41865c.execute();
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f41865c.add(runnable, executor);
            if (this.f41866d.compareAndSet(false, true)) {
                if (this.f41867f.isDone()) {
                    this.f41865c.execute();
                } else {
                    this.f41864b.execute(new Runnable() { // from class: com.google.common.util.concurrent.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            JdkFutureAdapters.ListenableFutureAdapter.m67562d(JdkFutureAdapters.ListenableFutureAdapter.this);
                        }
                    });
                }
            }
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* renamed from: c */
        public Future<V> delegate() {
            return this.f41867f;
        }

        ListenableFutureAdapter(Future<V> future, Executor executor) {
            this.f41865c = new ExecutionList();
            this.f41866d = new AtomicBoolean(false);
            this.f41867f = (Future) Preconditions.checkNotNull(future);
            this.f41864b = (Executor) Preconditions.checkNotNull(executor);
        }
    }

    private JdkFutureAdapters() {
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future) {
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new ListenableFutureAdapter(future);
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future, Executor executor) {
        Preconditions.checkNotNull(executor);
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new ListenableFutureAdapter(future, executor);
    }
}
