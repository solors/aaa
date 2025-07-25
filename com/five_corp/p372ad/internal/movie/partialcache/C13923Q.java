package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.Q */
/* loaded from: classes4.dex */
public final class C13923Q extends AbstractC13968e0 {

    /* renamed from: h */
    public short[] f25975h;

    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        int m78218a = (int) (m78218a(c14115c) / 2);
        this.f25975h = new short[m78218a];
        for (int i = 0; i < m78218a; i++) {
            this.f25975h[i] = c14115c.m78087d();
        }
    }
}
