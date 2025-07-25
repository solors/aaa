package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.C29518o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.executor.b */
/* loaded from: classes7.dex */
public final class FutureResult<T> implements Future<T> {
    @NotNull
    public static final C29193a Companion = new C29193a(null);
    private static final String TAG = FutureResult.class.getSimpleName();
    @Nullable
    private final Future<T> future;

    /* compiled from: FutureResult.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.executor.b$a */
    /* loaded from: classes7.dex */
    public static final class C29193a {
        private C29193a() {
        }

        public /* synthetic */ C29193a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return FutureResult.TAG;
        }
    }

    public FutureResult(@Nullable Future<T> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Future<T> future = this.future;
        if (future != null) {
            return future.cancel(z);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public T get() {
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            C29518o.C29519a c29519a = C29518o.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c29519a.m37463w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            C29518o.C29519a c29519a2 = C29518o.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c29519a2.m37466e(TAG3, "error on execution", e);
            return null;
        }
    }

    @Nullable
    public final Future<T> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public T get(long j, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get(j, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            C29518o.C29519a c29519a = C29518o.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c29519a.m37463w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            C29518o.C29519a c29519a2 = C29518o.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c29519a2.m37466e(TAG3, "error on execution", e);
            return null;
        } catch (TimeoutException e2) {
            C29518o.C29519a c29519a3 = C29518o.Companion;
            String TAG4 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            c29519a3.m37466e(TAG4, "error on timeout", e2);
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            c29519a3.m37463w(TAG4, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
