package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d */
/* loaded from: classes4.dex */
public final class C14893d {

    /* renamed from: a */
    public final int f28782a;

    /* renamed from: b */
    public int f28783b;

    /* renamed from: c */
    public int f28784c;

    /* renamed from: d */
    public long f28785d;

    /* renamed from: e */
    public final boolean f28786e;

    /* renamed from: f */
    public final C15121n f28787f;

    /* renamed from: g */
    public final C15121n f28788g;

    /* renamed from: h */
    public int f28789h;

    /* renamed from: i */
    public int f28790i;

    public C14893d(C15121n c15121n, C15121n c15121n2, boolean z) {
        this.f28788g = c15121n;
        this.f28787f = c15121n2;
        this.f28786e = z;
        c15121n2.m77197e(12);
        this.f28782a = c15121n2.m77189m();
        c15121n.m77197e(12);
        this.f28790i = c15121n.m77189m();
        if (c15121n.m77204b() == 1) {
            this.f28783b = -1;
            return;
        }
        throw new IllegalStateException("first_chunk must be 1");
    }

    /* renamed from: a */
    public final boolean m77461a() {
        long m77191k;
        int i;
        int i2 = this.f28783b + 1;
        this.f28783b = i2;
        if (i2 == this.f28782a) {
            return false;
        }
        if (this.f28786e) {
            m77191k = this.f28787f.m77188n();
        } else {
            m77191k = this.f28787f.m77191k();
        }
        this.f28785d = m77191k;
        if (this.f28783b == this.f28789h) {
            this.f28784c = this.f28788g.m77189m();
            C15121n c15121n = this.f28788g;
            c15121n.m77197e(c15121n.f29805b + 4);
            int i3 = this.f28790i - 1;
            this.f28790i = i3;
            if (i3 > 0) {
                i = this.f28788g.m77189m() - 1;
            } else {
                i = -1;
            }
            this.f28789h = i;
        }
        return true;
    }
}
