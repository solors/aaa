package com.applovin.impl;

/* renamed from: com.applovin.impl.zp */
/* loaded from: classes2.dex */
final class C5989zp {

    /* renamed from: d */
    private static final long[] f12610d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f12611a = new byte[8];

    /* renamed from: b */
    private int f12612b;

    /* renamed from: c */
    private int f12613c;

    /* renamed from: a */
    public static long m92324a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f12610d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: b */
    public void m92323b() {
        this.f12612b = 0;
        this.f12613c = 0;
    }

    /* renamed from: a */
    public int m92327a() {
        return this.f12613c;
    }

    /* renamed from: a */
    public static int m92326a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f12610d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & i) > 0L ? 1 : ((jArr[i3] & i) == 0L ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: a */
    public long m92325a(InterfaceC4703k8 interfaceC4703k8, boolean z, boolean z2, int i) {
        if (this.f12612b == 0) {
            if (!interfaceC4703k8.mo98008a(this.f12611a, 0, 1, z)) {
                return -1L;
            }
            int m92326a = m92326a(this.f12611a[0] & 255);
            this.f12613c = m92326a;
            if (m92326a != -1) {
                this.f12612b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f12613c;
        if (i2 > i) {
            this.f12612b = 0;
            return -2L;
        }
        if (i2 != 1) {
            interfaceC4703k8.mo98000d(this.f12611a, 1, i2 - 1);
        }
        this.f12612b = 0;
        return m92324a(this.f12611a, this.f12613c, z2);
    }
}
