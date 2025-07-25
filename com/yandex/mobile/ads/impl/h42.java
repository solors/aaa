package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class h42 {

    /* renamed from: d */
    private static final long[] f79950d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f79951a = new byte[8];

    /* renamed from: b */
    private int f79952b;

    /* renamed from: c */
    private int f79953c;

    /* renamed from: a */
    public static long m33618a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f79950d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: b */
    public final void m33617b() {
        this.f79952b = 0;
        this.f79953c = 0;
    }

    /* renamed from: a */
    public final int m33621a() {
        return this.f79953c;
    }

    /* renamed from: a */
    public static int m33620a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f79950d;
            if (i3 >= 8) {
                return -1;
            }
            i2 = ((jArr[i3] & i) > 0L ? 1 : ((jArr[i3] & i) == 0L ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: a */
    public final long m33619a(C30513hy c30513hy, boolean z, boolean z2, int i) throws IOException {
        if (this.f79952b == 0) {
            if (!c30513hy.mo27619a(this.f79951a, 0, 1, z)) {
                return -1L;
            }
            int m33620a = m33620a(this.f79951a[0] & 255);
            this.f79953c = m33620a;
            if (m33620a != -1) {
                this.f79952b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f79953c;
        if (i2 > i) {
            this.f79952b = 0;
            return -2L;
        }
        if (i2 != 1) {
            c30513hy.mo27619a(this.f79951a, 1, i2 - 1, false);
        }
        this.f79952b = 0;
        return m33618a(this.f79951a, this.f79953c, z2);
    }
}
