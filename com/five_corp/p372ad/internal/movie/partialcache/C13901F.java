package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import java.util.ArrayList;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.F */
/* loaded from: classes4.dex */
public final class C13901F extends AbstractC13968e0 {

    /* renamed from: h */
    public final ArrayList f25965h = new ArrayList();

    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        int m78090b = c14115c.m78090b();
        for (int i = 0; i < m78090b; i++) {
            this.f25965h.add(Integer.valueOf(c14115c.m78090b()));
        }
    }
}
