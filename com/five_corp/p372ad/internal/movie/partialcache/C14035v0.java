package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.v0 */
/* loaded from: classes4.dex */
public final class C14035v0 extends AbstractC13968e0 {

    /* renamed from: h */
    public int f26161h;

    /* renamed from: i */
    public long f26162i;

    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        byte b = this.f26034f;
        if (b == 1) {
            c14115c.m78088c();
            c14115c.m78088c();
            this.f26161h = c14115c.m78090b();
            this.f26162i = c14115c.m78088c();
        } else if (b == 0) {
            c14115c.m78090b();
            HashMap hashMap = AbstractC13984j1.f26058a;
            c14115c.m78090b();
            this.f26161h = c14115c.m78090b();
            int m78090b = c14115c.m78090b();
            long j = m78090b;
            if (m78090b < 0) {
                j += 4294967296L;
            }
            this.f26162i = j;
        } else {
            throw new C14050y0("Invalid version " + ((int) this.f26034f) + " for mvhd");
        }
        int m78090b2 = c14115c.m78090b();
        short m78087d = c14115c.m78087d();
        c14115c.m78087d();
        c14115c.m78090b();
        c14115c.m78090b();
        int[] iArr = new int[9];
        for (int i = 0; i < 9; i++) {
            iArr[i] = c14115c.m78090b();
        }
        c14115c.m78092a(new byte[24]);
        c14115c.m78090b();
        if (m78090b2 != 65536) {
            HashMap hashMap2 = AbstractC13984j1.f26058a;
        }
        if (m78087d != 256) {
            HashMap hashMap3 = AbstractC13984j1.f26058a;
        }
        if (!Arrays.equals(iArr, new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824})) {
            HashMap hashMap4 = AbstractC13984j1.f26058a;
            Arrays.toString(iArr);
        }
    }
}
