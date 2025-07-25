package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {

    /* renamed from: b */
    static final HashFunction f41114b = new FarmHashFingerprint64();

    FarmHashFingerprint64() {
    }

    @VisibleForTesting
    /* renamed from: a */
    static long m68354a(byte[] bArr, int i, int i2) {
        if (i2 <= 32) {
            if (i2 <= 16) {
                return m68353b(bArr, i, i2);
            }
            return m68351d(bArr, i, i2);
        } else if (i2 <= 64) {
            return m68350e(bArr, i, i2);
        } else {
            return m68349f(bArr, i, i2);
        }
    }

    /* renamed from: b */
    private static long m68353b(byte[] bArr, int i, int i2) {
        if (i2 >= 8) {
            long j = (i2 * 2) - 7286425919675154353L;
            long m68321b = LittleEndianByteArray.m68321b(bArr, i) - 7286425919675154353L;
            long m68321b2 = LittleEndianByteArray.m68321b(bArr, (i + i2) - 8);
            return m68352c((Long.rotateRight(m68321b2, 37) * j) + m68321b, (Long.rotateRight(m68321b, 25) + m68321b2) * j, j);
        } else if (i2 >= 4) {
            return m68352c(i2 + ((LittleEndianByteArray.m68322a(bArr, i) & 4294967295L) << 3), LittleEndianByteArray.m68322a(bArr, (i + i2) - 4) & 4294967295L, (i2 * 2) - 7286425919675154353L);
        } else if (i2 <= 0) {
            return -7286425919675154353L;
        } else {
            return m68348g((((bArr[i] & 255) + ((bArr[(i2 >> 1) + i] & 255) << 8)) * (-7286425919675154353L)) ^ ((i2 + ((bArr[i + (i2 - 1)] & 255) << 2)) * (-4348849565147123417L))) * (-7286425919675154353L);
        }
    }

    /* renamed from: c */
    private static long m68352c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: d */
    private static long m68351d(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) - 7286425919675154353L;
        long m68321b = LittleEndianByteArray.m68321b(bArr, i) * (-5435081209227447693L);
        long m68321b2 = LittleEndianByteArray.m68321b(bArr, i + 8);
        int i3 = i + i2;
        long m68321b3 = LittleEndianByteArray.m68321b(bArr, i3 - 8) * j;
        return m68352c((LittleEndianByteArray.m68321b(bArr, i3 - 16) * (-7286425919675154353L)) + Long.rotateRight(m68321b + m68321b2, 43) + Long.rotateRight(m68321b3, 30), m68321b + Long.rotateRight(m68321b2 - 7286425919675154353L, 18) + m68321b3, j);
    }

    /* renamed from: e */
    private static long m68350e(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) - 7286425919675154353L;
        long m68321b = LittleEndianByteArray.m68321b(bArr, i) * (-7286425919675154353L);
        long m68321b2 = LittleEndianByteArray.m68321b(bArr, i + 8);
        int i3 = i + i2;
        long m68321b3 = LittleEndianByteArray.m68321b(bArr, i3 - 8) * j;
        long rotateRight = Long.rotateRight(m68321b + m68321b2, 43) + Long.rotateRight(m68321b3, 30) + (LittleEndianByteArray.m68321b(bArr, i3 - 16) * (-7286425919675154353L));
        long m68352c = m68352c(rotateRight, m68321b3 + Long.rotateRight(m68321b2 - 7286425919675154353L, 18) + m68321b, j);
        long m68321b4 = LittleEndianByteArray.m68321b(bArr, i + 16) * j;
        long m68321b5 = LittleEndianByteArray.m68321b(bArr, i + 24);
        long m68321b6 = (rotateRight + LittleEndianByteArray.m68321b(bArr, i3 - 32)) * j;
        return m68352c(((m68352c + LittleEndianByteArray.m68321b(bArr, i3 - 24)) * j) + Long.rotateRight(m68321b4 + m68321b5, 43) + Long.rotateRight(m68321b6, 30), m68321b4 + Long.rotateRight(m68321b5 + m68321b, 18) + m68321b6, j);
    }

    /* renamed from: f */
    private static long m68349f(byte[] bArr, int i, int i2) {
        long j = 81;
        long j2 = (j * (-5435081209227447693L)) + 113;
        long m68348g = m68348g((j2 * (-7286425919675154353L)) + 113) * (-7286425919675154353L);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long m68321b = (j * (-7286425919675154353L)) + LittleEndianByteArray.m68321b(bArr, i);
        int i3 = i2 - 1;
        int i4 = i + ((i3 / 64) * 64);
        int i5 = i3 & 63;
        int i6 = (i4 + i5) - 63;
        int i7 = i;
        while (true) {
            long rotateRight = (Long.rotateRight(((m68321b + j2) + jArr[0]) + LittleEndianByteArray.m68321b(bArr, i7 + 8), 37) * (-5435081209227447693L)) ^ jArr2[1];
            long rotateRight2 = (Long.rotateRight(j2 + jArr[1] + LittleEndianByteArray.m68321b(bArr, i7 + 48), 42) * (-5435081209227447693L)) + jArr[0] + LittleEndianByteArray.m68321b(bArr, i7 + 40);
            long rotateRight3 = Long.rotateRight(m68348g + jArr2[0], 33) * (-5435081209227447693L);
            m68347h(bArr, i7, jArr[1] * (-5435081209227447693L), rotateRight + jArr2[0], jArr);
            m68347h(bArr, i7 + 32, rotateRight3 + jArr2[1], rotateRight2 + LittleEndianByteArray.m68321b(bArr, i7 + 16), jArr2);
            int i8 = i7 + 64;
            if (i8 == i4) {
                long j3 = (-5435081209227447693L) + ((rotateRight & 255) << 1);
                long j4 = jArr2[0] + i5;
                jArr2[0] = j4;
                long j5 = jArr[0] + j4;
                jArr[0] = j5;
                jArr2[0] = jArr2[0] + j5;
                long rotateRight4 = (Long.rotateRight(((rotateRight3 + rotateRight2) + jArr[0]) + LittleEndianByteArray.m68321b(bArr, i6 + 8), 37) * j3) ^ (jArr2[1] * 9);
                long rotateRight5 = (Long.rotateRight(rotateRight2 + jArr[1] + LittleEndianByteArray.m68321b(bArr, i6 + 48), 42) * j3) + (jArr[0] * 9) + LittleEndianByteArray.m68321b(bArr, i6 + 40);
                long rotateRight6 = Long.rotateRight(rotateRight + jArr2[0], 33) * j3;
                m68347h(bArr, i6, jArr[1] * j3, rotateRight4 + jArr2[0], jArr);
                m68347h(bArr, i6 + 32, rotateRight6 + jArr2[1], rotateRight5 + LittleEndianByteArray.m68321b(bArr, i6 + 16), jArr2);
                return m68352c(m68352c(jArr[0], jArr2[0], j3) + (m68348g(rotateRight5) * (-4348849565147123417L)) + rotateRight4, m68352c(jArr[1], jArr2[1], j3) + rotateRight6, j3);
            }
            i7 = i8;
            m68348g = rotateRight;
            j2 = rotateRight2;
            m68321b = rotateRight3;
        }
    }

    /* renamed from: g */
    private static long m68348g(long j) {
        return j ^ (j >>> 47);
    }

    /* renamed from: h */
    private static void m68347h(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long m68321b = LittleEndianByteArray.m68321b(bArr, i);
        long m68321b2 = LittleEndianByteArray.m68321b(bArr, i + 8);
        long m68321b3 = LittleEndianByteArray.m68321b(bArr, i + 16);
        long m68321b4 = LittleEndianByteArray.m68321b(bArr, i + 24);
        long j3 = j + m68321b;
        long j4 = m68321b2 + j3 + m68321b3;
        jArr[0] = j4 + m68321b4;
        jArr[1] = Long.rotateRight(j2 + j3 + m68321b4, 21) + Long.rotateRight(j4, 44) + j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(m68354a(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
