package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: b */
    private final MessageDigest f41151b;

    /* renamed from: c */
    private final int f41152c;

    /* renamed from: d */
    private final boolean f41153d;

    /* renamed from: f */
    private final String f41154f;

    /* loaded from: classes4.dex */
    private static final class MessageDigestHasher extends AbstractByteHasher {

        /* renamed from: b */
        private final MessageDigest f41155b;

        /* renamed from: c */
        private final int f41156c;

        /* renamed from: d */
        private boolean f41157d;

        /* renamed from: f */
        private void m68305f() {
            Preconditions.checkState(!this.f41157d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: b */
        protected void mo68308b(byte b) {
            m68305f();
            this.f41155b.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: c */
        protected void mo68307c(ByteBuffer byteBuffer) {
            m68305f();
            this.f41155b.update(byteBuffer);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: e */
        protected void mo68306e(byte[] bArr, int i, int i2) {
            m68305f();
            this.f41155b.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            m68305f();
            this.f41157d = true;
            if (this.f41156c == this.f41155b.getDigestLength()) {
                return HashCode.m68334c(this.f41155b.digest());
            }
            return HashCode.m68334c(Arrays.copyOf(this.f41155b.digest(), this.f41156c));
        }

        private MessageDigestHasher(MessageDigest messageDigest, int i) {
            this.f41155b = messageDigest;
            this.f41156c = i;
        }
    }

    /* loaded from: classes4.dex */
    private static final class SerializedForm implements Serializable {

        /* renamed from: b */
        private final String f41158b;

        /* renamed from: c */
        private final int f41159c;

        /* renamed from: d */
        private final String f41160d;

        private Object readResolve() {
            return new MessageDigestHashFunction(this.f41158b, this.f41159c, this.f41160d);
        }

        private SerializedForm(String str, int i, String str2) {
            this.f41158b = str;
            this.f41159c = i;
            this.f41160d = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageDigestHashFunction(String str, String str2) {
        MessageDigest m68310a = m68310a(str);
        this.f41151b = m68310a;
        this.f41152c = m68310a.getDigestLength();
        this.f41154f = (String) Preconditions.checkNotNull(str2);
        this.f41153d = m68309b(m68310a);
    }

    /* renamed from: a */
    private static MessageDigest m68310a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private static boolean m68309b(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.f41152c * 8;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.f41153d) {
            try {
                return new MessageDigestHasher((MessageDigest) this.f41151b.clone(), this.f41152c);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MessageDigestHasher(m68310a(this.f41151b.getAlgorithm()), this.f41152c);
    }

    public String toString() {
        return this.f41154f;
    }

    Object writeReplace() {
        return new SerializedForm(this.f41151b.getAlgorithm(), this.f41152c, this.f41154f);
    }

    MessageDigestHashFunction(String str, int i, String str2) {
        this.f41154f = (String) Preconditions.checkNotNull(str2);
        MessageDigest m68310a = m68310a(str);
        this.f41151b = m68310a;
        int digestLength = m68310a.getDigestLength();
        Preconditions.checkArgument(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.f41152c = i;
        this.f41153d = m68309b(m68310a);
    }
}
