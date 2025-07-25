package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import java.util.ArrayList;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.b0 */
/* loaded from: classes4.dex */
public final class C13959b0 extends AbstractC13897D {

    /* renamed from: f */
    public final ArrayList f26030f = new ArrayList();

    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        c14115c.m78090b();
        c14115c.m78090b();
        long m78218a = m78218a(c14115c) / 4;
        for (long j = 0; j < m78218a; j++) {
            this.f26030f.add(Integer.valueOf(c14115c.m78090b()));
        }
    }
}
