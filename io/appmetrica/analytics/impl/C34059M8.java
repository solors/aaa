package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.M8 */
/* loaded from: classes9.dex */
public final class C34059M8 implements ProtobufConverter {
    /* renamed from: a */
    public static C34853r9 m22429a(C34035L8 c34035l8) {
        C34853r9 c34853r9 = new C34853r9();
        c34853r9.f95275d = new int[c34035l8.f93172b.size()];
        int i = 0;
        for (Integer num : c34035l8.f93172b) {
            c34853r9.f95275d[i] = num.intValue();
            i++;
        }
        c34853r9.f95274c = c34035l8.f93174d;
        c34853r9.f95273b = c34035l8.f93173c;
        c34853r9.f95272a = c34035l8.f93171a;
        return c34853r9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return m22429a((C34035L8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C34853r9 c34853r9 = (C34853r9) obj;
        return new C34035L8(c34853r9.f95272a, c34853r9.f95273b, c34853r9.f95274c, CollectionUtils.hashSetFromIntArray(c34853r9.f95275d));
    }
}
