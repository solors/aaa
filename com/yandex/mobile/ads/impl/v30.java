package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.SetsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class v30 {
    @Nullable
    /* renamed from: a */
    public static Set m28547a(@NotNull String jsonData) {
        Object m14549b;
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(m28545a(new JSONArray(jsonData)));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14546e(m14549b) != null) {
            um0.m28727b(new Object[0]);
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        return (Set) m14549b;
    }

    @Nullable
    /* renamed from: a */
    public static Set m28545a(@NotNull JSONArray jsonArray) {
        Object m14549b;
        Set m17129b;
        Set m17130a;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            Result.C38506a c38506a = Result.f101870c;
            m17129b = SetsJVM.m17129b();
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jsonArray.getJSONObject(i);
                String string = jSONObject.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                u30 valueOf = u30.valueOf(string);
                String string2 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                m17129b.add(new t30(valueOf, string2));
            }
            m17130a = SetsJVM.m17130a(m17129b);
            m14549b = Result.m14549b(m17130a);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14546e(m14549b) != null) {
            Objects.toString(jsonArray);
            um0.m28727b(new Object[0]);
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        return (Set) m14549b;
    }

    @Nullable
    /* renamed from: a */
    public static String m28546a(@Nullable Set set) {
        if (set != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                t30 t30Var = (t30) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", t30Var.m29311a().name());
                jSONObject.put("value", t30Var.m29310b());
                jSONArray = jSONArray.put(jSONObject);
                Intrinsics.checkNotNullExpressionValue(jSONArray, "put(...)");
            }
            if (jSONArray != null) {
                return jSONArray.toString();
            }
        }
        return null;
    }
}
