package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {

    /* renamed from: b */
    static final HashFunction f41115b = new Fingerprint2011();

    Fingerprint2011() {
    }

    @VisibleForTesting
    /* renamed from: a */
    static long m68346a(byte[] bArr, int i, int i2) {
        long m68345b;
        long j;
        if (i2 <= 32) {
            m68345b = m68342e(bArr, i, i2, -1397348546323613475L);
        } else if (i2 <= 64) {
            m68345b = m68343d(bArr, i, i2);
        } else {
            m68345b = m68345b(bArr, i, i2);
        }
        long j2 = -6505348102511208375L;
        if (i2 >= 8) {
            j = LittleEndianByteArray.m68321b(bArr, i);
        } else {
            j = -6505348102511208375L;
        }
        if (i2 >= 9) {
            j2 = LittleEndianByteArray.m68321b(bArr, (i + i2) - 8);
        }
        long m68344c = m68344c(m68345b + j2, j);
        if (m68344c == 0 || m68344c == 1) {
            return m68344c - 2;
        }
        return m68344c;
    }

    /* renamed from: b */
    private static long m68345b(byte[] bArr, int i, int i2) {
        long m68321b = LittleEndianByteArray.m68321b(bArr, i);
        int i3 = i + i2;
        long m68321b2 = LittleEndianByteArray.m68321b(bArr, i3 - 16) ^ (-8261664234251669945L);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j = i2;
        m68340g(bArr, i3 - 64, j, m68321b2, jArr);
        m68340g(bArr, i3 - 32, j * (-8261664234251669945L), -6505348102511208375L, jArr2);
        long m68321b3 = (LittleEndianByteArray.m68321b(bArr, i3 - 56) ^ (-6505348102511208375L)) + (m68341f(jArr[1]) * (-8261664234251669945L));
        long rotateRight = Long.rotateRight(m68321b3 + m68321b, 39) * (-8261664234251669945L);
        long rotateRight2 = Long.rotateRight(m68321b2, 33) * (-8261664234251669945L);
        int i4 = i;
        int i5 = (i2 - 1) & (-64);
        while (true) {
            long rotateRight3 = (Long.rotateRight(((rotateRight + rotateRight2) + jArr[0]) + LittleEndianByteArray.m68321b(bArr, i4 + 16), 37) * (-8261664234251669945L)) ^ jArr2[1];
            long rotateRight4 = (Long.rotateRight((rotateRight2 + jArr[1]) + LittleEndianByteArray.m68321b(bArr, i4 + 48), 42) * (-8261664234251669945L)) ^ jArr[0];
            long rotateRight5 = Long.rotateRight(m68321b3 ^ jArr2[0], 33);
            m68340g(bArr, i4, jArr[1] * (-8261664234251669945L), rotateRight3 + jArr2[0], jArr);
            m68340g(bArr, i4 + 32, jArr2[1] + rotateRight5, rotateRight4, jArr2);
            i4 += 64;
            i5 -= 64;
            if (i5 == 0) {
                return m68344c(m68344c(jArr[0], jArr2[0]) + (m68341f(rotateRight4) * (-8261664234251669945L)) + rotateRight3, m68344c(jArr[1], jArr2[1]) + rotateRight5);
            }
            rotateRight = rotateRight5;
            m68321b3 = rotateRight3;
            rotateRight2 = rotateRight4;
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    static long m68344c(long j, long j2) {
        long j3 = (j2 ^ j) * (-4132994306676758123L);
        long j4 = (j ^ (j3 ^ (j3 >>> 47))) * (-4132994306676758123L);
        return (j4 ^ (j4 >>> 47)) * (-4132994306676758123L);
    }

    /* renamed from: d */
    private static long m68343d(byte[] bArr, int i, int i2) {
        long m68321b = LittleEndianByteArray.m68321b(bArr, i + 24);
        int i3 = i + i2;
        int i4 = i3 - 16;
        long m68321b2 = LittleEndianByteArray.m68321b(bArr, i) + ((i2 + LittleEndianByteArray.m68321b(bArr, i4)) * (-6505348102511208375L));
        long rotateRight = Long.rotateRight(m68321b2 + m68321b, 52);
        long rotateRight2 = Long.rotateRight(m68321b2, 37);
        long m68321b3 = m68321b2 + LittleEndianByteArray.m68321b(bArr, i + 8);
        int i5 = i + 16;
        long m68321b4 = m68321b3 + LittleEndianByteArray.m68321b(bArr, i5);
        long j = m68321b + m68321b4;
        long rotateRight3 = rotateRight + Long.rotateRight(m68321b4, 31) + rotateRight2 + Long.rotateRight(m68321b3, 7);
        long m68321b5 = LittleEndianByteArray.m68321b(bArr, i5) + LittleEndianByteArray.m68321b(bArr, i3 - 32);
        long m68321b6 = LittleEndianByteArray.m68321b(bArr, i3 - 8);
        long rotateRight4 = Long.rotateRight(m68321b5 + m68321b6, 52);
        long rotateRight5 = Long.rotateRight(m68321b5, 37);
        long m68321b7 = m68321b5 + LittleEndianByteArray.m68321b(bArr, i3 - 24);
        long m68321b8 = m68321b7 + LittleEndianByteArray.m68321b(bArr, i4);
        return m68341f((m68341f(((j + rotateRight4 + Long.rotateRight(m68321b8, 31) + rotateRight5 + Long.rotateRight(m68321b7, 7)) * (-4288712594273399085L)) + ((m68321b6 + m68321b8 + rotateRight3) * (-6505348102511208375L))) * (-6505348102511208375L)) + rotateRight3) * (-4288712594273399085L);
    }

    @VisibleForTesting
    /* renamed from: e */
    static long m68342e(byte[] bArr, int i, int i2, long j) {
        int i3 = i2 & (-8);
        int i4 = i2 & 7;
        long j2 = j ^ (i2 * (-4132994306676758123L));
        for (int i5 = 0; i5 < i3; i5 += 8) {
            j2 = (j2 ^ (m68341f(LittleEndianByteArray.m68321b(bArr, i + i5) * (-4132994306676758123L)) * (-4132994306676758123L))) * (-4132994306676758123L);
        }
        if (i4 != 0) {
            j2 = (LittleEndianByteArray.m68320c(bArr, i + i3, i4) ^ j2) * (-4132994306676758123L);
        }
        return m68341f(m68341f(j2) * (-4132994306676758123L));
    }

    /* renamed from: f */
    private static long m68341f(long j) {
        return j ^ (j >>> 47);
    }

    /* renamed from: g */
    private static void m68340g(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long m68321b = LittleEndianByteArray.m68321b(bArr, i);
        long m68321b2 = LittleEndianByteArray.m68321b(bArr, i + 8);
        long m68321b3 = LittleEndianByteArray.m68321b(bArr, i + 16);
        long m68321b4 = LittleEndianByteArray.m68321b(bArr, i + 24);
        long j3 = j + m68321b;
        long j4 = m68321b2 + j3 + m68321b3;
        jArr[0] = j4 + m68321b4;
        jArr[1] = Long.rotateRight(j2 + j3 + m68321b4, 51) + Long.rotateRight(j4, 23) + j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(m68346a(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
