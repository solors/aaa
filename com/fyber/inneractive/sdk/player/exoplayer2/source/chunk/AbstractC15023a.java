package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15107z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a */
/* loaded from: classes4.dex */
public abstract class AbstractC15023a implements InterfaceC15107z {

    /* renamed from: a */
    public final C15092k f29494a;

    /* renamed from: b */
    public final int f29495b;

    /* renamed from: c */
    public final C15014o f29496c;

    /* renamed from: d */
    public final int f29497d;

    /* renamed from: e */
    public final Object f29498e;

    /* renamed from: f */
    public final long f29499f;

    /* renamed from: g */
    public final long f29500g;

    /* renamed from: h */
    public final InterfaceC15089h f29501h;

    public AbstractC15023a(int i, int i2, long j, long j2, C15014o c15014o, InterfaceC15089h interfaceC15089h, C15092k c15092k, Object obj) {
        interfaceC15089h.getClass();
        this.f29501h = interfaceC15089h;
        this.f29494a = c15092k;
        this.f29495b = i;
        this.f29496c = c15014o;
        this.f29497d = i2;
        this.f29498e = obj;
        this.f29499f = j;
        this.f29500g = j2;
    }

    /* renamed from: c */
    public abstract long mo77304c();
}
