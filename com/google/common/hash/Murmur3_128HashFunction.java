package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: c */
    static final HashFunction f41161c = new Murmur3_128HashFunction(0);

    /* renamed from: d */
    static final HashFunction f41162d = new Murmur3_128HashFunction(Hashing.f41128a);

    /* renamed from: b */
    private final int f41163b;

    /* loaded from: classes4.dex */
    private static final class Murmur3_128Hasher extends AbstractStreamingHasher {

        /* renamed from: d */
        private long f41164d;

        /* renamed from: e */
        private long f41165e;

        /* renamed from: f */
        private int f41166f;

        Murmur3_128Hasher(int i) {
            super(16);
            long j = i;
            this.f41164d = j;
            this.f41165e = j;
            this.f41166f = 0;
        }

        /* renamed from: g */
        private void m68304g(long j, long j2) {
            long m68302i = m68302i(j) ^ this.f41164d;
            this.f41164d = m68302i;
            long rotateLeft = Long.rotateLeft(m68302i, 27);
            long j3 = this.f41165e;
            this.f41164d = ((rotateLeft + j3) * 5) + 1390208809;
            long m68301j = m68301j(j2) ^ j3;
            this.f41165e = m68301j;
            this.f41165e = ((Long.rotateLeft(m68301j, 31) + this.f41164d) * 5) + 944331445;
        }

        /* renamed from: h */
        private static long m68303h(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        /* renamed from: i */
        private static long m68302i(long j) {
            return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        /* renamed from: j */
        private static long m68301j(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        /* renamed from: a */
        protected HashCode mo68285a() {
            long j = this.f41164d;
            int i = this.f41166f;
            long j2 = j ^ i;
            long j3 = this.f41165e ^ i;
            long j4 = j2 + j3;
            this.f41164d = j4;
            this.f41165e = j3 + j4;
            this.f41164d = m68303h(j4);
            long m68303h = m68303h(this.f41165e);
            long j5 = this.f41164d + m68303h;
            this.f41164d = j5;
            this.f41165e = m68303h + j5;
            return HashCode.m68334c(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f41164d).putLong(this.f41165e).array());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        /* renamed from: d */
        protected void mo68284d(ByteBuffer byteBuffer) {
            m68304g(byteBuffer.getLong(), byteBuffer.getLong());
            this.f41166f += 16;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        /* renamed from: e */
        protected void mo68283e(ByteBuffer byteBuffer) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            long j9;
            long j10;
            long j11;
            long j12;
            long j13;
            long j14;
            this.f41166f += byteBuffer.remaining();
            long j15 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j = 0;
                    j7 = UnsignedBytes.toInt(byteBuffer.get(0)) ^ j;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 2:
                    j2 = 0;
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = UnsignedBytes.toInt(byteBuffer.get(0)) ^ j;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 3:
                    j3 = 0;
                    j2 = j3 ^ (UnsignedBytes.toInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = UnsignedBytes.toInt(byteBuffer.get(0)) ^ j;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j2 = j3 ^ (UnsignedBytes.toInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = UnsignedBytes.toInt(byteBuffer.get(0)) ^ j;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j2 = j3 ^ (UnsignedBytes.toInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = UnsignedBytes.toInt(byteBuffer.get(0)) ^ j;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 6:
                    j6 = 0;
                    j5 = j6 ^ (UnsignedBytes.toInt(byteBuffer.get(5)) << 40);
                    j4 = j5 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j2 = j3 ^ (UnsignedBytes.toInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = UnsignedBytes.toInt(byteBuffer.get(0)) ^ j;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 7:
                    j6 = (UnsignedBytes.toInt(byteBuffer.get(6)) << 48) ^ 0;
                    j5 = j6 ^ (UnsignedBytes.toInt(byteBuffer.get(5)) << 40);
                    j4 = j5 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j2 = j3 ^ (UnsignedBytes.toInt(byteBuffer.get(2)) << 16);
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = UnsignedBytes.toInt(byteBuffer.get(0)) ^ j;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 8:
                    j8 = 0;
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 9:
                    j9 = 0;
                    j8 = j9 ^ UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 10:
                    j10 = 0;
                    j9 = j10 ^ (UnsignedBytes.toInt(byteBuffer.get(9)) << 8);
                    j8 = j9 ^ UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 11:
                    j11 = 0;
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(10)) << 16);
                    j9 = j10 ^ (UnsignedBytes.toInt(byteBuffer.get(9)) << 8);
                    j8 = j9 ^ UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 12:
                    j12 = 0;
                    j11 = j12 ^ (UnsignedBytes.toInt(byteBuffer.get(11)) << 24);
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(10)) << 16);
                    j9 = j10 ^ (UnsignedBytes.toInt(byteBuffer.get(9)) << 8);
                    j8 = j9 ^ UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 13:
                    j13 = 0;
                    j12 = j13 ^ (UnsignedBytes.toInt(byteBuffer.get(12)) << 32);
                    j11 = j12 ^ (UnsignedBytes.toInt(byteBuffer.get(11)) << 24);
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(10)) << 16);
                    j9 = j10 ^ (UnsignedBytes.toInt(byteBuffer.get(9)) << 8);
                    j8 = j9 ^ UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 14:
                    j14 = 0;
                    j13 = j14 ^ (UnsignedBytes.toInt(byteBuffer.get(13)) << 40);
                    j12 = j13 ^ (UnsignedBytes.toInt(byteBuffer.get(12)) << 32);
                    j11 = j12 ^ (UnsignedBytes.toInt(byteBuffer.get(11)) << 24);
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(10)) << 16);
                    j9 = j10 ^ (UnsignedBytes.toInt(byteBuffer.get(9)) << 8);
                    j8 = j9 ^ UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                case 15:
                    j14 = (UnsignedBytes.toInt(byteBuffer.get(14)) << 48) ^ 0;
                    j13 = j14 ^ (UnsignedBytes.toInt(byteBuffer.get(13)) << 40);
                    j12 = j13 ^ (UnsignedBytes.toInt(byteBuffer.get(12)) << 32);
                    j11 = j12 ^ (UnsignedBytes.toInt(byteBuffer.get(11)) << 24);
                    j10 = j11 ^ (UnsignedBytes.toInt(byteBuffer.get(10)) << 16);
                    j9 = j10 ^ (UnsignedBytes.toInt(byteBuffer.get(9)) << 8);
                    j8 = j9 ^ UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.f41164d ^= m68302i(j7);
                    this.f41165e ^= m68301j(j15);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Murmur3_128HashFunction(int i) {
        this.f41163b = i;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Murmur3_128HashFunction) || this.f41163b != ((Murmur3_128HashFunction) obj).f41163b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.f41163b;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.f41163b);
    }

    public String toString() {
        int i = this.f41163b;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Hashing.murmur3_128(");
        sb2.append(i);
        sb2.append(")");
        return sb2.toString();
    }
}
