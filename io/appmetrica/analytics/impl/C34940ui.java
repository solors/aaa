package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ui */
/* loaded from: classes9.dex */
public final class C34940ui {

    /* renamed from: a */
    public final String f95479a;

    /* renamed from: b */
    public final List f95480b;

    /* renamed from: c */
    public final String f95481c;

    /* renamed from: d */
    public final Map f95482d;

    public C34940ui(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f95479a + "', categoriesPath=" + this.f95480b + ", searchQuery='" + this.f95481c + "', payload=" + this.f95482d + '}';
    }

    public C34940ui(String str, String str2, List list, Map map) {
        this.f95479a = str;
        this.f95480b = list;
        this.f95481c = str2;
        this.f95482d = map;
    }
}
