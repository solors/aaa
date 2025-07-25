package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import java.util.HashMap;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.s0 */
/* loaded from: classes4.dex */
public final class C14026s0 extends AbstractC13968e0 {
    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        byte b = this.f26034f;
        if (b == 1) {
            c14115c.m78088c();
        } else if (b == 0) {
            c14115c.m78090b();
            HashMap hashMap = AbstractC13984j1.f26058a;
        } else {
            throw new C14050y0("Invalid version " + ((int) this.f26034f) + " for mehd");
        }
    }
}
