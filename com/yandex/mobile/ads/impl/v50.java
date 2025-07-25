package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class v50 {
    @NotNull

    /* renamed from: a */
    private final u50 f86566a;

    public /* synthetic */ v50() {
        this(new u50());
    }

    @Nullable
    /* renamed from: a */
    public final LinkedHashMap m28529a(@Nullable JSONObject jSONObject) throws JSONException {
        t50 t50Var;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            if (keys.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.isNull(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof JSONObject) {
                            JSONObject jsonObject = (JSONObject) obj;
                            this.f86566a.getClass();
                            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                            String optString = jsonObject.optString("type");
                            String m26827a = yn0.m26827a("value", jsonObject);
                            if (Intrinsics.m17075f(optString, "parcelable") && Intrinsics.m17075f(m26827a, "null")) {
                                t50Var = t50.f85514a;
                            } else {
                                t50Var = null;
                            }
                            if (t50Var != null) {
                                Intrinsics.m17074g(next);
                                linkedHashMap.put(next, t50Var);
                            }
                        } else {
                            Intrinsics.m17074g(next);
                            Intrinsics.m17074g(obj);
                            linkedHashMap.put(next, obj);
                        }
                    }
                }
                return linkedHashMap;
            }
        }
        return null;
    }

    public v50(@NotNull u50 extrasParcelableParser) {
        Intrinsics.checkNotNullParameter(extrasParcelableParser, "extrasParcelableParser");
        this.f86566a = extrasParcelableParser;
    }
}
