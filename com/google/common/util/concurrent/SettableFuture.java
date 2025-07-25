package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class SettableFuture<V> extends AbstractFuture.TrustedFuture<V> {
    private SettableFuture() {
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
    public /* bridge */ /* synthetic */ void addListener(Runnable runnable, Executor executor) {
        super.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public /* bridge */ /* synthetic */ Object get() throws InterruptedException, ExecutionException {
        return super.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean set(@ParametricNullness V v) {
        return super.set(v);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
