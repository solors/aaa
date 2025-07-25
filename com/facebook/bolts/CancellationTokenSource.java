package com.facebook.bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellationTokenSource.kt */
@Metadata
/* loaded from: classes2.dex */
public final class CancellationTokenSource implements Closeable {
    private boolean cancellationRequested;
    private boolean closed;
    @Nullable
    private ScheduledFuture<?> scheduledCancellation;
    @NotNull
    private final Object lock = new Object();
    @NotNull
    private final List<CancellationTokenRegistration> registrations = new ArrayList();
    @NotNull
    private final ScheduledExecutorService executor = BoltsExecutors.Companion.scheduled$facebook_bolts_release();

    /* renamed from: a */
    public static /* synthetic */ void m78799a(CancellationTokenSource cancellationTokenSource) {
        m110103cancelAfter$lambda6$lambda5(cancellationTokenSource);
    }

    /* renamed from: cancelAfter$lambda-6$lambda-5 */
    public static final void m110103cancelAfter$lambda6$lambda5(CancellationTokenSource this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.lock) {
            this$0.scheduledCancellation = null;
            Unit unit = Unit.f99208a;
        }
        this$0.cancel();
    }

    private final void cancelScheduledCancellation() {
        ScheduledFuture<?> scheduledFuture = this.scheduledCancellation;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
        this.scheduledCancellation = null;
    }

    private final void notifyListeners(List<CancellationTokenRegistration> list) {
        for (CancellationTokenRegistration cancellationTokenRegistration : list) {
            cancellationTokenRegistration.runAction$facebook_bolts_release();
        }
    }

    private final void throwIfClosed() {
        if (!this.closed) {
            return;
        }
        throw new IllegalStateException("Object already closed".toString());
    }

    public final void cancel() {
        synchronized (this.lock) {
            throwIfClosed();
            if (this.cancellationRequested) {
                return;
            }
            cancelScheduledCancellation();
            this.cancellationRequested = true;
            ArrayList arrayList = new ArrayList(this.registrations);
            Unit unit = Unit.f99208a;
            notifyListeners(arrayList);
        }
    }

    public final void cancelAfter(long j) {
        cancelAfter(j, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            cancelScheduledCancellation();
            for (CancellationTokenRegistration cancellationTokenRegistration : this.registrations) {
                cancellationTokenRegistration.close();
            }
            this.registrations.clear();
            this.closed = true;
            Unit unit = Unit.f99208a;
        }
    }

    @NotNull
    public final CancellationToken getToken() {
        CancellationToken cancellationToken;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationToken = new CancellationToken(this);
        }
        return cancellationToken;
    }

    public final boolean isCancellationRequested() {
        boolean z;
        synchronized (this.lock) {
            throwIfClosed();
            z = this.cancellationRequested;
        }
        return z;
    }

    @NotNull
    public final CancellationTokenRegistration register$facebook_bolts_release(@Nullable Runnable runnable) {
        CancellationTokenRegistration cancellationTokenRegistration;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationTokenRegistration = new CancellationTokenRegistration(this, runnable);
            if (this.cancellationRequested) {
                cancellationTokenRegistration.runAction$facebook_bolts_release();
                Unit unit = Unit.f99208a;
            } else {
                this.registrations.add(cancellationTokenRegistration);
            }
        }
        return cancellationTokenRegistration;
    }

    public final void throwIfCancellationRequested$facebook_bolts_release() throws CancellationException {
        synchronized (this.lock) {
            throwIfClosed();
            if (!this.cancellationRequested) {
                Unit unit = Unit.f99208a;
            } else {
                throw new CancellationException();
            }
        }
    }

    @NotNull
    public String toString() {
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{CancellationTokenSource.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public final void unregister$facebook_bolts_release(@NotNull CancellationTokenRegistration registration) {
        Intrinsics.checkNotNullParameter(registration, "registration");
        synchronized (this.lock) {
            throwIfClosed();
            this.registrations.remove(registration);
        }
    }

    private final void cancelAfter(long j, TimeUnit timeUnit) {
        int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Delay must be >= -1".toString());
        }
        if (j == 0) {
            cancel();
            return;
        }
        synchronized (this.lock) {
            if (this.cancellationRequested) {
                return;
            }
            cancelScheduledCancellation();
            if (i != 0) {
                this.scheduledCancellation = this.executor.schedule(new Runnable() { // from class: com.facebook.bolts.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        CancellationTokenSource.m78799a(CancellationTokenSource.this);
                    }
                }, j, timeUnit);
            }
            Unit unit = Unit.f99208a;
        }
    }
}
