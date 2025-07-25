package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.s2 */
/* loaded from: classes2.dex */
final class C5301s2 {

    /* renamed from: a */
    private long f9557a;

    /* renamed from: b */
    private long f9558b;

    /* renamed from: c */
    private boolean f9559c;

    /* renamed from: a */
    private long m95720a(long j) {
        return this.f9557a + Math.max(0L, ((this.f9558b - 529) * 1000000) / j);
    }

    /* renamed from: a */
    public long m95719a(C4310e9 c4310e9) {
        return m95720a(c4310e9.f5795A);
    }

    /* renamed from: a */
    public void m95721a() {
        this.f9557a = 0L;
        this.f9558b = 0L;
        this.f9559c = false;
    }

    /* renamed from: a */
    public long m95718a(C4310e9 c4310e9, C5048o5 c5048o5) {
        if (this.f9558b == 0) {
            this.f9557a = c5048o5.f8727f;
        }
        if (this.f9559c) {
            return c5048o5.f8727f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4100b1.m100583a(c5048o5.f8725c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int m94622d = AbstractC5512sf.m94622d(i);
        if (m94622d == -1) {
            this.f9559c = true;
            this.f9558b = 0L;
            this.f9557a = c5048o5.f8727f;
            AbstractC5063oc.m96800d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return c5048o5.f8727f;
        }
        long m95720a = m95720a(c4310e9.f5795A);
        this.f9558b += m94622d;
        return m95720a;
    }
}
