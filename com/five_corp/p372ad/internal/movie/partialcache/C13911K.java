package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import java.io.UnsupportedEncodingException;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.K */
/* loaded from: classes4.dex */
public final class C13911K extends AbstractC13968e0 {
    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        c14115c.m78087d();
        byte[] bArr = new byte[(int) m78218a(c14115c)];
        c14115c.m78092a(bArr);
        try {
            new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new C14050y0("UnsupportedEncodingException for copyright notice", e);
        }
    }
}
