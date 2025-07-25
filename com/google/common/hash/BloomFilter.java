package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilterStrategies;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class BloomFilter<T> implements Predicate<T>, Serializable {

    /* renamed from: b */
    private final BloomFilterStrategies.LockFreeBitArray f41089b;

    /* renamed from: c */
    private final int f41090c;

    /* renamed from: d */
    private final Funnel<? super T> f41091d;

    /* renamed from: f */
    private final Strategy f41092f;

    /* loaded from: classes4.dex */
    private static class SerialForm<T> implements Serializable {

        /* renamed from: b */
        final long[] f41093b;

        /* renamed from: c */
        final int f41094c;

        /* renamed from: d */
        final Funnel<? super T> f41095d;

        /* renamed from: f */
        final Strategy f41096f;

        SerialForm(BloomFilter<T> bloomFilter) {
            this.f41093b = BloomFilterStrategies.LockFreeBitArray.toPlainArray(((BloomFilter) bloomFilter).f41089b.f41098a);
            this.f41094c = ((BloomFilter) bloomFilter).f41090c;
            this.f41095d = ((BloomFilter) bloomFilter).f41091d;
            this.f41096f = ((BloomFilter) bloomFilter).f41092f;
        }

        Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.f41093b), this.f41094c, this.f41095d, this.f41096f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface Strategy extends Serializable {
        <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);

        int ordinal();

        <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i, double d) {
        return create(funnel, i, d);
    }

    @VisibleForTesting
    /* renamed from: f */
    static <T> BloomFilter<T> m68370f(Funnel<? super T> funnel, long j, double d, Strategy strategy) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(funnel);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected insertions (%s) must be >= 0", j);
        if (d > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "False positive probability (%s) must be > 0.0", Double.valueOf(d));
        if (d >= 1.0d) {
            z3 = false;
        }
        Preconditions.checkArgument(z3, "False positive probability (%s) must be < 1.0", Double.valueOf(d));
        Preconditions.checkNotNull(strategy);
        if (i == 0) {
            j = 1;
        }
        long m68369g = m68369g(j, d);
        try {
            return new BloomFilter<>(new BloomFilterStrategies.LockFreeBitArray(m68369g), m68368h(j, m68369g), funnel, strategy);
        } catch (IllegalArgumentException e) {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("Could not create BloomFilter of ");
            sb2.append(m68369g);
            sb2.append(" bits");
            throw new IllegalArgumentException(sb2.toString(), e);
        }
    }

    @VisibleForTesting
    /* renamed from: g */
    static long m68369g(long j, double d) {
        if (d == 0.0d) {
            d = Double.MIN_VALUE;
        }
        return (long) (((-j) * Math.log(d)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @VisibleForTesting
    /* renamed from: h */
    static int m68368h(long j, long j2) {
        return Math.max(1, (int) Math.round((j2 / j) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
        int i;
        int i2;
        DataInputStream dataInputStream;
        byte readByte;
        Preconditions.checkNotNull(inputStream, "InputStream");
        Preconditions.checkNotNull(funnel, "Funnel");
        int i3 = -1;
        try {
            dataInputStream = new DataInputStream(inputStream);
            readByte = dataInputStream.readByte();
            try {
                i2 = UnsignedBytes.toInt(dataInputStream.readByte());
            } catch (RuntimeException e) {
                e = e;
                i2 = -1;
                i3 = readByte;
                i = -1;
            }
        } catch (RuntimeException e2) {
            e = e2;
            i = -1;
            i2 = -1;
        }
        try {
            i3 = dataInputStream.readInt();
            BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.values()[readByte];
            BloomFilterStrategies.LockFreeBitArray lockFreeBitArray = new BloomFilterStrategies.LockFreeBitArray(LongMath.checkedMultiply(i3, 64L));
            for (int i4 = 0; i4 < i3; i4++) {
                lockFreeBitArray.m68359f(i4, dataInputStream.readLong());
            }
            return new BloomFilter<>(lockFreeBitArray, i2, funnel, bloomFilterStrategies);
        } catch (RuntimeException e3) {
            e = e3;
            int i5 = i3;
            i3 = readByte;
            i = i5;
            StringBuilder sb2 = new StringBuilder(134);
            sb2.append("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
            sb2.append(i3);
            sb2.append(" numHashFunctions: ");
            sb2.append(i2);
            sb2.append(" dataLength: ");
            sb2.append(i);
            throw new IOException(sb2.toString(), e);
        }
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(@ParametricNullness T t) {
        return mightContain(t);
    }

    public long approximateElementCount() {
        double m68363b = this.f41089b.m68363b();
        return DoubleMath.roundToLong(((-Math.log1p(-(this.f41089b.m68364a() / m68363b))) * m68363b) / this.f41090c, RoundingMode.HALF_UP);
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.f41089b.m68362c(), this.f41090c, this.f41091d, this.f41092f);
    }

    @VisibleForTesting
    /* renamed from: e */
    long m68371e() {
        return this.f41089b.m68363b();
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        if (this.f41090c == bloomFilter.f41090c && this.f41091d.equals(bloomFilter.f41091d) && this.f41089b.equals(bloomFilter.f41089b) && this.f41092f.equals(bloomFilter.f41092f)) {
            return true;
        }
        return false;
    }

    public double expectedFpp() {
        return Math.pow(this.f41089b.m68364a() / m68371e(), this.f41090c);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f41090c), this.f41091d, this.f41092f, this.f41089b);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        if (this != bloomFilter && this.f41090c == bloomFilter.f41090c && m68371e() == bloomFilter.m68371e() && this.f41092f.equals(bloomFilter.f41092f) && this.f41091d.equals(bloomFilter.f41091d)) {
            return true;
        }
        return false;
    }

    public boolean mightContain(@ParametricNullness T t) {
        return this.f41092f.mightContain(t, this.f41091d, this.f41090c, this.f41089b);
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness T t) {
        return this.f41092f.put(t, this.f41091d, this.f41090c, this.f41089b);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        boolean z;
        boolean z2;
        boolean z3;
        Preconditions.checkNotNull(bloomFilter);
        if (this != bloomFilter) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Cannot combine a BloomFilter with itself.");
        int i = this.f41090c;
        int i2 = bloomFilter.f41090c;
        if (i == i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "BloomFilters must have the same number of hash functions (%s != %s)", i, i2);
        if (m68371e() == bloomFilter.m68371e()) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3, "BloomFilters must have the same size underlying bit arrays (%s != %s)", m68371e(), bloomFilter.m68371e());
        Preconditions.checkArgument(this.f41092f.equals(bloomFilter.f41092f), "BloomFilters must have equal strategies (%s != %s)", this.f41092f, bloomFilter.f41092f);
        Preconditions.checkArgument(this.f41091d.equals(bloomFilter.f41091d), "BloomFilters must have equal funnels (%s != %s)", this.f41091d, bloomFilter.f41091d);
        this.f41089b.m68360e(bloomFilter.f41089b);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(SignedBytes.checkedCast(this.f41092f.ordinal()));
        dataOutputStream.writeByte(UnsignedBytes.checkedCast(this.f41090c));
        dataOutputStream.writeInt(this.f41089b.f41098a.length());
        for (int i = 0; i < this.f41089b.f41098a.length(); i++) {
            dataOutputStream.writeLong(this.f41089b.f41098a.get(i));
        }
    }

    private BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i, Funnel<? super T> funnel, Strategy strategy) {
        Preconditions.checkArgument(i > 0, "numHashFunctions (%s) must be > 0", i);
        Preconditions.checkArgument(i <= 255, "numHashFunctions (%s) must be <= 255", i);
        this.f41089b = (BloomFilterStrategies.LockFreeBitArray) Preconditions.checkNotNull(lockFreeBitArray);
        this.f41090c = i;
        this.f41091d = (Funnel) Preconditions.checkNotNull(funnel);
        this.f41092f = (Strategy) Preconditions.checkNotNull(strategy);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j, double d) {
        return m68370f(funnel, j, d, BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i) {
        return create(funnel, i);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j) {
        return create(funnel, j, 0.03d);
    }
}
