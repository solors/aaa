package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class HashCode {

    /* renamed from: b */
    private static final char[] f41124b = "0123456789abcdef".toCharArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class BytesHashCode extends HashCode implements Serializable {

        /* renamed from: c */
        final byte[] f41125c;

        BytesHashCode(byte[] bArr) {
            this.f41125c = (byte[]) Preconditions.checkNotNull(bArr);
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            return (byte[]) this.f41125c.clone();
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            boolean z;
            byte[] bArr = this.f41125c;
            if (bArr.length >= 4) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f41125c;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            boolean z;
            byte[] bArr = this.f41125c;
            if (bArr.length >= 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: b */
        boolean mo68332b(HashCode hashCode) {
            boolean z;
            if (this.f41125c.length != hashCode.mo68333d().length) {
                return false;
            }
            boolean z2 = true;
            int i = 0;
            while (true) {
                byte[] bArr = this.f41125c;
                if (i < bArr.length) {
                    if (bArr[i] == hashCode.mo68333d()[i]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 &= z;
                    i++;
                } else {
                    return z2;
                }
            }
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return this.f41125c.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: d */
        byte[] mo68333d() {
            return this.f41125c;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: e */
        void mo68331e(byte[] bArr, int i, int i2) {
            System.arraycopy(this.f41125c, 0, bArr, i, i2);
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            long j = this.f41125c[0] & 255;
            for (int i = 1; i < Math.min(this.f41125c.length, 8); i++) {
                j |= (this.f41125c[i] & 255) << (i * 8);
            }
            return j;
        }
    }

    /* loaded from: classes4.dex */
    private static final class IntHashCode extends HashCode implements Serializable {

        /* renamed from: c */
        final int f41126c;

        IntHashCode(int i) {
            this.f41126c = i;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            int i = this.f41126c;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return this.f41126c;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: b */
        boolean mo68332b(HashCode hashCode) {
            if (this.f41126c == hashCode.asInt()) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: e */
        void mo68331e(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.f41126c >> (i3 * 8));
            }
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return UnsignedInts.toLong(this.f41126c);
        }
    }

    /* loaded from: classes4.dex */
    private static final class LongHashCode extends HashCode implements Serializable {

        /* renamed from: c */
        final long f41127c;

        LongHashCode(long j) {
            this.f41127c = j;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            long j = this.f41127c;
            return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return (int) this.f41127c;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            return this.f41127c;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: b */
        boolean mo68332b(HashCode hashCode) {
            if (this.f41127c == hashCode.asLong()) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: e */
        void mo68331e(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.f41127c >> (i3 * 8));
            }
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return this.f41127c;
        }
    }

    HashCode() {
    }

    /* renamed from: a */
    private static int m68335a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Illegal hexadecimal character: ");
        sb2.append(c);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static HashCode m68334c(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode fromBytes(byte[] bArr) {
        boolean z = true;
        if (bArr.length < 1) {
            z = false;
        }
        Preconditions.checkArgument(z, "A HashCode must contain at least 1 byte.");
        return m68334c((byte[]) bArr.clone());
    }

    public static HashCode fromInt(int i) {
        return new IntHashCode(i);
    }

    public static HashCode fromLong(long j) {
        return new LongHashCode(j);
    }

    public static HashCode fromString(String str) {
        boolean z;
        boolean z2 = true;
        if (str.length() >= 2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "input string (%s) must have at least 2 characters", str);
        if (str.length() % 2 != 0) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((m68335a(str.charAt(i)) << 4) + m68335a(str.charAt(i + 1)));
        }
        return m68334c(bArr);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    /* renamed from: b */
    abstract boolean mo68332b(HashCode hashCode);

    public abstract int bits();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public byte[] mo68333d() {
        return asBytes();
    }

    /* renamed from: e */
    abstract void mo68331e(byte[] bArr, int i, int i2);

    public final boolean equals(Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        if (bits() != hashCode.bits() || !mo68332b(hashCode)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] mo68333d = mo68333d();
        int i = mo68333d[0] & 255;
        for (int i2 = 1; i2 < mo68333d.length; i2++) {
            i |= (mo68333d[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] mo68333d = mo68333d();
        StringBuilder sb2 = new StringBuilder(mo68333d.length * 2);
        for (byte b : mo68333d) {
            char[] cArr = f41124b;
            sb2.append(cArr[(b >> 4) & 15]);
            sb2.append(cArr[b & 15]);
        }
        return sb2.toString();
    }

    @CanIgnoreReturnValue
    public int writeBytesTo(byte[] bArr, int i, int i2) {
        int min = Ints.min(i2, bits() / 8);
        Preconditions.checkPositionIndexes(i, i + min, bArr.length);
        mo68331e(bArr, i, min);
        return min;
    }
}
