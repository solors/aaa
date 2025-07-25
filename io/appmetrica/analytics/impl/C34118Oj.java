package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.MapsJVM;
import kotlin.ranges._Ranges;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* renamed from: io.appmetrica.analytics.impl.Oj */
/* loaded from: classes9.dex */
public final class C34118Oj implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34166Qj fromModel(@NotNull Map<String, byte[]> map) {
        C34166Qj c34166Qj = new C34166Qj();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            C34189Rj c34189Rj = new C34189Rj();
            c34189Rj.f93453a = entry.getKey().getBytes(Charsets.UTF_8);
            c34189Rj.f93454b = entry.getValue();
            arrayList.add(c34189Rj);
        }
        Object[] array = arrayList.toArray(new C34189Rj[0]);
        if (array != null) {
            c34166Qj.f93415a = (C34189Rj[]) array;
            return c34166Qj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final Map<String, byte[]> toModel(@NotNull C34166Qj c34166Qj) {
        int m17292f;
        int m16917e;
        C34189Rj[] c34189RjArr = c34166Qj.f93415a;
        m17292f = MapsJVM.m17292f(c34189RjArr.length);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (C34189Rj c34189Rj : c34189RjArr) {
            Tuples m14532a = C38513v.m14532a(new String(c34189Rj.f93453a, Charsets.UTF_8), c34189Rj.f93454b);
            linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
        }
        return linkedHashMap;
    }
}
