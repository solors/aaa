package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37566w;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFj1sSDK {
    private static final List<Object> AFInAppEventParameterName(JSONArray jSONArray) {
        PrimitiveRanges m16900v;
        int m17154x;
        m16900v = _Ranges.m16900v(0, jSONArray.length());
        m17154x = C37566w.m17154x(m16900v, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator<Integer> it = m16900v.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((PrimitiveIterators) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(AFInAppEventParameterName(obj));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> valueOf(@NotNull JSONObject jSONObject) {
        Sequence m16841c;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "");
        m16841c = C37653n.m16841c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m16841c) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, AFInAppEventParameterName(obj2));
        }
        return linkedHashMap;
    }

    private static final Object AFInAppEventParameterName(Object obj) {
        if (obj instanceof JSONArray) {
            return AFInAppEventParameterName((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return valueOf((JSONObject) obj);
        }
        if (Intrinsics.m17075f(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
