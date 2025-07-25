package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Tuples;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import kotlin.ranges._Ranges;
import kotlin.text.Charsets;
import org.json.JSONObject;
import p804nd.C38513v;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.lc */
/* loaded from: classes9.dex */
public final class C34695lc {
    /* renamed from: a */
    public static final C35035y9 m21424a(C34695lc c34695lc, EnumC33940H9 enumC33940H9, Map map) {
        int i;
        int m17154x;
        int m17292f;
        int m16917e;
        Object value;
        c34695lc.getClass();
        C35035y9 c35035y9 = new C35035y9();
        switch (enumC33940H9.ordinal()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c35035y9.f95653a = i;
        C34722mc.f94922b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        m17154x = C37566w.m17154x(entrySet, 10);
        m17292f = MapsJVM.m17292f(m17154x);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 != null) {
                    double doubleValue = ((Number) value2).doubleValue();
                    if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                        value = null;
                        Tuples m14532a = C38513v.m14532a(key, value);
                        linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
            }
            value = entry.getValue();
            Tuples m14532a2 = C38513v.m14532a(key, value);
            linkedHashMap.put(m14532a2.m17630c(), m14532a2.m17629d());
        }
        String jSONObject = new JSONObject(linkedHashMap).toString();
        if (jSONObject != null) {
            c35035y9.f95654b = jSONObject.getBytes(Charsets.UTF_8);
        }
        return c35035y9;
    }
}
