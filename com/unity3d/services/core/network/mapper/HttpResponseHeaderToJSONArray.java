package com.unity3d.services.core.network.mapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

@Metadata
/* renamed from: com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt */
/* loaded from: classes7.dex */
public final class HttpResponseHeaderToJSONArray {
    @NotNull
    public static final JSONArray toResponseHeadersMap(@Nullable Map<String, ? extends List<String>> map) {
        Set<Map.Entry<String, ? extends List<String>>> entrySet;
        List m17163p;
        if (map != null && (entrySet = map.entrySet()) != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                m17163p = C37563v.m17163p((String) entry.getKey(), (List) entry.getValue());
                jSONArray = jSONArray.put(new JSONArray((Collection) m17163p));
                Intrinsics.checkNotNullExpressionValue(jSONArray, "acc.put(JSONArray(listOf(key, value)))");
            }
            if (jSONArray != null) {
                return jSONArray;
            }
        }
        return new JSONArray();
    }
}
