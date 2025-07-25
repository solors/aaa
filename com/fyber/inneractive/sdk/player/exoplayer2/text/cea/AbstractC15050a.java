package com.fyber.inneractive.sdk.player.exoplayer2.text.cea;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a */
/* loaded from: classes4.dex */
public abstract class AbstractC15050a {
    /* renamed from: a */
    public static void m77276a(long j, C15121n c15121n, InterfaceC14935r[] interfaceC14935rArr) {
        int i;
        while (c15121n.f29806c - c15121n.f29805b > 1) {
            int i2 = 0;
            while (true) {
                if (c15121n.f29806c - c15121n.f29805b == 0) {
                    i = -1;
                    break;
                }
                int m77192j = c15121n.m77192j();
                i2 += m77192j;
                if (m77192j != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (c15121n.f29806c - c15121n.f29805b == 0) {
                    i3 = -1;
                    break;
                }
                int m77192j2 = c15121n.m77192j();
                i3 += m77192j2;
                if (m77192j2 != 255) {
                    break;
                }
            }
            if (i3 != -1) {
                int i4 = c15121n.f29806c;
                int i5 = c15121n.f29805b;
                if (i3 <= i4 - i5) {
                    if (i == 4 && i3 >= 8) {
                        int m77192j3 = c15121n.m77192j();
                        int m77187o = c15121n.m77187o();
                        int m77204b = c15121n.m77204b();
                        int m77192j4 = c15121n.m77192j();
                        c15121n.m77197e(i5);
                        if (m77192j3 == 181 && m77187o == 49 && m77204b == 1195456820 && m77192j4 == 3) {
                            c15121n.m77197e(c15121n.f29805b + 8);
                            c15121n.m77197e(c15121n.f29805b + 1);
                            int m77192j5 = (c15121n.m77192j() & 31) * 3;
                            int i6 = c15121n.f29805b;
                            for (InterfaceC14935r interfaceC14935r : interfaceC14935rArr) {
                                c15121n.m77197e(i6);
                                interfaceC14935r.mo77422a(m77192j5, c15121n);
                                interfaceC14935r.mo77421a(j, 1, m77192j5, 0, null);
                            }
                            c15121n.m77197e(c15121n.f29805b + (i3 - (m77192j5 + 10)));
                        }
                    }
                    c15121n.m77197e(c15121n.f29805b + i3);
                }
            }
            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
            c15121n.m77197e(c15121n.f29806c);
        }
    }
}
