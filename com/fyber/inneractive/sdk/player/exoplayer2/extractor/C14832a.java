package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.a */
/* loaded from: classes4.dex */
public final class C14832a implements InterfaceC14934q {

    /* renamed from: a */
    public final long[] f28279a;

    /* renamed from: b */
    public final long[] f28280b;

    /* renamed from: c */
    public final long f28281c;

    public C14832a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f28279a = jArr;
        this.f28280b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f28281c = jArr2[i] + jArr3[i];
            return;
        }
        this.f28281c = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final boolean mo77395a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: c */
    public final long mo77389c() {
        return this.f28281c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final long mo77394a(long j) {
        return this.f28279a[AbstractC15133z.m77156a(this.f28280b, j, true)];
    }
}
