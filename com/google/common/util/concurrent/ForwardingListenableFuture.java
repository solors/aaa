package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtCompatible
@CanIgnoreReturnValue
/* loaded from: classes4.dex */
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

    /* loaded from: classes4.dex */
    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {

        /* renamed from: b */
        private final ListenableFuture<V> f41832b;

        /* JADX INFO: Access modifiers changed from: protected */
        public SimpleForwardingListenableFuture(ListenableFuture<V> listenableFuture) {
            this.f41832b = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* renamed from: d */
        public final ListenableFuture<V> delegate() {
            return this.f41832b;
        }
    }

    protected ForwardingListenableFuture() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        delegate().addListener(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
    /* renamed from: d */
    public abstract ListenableFuture<? extends V> delegate();
}
