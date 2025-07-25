package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a */
/* loaded from: classes4.dex */
public final class C14885a implements InterfaceC14886b {

    /* renamed from: a */
    public final long f28658a;

    /* renamed from: b */
    public final int f28659b;

    /* renamed from: c */
    public final long f28660c;

    public C14885a(int i, long j, long j2) {
        long mo77465b;
        this.f28658a = j;
        this.f28659b = i;
        if (j2 == -1) {
            mo77465b = -9223372036854775807L;
        } else {
            mo77465b = mo77465b(j2);
        }
        this.f28660c = mo77465b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final boolean mo77395a() {
        return this.f28660c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.InterfaceC14886b
    /* renamed from: b */
    public final long mo77465b(long j) {
        return (Math.max(0L, j - this.f28658a) * 8000000) / this.f28659b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: c */
    public final long mo77389c() {
        return this.f28660c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q
    /* renamed from: a */
    public final long mo77394a(long j) {
        long j2 = this.f28660c;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        int i = AbstractC15133z.f29832a;
        long max = Math.max(0L, Math.min(j, j2));
        return ((max * this.f28659b) / 8000000) + this.f28658a;
    }
}
