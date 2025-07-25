package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: b */
    private final ImmutableSupplier<? extends Checksum> f41100b;

    /* renamed from: c */
    private final int f41101c;

    /* renamed from: d */
    private final String f41102d;

    /* loaded from: classes4.dex */
    private final class ChecksumHasher extends AbstractByteHasher {

        /* renamed from: b */
        private final Checksum f41103b;

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: b */
        protected void mo68308b(byte b) {
            this.f41103b.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        /* renamed from: e */
        protected void mo68306e(byte[] bArr, int i, int i2) {
            this.f41103b.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            long value = this.f41103b.getValue();
            if (ChecksumHashFunction.this.f41101c == 32) {
                return HashCode.fromInt((int) value);
            }
            return HashCode.fromLong(value);
        }

        private ChecksumHasher(Checksum checksum) {
            this.f41103b = (Checksum) Preconditions.checkNotNull(checksum);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChecksumHashFunction(ImmutableSupplier<? extends Checksum> immutableSupplier, int i, String str) {
        boolean z;
        this.f41100b = (ImmutableSupplier) Preconditions.checkNotNull(immutableSupplier);
        if (i != 32 && i != 64) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "bits (%s) must be either 32 or 64", i);
        this.f41101c = i;
        this.f41102d = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.f41101c;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new ChecksumHasher(this.f41100b.get());
    }

    public String toString() {
        return this.f41102d;
    }
}
