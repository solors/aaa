package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d */
/* loaded from: classes4.dex */
public final class C14888d implements InterfaceC14886b {

    /* renamed from: a */
    public final long[] f28676a;

    /* renamed from: b */
    public final long[] f28677b;

    /* renamed from: c */
    public final long f28678c;

    public C14888d(long[] jArr, long[] jArr2, long j) {
        this.f28676a = jArr;
        this.f28677b = jArr2;
        this.f28678c = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final boolean mo77395a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.InterfaceC14886b
    /* renamed from: b */
    public final long mo77465b(long j) {
        return this.f28676a[AbstractC15133z.m77156a(this.f28677b, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: c */
    public final long mo77389c() {
        return this.f28678c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final long mo77394a(long j) {
        return this.f28677b[AbstractC15133z.m77156a(this.f28676a, j, true)];
    }
}
