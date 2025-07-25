package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.r */
/* loaded from: classes4.dex */
public abstract class AbstractC14907r {

    /* renamed from: a */
    public static final int[] f28902a = {AbstractC15133z.m77158a("isom"), AbstractC15133z.m77158a("iso2"), AbstractC15133z.m77158a("iso3"), AbstractC15133z.m77158a("iso4"), AbstractC15133z.m77158a("iso5"), AbstractC15133z.m77158a("iso6"), AbstractC15133z.m77158a("avc1"), AbstractC15133z.m77158a("hvc1"), AbstractC15133z.m77158a("hev1"), AbstractC15133z.m77158a("mp41"), AbstractC15133z.m77158a("mp42"), AbstractC15133z.m77158a("3g2a"), AbstractC15133z.m77158a("3g2b"), AbstractC15133z.m77158a("3gr6"), AbstractC15133z.m77158a("3gs6"), AbstractC15133z.m77158a("3ge6"), AbstractC15133z.m77158a("3gg6"), AbstractC15133z.m77158a("M4V "), AbstractC15133z.m77158a("M4A "), AbstractC15133z.m77158a("f4v "), AbstractC15133z.m77158a("kddi"), AbstractC15133z.m77158a("M4VP"), AbstractC15133z.m77158a("qt  "), AbstractC15133z.m77158a("MSNV")};

    /* renamed from: a */
    public static boolean m77441a(C14833b c14833b, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        long j = c14833b.f28284b;
        int i2 = (int) ((j == -1 || j > 4096) ? 4096L : 4096L);
        C15121n c15121n = new C15121n(64);
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i2) {
            c15121n.m77201c(8);
            c14833b.m77521a(c15121n.f29804a, 0, 8, false);
            long m77191k = c15121n.m77191k();
            int m77204b = c15121n.m77204b();
            if (m77191k == 1) {
                c14833b.m77521a(c15121n.f29804a, 8, 8, false);
                c15121n.m77199d(16);
                i = 16;
                m77191k = c15121n.m77188n();
            } else {
                i = 8;
            }
            long j2 = i;
            if (m77191k < j2) {
                return false;
            }
            i3 += i;
            if (m77204b != AbstractC14892c.f28693C) {
                if (m77204b != AbstractC14892c.f28711L && m77204b != AbstractC14892c.f28715N) {
                    if ((i3 + m77191k) - j2 >= i2) {
                        break;
                    }
                    int i4 = (int) (m77191k - j2);
                    i3 += i4;
                    if (m77204b == AbstractC14892c.f28731b) {
                        if (i4 < 8) {
                            return false;
                        }
                        c15121n.m77201c(i4);
                        c14833b.m77521a(c15121n.f29804a, 0, i4, false);
                        int i5 = i4 / 4;
                        for (int i6 = 0; i6 < i5; i6++) {
                            if (i6 == 1) {
                                c15121n.m77197e(c15121n.f29805b + 4);
                            } else {
                                int m77204b2 = c15121n.m77204b();
                                if ((m77204b2 >>> 8) != AbstractC15133z.m77158a("3gp")) {
                                    for (int i7 : f28902a) {
                                        if (i7 != m77204b2) {
                                        }
                                    }
                                    continue;
                                }
                                z4 = true;
                                break;
                            }
                        }
                        if (!z4) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        c14833b.m77523a(i4, false);
                    }
                } else {
                    z2 = true;
                    z3 = true;
                    break;
                }
            }
        }
        z2 = true;
        z3 = false;
        if (!z4 || z != z3) {
            return false;
        }
        return z2;
    }
}
