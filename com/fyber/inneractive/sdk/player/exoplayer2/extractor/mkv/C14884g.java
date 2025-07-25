package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g */
/* loaded from: classes4.dex */
public final class C14884g {

    /* renamed from: d */
    public static final long[] f28654d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f28655a = new byte[8];

    /* renamed from: b */
    public int f28656b;

    /* renamed from: c */
    public int f28657c;

    /* renamed from: a */
    public final long m77469a(C14833b c14833b, boolean z, boolean z2, int i) {
        int i2;
        if (this.f28656b == 0) {
            if (!c14833b.m77519b(this.f28655a, 0, 1, z)) {
                return -1L;
            }
            int i3 = this.f28655a[0] & 255;
            int i4 = 0;
            while (true) {
                long[] jArr = f28654d;
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((i3 & jArr[i4]) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.f28657c = i2;
            if (i2 != -1) {
                this.f28656b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i5 = this.f28657c;
        if (i5 > i) {
            this.f28656b = 0;
            return -2L;
        }
        if (i5 != 1) {
            c14833b.m77519b(this.f28655a, 1, i5 - 1, false);
        }
        this.f28656b = 0;
        return m77468a(this.f28655a, this.f28657c, z2);
    }

    /* renamed from: a */
    public static long m77468a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f28654d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
