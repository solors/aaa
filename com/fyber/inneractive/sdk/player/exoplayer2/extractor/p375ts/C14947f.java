package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AbstractC14816t;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15120m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import com.google.common.primitives.UnsignedBytes;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f */
/* loaded from: classes4.dex */
public final class C14947f implements InterfaceC14949h {

    /* renamed from: a */
    public final C15121n f29099a;

    /* renamed from: b */
    public final String f29100b;

    /* renamed from: c */
    public String f29101c;

    /* renamed from: d */
    public InterfaceC14935r f29102d;

    /* renamed from: e */
    public int f29103e;

    /* renamed from: f */
    public int f29104f;

    /* renamed from: g */
    public int f29105g;

    /* renamed from: h */
    public long f29106h;

    /* renamed from: i */
    public C15014o f29107i;

    /* renamed from: j */
    public int f29108j;

    /* renamed from: k */
    public long f29109k;

    public C14947f(String str) {
        byte[] bArr = new byte[15];
        this.f29099a = new C15121n(bArr);
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = UnsignedBytes.MAX_POWER_OF_TWO;
        bArr[3] = 1;
        this.f29103e = 0;
        this.f29100b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77410a() {
        this.f29103e = 0;
        this.f29104f = 0;
        this.f29105g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77409a(InterfaceC14874j interfaceC14874j, C14940E c14940e) {
        c14940e.m77417a();
        c14940e.m77416b();
        this.f29101c = c14940e.f29056e;
        c14940e.m77416b();
        this.f29102d = interfaceC14874j.mo77301a(c14940e.f29055d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77407a(boolean z, long j) {
        this.f29109k = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77408a(C15121n c15121n) {
        byte b;
        while (true) {
            int i = c15121n.f29806c - c15121n.f29805b;
            if (i <= 0) {
                return;
            }
            int i2 = this.f29103e;
            if (i2 == 0) {
                while (true) {
                    if (c15121n.f29806c - c15121n.f29805b > 0) {
                        int i3 = this.f29105g << 8;
                        this.f29105g = i3;
                        int m77192j = i3 | c15121n.m77192j();
                        this.f29105g = m77192j;
                        if (m77192j == 2147385345) {
                            this.f29105g = 0;
                            this.f29104f = 4;
                            this.f29103e = 1;
                            break;
                        }
                    }
                }
            } else if (i2 == 1) {
                byte[] bArr = this.f29099a.f29804a;
                int min = Math.min(i, 15 - this.f29104f);
                c15121n.m77205a(bArr, this.f29104f, min);
                int i4 = this.f29104f + min;
                this.f29104f = i4;
                if (i4 == 15) {
                    byte[] bArr2 = this.f29099a.f29804a;
                    if (this.f29107i == null) {
                        String str = this.f29101c;
                        String str2 = this.f29100b;
                        C15120m c15120m = new C15120m(bArr2);
                        c15120m.m77208c(60);
                        int i5 = AbstractC14816t.f28202a[c15120m.m77211a(6)];
                        int i6 = AbstractC14816t.f28203b[c15120m.m77211a(4)];
                        int m77211a = c15120m.m77211a(5);
                        int i7 = m77211a >= 29 ? -1 : (AbstractC14816t.f28204c[m77211a] * 1000) / 2;
                        c15120m.m77208c(10);
                        C15014o m77309a = C15014o.m77309a(str, "audio/vnd.dts", i7, -1, i5 + (c15120m.m77211a(2) > 0 ? 1 : 0), i6, null, null, str2);
                        this.f29107i = m77309a;
                        this.f29102d.mo77419a(m77309a);
                    }
                    this.f29108j = (((bArr2[5] & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f29106h = (int) (((((((bArr2[4] & 1) << 6) | ((b & 252) >> 2)) + 1) * 32) * 1000000) / this.f29107i.f29469s);
                    this.f29099a.m77197e(0);
                    this.f29102d.mo77422a(15, this.f29099a);
                    this.f29103e = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(i, this.f29108j - this.f29104f);
                this.f29102d.mo77422a(min2, c15121n);
                int i8 = this.f29104f + min2;
                this.f29104f = i8;
                int i9 = this.f29108j;
                if (i8 == i9) {
                    this.f29102d.mo77421a(this.f29109k, 1, i9, 0, null);
                    this.f29109k += this.f29106h;
                    this.f29103e = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: b */
    public final void mo77406b() {
    }
}
