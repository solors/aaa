package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.G0 */
/* loaded from: classes4.dex */
public final class C13904G0 extends AbstractC13968e0 {

    /* renamed from: h */
    public int f25967h;

    /* renamed from: i */
    public int f25968i;

    /* renamed from: j */
    public int[] f25969j;

    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        this.f25967h = c14115c.m78090b();
        int m78090b = c14115c.m78090b();
        this.f25968i = m78090b;
        if (this.f25967h == 0) {
            this.f25969j = new int[m78090b];
            for (int i = 0; i < this.f25968i; i++) {
                this.f25969j[i] = c14115c.m78090b();
            }
        }
    }
}
