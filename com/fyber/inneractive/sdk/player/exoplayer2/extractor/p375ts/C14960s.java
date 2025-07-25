package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15120m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15129v;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s */
/* loaded from: classes4.dex */
public final class C14960s implements InterfaceC14941F {

    /* renamed from: a */
    public final InterfaceC14949h f29232a;

    /* renamed from: b */
    public final C15120m f29233b = new C15120m(new byte[10]);

    /* renamed from: c */
    public int f29234c = 0;

    /* renamed from: d */
    public int f29235d;

    /* renamed from: e */
    public C15129v f29236e;

    /* renamed from: f */
    public boolean f29237f;

    /* renamed from: g */
    public boolean f29238g;

    /* renamed from: h */
    public boolean f29239h;

    /* renamed from: i */
    public int f29240i;

    /* renamed from: j */
    public int f29241j;

    /* renamed from: k */
    public boolean f29242k;

    /* renamed from: l */
    public long f29243l;

    public C14960s(InterfaceC14949h interfaceC14949h) {
        this.f29232a = interfaceC14949h;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14941F
    /* renamed from: a */
    public final void mo77399a(C15129v c15129v, InterfaceC14874j interfaceC14874j, C14940E c14940e) {
        this.f29236e = c15129v;
        this.f29232a.mo77409a(interfaceC14874j, c14940e);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14941F
    /* renamed from: a */
    public final void mo77401a() {
        this.f29234c = 0;
        this.f29235d = 0;
        this.f29239h = false;
        this.f29232a.mo77410a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14941F
    /* renamed from: a */
    public final void mo77400a(C15121n c15121n, boolean z) {
        int i;
        if (z) {
            int i2 = this.f29234c;
            if (i2 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i2 == 3) {
                if (this.f29241j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f29241j + " more bytes");
                }
                this.f29232a.mo77406b();
            }
            this.f29234c = 1;
            this.f29235d = 0;
        }
        while (true) {
            int i3 = c15121n.f29806c;
            int i4 = c15121n.f29805b;
            int i5 = i3 - i4;
            if (i5 <= 0) {
                return;
            }
            int i6 = this.f29234c;
            if (i6 == 0) {
                c15121n.m77197e(i5 + i4);
            } else if (i6 != 1) {
                if (i6 == 2) {
                    if (m77402a(c15121n, this.f29233b.f29800a, Math.min(10, this.f29240i)) && m77402a(c15121n, (byte[]) null, this.f29240i)) {
                        this.f29233b.m77209b(0);
                        this.f29243l = -9223372036854775807L;
                        if (this.f29237f) {
                            this.f29233b.m77208c(4);
                            this.f29233b.m77208c(1);
                            this.f29233b.m77208c(1);
                            long m77211a = (this.f29233b.m77211a(3) << 30) | (this.f29233b.m77211a(15) << 15) | this.f29233b.m77211a(15);
                            this.f29233b.m77208c(1);
                            if (!this.f29239h && this.f29238g) {
                                this.f29233b.m77208c(4);
                                this.f29233b.m77208c(1);
                                this.f29233b.m77208c(1);
                                this.f29233b.m77208c(1);
                                this.f29236e.m77170b((this.f29233b.m77211a(3) << 30) | (this.f29233b.m77211a(15) << 15) | this.f29233b.m77211a(15));
                                this.f29239h = true;
                            }
                            this.f29243l = this.f29236e.m77170b(m77211a);
                        }
                        this.f29232a.mo77407a(this.f29242k, this.f29243l);
                        this.f29234c = 3;
                        this.f29235d = 0;
                    }
                } else if (i6 == 3) {
                    int i7 = this.f29241j;
                    int i8 = i7 == -1 ? 0 : i5 - i7;
                    if (i8 > 0) {
                        i5 -= i8;
                        c15121n.m77199d(i4 + i5);
                    }
                    this.f29232a.mo77408a(c15121n);
                    int i9 = this.f29241j;
                    if (i9 != -1) {
                        int i10 = i9 - i5;
                        this.f29241j = i10;
                        if (i10 == 0) {
                            this.f29232a.mo77406b();
                            this.f29234c = 1;
                            this.f29235d = 0;
                        }
                    }
                }
            } else if (m77402a(c15121n, this.f29233b.f29800a, 9)) {
                this.f29233b.m77209b(0);
                int m77211a2 = this.f29233b.m77211a(24);
                if (m77211a2 != 1) {
                    Log.w("PesReader", "Unexpected start code prefix: " + m77211a2);
                    this.f29241j = -1;
                    i = 0;
                } else {
                    this.f29233b.m77208c(8);
                    int m77211a3 = this.f29233b.m77211a(16);
                    this.f29233b.m77208c(5);
                    this.f29242k = this.f29233b.m77210b();
                    this.f29233b.m77208c(2);
                    this.f29237f = this.f29233b.m77210b();
                    this.f29238g = this.f29233b.m77210b();
                    this.f29233b.m77208c(6);
                    int m77211a4 = this.f29233b.m77211a(8);
                    this.f29240i = m77211a4;
                    if (m77211a3 == 0) {
                        this.f29241j = -1;
                    } else {
                        this.f29241j = (m77211a3 - 3) - m77211a4;
                    }
                    i = 2;
                }
                this.f29234c = i;
                this.f29235d = 0;
            }
        }
    }

    /* renamed from: a */
    public final boolean m77402a(C15121n c15121n, byte[] bArr, int i) {
        int min = Math.min(c15121n.f29806c - c15121n.f29805b, i - this.f29235d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c15121n.m77197e(c15121n.f29805b + min);
        } else {
            c15121n.m77205a(bArr, this.f29235d, min);
        }
        int i2 = this.f29235d + min;
        this.f29235d = i2;
        return i2 == i;
    }
}
