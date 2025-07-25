package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C15017r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15119l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.d */
/* loaded from: classes4.dex */
public final class C15138d {

    /* renamed from: a */
    public final List f29883a;

    /* renamed from: b */
    public final int f29884b;

    public C15138d(int i, List list) {
        this.f29883a = list;
        this.f29884b = i;
    }

    /* renamed from: a */
    public static C15138d m77131a(C15121n c15121n) {
        List singletonList;
        try {
            c15121n.m77197e(c15121n.f29805b + 21);
            int m77192j = c15121n.m77192j() & 3;
            int m77192j2 = c15121n.m77192j();
            int i = c15121n.f29805b;
            int i2 = 0;
            for (int i3 = 0; i3 < m77192j2; i3++) {
                c15121n.m77197e(c15121n.f29805b + 1);
                int m77187o = c15121n.m77187o();
                for (int i4 = 0; i4 < m77187o; i4++) {
                    int m77187o2 = c15121n.m77187o();
                    i2 += m77187o2 + 4;
                    c15121n.m77197e(c15121n.f29805b + m77187o2);
                }
            }
            c15121n.m77197e(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < m77192j2; i6++) {
                c15121n.m77197e(c15121n.f29805b + 1);
                int m77187o3 = c15121n.m77187o();
                for (int i7 = 0; i7 < m77187o3; i7++) {
                    int m77187o4 = c15121n.m77187o();
                    System.arraycopy(AbstractC15119l.f29796a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(c15121n.f29804a, c15121n.f29805b, bArr, i8, m77187o4);
                    i5 = i8 + m77187o4;
                    c15121n.m77197e(c15121n.f29805b + m77187o4);
                }
            }
            if (i2 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C15138d(m77192j + 1, singletonList);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C15017r("Error parsing HEVC config", e);
        }
    }
}
