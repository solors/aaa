package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class SipHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: g */
    static final HashFunction f41177g = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);

    /* renamed from: b */
    private final int f41178b;

    /* renamed from: c */
    private final int f41179c;

    /* renamed from: d */
    private final long f41180d;

    /* renamed from: f */
    private final long f41181f;

    /* loaded from: classes4.dex */
    private static final class SipHasher extends AbstractStreamingHasher {

        /* renamed from: d */
        private final int f41182d;

        /* renamed from: e */
        private final int f41183e;

        /* renamed from: f */
        private long f41184f;

        /* renamed from: g */
        private long f41185g;

        /* renamed from: h */
        private long f41186h;

        /* renamed from: i */
        private long f41187i;

        /* renamed from: j */
        private long f41188j;

        /* renamed from: k */
        private long f41189k;

        SipHasher(int i, int i2, long j, long j2) {
            super(8);
            this.f41188j = 0L;
            this.f41189k = 0L;
            this.f41182d = i;
            this.f41183e = i2;
            this.f41184f = 8317987319222330741L ^ j;
            this.f41185g = 7237128888997146477L ^ j2;
            this.f41186h = 7816392313619706465L ^ j;
            this.f41187i = 8387220255154660723L ^ j2;
        }

        /* renamed from: g */
        private void m68282g(long j) {
            this.f41187i ^= j;
            m68281h(this.f41182d);
            this.f41184f = j ^ this.f41184f;
        }

        /* renamed from: h */
        private void m68281h(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f41184f;
                long j2 = this.f41185g;
                this.f41184f = j + j2;
                this.f41186h += this.f41187i;
                this.f41185g = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.f41187i, 16);
                long j3 = this.f41185g;
                long j4 = this.f41184f;
                this.f41185g = j3 ^ j4;
                this.f41187i = rotateLeft ^ this.f41186h;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f41186h;
                long j6 = this.f41185g;
                this.f41186h = j5 + j6;
                this.f41184f = rotateLeft2 + this.f41187i;
                this.f41185g = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.f41187i, 21);
                long j7 = this.f41185g;
                long j8 = this.f41186h;
                this.f41185g = j7 ^ j8;
                this.f41187i = rotateLeft3 ^ this.f41184f;
                this.f41186h = Long.rotateLeft(j8, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        /* renamed from: a */
        protected HashCode mo68285a() {
            long j = this.f41189k ^ (this.f41188j << 56);
            this.f41189k = j;
            m68282g(j);
            this.f41186h ^= 255;
            m68281h(this.f41183e);
            return HashCode.fromLong(((this.f41184f ^ this.f41185g) ^ this.f41186h) ^ this.f41187i);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        /* renamed from: d */
        protected void mo68284d(ByteBuffer byteBuffer) {
            this.f41188j += 8;
            m68282g(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        /* renamed from: e */
        protected void mo68283e(ByteBuffer byteBuffer) {
            this.f41188j += byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.f41189k ^= (byteBuffer.get() & 255) << i;
                i += 8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SipHashFunction(int i, int i2, long j, long j2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        Preconditions.checkArgument(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f41178b = i;
        this.f41179c = i2;
        this.f41180d = j;
        this.f41181f = j2;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        if (this.f41178b != sipHashFunction.f41178b || this.f41179c != sipHashFunction.f41179c || this.f41180d != sipHashFunction.f41180d || this.f41181f != sipHashFunction.f41181f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (int) ((((SipHashFunction.class.hashCode() ^ this.f41178b) ^ this.f41179c) ^ this.f41180d) ^ this.f41181f);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f41178b, this.f41179c, this.f41180d, this.f41181f);
    }

    public String toString() {
        int i = this.f41178b;
        int i2 = this.f41179c;
        long j = this.f41180d;
        long j2 = this.f41181f;
        StringBuilder sb2 = new StringBuilder(81);
        sb2.append("Hashing.sipHash");
        sb2.append(i);
        sb2.append(i2);
        sb2.append("(");
        sb2.append(j);
        sb2.append(", ");
        sb2.append(j2);
        sb2.append(")");
        return sb2.toString();
    }
}
