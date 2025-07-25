package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.AbstractC14866e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C14868g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.D */
/* loaded from: classes4.dex */
public final class C15067D implements InterfaceC15107z {

    /* renamed from: a */
    public final C15092k f29614a;

    /* renamed from: b */
    public final InterfaceC15089h f29615b;

    /* renamed from: c */
    public final InterfaceC15066C f29616c;

    /* renamed from: d */
    public volatile AbstractC14866e f29617d;

    /* renamed from: e */
    public volatile boolean f29618e;

    /* renamed from: f */
    public volatile long f29619f;

    public C15067D(InterfaceC15089h interfaceC15089h, Uri uri, InterfaceC15066C interfaceC15066C) {
        this.f29615b = interfaceC15089h;
        this.f29614a = new C15092k(uri, 0L, 0L, -1L, null, 1);
        this.f29616c = interfaceC15066C;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15107z
    /* renamed from: a */
    public final boolean mo77227a() {
        return this.f29618e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15107z
    /* renamed from: b */
    public final void mo77226b() {
        this.f29618e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15107z
    public final void load() {
        C15091j c15091j = new C15091j(this.f29615b, this.f29614a);
        try {
            c15091j.f29700a.mo77234a(c15091j.f29701b);
            c15091j.f29703d = true;
            this.f29617d = ((C14868g) this.f29616c).m77486a(this.f29615b.mo77235a(), c15091j);
        } finally {
            this.f29619f = c15091j.f29705f;
            AbstractC15133z.m77160a(c15091j);
        }
    }
}
