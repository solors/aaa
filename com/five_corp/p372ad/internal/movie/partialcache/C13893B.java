package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import java.util.HashMap;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.B */
/* loaded from: classes4.dex */
public final class C13893B extends AbstractC13897D {

    /* renamed from: f */
    public int f25950f;

    /* renamed from: g */
    public int f25951g;

    /* renamed from: h */
    public int f25952h;

    /* renamed from: i */
    public byte[][] f25953i;

    /* renamed from: j */
    public byte[][] f25954j;

    /* renamed from: k */
    public int f25955k;

    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        c14115c.m78094a();
        HashMap hashMap = AbstractC13984j1.f26058a;
        this.f25950f = AbstractC13984j1.m78196a(c14115c.m78094a());
        c14115c.m78094a();
        this.f25951g = AbstractC13984j1.m78196a(c14115c.m78094a());
        c14115c.m78094a();
        int m78094a = c14115c.m78094a() & 31;
        this.f25952h = m78094a;
        this.f25953i = new byte[m78094a];
        for (int i = 0; i < this.f25952h; i++) {
            byte[] bArr = new byte[c14115c.m78087d()];
            this.f25953i[i] = bArr;
            c14115c.m78092a(bArr);
        }
        int m78094a2 = c14115c.m78094a();
        this.f25955k = m78094a2;
        this.f25954j = new byte[m78094a2];
        for (int i2 = 0; i2 < this.f25955k; i2++) {
            byte[] bArr2 = new byte[c14115c.m78087d()];
            this.f25954j[i2] = bArr2;
            c14115c.m78092a(bArr2);
        }
    }
}
