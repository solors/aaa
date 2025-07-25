package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class AbstractByteHasher extends AbstractHasher {

    /* renamed from: a */
    private final ByteBuffer f41080a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: a */
    private Hasher m68382a(int i) {
        try {
            mo68306e(this.f41080a.array(), 0, i);
            return this;
        } finally {
            Java8Compatibility.m68326a(this.f41080a);
        }
    }

    /* renamed from: b */
    protected abstract void mo68308b(byte b);

    /* renamed from: c */
    protected void mo68307c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            mo68306e(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            Java8Compatibility.m68323d(byteBuffer, byteBuffer.limit());
            return;
        }
        for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
            mo68308b(byteBuffer.get());
        }
    }

    /* renamed from: d */
    protected void mo68312d(byte[] bArr) {
        mo68306e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    protected void mo68306e(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo68308b(bArr[i3]);
        }
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putByte(byte b) {
        mo68308b(b);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putChar(char c) {
        this.f41080a.putChar(c);
        return m68382a(2);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putInt(int i) {
        this.f41080a.putInt(i);
        return m68382a(4);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putLong(long j) {
        this.f41080a.putLong(j);
        return m68382a(8);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putShort(short s) {
        this.f41080a.putShort(s);
        return m68382a(2);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        mo68312d(bArr);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        mo68306e(bArr, i, i2);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(ByteBuffer byteBuffer) {
        mo68307c(byteBuffer);
        return this;
    }
}
