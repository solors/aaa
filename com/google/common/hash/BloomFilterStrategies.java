package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.BloomFilter;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
            long m68363b = lockFreeBitArray.m68363b();
            long asLong = Hashing.murmur3_128().hashObject(t, funnel).asLong();
            int i2 = (int) asLong;
            int i3 = (int) (asLong >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!lockFreeBitArray.m68361d(i5 % m68363b)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
            long m68363b = lockFreeBitArray.m68363b();
            long asLong = Hashing.murmur3_128().hashObject(t, funnel).asLong();
            int i2 = (int) asLong;
            int i3 = (int) (asLong >>> 32);
            boolean z = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                z |= lockFreeBitArray.m68358g(i5 % m68363b);
            }
            return z;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        /* renamed from: c */
        private long m68366c(byte[] bArr) {
            return Longs.fromBytes(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        /* renamed from: d */
        private long m68365d(byte[] bArr) {
            return Longs.fromBytes(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
            long m68363b = lockFreeBitArray.m68363b();
            byte[] mo68333d = Hashing.murmur3_128().hashObject(t, funnel).mo68333d();
            long m68366c = m68366c(mo68333d);
            long m68365d = m68365d(mo68333d);
            for (int i2 = 0; i2 < i; i2++) {
                if (!lockFreeBitArray.m68361d((Long.MAX_VALUE & m68366c) % m68363b)) {
                    return false;
                }
                m68366c += m68365d;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
            long m68363b = lockFreeBitArray.m68363b();
            byte[] mo68333d = Hashing.murmur3_128().hashObject(t, funnel).mo68333d();
            long m68366c = m68366c(mo68333d);
            long m68365d = m68365d(mo68333d);
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                z |= lockFreeBitArray.m68358g((Long.MAX_VALUE & m68366c) % m68363b);
                m68366c += m68365d;
            }
            return z;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class LockFreeBitArray {

        /* renamed from: a */
        final AtomicLongArray f41098a;

        /* renamed from: b */
        private final LongAddable f41099b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public LockFreeBitArray(long j) {
            Preconditions.checkArgument(j > 0, "data length is zero!");
            this.f41098a = new AtomicLongArray(Ints.checkedCast(LongMath.divide(j, 64L, RoundingMode.CEILING)));
            this.f41099b = LongAddables.create();
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public long m68364a() {
            return this.f41099b.sum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public long m68363b() {
            return this.f41098a.length() * 64;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public LockFreeBitArray m68362c() {
            return new LockFreeBitArray(toPlainArray(this.f41098a));
        }

        /* renamed from: d */
        boolean m68361d(long j) {
            if (((1 << ((int) j)) & this.f41098a.get((int) (j >>> 6))) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public void m68360e(LockFreeBitArray lockFreeBitArray) {
            boolean z;
            if (this.f41098a.length() == lockFreeBitArray.f41098a.length()) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "BitArrays must be of equal length (%s != %s)", this.f41098a.length(), lockFreeBitArray.f41098a.length());
            for (int i = 0; i < this.f41098a.length(); i++) {
                m68359f(i, lockFreeBitArray.f41098a.get(i));
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(toPlainArray(this.f41098a), toPlainArray(((LockFreeBitArray) obj).f41098a));
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public void m68359f(int i, long j) {
            long j2;
            long j3;
            boolean z;
            while (true) {
                j2 = this.f41098a.get(i);
                j3 = j2 | j;
                if (j2 == j3) {
                    z = false;
                    break;
                } else if (this.f41098a.compareAndSet(i, j2, j3)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                this.f41099b.add(Long.bitCount(j3) - Long.bitCount(j2));
            }
        }

        /* renamed from: g */
        boolean m68358g(long j) {
            long j2;
            long j3;
            if (m68361d(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.f41098a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.f41098a.compareAndSet(i, j2, j3));
            this.f41099b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(toPlainArray(this.f41098a));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public LockFreeBitArray(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.f41098a = new AtomicLongArray(jArr);
            this.f41099b = LongAddables.create();
            long j = 0;
            for (long j2 : jArr) {
                j += Long.bitCount(j2);
            }
            this.f41099b.add(j);
        }
    }
}
