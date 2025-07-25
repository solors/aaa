package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14913o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14933p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14873i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15120m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c */
/* loaded from: classes4.dex */
public final class C14944c implements InterfaceC14873i {

    /* renamed from: e */
    public static final int f29074e = AbstractC15133z.m77158a("ID3");

    /* renamed from: a */
    public final long f29075a;

    /* renamed from: b */
    public final C15121n f29076b = new C15121n(200);

    /* renamed from: c */
    public C14945d f29077c;

    /* renamed from: d */
    public boolean f29078d;

    public C14944c(long j) {
        this.f29075a = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14873i
    /* renamed from: a */
    public final boolean mo77392a(C14833b c14833b) {
        C15121n c15121n = new C15121n(10);
        C15120m c15120m = new C15120m(c15121n.f29804a);
        int i = 0;
        while (true) {
            c14833b.m77521a(c15121n.f29804a, 0, 10, false);
            c15121n.m77197e(0);
            if (c15121n.m77190l() != f29074e) {
                break;
            }
            c15121n.m77197e(c15121n.f29805b + 3);
            int m77193i = c15121n.m77193i();
            i += m77193i + 10;
            c14833b.m77523a(m77193i, false);
        }
        c14833b.f28287e = 0;
        c14833b.m77523a(i, false);
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        while (true) {
            c14833b.m77521a(c15121n.f29804a, 0, 2, false);
            c15121n.m77197e(0);
            if ((c15121n.m77187o() & 65526) != 65520) {
                c14833b.f28287e = 0;
                i4++;
                if (i4 - i >= 8192) {
                    return false;
                }
                c14833b.m77523a(i4, false);
                i2 = 0;
                i3 = 0;
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c14833b.m77521a(c15121n.f29804a, 0, 4, false);
                c15120m.m77209b(14);
                int m77211a = c15120m.m77211a(13);
                if (m77211a <= 6) {
                    return false;
                }
                c14833b.m77523a(m77211a - 6, false);
                i3 += m77211a;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14873i
    /* renamed from: a */
    public final void mo77390a(InterfaceC14874j interfaceC14874j) {
        C14945d c14945d = new C14945d(true, null);
        this.f29077c = c14945d;
        c14945d.mo77409a(interfaceC14874j, new C14940E(Integer.MIN_VALUE, 0, 1));
        interfaceC14874j.mo77299b();
        interfaceC14874j.mo77300a(new C14933p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14873i
    /* renamed from: a */
    public final void mo77393a(long j, long j2) {
        this.f29078d = false;
        C14945d c14945d = this.f29077c;
        c14945d.f29087h = 0;
        c14945d.f29088i = 0;
        c14945d.f29089j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14873i
    /* renamed from: a */
    public final int mo77391a(C14833b c14833b, C14913o c14913o) {
        int min;
        byte[] bArr = this.f29076b.f29804a;
        int i = c14833b.f28288f;
        if (i == 0) {
            min = 0;
        } else {
            min = Math.min(i, 200);
            System.arraycopy(c14833b.f28286d, 0, bArr, 0, min);
            c14833b.m77520b(min);
        }
        if (min == 0) {
            min = c14833b.m77522a(bArr, 0, 200, 0, true);
        }
        if (min != -1) {
            c14833b.f28285c += min;
        }
        if (min == -1) {
            return -1;
        }
        this.f29076b.m77197e(0);
        this.f29076b.m77199d(min);
        if (!this.f29078d) {
            this.f29077c.f29094o = this.f29075a;
            this.f29078d = true;
        }
        this.f29077c.mo77408a(this.f29076b);
        return 0;
    }
}
