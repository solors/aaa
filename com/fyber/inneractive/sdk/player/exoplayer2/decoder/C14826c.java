package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.c */
/* loaded from: classes4.dex */
public final class C14826c {

    /* renamed from: a */
    public int f28263a;

    /* renamed from: c */
    public ByteBuffer f28265c;

    /* renamed from: d */
    public long f28266d;

    /* renamed from: b */
    public final C14825b f28264b = new C14825b();

    /* renamed from: e */
    public final int f28267e = 0;

    /* renamed from: a */
    public final void m77527a() {
        this.f28263a = 0;
        ByteBuffer byteBuffer = this.f28265c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: b */
    public final boolean m77525b(int i) {
        if ((this.f28263a & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final ByteBuffer m77526a(int i) {
        int i2 = this.f28267e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f28265c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }
}
