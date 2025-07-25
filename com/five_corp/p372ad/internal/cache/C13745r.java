package com.five_corp.p372ad.internal.cache;

import com.five_corp.p372ad.internal.media_config.C13838a;
import com.five_corp.p372ad.internal.util.C14120h;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.cache.r */
/* loaded from: classes4.dex */
public final class C13745r {

    /* renamed from: a */
    public final Object f25539a = new Object();

    /* renamed from: b */
    public C13750w f25540b;

    /* renamed from: c */
    public final C14120h f25541c;

    /* renamed from: d */
    public final C14120h f25542d;

    public C13745r(C13750w c13750w) {
        this.f25540b = c13750w;
        C14120h c14120h = new C14120h();
        this.f25541c = c14120h;
        c14120h.m78084a(c13750w);
        this.f25542d = new C14120h();
    }

    /* renamed from: a */
    public final ArrayList m78405a() {
        ArrayList arrayList;
        synchronized (this.f25539a) {
            C14120h c14120h = this.f25541c;
            c14120h.getClass();
            arrayList = new ArrayList();
            c14120h.m78083a((AbstractCollection) arrayList);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C13750w m78402b() {
        C13750w c13750w;
        synchronized (this.f25539a) {
            c13750w = this.f25540b;
        }
        return c13750w;
    }

    /* renamed from: a */
    public final void m78403a(InterfaceC13751x interfaceC13751x) {
        this.f25542d.f26749a.add(new WeakReference(interfaceC13751x));
    }

    /* renamed from: a */
    public final void m78404a(InterfaceC13744q interfaceC13744q) {
        C13750w c13750w;
        C13750w mo78401a;
        ArrayList arrayList;
        synchronized (this.f25539a) {
            c13750w = this.f25540b;
            mo78401a = interfaceC13744q.mo78401a(c13750w);
            this.f25540b = mo78401a;
            this.f25541c.f26749a.add(new WeakReference(mo78401a));
            C14120h c14120h = this.f25542d;
            c14120h.getClass();
            arrayList = new ArrayList();
            c14120h.m78083a((AbstractCollection) arrayList);
        }
        C13838a c13838a = c13750w.f25563b;
        C13838a c13838a2 = mo78401a.f25563b;
        if (c13838a == c13838a2 || c13838a2 == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC13751x) it.next()).mo78129a(mo78401a);
        }
    }
}
