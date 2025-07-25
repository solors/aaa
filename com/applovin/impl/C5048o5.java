package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.o5 */
/* loaded from: classes2.dex */
public class C5048o5 extends AbstractC4746l2 {

    /* renamed from: b */
    public final C5950z4 f8724b;

    /* renamed from: c */
    public ByteBuffer f8725c;

    /* renamed from: d */
    public boolean f8726d;

    /* renamed from: f */
    public long f8727f;

    /* renamed from: g */
    public ByteBuffer f8728g;

    /* renamed from: h */
    private final int f8729h;

    /* renamed from: i */
    private final int f8730i;

    /* renamed from: com.applovin.impl.o5$a */
    /* loaded from: classes2.dex */
    public static final class C5049a extends IllegalStateException {

        /* renamed from: a */
        public final int f8731a;

        /* renamed from: b */
        public final int f8732b;

        public C5049a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f8731a = i;
            this.f8732b = i2;
        }
    }

    public C5048o5(int i) {
        this(i, 0);
    }

    /* renamed from: f */
    private ByteBuffer m96870f(int i) {
        int capacity;
        int i2 = this.f8729h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f8725c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new C5049a(capacity, i);
    }

    /* renamed from: i */
    public static C5048o5 m96865i() {
        return new C5048o5(0);
    }

    @Override // com.applovin.impl.AbstractC4746l2
    /* renamed from: b */
    public void mo94598b() {
        super.mo94598b();
        ByteBuffer byteBuffer = this.f8725c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f8728g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f8726d = false;
    }

    /* renamed from: g */
    public void m96868g(int i) {
        int i2 = i + this.f8730i;
        ByteBuffer byteBuffer = this.f8725c;
        if (byteBuffer == null) {
            this.f8725c = m96870f(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f8725c = byteBuffer;
            return;
        }
        ByteBuffer m96870f = m96870f(i3);
        m96870f.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m96870f.put(byteBuffer);
        }
        this.f8725c = m96870f;
    }

    /* renamed from: h */
    public final boolean m96867h() {
        return m97867d(1073741824);
    }

    public C5048o5(int i, int i2) {
        this.f8724b = new C5950z4();
        this.f8729h = i;
        this.f8730i = i2;
    }

    /* renamed from: h */
    public void m96866h(int i) {
        ByteBuffer byteBuffer = this.f8728g;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            this.f8728g.clear();
        } else {
            this.f8728g = ByteBuffer.allocate(i);
        }
    }

    /* renamed from: g */
    public final void m96869g() {
        ByteBuffer byteBuffer = this.f8725c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f8728g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
