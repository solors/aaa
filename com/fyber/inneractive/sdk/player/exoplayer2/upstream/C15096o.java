package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.o */
/* loaded from: classes4.dex */
public final class C15096o implements InterfaceC15088g {

    /* renamed from: a */
    public final Context f29728a;

    /* renamed from: b */
    public final C15094m f29729b;

    /* renamed from: c */
    public final InterfaceC15088g f29730c;

    public C15096o(Context context, C15094m c15094m, C15098q c15098q) {
        this.f29728a = context.getApplicationContext();
        this.f29729b = c15094m;
        this.f29730c = c15098q;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15088g
    /* renamed from: a */
    public final InterfaceC15089h mo77233a() {
        return new C15095n(this.f29728a, this.f29729b, this.f29730c.mo77233a());
    }
}
