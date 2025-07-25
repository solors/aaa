package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.math.BigInteger;

@ElementTypesAreNonnullByDefault
@GwtCompatible(serializable = true)
/* loaded from: classes4.dex */
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {

    /* renamed from: b */
    private final long f41505b;
    public static final UnsignedLong ZERO = new UnsignedLong(0);
    public static final UnsignedLong ONE = new UnsignedLong(1);
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(-1);

    private UnsignedLong(long j) {
        this.f41505b = j;
    }

    public static UnsignedLong fromLongBits(long j) {
        return new UnsignedLong(j);
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(long j) {
        Preconditions.checkArgument(j >= 0, "value (%s) is outside the range for an unsigned long value", j);
        return fromLongBits(j);
    }

    public BigInteger bigIntegerValue() {
        BigInteger valueOf = BigInteger.valueOf(this.f41505b & Long.MAX_VALUE);
        if (this.f41505b < 0) {
            return valueOf.setBit(63);
        }
        return valueOf;
    }

    public UnsignedLong dividedBy(UnsignedLong unsignedLong) {
        return fromLongBits(UnsignedLongs.divide(this.f41505b, ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f41505b));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j = this.f41505b;
        if (j >= 0) {
            return j;
        }
        return ((j & 1) | (j >>> 1)) * 2.0d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnsignedLong) || this.f41505b != ((UnsignedLong) obj).f41505b) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j = this.f41505b;
        if (j >= 0) {
            return (float) j;
        }
        return ((float) ((j & 1) | (j >>> 1))) * 2.0f;
    }

    public int hashCode() {
        return Longs.hashCode(this.f41505b);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f41505b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f41505b;
    }

    public UnsignedLong minus(UnsignedLong unsignedLong) {
        return fromLongBits(this.f41505b - ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f41505b);
    }

    public UnsignedLong mod(UnsignedLong unsignedLong) {
        return fromLongBits(UnsignedLongs.remainder(this.f41505b, ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f41505b));
    }

    public UnsignedLong plus(UnsignedLong unsignedLong) {
        return fromLongBits(this.f41505b + ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f41505b);
    }

    public UnsignedLong times(UnsignedLong unsignedLong) {
        return fromLongBits(this.f41505b * ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f41505b);
    }

    public String toString() {
        return UnsignedLongs.toString(this.f41505b);
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedLong unsignedLong) {
        Preconditions.checkNotNull(unsignedLong);
        return UnsignedLongs.compare(this.f41505b, unsignedLong.f41505b);
    }

    public String toString(int i) {
        return UnsignedLongs.toString(this.f41505b, i);
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(BigInteger bigInteger) {
        Preconditions.checkNotNull(bigInteger);
        Preconditions.checkArgument(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return fromLongBits(bigInteger.longValue());
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(String str) {
        return valueOf(str, 10);
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(String str, int i) {
        return fromLongBits(UnsignedLongs.parseUnsignedLong(str, i));
    }
}
