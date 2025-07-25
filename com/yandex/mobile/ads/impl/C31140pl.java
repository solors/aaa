package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.pl */
/* loaded from: classes8.dex */
final class C31140pl {

    /* renamed from: a */
    private long f84005a;

    /* renamed from: b */
    private long f84006b;

    /* renamed from: c */
    private boolean f84007c;

    /* renamed from: a */
    public final long m30616a(v90 v90Var) {
        return Math.max(0L, ((this.f84006b - 529) * 1000000) / v90Var.f86605A) + this.f84005a;
    }

    /* renamed from: a */
    public final void m30617a() {
        this.f84005a = 0L;
        this.f84006b = 0L;
        this.f84007c = false;
    }

    /* renamed from: a */
    public final long m30615a(v90 v90Var, C30423gx c30423gx) {
        if (this.f84006b == 0) {
            this.f84005a = c30423gx.f79795f;
        }
        if (this.f84007c) {
            return c30423gx.f79795f;
        }
        ByteBuffer byteBuffer = c30423gx.f79793d;
        byteBuffer.getClass();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int m26537b = yy0.m26537b(i);
        if (m26537b == -1) {
            this.f84007c = true;
            this.f84006b = 0L;
            this.f84005a = c30423gx.f79795f;
            gq0.m33792d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return c30423gx.f79795f;
        }
        long max = Math.max(0L, ((this.f84006b - 529) * 1000000) / v90Var.f86605A) + this.f84005a;
        this.f84006b += m26537b;
        return max;
    }
}
