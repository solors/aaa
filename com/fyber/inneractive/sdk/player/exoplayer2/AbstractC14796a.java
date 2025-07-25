package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C14826c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC15043v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC15115h;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC14796a {

    /* renamed from: a */
    public final int f28084a;

    /* renamed from: b */
    public C15048t f28085b;

    /* renamed from: c */
    public int f28086c;

    /* renamed from: d */
    public InterfaceC15043v f28087d;

    /* renamed from: e */
    public long f28088e;

    /* renamed from: f */
    public boolean f28089f = true;

    /* renamed from: g */
    public boolean f28090g;

    public AbstractC14796a(int i) {
        this.f28084a = i;
    }

    /* renamed from: a */
    public abstract void mo77153a(int i, Object obj);

    /* renamed from: a */
    public abstract void mo77347a(long j, long j2);

    /* renamed from: a */
    public abstract void mo77146a(boolean z, long j);

    /* renamed from: a */
    public void mo77144a(C15014o[] c15014oArr) {
    }

    /* renamed from: c */
    public final void m77570c() {
        if (this.f28086c == 1) {
            this.f28086c = 0;
            this.f28087d = null;
            this.f28090g = false;
            mo77140g();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public InterfaceC15115h mo77569d() {
        return null;
    }

    /* renamed from: e */
    public abstract boolean mo77345e();

    /* renamed from: f */
    public abstract boolean mo77141f();

    /* renamed from: g */
    public abstract void mo77140g();

    /* renamed from: h */
    public abstract void mo77139h();

    /* renamed from: i */
    public abstract void mo77138i();

    /* renamed from: j */
    public abstract void mo77137j();

    /* renamed from: a */
    public final int m77571a(C15015p c15015p, C14826c c14826c, boolean z) {
        int mo77280a = this.f28087d.mo77280a(c15015p, c14826c, z);
        if (mo77280a == -4) {
            if (c14826c.m77525b(4)) {
                this.f28089f = true;
                return this.f28090g ? -4 : -3;
            }
            c14826c.f28266d += this.f28088e;
        } else if (mo77280a == -5) {
            C15014o c15014o = c15015p.f29477a;
            long j = c15014o.f29473w;
            if (j != Long.MAX_VALUE) {
                c15015p.f29477a = new C15014o(c15014o.f29451a, c15014o.f29455e, c15014o.f29456f, c15014o.f29453c, c15014o.f29452b, c15014o.f29457g, c15014o.f29460j, c15014o.f29461k, c15014o.f29462l, c15014o.f29463m, c15014o.f29464n, c15014o.f29466p, c15014o.f29465o, c15014o.f29467q, c15014o.f29468r, c15014o.f29469s, c15014o.f29470t, c15014o.f29471u, c15014o.f29472v, c15014o.f29474x, c15014o.f29475y, c15014o.f29476z, j + this.f28088e, c15014o.f29458h, c15014o.f29459i, c15014o.f29454d);
            }
        }
        return mo77280a;
    }
}
