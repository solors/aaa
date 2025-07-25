package com.five_corp.p372ad.internal.layouter;

import com.five_corp.p372ad.internal.util.C14120h;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.layouter.k */
/* loaded from: classes4.dex */
public final class C13833k {

    /* renamed from: a */
    public final C14120h f25829a = new C14120h();

    /* renamed from: b */
    public C13831i f25830b;

    public C13833k(C13831i c13831i) {
        this.f25830b = c13831i;
    }

    /* renamed from: a */
    public final C13831i m78273a(InterfaceC13832j interfaceC13832j) {
        this.f25829a.f26749a.add(new WeakReference(interfaceC13832j));
        return this.f25830b;
    }

    /* renamed from: a */
    public final void m78274a(C13831i c13831i) {
        if (this.f25830b.equals(c13831i)) {
            return;
        }
        this.f25830b = c13831i;
        C14120h c14120h = this.f25829a;
        c14120h.getClass();
        ArrayList arrayList = new ArrayList();
        c14120h.m78083a((AbstractCollection) arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC13832j) it.next()).mo78275a(c13831i);
        }
    }
}
