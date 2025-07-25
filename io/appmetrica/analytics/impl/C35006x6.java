package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.C37563v;
import kotlin.collections.MapsJVM;
import kotlin.collections._Arrays;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* renamed from: io.appmetrica.analytics.impl.x6 */
/* loaded from: classes9.dex */
public final class C35006x6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34943ul[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        C34943ul[] c34943ulArr = new C34943ul[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                C37563v.m17156w();
            }
            Map.Entry entry = (Map.Entry) obj;
            C34943ul c34943ul = new C34943ul();
            c34943ul.f95485a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array != null) {
                c34943ul.f95486b = (String[]) array;
                c34943ulArr[i] = c34943ul;
                i = i2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return c34943ulArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final Map<String, List<String>> toModel(@NotNull C34943ul[] c34943ulArr) {
        int m17292f;
        int m16917e;
        List m17348D0;
        m17292f = MapsJVM.m17292f(c34943ulArr.length);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (C34943ul c34943ul : c34943ulArr) {
            String str = c34943ul.f95485a;
            m17348D0 = _Arrays.m17348D0(c34943ul.f95486b);
            Tuples m14532a = C38513v.m14532a(str, m17348D0);
            linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
        }
        return linkedHashMap;
    }
}
