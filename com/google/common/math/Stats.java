package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Stats implements Serializable {

    /* renamed from: b */
    private final long f41373b;

    /* renamed from: c */
    private final double f41374c;

    /* renamed from: d */
    private final double f41375d;

    /* renamed from: f */
    private final double f41376f;

    /* renamed from: g */
    private final double f41377g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Stats(long j, double d, double d2, double d3, double d4) {
        this.f41373b = j;
        this.f41374c = d;
        this.f41375d = d2;
        this.f41376f = d3;
        this.f41377g = d4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Stats m68131a(ByteBuffer byteBuffer) {
        boolean z;
        Preconditions.checkNotNull(byteBuffer);
        if (byteBuffer.remaining() >= 40) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public static Stats fromByteArray(byte[] bArr) {
        boolean z;
        Preconditions.checkNotNull(bArr);
        if (bArr.length == 40) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return m68131a(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    /* renamed from: of */
    public static Stats m68128of(Iterable<? extends Number> iterable) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iterable);
        return statsAccumulator.snapshot();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public double m68130b() {
        return this.f41375d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m68129c(ByteBuffer byteBuffer) {
        boolean z;
        Preconditions.checkNotNull(byteBuffer);
        if (byteBuffer.remaining() >= 40) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.f41373b).putDouble(this.f41374c).putDouble(this.f41375d).putDouble(this.f41376f).putDouble(this.f41377g);
    }

    public long count() {
        return this.f41373b;
    }

    public boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        if (this.f41373b != stats.f41373b || Double.doubleToLongBits(this.f41374c) != Double.doubleToLongBits(stats.f41374c) || Double.doubleToLongBits(this.f41375d) != Double.doubleToLongBits(stats.f41375d) || Double.doubleToLongBits(this.f41376f) != Double.doubleToLongBits(stats.f41376f) || Double.doubleToLongBits(this.f41377g) != Double.doubleToLongBits(stats.f41377g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f41373b), Double.valueOf(this.f41374c), Double.valueOf(this.f41375d), Double.valueOf(this.f41376f), Double.valueOf(this.f41377g));
    }

    public double max() {
        boolean z;
        if (this.f41373b != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41377g;
    }

    public double mean() {
        boolean z;
        if (this.f41373b != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41374c;
    }

    public double min() {
        boolean z;
        if (this.f41373b != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f41376f;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        boolean z;
        if (this.f41373b > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f41375d)) {
            return Double.NaN;
        }
        if (this.f41373b == 1) {
            return 0.0d;
        }
        return DoubleUtils.m68188b(this.f41375d) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        boolean z;
        if (this.f41373b > 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Double.isNaN(this.f41375d)) {
            return Double.NaN;
        }
        return DoubleUtils.m68188b(this.f41375d) / (this.f41373b - 1);
    }

    public double sum() {
        return this.f41374c * this.f41373b;
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        m68129c(order);
        return order.array();
    }

    public String toString() {
        if (count() > 0) {
            return MoreObjects.toStringHelper(this).add("count", this.f41373b).add("mean", this.f41374c).add("populationStandardDeviation", populationStandardDeviation()).add("min", this.f41376f).add("max", this.f41377g).toString();
        }
        return MoreObjects.toStringHelper(this).add("count", this.f41373b).toString();
    }

    public static double meanOf(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext());
        double doubleValue = it.next().doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double doubleValue2 = it.next().doubleValue();
            j++;
            doubleValue = (Doubles.isFinite(doubleValue2) && Doubles.isFinite(doubleValue)) ? doubleValue + ((doubleValue2 - doubleValue) / j) : StatsAccumulator.m68123a(doubleValue, doubleValue2);
        }
        return doubleValue;
    }

    /* renamed from: of */
    public static Stats m68127of(Iterator<? extends Number> it) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(it);
        return statsAccumulator.snapshot();
    }

    /* renamed from: of */
    public static Stats m68126of(double... dArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(dArr);
        return statsAccumulator.snapshot();
    }

    public static double meanOf(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            d = (Doubles.isFinite(d2) && Doubles.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : StatsAccumulator.m68123a(d, d2);
        }
        return d;
    }

    /* renamed from: of */
    public static Stats m68125of(int... iArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iArr);
        return statsAccumulator.snapshot();
    }

    /* renamed from: of */
    public static Stats m68124of(long... jArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(jArr);
        return statsAccumulator.snapshot();
    }

    public static double meanOf(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        double d = iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d2 = iArr[i];
            d = (Doubles.isFinite(d2) && Doubles.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : StatsAccumulator.m68123a(d, d2);
        }
        return d;
    }

    public static double meanOf(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        double d = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d2 = jArr[i];
            d = (Doubles.isFinite(d2) && Doubles.isFinite(d)) ? d + ((d2 - d) / (i + 1)) : StatsAccumulator.m68123a(d, d2);
        }
        return d;
    }
}
