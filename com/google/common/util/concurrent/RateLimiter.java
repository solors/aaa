package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.SmoothRateLimiter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class RateLimiter {

    /* renamed from: a */
    private final SleepingStopwatch f41901a;

    /* renamed from: b */
    private volatile Object f41902b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class SleepingStopwatch {
        protected SleepingStopwatch() {
        }

        public static SleepingStopwatch createFromSystemTimer() {
            return new SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1

                /* renamed from: a */
                final Stopwatch f41903a = Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                /* renamed from: a */
                protected long mo67518a() {
                    return this.f41903a.elapsed(TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                /* renamed from: b */
                protected void mo67517b(long j) {
                    if (j > 0) {
                        Uninterruptibles.sleepUninterruptibly(j, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }

        /* renamed from: a */
        protected abstract long mo67518a();

        /* renamed from: b */
        protected abstract void mo67517b(long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RateLimiter(SleepingStopwatch sleepingStopwatch) {
        this.f41901a = (SleepingStopwatch) Preconditions.checkNotNull(sleepingStopwatch);
    }

    /* renamed from: a */
    private boolean m67525a(long j, long j2) {
        if (mo67474h(j) - j2 <= j) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m67524b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Requested permits (%s) must be positive", i);
    }

    @VisibleForTesting
    /* renamed from: c */
    static RateLimiter m67523c(double d, long j, TimeUnit timeUnit, double d2, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new SmoothRateLimiter.SmoothWarmingUp(sleepingStopwatch, j, timeUnit, d2);
        smoothWarmingUp.setRate(d);
        return smoothWarmingUp;
    }

    public static RateLimiter create(double d) {
        return m67522d(d, SleepingStopwatch.createFromSystemTimer());
    }

    @VisibleForTesting
    /* renamed from: d */
    static RateLimiter m67522d(double d, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothBursty smoothBursty = new SmoothRateLimiter.SmoothBursty(sleepingStopwatch, 1.0d);
        smoothBursty.setRate(d);
        return smoothBursty;
    }

    /* renamed from: g */
    private Object m67521g() {
        Object obj = this.f41902b;
        if (obj == null) {
            synchronized (this) {
                obj = this.f41902b;
                if (obj == null) {
                    obj = new Object();
                    this.f41902b = obj;
                }
            }
        }
        return obj;
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    /* renamed from: e */
    abstract double mo67476e();

    /* renamed from: f */
    abstract void mo67475f(double d, long j);

    public final double getRate() {
        double mo67476e;
        synchronized (m67521g()) {
            mo67476e = mo67476e();
        }
        return mo67476e;
    }

    /* renamed from: h */
    abstract long mo67474h(long j);

    /* renamed from: i */
    final long m67520i(int i) {
        long m67519j;
        m67524b(i);
        synchronized (m67521g()) {
            m67519j = m67519j(i, this.f41901a.mo67518a());
        }
        return m67519j;
    }

    /* renamed from: j */
    final long m67519j(int i, long j) {
        return Math.max(mo67473k(i, j) - j, 0L);
    }

    /* renamed from: k */
    abstract long mo67473k(int i, long j);

    public final void setRate(double d) {
        boolean z;
        if (d > 0.0d && !Double.isNaN(d)) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "rate must be positive");
        synchronized (m67521g()) {
            mo67475f(d, this.f41901a.mo67518a());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(long j, TimeUnit timeUnit) {
        return tryAcquire(1, j, timeUnit);
    }

    public static RateLimiter create(double d, long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j >= 0, "warmupPeriod must not be negative: %s", j);
        return m67523c(d, j, timeUnit, 3.0d, SleepingStopwatch.createFromSystemTimer());
    }

    @CanIgnoreReturnValue
    public double acquire(int i) {
        long m67520i = m67520i(i);
        this.f41901a.mo67517b(m67520i);
        return (m67520i * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public boolean tryAcquire(int i) {
        return tryAcquire(i, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i, long j, TimeUnit timeUnit) {
        long max = Math.max(timeUnit.toMicros(j), 0L);
        m67524b(i);
        synchronized (m67521g()) {
            long mo67518a = this.f41901a.mo67518a();
            if (m67525a(mo67518a, max)) {
                this.f41901a.mo67517b(m67519j(i, mo67518a));
                return true;
            }
            return false;
        }
    }
}
