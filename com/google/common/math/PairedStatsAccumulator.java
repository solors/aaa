package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public final class PairedStatsAccumulator {

    /* renamed from: a */
    private final StatsAccumulator f41365a = new StatsAccumulator();

    /* renamed from: b */
    private final StatsAccumulator f41366b = new StatsAccumulator();

    /* renamed from: c */
    private double f41367c = 0.0d;

    /* renamed from: a */
    private static double m68151a(double d) {
        return Doubles.constrainToRange(d, -1.0d, 1.0d);
    }

    /* renamed from: b */
    private double m68150b(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public void add(double d, double d2) {
        this.f41365a.add(d);
        if (Doubles.isFinite(d) && Doubles.isFinite(d2)) {
            if (this.f41365a.count() > 1) {
                this.f41367c += (d - this.f41365a.mean()) * (d2 - this.f41366b.mean());
            }
        } else {
            this.f41367c = Double.NaN;
        }
        this.f41366b.add(d2);
    }

    public void addAll(PairedStats pairedStats) {
        if (pairedStats.count() == 0) {
            return;
        }
        this.f41365a.addAll(pairedStats.xStats());
        if (this.f41366b.count() == 0) {
            this.f41367c = pairedStats.m68152c();
        } else {
            this.f41367c += pairedStats.m68152c() + ((pairedStats.xStats().mean() - this.f41365a.mean()) * (pairedStats.yStats().mean() - this.f41366b.mean()) * pairedStats.count());
        }
        this.f41366b.addAll(pairedStats.yStats());
    }

    public long count() {
        return this.f41365a.count();
    }

    public final LinearTransformation leastSquaresFit() {
        boolean z;
        boolean z2 = true;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f41367c)) {
            return LinearTransformation.forNaN();
        }
        double m68121c = this.f41365a.m68121c();
        if (m68121c > 0.0d) {
            if (this.f41366b.m68121c() > 0.0d) {
                return LinearTransformation.mapping(this.f41365a.mean(), this.f41366b.mean()).withSlope(this.f41367c / m68121c);
            }
            return LinearTransformation.horizontal(this.f41366b.mean());
        }
        if (this.f41366b.m68121c() <= 0.0d) {
            z2 = false;
        }
        Preconditions.checkState(z2);
        return LinearTransformation.vertical(this.f41365a.mean());
    }

    public final double pearsonsCorrelationCoefficient() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f41367c)) {
            return Double.NaN;
        }
        double m68121c = this.f41365a.m68121c();
        double m68121c2 = this.f41366b.m68121c();
        if (m68121c > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2);
        if (m68121c2 <= 0.0d) {
            z3 = false;
        }
        Preconditions.checkState(z3);
        return m68151a(this.f41367c / Math.sqrt(m68150b(m68121c * m68121c2)));
    }

    public double populationCovariance() {
        boolean z;
        if (count() != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41367c / count();
    }

    public final double sampleCovariance() {
        boolean z;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41367c / (count() - 1);
    }

    public PairedStats snapshot() {
        return new PairedStats(this.f41365a.snapshot(), this.f41366b.snapshot(), this.f41367c);
    }

    public Stats xStats() {
        return this.f41365a.snapshot();
    }

    public Stats yStats() {
        return this.f41366b.snapshot();
    }
}
