package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C15017r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.s */
/* loaded from: classes4.dex */
public abstract class AbstractC14932s {
    /* renamed from: a */
    public static C14931r m77423a(C15121n c15121n) {
        m77424a(1, c15121n, false);
        c15121n.m77198e();
        int m77192j = c15121n.m77192j();
        long m77198e = c15121n.m77198e();
        c15121n.m77200d();
        int m77200d = c15121n.m77200d();
        c15121n.m77200d();
        int m77192j2 = c15121n.m77192j();
        c15121n.m77192j();
        return new C14931r(m77192j, m77198e, m77200d, (int) Math.pow(2.0d, m77192j2 & 15), (int) Math.pow(2.0d, (m77192j2 & 240) >> 4), Arrays.copyOf(c15121n.f29804a, c15121n.f29806c));
    }

    /* renamed from: a */
    public static boolean m77424a(int i, C15121n c15121n, boolean z) {
        if (c15121n.f29806c - c15121n.f29805b < 7) {
            if (z) {
                return false;
            }
            throw new C15017r("too short header: " + (c15121n.f29806c - c15121n.f29805b));
        } else if (c15121n.m77192j() != i) {
            if (z) {
                return false;
            }
            throw new C15017r("expected header type " + Integer.toHexString(i));
        } else if (c15121n.m77192j() == 118 && c15121n.m77192j() == 111 && c15121n.m77192j() == 114 && c15121n.m77192j() == 98 && c15121n.m77192j() == 105 && c15121n.m77192j() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C15017r("expected characters 'vorbis'");
        }
    }
}
