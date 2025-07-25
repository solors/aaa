package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a */
/* loaded from: classes4.dex */
public final class C14914a implements InterfaceC14934q {

    /* renamed from: a */
    public final /* synthetic */ C14915b f28955a;

    public C14914a(C14915b c14915b) {
        this.f28955a = c14915b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final boolean mo77395a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: c */
    public final long mo77389c() {
        C14915b c14915b = this.f28955a;
        return (c14915b.f28961f * 1000000) / c14915b.f28959d.f29002i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final long mo77394a(long j) {
        if (j == 0) {
            return this.f28955a.f28957b;
        }
        C14915b c14915b = this.f28955a;
        long j2 = c14915b.f28957b;
        long j3 = c14915b.f28958c;
        long j4 = ((((j3 - j2) * ((c14915b.f28959d.f29002i * j) / 1000000)) / c14915b.f28961f) - 30000) + j2;
        if (j4 >= j2) {
            j2 = j4;
        }
        return j2 >= j3 ? j3 - 1 : j2;
    }
}
