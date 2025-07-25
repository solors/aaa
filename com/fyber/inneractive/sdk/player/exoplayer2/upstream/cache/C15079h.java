package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h */
/* loaded from: classes4.dex */
public final class C15079h {

    /* renamed from: a */
    public final int f29662a;

    /* renamed from: b */
    public final String f29663b;

    /* renamed from: c */
    public final TreeSet f29664c = new TreeSet();

    /* renamed from: d */
    public long f29665d;

    public C15079h(int i, String str, long j) {
        this.f29662a = i;
        this.f29663b = str;
        this.f29665d = j;
    }

    /* renamed from: a */
    public final C15084m m77258a(long j) {
        C15084m c15084m = new C15084m(this.f29663b, j, -1L, -9223372036854775807L, null);
        C15084m c15084m2 = (C15084m) this.f29664c.floor(c15084m);
        if (c15084m2 != null && c15084m2.f29657b + c15084m2.f29658c > j) {
            return c15084m2;
        }
        C15084m c15084m3 = (C15084m) this.f29664c.ceiling(c15084m);
        if (c15084m3 == null) {
            return new C15084m(this.f29663b, j, -1L, -9223372036854775807L, null);
        }
        return new C15084m(this.f29663b, j, c15084m3.f29657b - j, -9223372036854775807L, null);
    }
}
