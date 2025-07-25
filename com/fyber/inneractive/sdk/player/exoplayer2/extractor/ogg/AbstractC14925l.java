package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l */
/* loaded from: classes4.dex */
public abstract class AbstractC14925l {

    /* renamed from: a */
    public C14919f f28994a;

    /* renamed from: b */
    public InterfaceC14935r f28995b;

    /* renamed from: c */
    public InterfaceC14874j f28996c;

    /* renamed from: d */
    public InterfaceC14921h f28997d;

    /* renamed from: e */
    public long f28998e;

    /* renamed from: f */
    public long f28999f;

    /* renamed from: g */
    public long f29000g;

    /* renamed from: h */
    public int f29001h;

    /* renamed from: i */
    public int f29002i;

    /* renamed from: j */
    public C14923j f29003j;

    /* renamed from: k */
    public long f29004k;

    /* renamed from: l */
    public boolean f29005l;

    /* renamed from: m */
    public boolean f29006m;

    /* renamed from: a */
    public abstract long mo77427a(C15121n c15121n);

    /* renamed from: a */
    public void mo77425a(boolean z) {
        if (z) {
            this.f29003j = new C14923j();
            this.f28999f = 0L;
            this.f29001h = 0;
        } else {
            this.f29001h = 1;
        }
        this.f28998e = -1L;
        this.f29000g = 0L;
    }

    /* renamed from: a */
    public abstract boolean mo77426a(C15121n c15121n, long j, C14923j c14923j);

    /* renamed from: a */
    public void mo77428a(long j) {
        this.f29000g = j;
    }
}
