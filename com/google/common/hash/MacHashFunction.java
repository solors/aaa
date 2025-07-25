package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class MacHashFunction extends AbstractHashFunction {

    /* renamed from: b */
    private final Mac f41144b;

    /* renamed from: c */
    private final Key f41145c;

    /* renamed from: d */
    private final String f41146d;

    /* renamed from: f */
    private final int f41147f;

    /* renamed from: g */
    private final boolean f41148g;

    /* loaded from: classes4.dex */
    private static final class MacHasher extends AbstractByteHasher {

        /* renamed from: b */
        private final Mac f41149b;

        /* renamed from: c */
        private boolean f41150c;

        /* renamed from: f */
        private void m68311f() {
            Preconditions.checkState(!this.f41150c, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: b */
        protected void mo68308b(byte b) {
            m68311f();
            this.f41149b.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: c */
        protected void mo68307c(ByteBuffer byteBuffer) {
            m68311f();
            Preconditions.checkNotNull(byteBuffer);
            this.f41149b.update(byteBuffer);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: d */
        protected void mo68312d(byte[] bArr) {
            m68311f();
            this.f41149b.update(bArr);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: e */
        protected void mo68306e(byte[] bArr, int i, int i2) {
            m68311f();
            this.f41149b.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            m68311f();
            this.f41150c = true;
            return HashCode.m68334c(this.f41149b.doFinal());
        }

        private MacHasher(Mac mac) {
            this.f41149b = mac;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MacHashFunction(String str, Key key, String str2) {
        Mac m68314a = m68314a(str, key);
        this.f41144b = m68314a;
        this.f41145c = (Key) Preconditions.checkNotNull(key);
        this.f41146d = (String) Preconditions.checkNotNull(str2);
        this.f41147f = m68314a.getMacLength() * 8;
        this.f41148g = m68313b(m68314a);
    }

    /* renamed from: a */
    private static Mac m68314a(String str, Key key) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: b */
    private static boolean m68313b(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.f41147f;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.f41148g) {
            try {
                return new MacHasher((Mac) this.f41144b.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MacHasher(m68314a(this.f41144b.getAlgorithm(), this.f41145c));
    }

    public String toString() {
        return this.f41146d;
    }
}
