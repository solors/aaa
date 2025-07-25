package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15113f;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.c */
/* loaded from: classes4.dex */
public final class C14916c implements InterfaceC14921h, InterfaceC14934q {

    /* renamed from: a */
    public long[] f28968a;

    /* renamed from: b */
    public long[] f28969b;

    /* renamed from: c */
    public long f28970c = -1;

    /* renamed from: d */
    public long f28971d = -1;

    /* renamed from: e */
    public final /* synthetic */ C14917d f28972e;

    public C14916c(C14917d c14917d) {
        this.f28972e = c14917d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final boolean mo77395a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC14921h
    /* renamed from: c */
    public final long mo77432c(long j) {
        long j2 = (this.f28972e.f29002i * j) / 1000000;
        this.f28971d = this.f28968a[AbstractC15133z.m77156a(this.f28968a, j2, true)];
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC14921h
    /* renamed from: a */
    public final long mo77434a(C14833b c14833b) {
        long j = this.f28971d;
        if (j >= 0) {
            long j2 = -(j + 2);
            this.f28971d = -1L;
            return j2;
        }
        return -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final long mo77394a(long j) {
        return this.f28970c + this.f28969b[AbstractC15133z.m77156a(this.f28968a, (this.f28972e.f29002i * j) / 1000000, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: c */
    public final long mo77389c() {
        C15113f c15113f = this.f28972e.f28973n;
        return (c15113f.f29781d * 1000000) / c15113f.f29778a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC14921h
    /* renamed from: b */
    public final InterfaceC14934q mo77433b() {
        return this;
    }
}
