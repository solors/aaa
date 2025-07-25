package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.e */
/* loaded from: classes4.dex */
public final class C14889e implements InterfaceC14886b {

    /* renamed from: a */
    public final long f28679a;

    /* renamed from: b */
    public final long f28680b;

    /* renamed from: c */
    public final long f28681c;

    /* renamed from: d */
    public final long[] f28682d;

    /* renamed from: e */
    public final long f28683e;

    /* renamed from: f */
    public final int f28684f;

    public C14889e(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f28679a = j;
        this.f28680b = j2;
        this.f28681c = j3;
        this.f28682d = jArr;
        this.f28683e = j4;
        this.f28684f = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final boolean mo77395a() {
        return this.f28682d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.InterfaceC14886b
    /* renamed from: b */
    public final long mo77465b(long j) {
        long j2;
        long j3;
        long j4;
        if (mo77395a()) {
            long j5 = this.f28679a;
            if (j >= j5) {
                double d = ((j - j5) * 256.0d) / this.f28683e;
                int m77156a = AbstractC15133z.m77156a(this.f28682d, (long) d, false);
                int i = m77156a + 1;
                long j6 = this.f28680b;
                long j7 = (i * j6) / 100;
                if (i == 0) {
                    j2 = 0;
                } else {
                    j2 = this.f28682d[m77156a];
                }
                if (i == 99) {
                    j3 = 256;
                } else {
                    j3 = this.f28682d[i];
                }
                long j8 = (j6 * (m77156a + 2)) / 100;
                if (j3 == j2) {
                    j4 = 0;
                } else {
                    j4 = (long) (((d - j2) * (j8 - j7)) / (j3 - j2));
                }
                return j7 + j4;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: c */
    public final long mo77389c() {
        return this.f28680b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final long mo77394a(long j) {
        if (!mo77395a()) {
            return this.f28679a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.f28680b);
        if (f > 0.0f) {
            if (f >= 100.0f) {
                r0 = 256.0f;
            } else {
                int i = (int) f;
                r0 = i != 0 ? (float) this.f28682d[i - 1] : 0.0f;
                r0 += (f - i) * ((i < 99 ? (float) this.f28682d[i] : 256.0f) - r0);
            }
        }
        long round = Math.round(r0 * 0.00390625d * this.f28683e);
        long j2 = this.f28679a;
        long j3 = round + j2;
        long j4 = this.f28681c;
        return Math.min(j3, j4 != -1 ? j4 - 1 : ((j2 - this.f28684f) + this.f28683e) - 1);
    }
}
