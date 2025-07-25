package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14912n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q */
/* loaded from: classes4.dex */
public final class C14958q implements InterfaceC14949h {

    /* renamed from: a */
    public final C15121n f29215a;

    /* renamed from: b */
    public final C14912n f29216b;

    /* renamed from: c */
    public final String f29217c;

    /* renamed from: d */
    public String f29218d;

    /* renamed from: e */
    public InterfaceC14935r f29219e;

    /* renamed from: f */
    public int f29220f = 0;

    /* renamed from: g */
    public int f29221g;

    /* renamed from: h */
    public boolean f29222h;

    /* renamed from: i */
    public boolean f29223i;

    /* renamed from: j */
    public long f29224j;

    /* renamed from: k */
    public int f29225k;

    /* renamed from: l */
    public long f29226l;

    public C14958q(String str) {
        C15121n c15121n = new C15121n(4);
        this.f29215a = c15121n;
        c15121n.f29804a[0] = -1;
        this.f29216b = new C14912n();
        this.f29217c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77410a() {
        this.f29220f = 0;
        this.f29221g = 0;
        this.f29223i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77409a(InterfaceC14874j interfaceC14874j, C14940E c14940e) {
        c14940e.m77417a();
        c14940e.m77416b();
        this.f29218d = c14940e.f29056e;
        c14940e.m77416b();
        this.f29219e = interfaceC14874j.mo77301a(c14940e.f29055d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77407a(boolean z, long j) {
        this.f29226l = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77408a(C15121n c15121n) {
        while (true) {
            int i = c15121n.f29806c;
            int i2 = c15121n.f29805b;
            int i3 = i - i2;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f29220f;
            if (i4 == 0) {
                byte[] bArr = c15121n.f29804a;
                while (true) {
                    if (i2 < i) {
                        byte b = bArr[i2];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.f29223i && (b & 224) == 224;
                        this.f29223i = z;
                        if (z2) {
                            c15121n.m77197e(i2 + 1);
                            this.f29223i = false;
                            this.f29215a.f29804a[1] = bArr[i2];
                            this.f29221g = 2;
                            this.f29220f = 1;
                            break;
                        }
                        i2++;
                    } else {
                        c15121n.m77197e(i);
                        break;
                    }
                }
            } else if (i4 == 1) {
                int min = Math.min(i3, 4 - this.f29221g);
                c15121n.m77205a(this.f29215a.f29804a, this.f29221g, min);
                int i5 = this.f29221g + min;
                this.f29221g = i5;
                if (i5 >= 4) {
                    this.f29215a.m77197e(0);
                    if (!C14912n.m77439a(this.f29215a.m77204b(), this.f29216b)) {
                        this.f29221g = 0;
                        this.f29220f = 1;
                    } else {
                        C14912n c14912n = this.f29216b;
                        this.f29225k = c14912n.f28949c;
                        if (!this.f29222h) {
                            int i6 = c14912n.f28950d;
                            this.f29224j = (c14912n.f28953g * 1000000) / i6;
                            this.f29219e.mo77419a(C15014o.m77309a(this.f29218d, c14912n.f28948b, -1, 4096, c14912n.f28951e, i6, null, null, this.f29217c));
                            this.f29222h = true;
                        }
                        this.f29215a.m77197e(0);
                        this.f29219e.mo77422a(4, this.f29215a);
                        this.f29220f = 2;
                    }
                }
            } else if (i4 == 2) {
                int min2 = Math.min(i3, this.f29225k - this.f29221g);
                this.f29219e.mo77422a(min2, c15121n);
                int i7 = this.f29221g + min2;
                this.f29221g = i7;
                int i8 = this.f29225k;
                if (i7 >= i8) {
                    this.f29219e.mo77421a(this.f29226l, 1, i8, 0, null);
                    this.f29226l += this.f29224j;
                    this.f29221g = 0;
                    this.f29220f = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: b */
    public final void mo77406b() {
    }
}
