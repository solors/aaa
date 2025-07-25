package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import com.five_corp.p372ad.internal.util.C14119g;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.a0 */
/* loaded from: classes4.dex */
public final class C13943a0 extends AbstractC13968e0 {

    /* renamed from: h */
    public C13936X f25988h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.five_corp.ad.internal.movie.partialcache.Y] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.five_corp.ad.internal.movie.partialcache.X] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.five_corp.ad.internal.movie.partialcache.V] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.five_corp.ad.internal.movie.partialcache.W] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.five_corp.ad.internal.movie.partialcache.Z] */
    /* renamed from: b */
    public static C13936X m78216b(C14115c c14115c) {
        int m78196a;
        ?? c13938y;
        boolean z;
        boolean z2;
        byte m78094a = c14115c.m78094a();
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        do {
            m78196a = AbstractC13984j1.m78196a(c14115c.m78094a());
            i++;
            i2 = (i2 << 7) | (m78196a & 127);
            if (i >= 4) {
                break;
            }
        } while ((m78196a & 128) > 0);
        int i3 = c14115c.f26743h;
        if (m78094a != 3) {
            if (m78094a != 4) {
                if (m78094a != 5) {
                    c13938y = new C13940Z();
                    c14115c.m78092a(new byte[i2]);
                } else {
                    c13938y = new C13934W();
                    byte[] bArr = new byte[i2];
                    c13938y.f25980b = bArr;
                    c14115c.m78092a(bArr);
                }
            } else {
                c13938y = new C13932V();
                c14115c.m78094a();
                c14115c.m78094a();
                C14119g m78092a = c14115c.m78092a(c14115c.f26739d);
                if (!m78092a.f26746a) {
                    m78092a.f26747b.m78136b();
                }
                byte[] bArr2 = c14115c.f26739d;
                byte b = bArr2[0];
                byte b2 = bArr2[1];
                byte b3 = bArr2[2];
                c14115c.m78090b();
                c14115c.m78090b();
            }
        } else {
            c13938y = new C13938Y();
            c14115c.m78087d();
            int m78196a2 = AbstractC13984j1.m78196a(c14115c.m78094a());
            if (((m78196a2 >> 7) & 1) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (((m78196a2 >> 6) & 1) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((m78196a2 >> 5) & 1) > 0) {
                z3 = true;
            }
            if (z) {
                c14115c.m78087d();
            }
            if (z2) {
                c14115c.m78092a(new byte[AbstractC13984j1.m78196a(c14115c.m78094a())]);
            }
            if (z3) {
                c14115c.m78087d();
            }
        }
        while (c14115c.f26743h < i3 + i2) {
            c13938y.f25981a.add(m78216b(c14115c));
        }
        return c13938y;
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.AbstractC13968e0, com.five_corp.p372ad.internal.movie.partialcache.AbstractC13897D
    /* renamed from: a */
    public final void mo78156a(C14115c c14115c, C13836a c13836a) {
        super.mo78156a(c14115c, c13836a);
        this.f25988h = m78216b(c14115c);
    }
}
