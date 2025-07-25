package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.sj */
/* loaded from: classes6.dex */
public final class C20974sj {

    /* renamed from: a */
    private static final int f53479a = 100;

    /* renamed from: a */
    private static final boolean m54952a(Object obj, Object obj2, int i) {
        return ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) ? m54948a((JSONObject) obj, (JSONObject) obj2, i + 1) : ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) ? m54950a((JSONArray) obj, (JSONArray) obj2, i + 1) : ((obj instanceof Number) && (obj2 instanceof Number)) ? ((Number) obj).doubleValue() == ((Number) obj2).doubleValue() : Intrinsics.m17075f(obj, obj2);
    }

    /* renamed from: a */
    public static final boolean m54951a(@NotNull JSONArray lhs, @NotNull JSONArray rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return m54950a(lhs, rhs, 0);
    }

    /* renamed from: a */
    private static final boolean m54950a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        PrimitiveRanges m16900v;
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() == jSONArray2.length() && i <= 100) {
            m16900v = _Ranges.m16900v(0, jSONArray.length());
            if (!(m16900v instanceof Collection) || !((Collection) m16900v).isEmpty()) {
                Iterator<Integer> it = m16900v.iterator();
                while (it.hasNext()) {
                    int nextInt = ((PrimitiveIterators) it).nextInt();
                    if (!m54952a(jSONArray.get(nextInt), jSONArray2.get(nextInt), i)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m54949a(@NotNull JSONObject lhs, @NotNull JSONObject rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return m54948a(lhs, rhs, 0);
    }

    /* renamed from: a */
    private static final boolean m54948a(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        Sequence<String> m16841c;
        boolean z;
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() == jSONObject2.length() && i <= 100) {
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "lhs.keys()");
            m16841c = C37653n.m16841c(keys);
            for (String str : m16841c) {
                if (jSONObject2.has(str) && m54952a(jSONObject.get(str), jSONObject2.get(str), i)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
