package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public final class StatsAccumulator {

    /* renamed from: a */
    private long f41378a = 0;

    /* renamed from: b */
    private double f41379b = 0.0d;

    /* renamed from: c */
    private double f41380c = 0.0d;

    /* renamed from: d */
    private double f41381d = Double.NaN;

    /* renamed from: e */
    private double f41382e = Double.NaN;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static double m68123a(double d, double d2) {
        if (Doubles.isFinite(d)) {
            return d2;
        }
        if (!Doubles.isFinite(d2) && d != d2) {
            return Double.NaN;
        }
        return d;
    }

    /* renamed from: b */
    private void m68122b(long j, double d, double d2, double d3, double d4) {
        long j2 = this.f41378a;
        if (j2 == 0) {
            this.f41378a = j;
            this.f41379b = d;
            this.f41380c = d2;
            this.f41381d = d3;
            this.f41382e = d4;
            return;
        }
        this.f41378a = j2 + j;
        if (Doubles.isFinite(this.f41379b) && Doubles.isFinite(d)) {
            double d5 = this.f41379b;
            double d6 = d - d5;
            double d7 = j;
            double d8 = d5 + ((d6 * d7) / this.f41378a);
            this.f41379b = d8;
            this.f41380c += d2 + (d6 * (d - d8) * d7);
        } else {
            this.f41379b = m68123a(this.f41379b, d);
            this.f41380c = Double.NaN;
        }
        this.f41381d = Math.min(this.f41381d, d3);
        this.f41382e = Math.max(this.f41382e, d4);
    }

    public void add(double d) {
        long j = this.f41378a;
        if (j == 0) {
            this.f41378a = 1L;
            this.f41379b = d;
            this.f41381d = d;
            this.f41382e = d;
            if (!Doubles.isFinite(d)) {
                this.f41380c = Double.NaN;
                return;
            }
            return;
        }
        this.f41378a = j + 1;
        if (Doubles.isFinite(d) && Doubles.isFinite(this.f41379b)) {
            double d2 = this.f41379b;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.f41378a);
            this.f41379b = d4;
            this.f41380c += d3 * (d - d4);
        } else {
            this.f41379b = m68123a(this.f41379b, d);
            this.f41380c = Double.NaN;
        }
        this.f41381d = Math.min(this.f41381d, d);
        this.f41382e = Math.max(this.f41382e, d);
    }

    public void addAll(Iterable<? extends Number> iterable) {
        for (Number number : iterable) {
            add(number.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public double m68121c() {
        return this.f41380c;
    }

    public long count() {
        return this.f41378a;
    }

    public double max() {
        boolean z;
        if (this.f41378a != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41382e;
    }

    public double mean() {
        boolean z;
        if (this.f41378a != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41379b;
    }

    public double min() {
        boolean z;
        if (this.f41378a != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41381d;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        boolean z;
        if (this.f41378a != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f41380c)) {
            return Double.NaN;
        }
        if (this.f41378a == 1) {
            return 0.0d;
        }
        return DoubleUtils.m68188b(this.f41380c) / this.f41378a;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        boolean z;
        if (this.f41378a > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f41380c)) {
            return Double.NaN;
        }
        return DoubleUtils.m68188b(this.f41380c) / (this.f41378a - 1);
    }

    public Stats snapshot() {
        return new Stats(this.f41378a, this.f41379b, this.f41380c, this.f41381d, this.f41382e);
    }

    public final double sum() {
        return this.f41379b * this.f41378a;
    }

    public void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public void addAll(double... dArr) {
        for (double d : dArr) {
            add(d);
        }
    }

    public void addAll(int... iArr) {
        for (int i : iArr) {
            add(i);
        }
    }

    public void addAll(long... jArr) {
        for (long j : jArr) {
            add(j);
        }
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        m68122b(stats.count(), stats.mean(), stats.m68130b(), stats.min(), stats.max());
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        m68122b(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.m68121c(), statsAccumulator.min(), statsAccumulator.max());
    }
}
