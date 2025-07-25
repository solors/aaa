package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public class ImmediateFuture<V> implements ListenableFuture<V> {

    /* renamed from: c */
    static final ListenableFuture<?> f41855c = new ImmediateFuture(null);

    /* renamed from: d */
    private static final Logger f41856d = Logger.getLogger(ImmediateFuture.class.getName());
    @ParametricNullness

    /* renamed from: b */
    private final V f41857b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {

        /* renamed from: j */
        static final ImmediateCancelledFuture<Object> f41858j;

        static {
            ImmediateCancelledFuture<Object> immediateCancelledFuture;
            if (AbstractFuture.f41596f) {
                immediateCancelledFuture = null;
            } else {
                immediateCancelledFuture = new ImmediateCancelledFuture<>();
            }
            f41858j = immediateCancelledFuture;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ImmediateCancelledFuture() {
            cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ImmediateFailedFuture(Throwable th) {
            setException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmediateFuture(@ParametricNullness V v) {
        this.f41857b = v;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f41856d;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.log(level, sb2.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public V get() {
        return this.f41857b;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f41857b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb2.append(obj);
        sb2.append("[status=SUCCESS, result=[");
        sb2.append(valueOf);
        sb2.append("]]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }
}
