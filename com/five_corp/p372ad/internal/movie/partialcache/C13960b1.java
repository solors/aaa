package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.b1 */
/* loaded from: classes4.dex */
public final class C13960b1 extends AbstractC13968e0 {
    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        byte b = this.f26034f;
        if (b == 1) {
            c14115c.m78088c();
            c14115c.m78088c();
            c14115c.m78090b();
            c14115c.m78090b();
            c14115c.m78088c();
        } else if (b == 0) {
            c14115c.m78090b();
            HashMap hashMap = AbstractC13984j1.f26058a;
            c14115c.m78090b();
            c14115c.m78090b();
            c14115c.m78090b();
            c14115c.m78090b();
        } else {
            throw new C14050y0("Invalid version " + ((int) this.f26034f) + " for tkhd");
        }
        c14115c.m78090b();
        c14115c.m78090b();
        if (c14115c.m78087d() != 0) {
            HashMap hashMap2 = AbstractC13984j1.f26058a;
        }
        if (c14115c.m78087d() != 0) {
            HashMap hashMap3 = AbstractC13984j1.f26058a;
        }
        short m78087d = c14115c.m78087d();
        if (m78087d != 256 && m78087d != 0) {
            HashMap hashMap4 = AbstractC13984j1.f26058a;
        }
        c14115c.m78087d();
        int[] iArr = new int[9];
        for (int i = 0; i < 9; i++) {
            iArr[i] = c14115c.m78090b();
        }
        if (!Arrays.equals(iArr, new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824})) {
            HashMap hashMap5 = AbstractC13984j1.f26058a;
            Arrays.toString(iArr);
        }
        c14115c.m78090b();
        c14115c.m78090b();
    }
}
