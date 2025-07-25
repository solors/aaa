package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14979m;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15119l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C15135a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.f */
/* loaded from: classes4.dex */
public final class C14843f extends AbstractC14842e {

    /* renamed from: b */
    public final C15121n f28332b;

    /* renamed from: c */
    public final C15121n f28333c;

    /* renamed from: d */
    public int f28334d;

    /* renamed from: e */
    public boolean f28335e;

    /* renamed from: f */
    public int f28336f;

    public C14843f(InterfaceC14935r interfaceC14935r) {
        super(interfaceC14935r);
        this.f28332b = new C15121n(AbstractC15119l.f29796a);
        this.f28333c = new C15121n(4);
    }

    /* renamed from: a */
    public final boolean m77509a(C15121n c15121n) {
        int m77192j = c15121n.m77192j();
        int i = (m77192j >> 4) & 15;
        int i2 = m77192j & 15;
        if (i2 == 7) {
            this.f28336f = i;
            return i != 5;
        }
        throw new C14841d(AbstractC14979m.m77354a("Video format not supported: ", i2));
    }

    /* renamed from: a */
    public final void m77508a(C15121n c15121n, long j) {
        int m77192j = c15121n.m77192j();
        long m77190l = (c15121n.m77190l() * 1000) + j;
        if (m77192j == 0 && !this.f28335e) {
            byte[] bArr = new byte[c15121n.f29806c - c15121n.f29805b];
            C15121n c15121n2 = new C15121n(bArr);
            c15121n.m77205a(bArr, 0, c15121n.f29806c - c15121n.f29805b);
            C15135a m77132a = C15135a.m77132a(c15121n2);
            this.f28334d = m77132a.f29874b;
            this.f28331a.mo77419a(C15014o.m77308a(null, "video/avc", -1, m77132a.f29875c, m77132a.f29876d, m77132a.f29873a, -1, m77132a.f29877e, null, -1, null, null));
            this.f28335e = true;
        } else if (m77192j == 1 && this.f28335e) {
            byte[] bArr2 = this.f28333c.f29804a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i = 4 - this.f28334d;
            int i2 = 0;
            while (c15121n.f29806c - c15121n.f29805b > 0) {
                c15121n.m77205a(this.f28333c.f29804a, i, this.f28334d);
                this.f28333c.m77197e(0);
                int m77189m = this.f28333c.m77189m();
                this.f28332b.m77197e(0);
                this.f28331a.mo77422a(4, this.f28332b);
                this.f28331a.mo77422a(m77189m, c15121n);
                i2 = i2 + 4 + m77189m;
            }
            this.f28331a.mo77421a(m77190l, this.f28336f == 1 ? 1 : 0, i2, 0, null);
        }
    }
}
