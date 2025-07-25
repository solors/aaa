package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.C37563v;
import kotlin.collections.MapsJVM;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* renamed from: io.appmetrica.analytics.impl.G8 */
/* loaded from: classes9.dex */
public final class C33914G8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final byte[] fromModel(@NotNull Map<String, byte[]> map) {
        C33963I8 c33963i8 = new C33963I8();
        C33939H8[] c33939h8Arr = new C33939H8[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                C37563v.m17156w();
            }
            Map.Entry entry = (Map.Entry) obj;
            C33939H8 c33939h8 = new C33939H8();
            c33939h8.f92950a = (String) entry.getKey();
            c33939h8.f92951b = (byte[]) entry.getValue();
            c33939h8Arr[i] = c33939h8;
            i = i2;
        }
        c33963i8.f93019a = c33939h8Arr;
        return MessageNano.toByteArray(c33963i8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final Map<String, byte[]> toModel(@NotNull byte[] bArr) {
        int m17292f;
        int m16917e;
        C33939H8[] c33939h8Arr = ((C33963I8) MessageNano.mergeFrom(new C33963I8(), bArr)).f93019a;
        m17292f = MapsJVM.m17292f(c33939h8Arr.length);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (C33939H8 c33939h8 : c33939h8Arr) {
            Tuples m14532a = C38513v.m14532a(c33939h8.f92950a, c33939h8.f92951b);
            linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
        }
        return linkedHashMap;
    }
}
