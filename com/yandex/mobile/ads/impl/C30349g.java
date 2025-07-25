package com.yandex.mobile.ads.impl;

import com.ironsource.C20217kq;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.jvm.internal.C37613u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.C38513v;
import p804nd.Result;

/* renamed from: com.yandex.mobile.ads.impl.g */
/* loaded from: classes8.dex */
public final class C30349g {
    @Nullable
    /* renamed from: a */
    public static C30280f m34038a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(C20217kq.f50860d);
            JSONArray jSONArray = jSONObject.getJSONArray("test_ids");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            LinkedHashSet m34037a = m34037a(jSONArray);
            Intrinsics.m17074g(string);
            return new C30280f(string, m34037a);
        } catch (Throwable unused) {
            um0.m28727b(new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private static LinkedHashSet m34037a(JSONArray jSONArray) {
        Object m14549b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Result.C38506a c38506a = Result.f101870c;
                m14549b = Result.m14549b(Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i)))));
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (Result.m14546e(m14549b) != null) {
                Objects.toString(C38513v.m14532a(jSONArray.get(i), C37613u.f99334a));
                um0.m28727b(new Object[0]);
            }
        }
        return linkedHashSet;
    }
}
