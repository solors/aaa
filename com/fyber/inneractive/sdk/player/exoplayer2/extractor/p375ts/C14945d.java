package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C14830d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14844g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14845h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15111d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15120m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d */
/* loaded from: classes4.dex */
public final class C14945d implements InterfaceC14949h {

    /* renamed from: r */
    public static final byte[] f29079r = {73, 68, 51};

    /* renamed from: a */
    public final boolean f29080a;

    /* renamed from: d */
    public final String f29083d;

    /* renamed from: e */
    public String f29084e;

    /* renamed from: f */
    public InterfaceC14935r f29085f;

    /* renamed from: g */
    public InterfaceC14935r f29086g;

    /* renamed from: k */
    public boolean f29090k;

    /* renamed from: l */
    public boolean f29091l;

    /* renamed from: m */
    public long f29092m;

    /* renamed from: n */
    public int f29093n;

    /* renamed from: o */
    public long f29094o;

    /* renamed from: p */
    public InterfaceC14935r f29095p;

    /* renamed from: q */
    public long f29096q;

    /* renamed from: b */
    public final C15120m f29081b = new C15120m(new byte[7]);

    /* renamed from: c */
    public final C15121n f29082c = new C15121n(Arrays.copyOf(f29079r, 10));

    /* renamed from: h */
    public int f29087h = 0;

    /* renamed from: i */
    public int f29088i = 0;

    /* renamed from: j */
    public int f29089j = 256;

    public C14945d(boolean z, String str) {
        this.f29080a = z;
        this.f29083d = str;
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
            int i4 = this.f29087h;
            if (i4 == 0) {
                byte[] bArr = c15121n.f29804a;
                while (true) {
                    if (i2 < i) {
                        int i5 = i2 + 1;
                        byte b = bArr[i2];
                        int i6 = b & 255;
                        int i7 = this.f29089j;
                        if (i7 != 512 || i6 < 240 || i6 == 255) {
                            int i8 = i7 | i6;
                            if (i8 == 329) {
                                this.f29089j = 768;
                            } else if (i8 == 511) {
                                this.f29089j = 512;
                            } else if (i8 == 836) {
                                this.f29089j = 1024;
                            } else if (i8 == 1075) {
                                this.f29087h = 1;
                                this.f29088i = 3;
                                this.f29093n = 0;
                                this.f29082c.m77197e(0);
                                c15121n.m77197e(i5);
                                break;
                            } else if (i7 != 256) {
                                this.f29089j = 256;
                            }
                            i2 = i5;
                        } else {
                            this.f29090k = (b & 1) == 0;
                            this.f29087h = 2;
                            this.f29088i = 0;
                            c15121n.m77197e(i5);
                        }
                    } else {
                        c15121n.m77197e(i2);
                        break;
                    }
                }
            } else if (i4 == 1) {
                byte[] bArr2 = this.f29082c.f29804a;
                int min = Math.min(i3, 10 - this.f29088i);
                c15121n.m77205a(bArr2, this.f29088i, min);
                int i9 = this.f29088i + min;
                this.f29088i = i9;
                if (i9 == 10) {
                    this.f29086g.mo77422a(10, this.f29082c);
                    this.f29082c.m77197e(6);
                    InterfaceC14935r interfaceC14935r = this.f29086g;
                    this.f29087h = 3;
                    this.f29088i = 10;
                    this.f29095p = interfaceC14935r;
                    this.f29096q = 0L;
                    this.f29093n = this.f29082c.m77193i() + 10;
                }
            } else if (i4 == 2) {
                int i10 = this.f29090k ? 7 : 5;
                byte[] bArr3 = this.f29081b.f29800a;
                int min2 = Math.min(i3, i10 - this.f29088i);
                c15121n.m77205a(bArr3, this.f29088i, min2);
                int i11 = this.f29088i + min2;
                this.f29088i = i11;
                if (i11 == i10) {
                    this.f29081b.m77209b(0);
                    if (!this.f29091l) {
                        int m77211a = this.f29081b.m77211a(2) + 1;
                        if (m77211a != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + m77211a + ", but assuming AAC LC.");
                            m77211a = 2;
                        }
                        int m77211a2 = this.f29081b.m77211a(4);
                        this.f29081b.m77208c(1);
                        byte[] bArr4 = {(byte) (((m77211a << 3) & 248) | ((m77211a2 >> 1) & 7)), (byte) (((m77211a2 << 7) & 128) | ((this.f29081b.m77211a(3) << 3) & 120))};
                        Pair m77222a = AbstractC15111d.m77222a(bArr4);
                        C15014o m77309a = C15014o.m77309a(this.f29084e, "audio/mp4a-latm", -1, -1, ((Integer) m77222a.second).intValue(), ((Integer) m77222a.first).intValue(), Collections.singletonList(bArr4), null, this.f29083d);
                        this.f29092m = 1024000000 / m77309a.f29469s;
                        this.f29085f.mo77419a(m77309a);
                        this.f29091l = true;
                    } else {
                        this.f29081b.m77208c(10);
                    }
                    this.f29081b.m77208c(4);
                    int m77211a3 = this.f29081b.m77211a(13);
                    int i12 = m77211a3 - 7;
                    if (this.f29090k) {
                        i12 = m77211a3 - 9;
                    }
                    InterfaceC14935r interfaceC14935r2 = this.f29085f;
                    long j = this.f29092m;
                    this.f29087h = 3;
                    this.f29088i = 0;
                    this.f29095p = interfaceC14935r2;
                    this.f29096q = j;
                    this.f29093n = i12;
                }
            } else if (i4 == 3) {
                int min3 = Math.min(i3, this.f29093n - this.f29088i);
                this.f29095p.mo77422a(min3, c15121n);
                int i13 = this.f29088i + min3;
                this.f29088i = i13;
                int i14 = this.f29093n;
                if (i13 == i14) {
                    this.f29095p.mo77421a(this.f29094o, 1, i14, 0, null);
                    this.f29094o += this.f29096q;
                    this.f29087h = 0;
                    this.f29088i = 0;
                    this.f29089j = 256;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: b */
    public final void mo77406b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77409a(InterfaceC14874j interfaceC14874j, C14940E c14940e) {
        c14940e.m77417a();
        c14940e.m77416b();
        this.f29084e = c14940e.f29056e;
        c14940e.m77416b();
        this.f29085f = interfaceC14874j.mo77301a(c14940e.f29055d, 1);
        if (this.f29080a) {
            c14940e.m77417a();
            c14940e.m77416b();
            C14844g mo77301a = interfaceC14874j.mo77301a(c14940e.f29055d, 4);
            this.f29086g = mo77301a;
            c14940e.m77416b();
            mo77301a.mo77419a(C15014o.m77306a(c14940e.f29056e, "application/id3", (C14830d) null));
            return;
        }
        this.f29086g = new C14845h();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77407a(boolean z, long j) {
        this.f29094o = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14949h
    /* renamed from: a */
    public final void mo77410a() {
        this.f29087h = 0;
        this.f29088i = 0;
        this.f29089j = 256;
    }
}
