package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.q */
/* loaded from: classes4.dex */
public final class C15098q implements InterfaceC15088g {

    /* renamed from: b */
    public final String f29748b;

    /* renamed from: c */
    public final C15094m f29749c;

    /* renamed from: a */
    public final C15104w f29747a = new C15104w();

    /* renamed from: d */
    public final int f29750d = 2000;

    /* renamed from: e */
    public final int f29751e = 2000;

    /* renamed from: f */
    public final boolean f29752f = true;

    public C15098q(String str, C15094m c15094m) {
        this.f29748b = str;
        this.f29749c = c15094m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15088g
    /* renamed from: a */
    public final InterfaceC15089h mo77233a() {
        return new C15097p(this.f29748b, this.f29749c, this.f29750d, this.f29751e, this.f29752f, this.f29747a);
    }
}
