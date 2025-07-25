package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class AbstractStreamingHasher extends AbstractHasher {

    /* renamed from: a */
    private final ByteBuffer f41086a;

    /* renamed from: b */
    private final int f41087b;

    /* renamed from: c */
    private final int f41088c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractStreamingHasher(int i) {
        this(i, i);
    }

    /* renamed from: b */
    private void m68378b() {
        Java8Compatibility.m68325b(this.f41086a);
        while (this.f41086a.remaining() >= this.f41088c) {
            mo68284d(this.f41086a);
        }
        this.f41086a.compact();
    }

    /* renamed from: c */
    private void m68377c() {
        if (this.f41086a.remaining() < 8) {
            m68378b();
        }
    }

    /* renamed from: f */
    private Hasher m68376f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f41086a.remaining()) {
            this.f41086a.put(byteBuffer);
            m68377c();
            return this;
        }
        int position = this.f41087b - this.f41086a.position();
        for (int i = 0; i < position; i++) {
            this.f41086a.put(byteBuffer.get());
        }
        m68378b();
        while (byteBuffer.remaining() >= this.f41088c) {
            mo68284d(byteBuffer);
        }
        this.f41086a.put(byteBuffer);
        return this;
    }

    /* renamed from: a */
    protected abstract HashCode mo68285a();

    /* renamed from: d */
    protected abstract void mo68284d(ByteBuffer byteBuffer);

    /* renamed from: e */
    protected void mo68283e(ByteBuffer byteBuffer) {
        Java8Compatibility.m68323d(byteBuffer, byteBuffer.limit());
        Java8Compatibility.m68324c(byteBuffer, this.f41088c + 7);
        while (true) {
            int position = byteBuffer.position();
            int i = this.f41088c;
            if (position < i) {
                byteBuffer.putLong(0L);
            } else {
                Java8Compatibility.m68324c(byteBuffer, i);
                Java8Compatibility.m68325b(byteBuffer);
                mo68284d(byteBuffer);
                return;
            }
        }
    }

    @Override // com.google.common.hash.Hasher
    public final HashCode hash() {
        m68378b();
        Java8Compatibility.m68325b(this.f41086a);
        if (this.f41086a.remaining() > 0) {
            mo68283e(this.f41086a);
            ByteBuffer byteBuffer = this.f41086a;
            Java8Compatibility.m68323d(byteBuffer, byteBuffer.limit());
        }
        return mo68285a();
    }

    protected AbstractStreamingHasher(int i, int i2) {
        Preconditions.checkArgument(i2 % i == 0);
        this.f41086a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f41087b = i2;
        this.f41088c = i;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putByte(byte b) {
        this.f41086a.put(b);
        m68377c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putChar(char c) {
        this.f41086a.putChar(c);
        m68377c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putInt(int i) {
        this.f41086a.putInt(i);
        m68377c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putLong(long j) {
        this.f41086a.putLong(j);
        m68377c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putShort(short s) {
        this.f41086a.putShort(s);
        m68377c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBytes(byte[] bArr, int i, int i2) {
        return m68376f(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBytes(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return m68376f(byteBuffer);
        } finally {
            byteBuffer.order(order);
        }
    }
}
