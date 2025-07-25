package com.five_corp.p372ad.internal.bgtask;

import com.five_corp.p372ad.internal.logger.C13836a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.bgtask.a */
/* loaded from: classes4.dex */
public final class C13714a {

    /* renamed from: a */
    public final Object f25469a = new Object();

    /* renamed from: b */
    public final ArrayList f25470b = new ArrayList();

    /* renamed from: c */
    public final C13836a f25471c;

    public C13714a(C13836a c13836a) {
        this.f25471c = c13836a;
    }

    /* renamed from: a */
    public final void m78426a(C13720g c13720g) {
        synchronized (this.f25469a) {
            this.f25470b.add(c13720g);
        }
    }

    /* renamed from: a */
    public final C13720g m78427a(long j) {
        Iterator it = this.f25470b.iterator();
        C13720g c13720g = null;
        while (it.hasNext()) {
            C13720g c13720g2 = (C13720g) it.next();
            if (c13720g2.f25486c <= j) {
                if (c13720g != null) {
                    if (AbstractC13725l.m78421a(c13720g2.f25484a.f25498a) < AbstractC13725l.m78421a(c13720g.f25484a.f25498a)) {
                    }
                }
                c13720g = c13720g2;
            }
        }
        if (c13720g != null) {
            this.f25470b.remove(c13720g);
        }
        return c13720g;
    }
}
