package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.math.LongMath;
import com.google.common.util.concurrent.RateLimiter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class SmoothRateLimiter extends RateLimiter {

    /* renamed from: c */
    double f41942c;

    /* renamed from: d */
    double f41943d;

    /* renamed from: e */
    double f41944e;

    /* renamed from: f */
    private long f41945f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class SmoothBursty extends SmoothRateLimiter {

        /* renamed from: g */
        final double f41946g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SmoothBursty(RateLimiter.SleepingStopwatch sleepingStopwatch, double d) {
            super(sleepingStopwatch);
            this.f41946g = d;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        /* renamed from: l */
        double mo67471l() {
            return this.f41944e;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        /* renamed from: m */
        void mo67470m(double d, double d2) {
            double d3 = this.f41943d;
            double d4 = this.f41946g * d;
            this.f41943d = d4;
            if (d3 == Double.POSITIVE_INFINITY) {
                this.f41942c = d4;
                return;
            }
            double d5 = 0.0d;
            if (d3 != 0.0d) {
                d5 = (this.f41942c * d4) / d3;
            }
            this.f41942c = d5;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        /* renamed from: o */
        long mo67469o(double d, double d2) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class SmoothWarmingUp extends SmoothRateLimiter {

        /* renamed from: g */
        private final long f41947g;

        /* renamed from: h */
        private double f41948h;

        /* renamed from: i */
        private double f41949i;

        /* renamed from: j */
        private double f41950j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SmoothWarmingUp(RateLimiter.SleepingStopwatch sleepingStopwatch, long j, TimeUnit timeUnit, double d) {
            super(sleepingStopwatch);
            this.f41947g = timeUnit.toMicros(j);
            this.f41950j = d;
        }

        /* renamed from: p */
        private double m67468p(double d) {
            return this.f41944e + (d * this.f41948h);
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        /* renamed from: l */
        double mo67471l() {
            return this.f41947g / this.f41943d;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        /* renamed from: m */
        void mo67470m(double d, double d2) {
            double d3 = this.f41943d;
            double d4 = this.f41950j * d2;
            long j = this.f41947g;
            double d5 = (j * 0.5d) / d2;
            this.f41949i = d5;
            double d6 = ((j * 2.0d) / (d2 + d4)) + d5;
            this.f41943d = d6;
            this.f41948h = (d4 - d2) / (d6 - d5);
            if (d3 == Double.POSITIVE_INFINITY) {
                this.f41942c = 0.0d;
                return;
            }
            if (d3 != 0.0d) {
                d6 = (this.f41942c * d6) / d3;
            }
            this.f41942c = d6;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        /* renamed from: o */
        long mo67469o(double d, double d2) {
            long j;
            double d3 = d - this.f41949i;
            if (d3 > 0.0d) {
                double min = Math.min(d3, d2);
                j = (long) (((m67468p(d3) + m67468p(d3 - min)) * min) / 2.0d);
                d2 -= min;
            } else {
                j = 0;
            }
            return j + ((long) (this.f41944e * d2));
        }
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: e */
    final double mo67476e() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f41944e;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: f */
    final void mo67475f(double d, long j) {
        m67472n(j);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d;
        this.f41944e = micros;
        mo67470m(d, micros);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: h */
    final long mo67474h(long j) {
        return this.f41945f;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: k */
    final long mo67473k(int i, long j) {
        m67472n(j);
        long j2 = this.f41945f;
        double d = i;
        double min = Math.min(d, this.f41942c);
        this.f41945f = LongMath.saturatedAdd(this.f41945f, mo67469o(this.f41942c, min) + ((long) ((d - min) * this.f41944e)));
        this.f41942c -= min;
        return j2;
    }

    /* renamed from: l */
    abstract double mo67471l();

    /* renamed from: m */
    abstract void mo67470m(double d, double d2);

    /* renamed from: n */
    void m67472n(long j) {
        long j2 = this.f41945f;
        if (j > j2) {
            this.f41942c = Math.min(this.f41943d, this.f41942c + ((j - j2) / mo67471l()));
            this.f41945f = j;
        }
    }

    /* renamed from: o */
    abstract long mo67469o(double d, double d2);

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.f41945f = 0L;
    }
}
