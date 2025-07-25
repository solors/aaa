package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Xe */
/* loaded from: classes9.dex */
public final class C34328Xe {

    /* renamed from: a */
    public final String f93768a;

    /* renamed from: b */
    public final String f93769b;

    /* renamed from: c */
    public final List f93770c;

    /* renamed from: d */
    public final Map f93771d;

    /* renamed from: e */
    public final C34161Qe f93772e;

    /* renamed from: f */
    public final C34161Qe f93773f;

    /* renamed from: g */
    public final List f93774g;

    public C34328Xe(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C34161Qe(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C34161Qe(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f93768a + "', name='" + this.f93769b + "', categoriesPath=" + this.f93770c + ", payload=" + this.f93771d + ", actualPrice=" + this.f93772e + ", originalPrice=" + this.f93773f + ", promocodes=" + this.f93774g + '}';
    }

    public C34328Xe(String str, String str2, List list, Map map, C34161Qe c34161Qe, C34161Qe c34161Qe2, List list2) {
        this.f93768a = str;
        this.f93769b = str2;
        this.f93770c = list;
        this.f93771d = map;
        this.f93772e = c34161Qe;
        this.f93773f = c34161Qe2;
        this.f93774g = list2;
    }
}
