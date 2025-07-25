package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.Ld */
/* loaded from: classes9.dex */
public final class C34040Ld {

    /* renamed from: a */
    public final String f93180a;

    /* renamed from: b */
    public final String f93181b;

    /* renamed from: c */
    public final List f93182c;

    /* renamed from: d */
    public final Map f93183d;

    public C34040Ld(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), m22471a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    /* renamed from: a */
    public static ArrayList m22471a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C33809C3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f93180a + "', identifier='" + this.f93181b + "', cartItems=" + this.f93182c + ", payload=" + this.f93183d + '}';
    }

    public C34040Ld(String str, String str2, ArrayList arrayList, Map map) {
        this.f93180a = str;
        this.f93181b = str2;
        this.f93182c = arrayList;
        this.f93183d = map;
    }
}
