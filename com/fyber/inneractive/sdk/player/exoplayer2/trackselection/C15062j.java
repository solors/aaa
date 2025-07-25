package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.C15048t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C15047z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j */
/* loaded from: classes4.dex */
public final class C15062j {

    /* renamed from: a */
    public final C15047z f29607a;

    /* renamed from: b */
    public final C15060h f29608b;

    /* renamed from: c */
    public final Object f29609c;

    /* renamed from: d */
    public final C15048t[] f29610d;

    public C15062j(C15047z c15047z, C15060h c15060h, C15058f c15058f, C15048t[] c15048tArr) {
        this.f29607a = c15047z;
        this.f29608b = c15060h;
        this.f29609c = c15058f;
        this.f29610d = c15048tArr;
    }

    /* renamed from: a */
    public final boolean m77267a(C15062j c15062j, int i) {
        if (c15062j == null || !AbstractC15133z.m77159a(this.f29608b.f29605b[i], c15062j.f29608b.f29605b[i]) || !AbstractC15133z.m77159a(this.f29610d[i], c15062j.f29610d[i])) {
            return false;
        }
        return true;
    }
}
