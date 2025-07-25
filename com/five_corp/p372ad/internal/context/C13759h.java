package com.five_corp.p372ad.internal.context;

import com.five_corp.p372ad.internal.p373ad.C13627a;
import com.five_corp.p372ad.internal.util.C14120h;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.context.h */
/* loaded from: classes4.dex */
public final class C13759h {

    /* renamed from: a */
    public final C14120h f25589a = new C14120h();

    /* renamed from: a */
    public final synchronized C13758g m78396a(C13627a c13627a) {
        C14120h c14120h = this.f25589a;
        c14120h.getClass();
        ArrayList arrayList = new ArrayList();
        c14120h.m78083a((AbstractCollection) arrayList);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C13758g c13758g = (C13758g) it.next();
            if (c13758g.m78397a() && c13758g.f25587a.f25185c.equals(c13627a.f25185c)) {
                i++;
            }
        }
        if (i < c13627a.f25196n) {
            C13758g c13758g2 = new C13758g(c13627a);
            this.f25589a.f26749a.add(new WeakReference(c13758g2));
            return c13758g2;
        }
        return null;
    }
}
