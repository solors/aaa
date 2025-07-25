package com.five_corp.p372ad.internal.util;

import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.util.h */
/* loaded from: classes4.dex */
public final class C14120h {

    /* renamed from: a */
    public ArrayList f26749a = new ArrayList();

    /* renamed from: a */
    public final void m78084a(Object obj) {
        this.f26749a.add(new WeakReference(obj));
    }

    /* renamed from: a */
    public final void m78083a(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26749a.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            Object obj = weakReference.get();
            if (obj != null) {
                arrayList.add(weakReference);
                abstractCollection.add(obj);
            }
        }
        this.f26749a = arrayList;
    }
}
