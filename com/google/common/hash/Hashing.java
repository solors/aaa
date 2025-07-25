package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Hashing {

    /* renamed from: a */
    static final int f41128a = (int) System.currentTimeMillis();

    @Immutable
    /* loaded from: classes4.dex */
    enum ChecksumType implements ImmutableSupplier<Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.base.Supplier
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.base.Supplier
            public Checksum get() {
                return new Adler32();
            }
        };
        
        public final HashFunction hashFunction;

        ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        @Override // com.google.common.hash.AbstractCompositeHashFunction
        /* renamed from: b */
        HashCode mo68327b(Hasher[] hasherArr) {
            byte[] bArr = new byte[bits() / 8];
            int i = 0;
            for (Hasher hasher : hasherArr) {
                HashCode hash = hasher.hash();
                i += hash.writeBytesTo(bArr, i, hash.bits() / 8);
            }
            return HashCode.m68334c(bArr);
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
            int i = 0;
            for (HashFunction hashFunction : this.f41081b) {
                i += hashFunction.bits();
            }
            return i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ConcatenatedHashFunction) {
                return Arrays.equals(this.f41081b, ((ConcatenatedHashFunction) obj).f41081b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f41081b);
        }

        private ConcatenatedHashFunction(HashFunction... hashFunctionArr) {
            super(hashFunctionArr);
            for (HashFunction hashFunction : hashFunctionArr) {
                Preconditions.checkArgument(hashFunction.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", hashFunction.bits(), (Object) hashFunction);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class LinearCongruentialGenerator {

        /* renamed from: a */
        private long f41130a;

        public LinearCongruentialGenerator(long j) {
            this.f41130a = j;
        }

        public double nextDouble() {
            long j = (this.f41130a * 2862933555777941757L) + 1;
            this.f41130a = j;
            return (((int) (j >>> 33)) + 1) / 2.147483648E9d;
        }
    }

    /* loaded from: classes4.dex */
    private static class Md5Holder {

        /* renamed from: a */
        static final HashFunction f41131a = new MessageDigestHashFunction(SameMD5.TAG, "Hashing.md5()");

        private Md5Holder() {
        }
    }

    /* loaded from: classes4.dex */
    private static class Sha1Holder {

        /* renamed from: a */
        static final HashFunction f41132a = new MessageDigestHashFunction(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1, "Hashing.sha1()");

        private Sha1Holder() {
        }
    }

    /* loaded from: classes4.dex */
    private static class Sha256Holder {

        /* renamed from: a */
        static final HashFunction f41133a = new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");

        private Sha256Holder() {
        }
    }

    /* loaded from: classes4.dex */
    private static class Sha384Holder {

        /* renamed from: a */
        static final HashFunction f41134a = new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");

        private Sha384Holder() {
        }
    }

    /* loaded from: classes4.dex */
    private static class Sha512Holder {

        /* renamed from: a */
        static final HashFunction f41135a = new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");

        private Sha512Holder() {
        }
    }

    private Hashing() {
    }

    /* renamed from: a */
    static int m68330a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Number of bits must be positive");
        return (i + 31) & (-32);
    }

    public static HashFunction adler32() {
        return ChecksumType.ADLER_32.hashFunction;
    }

    /* renamed from: b */
    private static String m68329b(String str, Key key) {
        return String.format("Hashing.%s(Key[algorithm=%s, format=%s])", str, key.getAlgorithm(), key.getFormat());
    }

    public static HashCode combineOrdered(Iterable<HashCode> iterable) {
        boolean z;
        Iterator<HashCode> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int bits = it.next().bits() / 8;
        byte[] bArr = new byte[bits];
        for (HashCode hashCode : iterable) {
            byte[] asBytes = hashCode.asBytes();
            if (asBytes.length == bits) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "All hashcodes must have the same bit length.");
            for (int i = 0; i < asBytes.length; i++) {
                bArr[i] = (byte) ((bArr[i] * 37) ^ asBytes[i]);
            }
        }
        return HashCode.m68334c(bArr);
    }

    public static HashCode combineUnordered(Iterable<HashCode> iterable) {
        boolean z;
        Iterator<HashCode> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int bits = it.next().bits() / 8;
        byte[] bArr = new byte[bits];
        for (HashCode hashCode : iterable) {
            byte[] asBytes = hashCode.asBytes();
            if (asBytes.length == bits) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "All hashcodes must have the same bit length.");
            for (int i = 0; i < asBytes.length; i++) {
                bArr[i] = (byte) (bArr[i] + asBytes[i]);
            }
        }
        return HashCode.m68334c(bArr);
    }

    public static HashFunction concatenating(HashFunction hashFunction, HashFunction hashFunction2, HashFunction... hashFunctionArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hashFunction);
        arrayList.add(hashFunction2);
        Collections.addAll(arrayList, hashFunctionArr);
        return new ConcatenatedHashFunction((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }

    public static int consistentHash(HashCode hashCode, int i) {
        return consistentHash(hashCode.padToLong(), i);
    }

    public static HashFunction crc32() {
        return ChecksumType.CRC_32.hashFunction;
    }

    public static HashFunction crc32c() {
        return Crc32cHashFunction.f41105b;
    }

    public static HashFunction farmHashFingerprint64() {
        return FarmHashFingerprint64.f41114b;
    }

    public static HashFunction fingerprint2011() {
        return Fingerprint2011.f41115b;
    }

    public static HashFunction goodFastHash(int i) {
        int m68330a = m68330a(i);
        if (m68330a == 32) {
            return Murmur3_32HashFunction.f41169g;
        }
        if (m68330a <= 128) {
            return Murmur3_128HashFunction.f41162d;
        }
        int i2 = (m68330a + 127) / 128;
        HashFunction[] hashFunctionArr = new HashFunction[i2];
        hashFunctionArr[0] = Murmur3_128HashFunction.f41162d;
        int i3 = f41128a;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 += 1500450271;
            hashFunctionArr[i4] = murmur3_128(i3);
        }
        return new ConcatenatedHashFunction(hashFunctionArr);
    }

    public static HashFunction hmacMd5(Key key) {
        return new MacHashFunction("HmacMD5", key, m68329b("hmacMd5", key));
    }

    public static HashFunction hmacSha1(Key key) {
        return new MacHashFunction("HmacSHA1", key, m68329b("hmacSha1", key));
    }

    public static HashFunction hmacSha256(Key key) {
        return new MacHashFunction("HmacSHA256", key, m68329b("hmacSha256", key));
    }

    public static HashFunction hmacSha512(Key key) {
        return new MacHashFunction("HmacSHA512", key, m68329b("hmacSha512", key));
    }

    @Deprecated
    public static HashFunction md5() {
        return Md5Holder.f41131a;
    }

    public static HashFunction murmur3_128(int i) {
        return new Murmur3_128HashFunction(i);
    }

    @Deprecated
    public static HashFunction murmur3_32(int i) {
        return new Murmur3_32HashFunction(i, false);
    }

    public static HashFunction murmur3_32_fixed(int i) {
        return new Murmur3_32HashFunction(i, true);
    }

    @Deprecated
    public static HashFunction sha1() {
        return Sha1Holder.f41132a;
    }

    public static HashFunction sha256() {
        return Sha256Holder.f41133a;
    }

    public static HashFunction sha384() {
        return Sha384Holder.f41134a;
    }

    public static HashFunction sha512() {
        return Sha512Holder.f41135a;
    }

    public static HashFunction sipHash24() {
        return SipHashFunction.f41177g;
    }

    public static int consistentHash(long j, int i) {
        int i2 = 0;
        Preconditions.checkArgument(i > 0, "buckets must be positive: %s", i);
        LinearCongruentialGenerator linearCongruentialGenerator = new LinearCongruentialGenerator(j);
        while (true) {
            int nextDouble = (int) ((i2 + 1) / linearCongruentialGenerator.nextDouble());
            if (nextDouble < 0 || nextDouble >= i) {
                break;
            }
            i2 = nextDouble;
        }
        return i2;
    }

    public static HashFunction hmacMd5(byte[] bArr) {
        return hmacMd5(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacMD5"));
    }

    public static HashFunction hmacSha1(byte[] bArr) {
        return hmacSha1(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA1"));
    }

    public static HashFunction hmacSha256(byte[] bArr) {
        return hmacSha256(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA256"));
    }

    public static HashFunction hmacSha512(byte[] bArr) {
        return hmacSha512(new SecretKeySpec((byte[]) Preconditions.checkNotNull(bArr), "HmacSHA512"));
    }

    public static HashFunction murmur3_128() {
        return Murmur3_128HashFunction.f41161c;
    }

    @Deprecated
    public static HashFunction murmur3_32() {
        return Murmur3_32HashFunction.f41167d;
    }

    public static HashFunction murmur3_32_fixed() {
        return Murmur3_32HashFunction.f41168f;
    }

    public static HashFunction sipHash24(long j, long j2) {
        return new SipHashFunction(2, 4, j, j2);
    }

    public static HashFunction concatenating(Iterable<HashFunction> iterable) {
        Preconditions.checkNotNull(iterable);
        ArrayList arrayList = new ArrayList();
        for (HashFunction hashFunction : iterable) {
            arrayList.add(hashFunction);
        }
        Preconditions.checkArgument(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new ConcatenatedHashFunction((HashFunction[]) arrayList.toArray(new HashFunction[0]));
    }
}
