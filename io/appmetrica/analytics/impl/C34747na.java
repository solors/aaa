package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.na */
/* loaded from: classes9.dex */
public final class C34747na {

    /* renamed from: a */
    public final HashMap f94995a;

    /* renamed from: b */
    public final boolean f94996b;

    public C34747na() {
        this(false);
    }

    /* renamed from: a */
    public final void m21305a(Object obj, Object obj2) {
        ArrayList arrayList;
        Collection collection = (Collection) this.f94995a.get(obj);
        if (collection == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(collection);
        }
        arrayList.add(obj2);
        Collection collection2 = (Collection) this.f94995a.put(obj, arrayList);
    }

    public final String toString() {
        return this.f94995a.toString();
    }

    public C34747na(boolean z) {
        this.f94995a = new HashMap();
        this.f94996b = z;
    }
}
