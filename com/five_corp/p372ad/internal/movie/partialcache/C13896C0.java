package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import java.util.ArrayList;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.C0 */
/* loaded from: classes4.dex */
public final class C13896C0 extends AbstractC13968e0 {

    /* renamed from: h */
    public final ArrayList f25958h = new ArrayList();

    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        int m78218a = (int) m78218a(c14115c);
        for (int i = 0; i < m78218a; i++) {
            this.f25958h.add(new C13892A0(this, AbstractC13984j1.m78196a(c14115c.m78094a())));
        }
    }
}
