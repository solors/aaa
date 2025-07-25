package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14979m;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.C15017r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.o */
/* loaded from: classes4.dex */
public final class C14928o extends AbstractC14925l {

    /* renamed from: n */
    public C14927n f29015n;

    /* renamed from: o */
    public int f29016o;

    /* renamed from: p */
    public boolean f29017p;

    /* renamed from: q */
    public C14931r f29018q;

    /* renamed from: r */
    public C14929p f29019r;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final void mo77425a(boolean z) {
        super.mo77425a(z);
        if (z) {
            this.f29015n = null;
            this.f29018q = null;
            this.f29019r = null;
        }
        this.f29016o = 0;
        this.f29017p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final long mo77427a(C15121n c15121n) {
        int i;
        byte b = c15121n.f29804a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C14927n c14927n = this.f29015n;
        if (!c14927n.f29013c[(b >> 1) & (255 >>> (8 - c14927n.f29014d))].f29020a) {
            i = c14927n.f29011a.f29024d;
        } else {
            i = c14927n.f29011a.f29025e;
        }
        long j = this.f29017p ? (this.f29016o + i) / 4 : 0;
        c15121n.m77199d(c15121n.f29806c + 4);
        byte[] bArr = c15121n.f29804a;
        int i2 = c15121n.f29806c;
        bArr[i2 - 4] = (byte) (j & 255);
        bArr[i2 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i2 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i2 - 1] = (byte) ((j >>> 24) & 255);
        this.f29017p = true;
        this.f29016o = i;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final boolean mo77426a(C15121n c15121n, long j, C14923j c14923j) {
        long j2;
        if (this.f29015n != null) {
            return false;
        }
        C14927n c14927n = null;
        if (this.f29018q == null) {
            this.f29018q = AbstractC14932s.m77423a(c15121n);
        } else if (this.f29019r == null) {
            AbstractC14932s.m77424a(3, c15121n, false);
            c15121n.m77203b((int) c15121n.m77198e());
            long m77198e = c15121n.m77198e();
            String[] strArr = new String[(int) m77198e];
            for (int i = 0; i < m77198e; i++) {
                strArr[i] = c15121n.m77203b((int) c15121n.m77198e());
            }
            if ((c15121n.m77192j() & 1) != 0) {
                this.f29019r = new C14929p();
            } else {
                throw new C15017r("framing bit expected to be set");
            }
        } else {
            int i2 = c15121n.f29806c;
            byte[] bArr = new byte[i2];
            System.arraycopy(c15121n.f29804a, 0, bArr, 0, i2);
            int i3 = this.f29018q.f29021a;
            int i4 = 5;
            AbstractC14932s.m77424a(5, c15121n, false);
            int m77192j = c15121n.m77192j() + 1;
            C14926m c14926m = new C14926m(c15121n.f29804a);
            c14926m.m77429b(c15121n.f29805b * 8);
            int i5 = 0;
            while (i5 < m77192j) {
                if (c14926m.m77430a(24) == 5653314) {
                    int m77430a = c14926m.m77430a(16);
                    int m77430a2 = c14926m.m77430a(24);
                    long[] jArr = new long[m77430a2];
                    long j3 = 0;
                    if (!c14926m.m77431a()) {
                        boolean m77431a = c14926m.m77431a();
                        for (int i6 = 0; i6 < m77430a2; i6++) {
                            if (m77431a) {
                                if (c14926m.m77431a()) {
                                    jArr[i6] = c14926m.m77430a(i4) + 1;
                                } else {
                                    jArr[i6] = 0;
                                }
                            } else {
                                jArr[i6] = c14926m.m77430a(i4) + 1;
                            }
                        }
                    } else {
                        int m77430a3 = c14926m.m77430a(i4) + 1;
                        int i7 = 0;
                        while (i7 < m77430a2) {
                            int i8 = 0;
                            for (int i9 = m77430a2 - i7; i9 > 0; i9 >>>= 1) {
                                i8++;
                            }
                            int m77430a4 = c14926m.m77430a(i8);
                            int i10 = 0;
                            while (i10 < m77430a4 && i7 < m77430a2) {
                                jArr[i7] = m77430a3;
                                i7++;
                                i10++;
                                m77192j = m77192j;
                            }
                            m77430a3++;
                            m77192j = m77192j;
                        }
                    }
                    int i11 = m77192j;
                    int m77430a5 = c14926m.m77430a(4);
                    if (m77430a5 > 2) {
                        throw new C15017r(AbstractC14979m.m77354a("lookup type greater than 2 not decodable: ", m77430a5));
                    }
                    if (m77430a5 == 1 || m77430a5 == 2) {
                        c14926m.m77429b(32);
                        c14926m.m77429b(32);
                        int m77430a6 = c14926m.m77430a(4) + 1;
                        c14926m.m77429b(1);
                        if (m77430a5 == 1) {
                            if (m77430a != 0) {
                                j2 = (long) Math.floor(Math.pow(m77430a2, 1.0d / m77430a));
                            }
                            c14926m.m77429b((int) (m77430a6 * j3));
                        } else {
                            j2 = m77430a2 * m77430a;
                        }
                        j3 = j2;
                        c14926m.m77429b((int) (m77430a6 * j3));
                    }
                    i5++;
                    m77192j = i11;
                    i4 = 5;
                } else {
                    throw new C15017r("expected code book to start with [0x56, 0x43, 0x42] at " + ((c14926m.f29009c * 8) + c14926m.f29010d));
                }
            }
            int i12 = 6;
            int m77430a7 = c14926m.m77430a(6) + 1;
            for (int i13 = 0; i13 < m77430a7; i13++) {
                if (c14926m.m77430a(16) != 0) {
                    throw new C15017r("placeholder of time domain transforms not zeroed out");
                }
            }
            int m77430a8 = c14926m.m77430a(6) + 1;
            int i14 = 0;
            while (i14 < m77430a8) {
                int m77430a9 = c14926m.m77430a(16);
                if (m77430a9 == 0) {
                    int i15 = 8;
                    c14926m.m77429b(8);
                    c14926m.m77429b(16);
                    c14926m.m77429b(16);
                    c14926m.m77429b(6);
                    c14926m.m77429b(8);
                    int m77430a10 = c14926m.m77430a(4) + 1;
                    int i16 = 0;
                    while (i16 < m77430a10) {
                        c14926m.m77429b(i15);
                        i16++;
                        i15 = 8;
                    }
                } else if (m77430a9 == 1) {
                    int m77430a11 = c14926m.m77430a(5);
                    int[] iArr = new int[m77430a11];
                    int i17 = -1;
                    for (int i18 = 0; i18 < m77430a11; i18++) {
                        int m77430a12 = c14926m.m77430a(4);
                        iArr[i18] = m77430a12;
                        if (m77430a12 > i17) {
                            i17 = m77430a12;
                        }
                    }
                    int i19 = i17 + 1;
                    int[] iArr2 = new int[i19];
                    for (int i20 = 0; i20 < i19; i20++) {
                        iArr2[i20] = c14926m.m77430a(3) + 1;
                        int m77430a13 = c14926m.m77430a(2);
                        int i21 = 8;
                        if (m77430a13 > 0) {
                            c14926m.m77429b(8);
                        }
                        int i22 = 0;
                        while (i22 < (1 << m77430a13)) {
                            c14926m.m77429b(i21);
                            i22++;
                            i21 = 8;
                        }
                    }
                    c14926m.m77429b(2);
                    int m77430a14 = c14926m.m77430a(4);
                    int i23 = 0;
                    int i24 = 0;
                    for (int i25 = 0; i25 < m77430a11; i25++) {
                        i23 += iArr2[iArr[i25]];
                        while (i24 < i23) {
                            c14926m.m77429b(m77430a14);
                            i24++;
                        }
                    }
                } else {
                    throw new C15017r(AbstractC14979m.m77354a("floor type greater than 1 not decodable: ", m77430a9));
                }
                i14++;
                i12 = 6;
            }
            int m77430a15 = c14926m.m77430a(i12) + 1;
            int i26 = 0;
            while (i26 < m77430a15) {
                if (c14926m.m77430a(16) <= 2) {
                    c14926m.m77429b(24);
                    c14926m.m77429b(24);
                    c14926m.m77429b(24);
                    int m77430a16 = c14926m.m77430a(i12) + 1;
                    int i27 = 8;
                    c14926m.m77429b(8);
                    int[] iArr3 = new int[m77430a16];
                    for (int i28 = 0; i28 < m77430a16; i28++) {
                        iArr3[i28] = ((c14926m.m77431a() ? c14926m.m77430a(5) : 0) * 8) + c14926m.m77430a(3);
                    }
                    int i29 = 0;
                    while (i29 < m77430a16) {
                        int i30 = 0;
                        while (i30 < i27) {
                            if ((iArr3[i29] & (1 << i30)) != 0) {
                                c14926m.m77429b(i27);
                            }
                            i30++;
                            i27 = 8;
                        }
                        i29++;
                        i27 = 8;
                    }
                    i26++;
                    i12 = 6;
                } else {
                    throw new C15017r("residueType greater than 2 is not decodable");
                }
            }
            int m77430a17 = c14926m.m77430a(i12) + 1;
            for (int i31 = 0; i31 < m77430a17; i31++) {
                int m77430a18 = c14926m.m77430a(16);
                if (m77430a18 != 0) {
                    Log.e("VorbisUtil", "mapping type other than 0 not supported: " + m77430a18);
                } else {
                    int m77430a19 = c14926m.m77431a() ? c14926m.m77430a(4) + 1 : 1;
                    if (c14926m.m77431a()) {
                        int m77430a20 = c14926m.m77430a(8) + 1;
                        for (int i32 = 0; i32 < m77430a20; i32++) {
                            int i33 = i3 - 1;
                            int i34 = 0;
                            for (int i35 = i33; i35 > 0; i35 >>>= 1) {
                                i34++;
                            }
                            c14926m.m77429b(i34);
                            int i36 = 0;
                            while (i33 > 0) {
                                i36++;
                                i33 >>>= 1;
                            }
                            c14926m.m77429b(i36);
                        }
                    }
                    if (c14926m.m77430a(2) != 0) {
                        throw new C15017r("to reserved bits must be zero after mapping coupling steps");
                    }
                    if (m77430a19 > 1) {
                        for (int i37 = 0; i37 < i3; i37++) {
                            c14926m.m77429b(4);
                        }
                    }
                    for (int i38 = 0; i38 < m77430a19; i38++) {
                        c14926m.m77429b(8);
                        c14926m.m77429b(8);
                        c14926m.m77429b(8);
                    }
                }
            }
            int m77430a21 = c14926m.m77430a(6);
            int i39 = m77430a21 + 1;
            C14930q[] c14930qArr = new C14930q[i39];
            for (int i40 = 0; i40 < i39; i40++) {
                boolean m77431a2 = c14926m.m77431a();
                c14926m.m77430a(16);
                c14926m.m77430a(16);
                c14926m.m77430a(8);
                c14930qArr[i40] = new C14930q(m77431a2);
            }
            if (c14926m.m77431a()) {
                int i41 = 0;
                while (m77430a21 > 0) {
                    i41++;
                    m77430a21 >>>= 1;
                }
                c14927n = new C14927n(this.f29018q, bArr, c14930qArr, i41);
            } else {
                throw new C15017r("framing bit after modes not set as expected");
            }
        }
        this.f29015n = c14927n;
        if (c14927n == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f29015n.f29011a.f29026f);
        arrayList.add(this.f29015n.f29012b);
        C14931r c14931r = this.f29015n.f29011a;
        c14923j.f28992a = C15014o.m77309a(null, "audio/vorbis", c14931r.f29023c, -1, c14931r.f29021a, (int) c14931r.f29022b, arrayList, null, null);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final void mo77428a(long j) {
        this.f29000g = j;
        this.f29017p = j != 0;
        C14931r c14931r = this.f29018q;
        this.f29016o = c14931r != null ? c14931r.f29024d : 0;
    }
}
