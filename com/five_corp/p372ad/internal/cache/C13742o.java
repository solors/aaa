package com.five_corp.p372ad.internal.cache;

import com.five_corp.p372ad.internal.storage.C14080e;
import com.five_corp.p372ad.internal.util.C14120h;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.cache.o */
/* loaded from: classes4.dex */
public final class C13742o {

    /* renamed from: a */
    public final C14080e f25535a;

    /* renamed from: b */
    public final C14120h f25536b = new C14120h();

    public C13742o(C14080e c14080e) {
        this.f25535a = c14080e;
    }

    /* renamed from: a */
    public final synchronized void m78406a(HashSet hashSet) {
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(hashSet);
        C14120h c14120h = this.f25536b;
        c14120h.getClass();
        ArrayList arrayList = new ArrayList();
        c14120h.m78083a((AbstractCollection) arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13743p c13743p = (C13743p) it.next();
            if (c13743p.f25538b) {
                hashSet2.addAll(c13743p.f25537a.keySet());
            }
        }
        this.f25535a.m78114a(hashSet2);
    }
}
