package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Qe */
/* loaded from: classes9.dex */
public final class C34161Qe {

    /* renamed from: a */
    public final C34289W f93403a;

    /* renamed from: b */
    public final List f93404b;

    public C34161Qe(ECommercePrice eCommercePrice) {
        this(new C34289W(eCommercePrice.getFiat()), m22337a(eCommercePrice.getInternalComponents()));
    }

    /* renamed from: a */
    public static LinkedList m22337a(List list) {
        if (list != null) {
            LinkedList linkedList = new LinkedList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
                linkedList.add(new C34289W(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
            }
            return linkedList;
        }
        return null;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f93403a + ", internalComponents=" + this.f93404b + '}';
    }

    public C34161Qe(C34289W c34289w, LinkedList linkedList) {
        this.f93403a = c34289w;
        this.f93404b = linkedList;
    }
}
