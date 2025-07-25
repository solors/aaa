package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public final class PairedStats implements Serializable {

    /* renamed from: b */
    private final Stats f41362b;

    /* renamed from: c */
    private final Stats f41363c;

    /* renamed from: d */
    private final double f41364d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PairedStats(Stats stats, Stats stats2, double d) {
        this.f41362b = stats;
        this.f41363c = stats2;
        this.f41364d = d;
    }

    /* renamed from: a */
    private static double m68154a(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    /* renamed from: b */
    private static double m68153b(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        boolean z;
        Preconditions.checkNotNull(bArr);
        if (bArr.length == 88) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.m68131a(order), Stats.m68131a(order), order.getDouble());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public double m68152c() {
        return this.f41364d;
    }

    public long count() {
        return this.f41362b.count();
    }

    public boolean equals(Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        if (!this.f41362b.equals(pairedStats.f41362b) || !this.f41363c.equals(pairedStats.f41363c) || Double.doubleToLongBits(this.f41364d) != Double.doubleToLongBits(pairedStats.f41364d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f41362b, this.f41363c, Double.valueOf(this.f41364d));
    }

    public LinearTransformation leastSquaresFit() {
        boolean z;
        boolean z2 = true;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f41364d)) {
            return LinearTransformation.forNaN();
        }
        double m68130b = this.f41362b.m68130b();
        if (m68130b > 0.0d) {
            if (this.f41363c.m68130b() > 0.0d) {
                return LinearTransformation.mapping(this.f41362b.mean(), this.f41363c.mean()).withSlope(this.f41364d / m68130b);
            }
            return LinearTransformation.horizontal(this.f41363c.mean());
        }
        if (this.f41363c.m68130b() <= 0.0d) {
            z2 = false;
        }
        Preconditions.checkState(z2);
        return LinearTransformation.vertical(this.f41362b.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f41364d)) {
            return Double.NaN;
        }
        double m68130b = xStats().m68130b();
        double m68130b2 = yStats().m68130b();
        if (m68130b > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2);
        if (m68130b2 <= 0.0d) {
            z3 = false;
        }
        Preconditions.checkState(z3);
        return m68154a(this.f41364d / Math.sqrt(m68153b(m68130b * m68130b2)));
    }

    public double populationCovariance() {
        boolean z;
        if (count() != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41364d / count();
    }

    public double sampleCovariance() {
        boolean z;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41364d / (count() - 1);
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.f41362b.m68129c(order);
        this.f41363c.m68129c(order);
        order.putDouble(this.f41364d);
        return order.array();
    }

    public String toString() {
        if (count() > 0) {
            return MoreObjects.toStringHelper(this).add("xStats", this.f41362b).add("yStats", this.f41363c).add("populationCovariance", populationCovariance()).toString();
        }
        return MoreObjects.toStringHelper(this).add("xStats", this.f41362b).add("yStats", this.f41363c).toString();
    }

    public Stats xStats() {
        return this.f41362b;
    }

    public Stats yStats() {
        return this.f41363c;
    }
}
