package com.unity3d.ads.core.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.JSONArrayExtensionsKt */
/* loaded from: classes7.dex */
public final class JSONArrayExtensions {
    @NotNull
    public static final Map<String, List<String>> getHeadersMap(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            Intrinsics.m17073h(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List list = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            Intrinsics.checkNotNullExpressionValue(string, "header.getString(1)");
            list.add(string);
            String string2 = jSONArray2.getString(0);
            Intrinsics.checkNotNullExpressionValue(string2, "header.getString(0)");
            linkedHashMap.put(string2, list);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Object[] toTypedArray(@NotNull JSONArray jSONArray) {
        PrimitiveRanges m16900v;
        int m17154x;
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        m16900v = _Ranges.m16900v(0, jSONArray.length());
        m17154x = C37566w.m17154x(m16900v, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator<Integer> it = m16900v.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((PrimitiveIterators) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
