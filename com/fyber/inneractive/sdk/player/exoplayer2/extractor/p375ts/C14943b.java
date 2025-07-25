package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AbstractC14797a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15120m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b */
/* loaded from: classes4.dex */
public final class C14943b implements InterfaceC14949h {

    /* renamed from: a */
    public final C15120m f29062a;

    /* renamed from: b */
    public final C15121n f29063b;

    /* renamed from: c */
    public final String f29064c;

    /* renamed from: d */
    public String f29065d;

    /* renamed from: e */
    public InterfaceC14935r f29066e;

    /* renamed from: f */
    public int f29067f = 0;

    /* renamed from: g */
    public int f29068g;

    /* renamed from: h */
    public boolean f29069h;

    /* renamed from: i */
    public long f29070i;

    /* renamed from: j */
    public C15014o f29071j;

    /* renamed from: k */
    public int f29072k;

    /* renamed from: l */
    public long f29073l;

    public C14943b(String str) {
        byte[] bArr = new byte[8];
        this.f29062a = new C15120m(bArr);
        this.f29063b = new C15121n(bArr);
        this.f29064c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77410a() {
        this.f29067f = 0;
        this.f29068g = 0;
        this.f29069h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77409a(InterfaceC14874j interfaceC14874j, C14940E c14940e) {
        c14940e.m77417a();
        c14940e.m77416b();
        this.f29065d = c14940e.f29056e;
        c14940e.m77416b();
        this.f29066e = interfaceC14874j.mo77301a(c14940e.f29055d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77407a(boolean z, long j) {
        this.f29073l = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77408a(C15121n c15121n) {
        int m77211a;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        while (true) {
            int i5 = c15121n.f29806c - c15121n.f29805b;
            if (i5 <= 0) {
                return;
            }
            int i6 = this.f29067f;
            if (i6 == 0) {
                while (true) {
                    if (c15121n.f29806c - c15121n.f29805b <= 0) {
                        break;
                    } else if (!this.f29069h) {
                        this.f29069h = c15121n.m77192j() == 11;
                    } else {
                        int m77192j = c15121n.m77192j();
                        if (m77192j == 119) {
                            this.f29069h = false;
                            this.f29067f = 1;
                            byte[] bArr = this.f29063b.f29804a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f29068g = 2;
                            break;
                        }
                        this.f29069h = m77192j == 11;
                    }
                }
            } else if (i6 == 1) {
                byte[] bArr2 = this.f29063b.f29804a;
                int min = Math.min(i5, 8 - this.f29068g);
                c15121n.m77205a(bArr2, this.f29068g, min);
                int i7 = this.f29068g + min;
                this.f29068g = i7;
                if (i7 == 8) {
                    this.f29062a.m77209b(0);
                    C15120m c15120m = this.f29062a;
                    int i8 = (c15120m.f29801b * 8) + c15120m.f29802c;
                    c15120m.m77208c(40);
                    byte b = c15120m.m77211a(5) == 16 ? (byte) 1 : (byte) 0;
                    c15120m.m77209b(i8);
                    int i9 = 6;
                    if (b != 0) {
                        c15120m.m77208c(21);
                        i2 = (c15120m.m77211a(11) + 1) * 2;
                        int m77211a2 = c15120m.m77211a(2);
                        if (m77211a2 == 3) {
                            i4 = AbstractC14797a.f28100c[c15120m.m77211a(2)];
                        } else {
                            i9 = AbstractC14797a.f28098a[c15120m.m77211a(2)];
                            i4 = AbstractC14797a.f28099b[m77211a2];
                        }
                        i3 = i9 * 256;
                        m77211a = c15120m.m77211a(3);
                        i = i4;
                        str = "audio/eac3";
                    } else {
                        c15120m.m77208c(32);
                        int m77211a3 = c15120m.m77211a(2);
                        int m77568a = AbstractC14797a.m77568a(m77211a3, c15120m.m77211a(6));
                        c15120m.m77208c(8);
                        m77211a = c15120m.m77211a(3);
                        if ((m77211a & 1) != 0 && m77211a != 1) {
                            c15120m.m77208c(2);
                        }
                        if ((m77211a & 4) != 0) {
                            c15120m.m77208c(2);
                        }
                        if (m77211a == 2) {
                            c15120m.m77208c(2);
                        }
                        i = AbstractC14797a.f28099b[m77211a3];
                        str = "audio/ac3";
                        i2 = m77568a;
                        i3 = 1536;
                    }
                    int i10 = AbstractC14797a.f28101d[m77211a] + (c15120m.m77210b() ? 1 : 0);
                    C15014o c15014o = this.f29071j;
                    if (c15014o == null || i10 != c15014o.f29468r || i != c15014o.f29469s || str != c15014o.f29456f) {
                        C15014o m77309a = C15014o.m77309a(this.f29065d, str, -1, -1, i10, i, null, null, this.f29064c);
                        this.f29071j = m77309a;
                        this.f29066e.mo77419a(m77309a);
                    }
                    this.f29072k = i2;
                    this.f29070i = (i3 * 1000000) / this.f29071j.f29469s;
                    this.f29063b.m77197e(0);
                    this.f29066e.mo77422a(8, this.f29063b);
                    this.f29067f = 2;
                }
            } else if (i6 == 2) {
                int min2 = Math.min(i5, this.f29072k - this.f29068g);
                this.f29066e.mo77422a(min2, c15121n);
                int i11 = this.f29068g + min2;
                this.f29068g = i11;
                int i12 = this.f29072k;
                if (i11 == i12) {
                    this.f29066e.mo77421a(this.f29073l, 1, i12, 0, null);
                    this.f29073l += this.f29070i;
                    this.f29067f = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: b */
    public final void mo77406b() {
    }
}
