package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.ironsource.C21114v8;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {

    /* renamed from: j */
    private ListenableFuture<V> f41977j;

    /* renamed from: k */
    private ScheduledFuture<?> f41978k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Fire<V> implements Runnable {

        /* renamed from: b */
        TimeoutFuture<V> f41979b;

        Fire(TimeoutFuture<V> timeoutFuture) {
            this.f41979b = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<? extends V> listenableFuture;
            TimeoutFuture<V> timeoutFuture = this.f41979b;
            if (timeoutFuture == null || (listenableFuture = ((TimeoutFuture) timeoutFuture).f41977j) == null) {
                return;
            }
            this.f41979b = null;
            if (listenableFuture.isDone()) {
                timeoutFuture.setFuture(listenableFuture);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = ((TimeoutFuture) timeoutFuture).f41978k;
                ((TimeoutFuture) timeoutFuture).f41978k = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb2 = new StringBuilder("Timed out".length() + 66);
                        sb2.append("Timed out");
                        sb2.append(" (timeout delayed by ");
                        sb2.append(abs);
                        sb2.append(" ms after scheduled time)");
                        str = sb2.toString();
                    }
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(listenableFuture);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
                sb3.append(valueOf);
                sb3.append(": ");
                sb3.append(valueOf2);
                timeoutFuture.setException(new TimeoutFutureException(sb3.toString()));
            } finally {
                listenableFuture.cancel(true);
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class TimeoutFutureException extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        private TimeoutFutureException(String str) {
            super(str);
        }
    }

    private TimeoutFuture(ListenableFuture<V> listenableFuture) {
        this.f41977j = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static <V> ListenableFuture<V> m67445F(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TimeoutFuture timeoutFuture = new TimeoutFuture(listenableFuture);
        Fire fire = new Fire(timeoutFuture);
        timeoutFuture.f41978k = scheduledExecutorService.schedule(fire, j, timeUnit);
        listenableFuture.addListener(fire, MoreExecutors.directExecutor());
        return timeoutFuture;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: m */
    public void mo67441m() {
        m67769x(this.f41977j);
        ScheduledFuture<?> scheduledFuture = this.f41978k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f41977j = null;
        this.f41978k = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: y */
    public String mo67440y() {
        ListenableFuture<V> listenableFuture = this.f41977j;
        ScheduledFuture<?> scheduledFuture = this.f41978k;
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14);
            sb2.append("inputFuture=[");
            sb2.append(valueOf);
            sb2.append(C21114v8.C21123i.f54139e);
            String sb3 = sb2.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    String valueOf2 = String.valueOf(sb3);
                    StringBuilder sb4 = new StringBuilder(valueOf2.length() + 43);
                    sb4.append(valueOf2);
                    sb4.append(", remaining delay=[");
                    sb4.append(delay);
                    sb4.append(" ms]");
                    return sb4.toString();
                }
                return sb3;
            }
            return sb3;
        }
        return null;
    }
}
