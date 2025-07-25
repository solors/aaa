package com.yandex.mobile.ads.impl;

import android.text.Html;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsJVM;
import kotlin.collections.MapsJVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.C37855d;
import kotlinx.serialization.json.C37868n;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class xn0 {
    @NotNull

    /* renamed from: a */
    public static final xn0 f87755a = new xn0();
    @NotNull

    /* renamed from: b */
    private static final Json f87756b = C37868n.m15882b(null, C31831a.f87757b, 1, null);

    /* renamed from: com.yandex.mobile.ads.impl.xn0$a */
    /* loaded from: classes8.dex */
    static final class C31831a extends Lambda implements Function1<C37855d, Unit> {

        /* renamed from: b */
        public static final C31831a f87757b = new C31831a();

        C31831a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C37855d c37855d) {
            C37855d Json = c37855d;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.m15938e(false);
            Json.m15937f(true);
            return Unit.f99208a;
        }
    }

    private xn0() {
    }

    @NotNull
    /* renamed from: a */
    public static String m27451a(@NotNull String str, @NotNull JSONObject jSONObject) throws JSONException {
        String m27867a = wn0.m27867a(jSONObject, "jsonObject", str, "key", str);
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f("null", m27867a)) {
            return String.valueOf(Html.fromHtml(m27867a));
        }
        throw new JSONException("Json value can not be null or empty");
    }

    @Nullable
    /* renamed from: b */
    public static final Integer m27449b(@NotNull String name, @NotNull JSONObject jsonObject) {
        Object m14549b;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(Integer.valueOf(jsonObject.getInt(name)));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        return (Integer) m14549b;
    }

    @Nullable
    /* renamed from: c */
    public static List m27448c(@NotNull String name, @NotNull JSONObject parent) {
        List m17177c;
        List m17179a;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(name, "name");
        JSONArray optJSONArray = parent.optJSONArray(name);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            m17177c = CollectionsJVM.m17177c();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                f87755a.getClass();
                if (optString != null && optString.length() != 0 && !Intrinsics.m17075f("null", optString)) {
                    Intrinsics.m17074g(optString);
                    m17177c.add(optString);
                }
            }
            m17179a = CollectionsJVM.m17179a(m17177c);
            return m17179a;
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static Map m27450a(@NotNull JSONObject parent) {
        Map m17294d;
        Map m17295c;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter("bidding_info", "name");
        JSONObject optJSONObject = parent.optJSONObject("bidding_info");
        if (optJSONObject != null) {
            m17294d = MapsJVM.m17294d();
            Iterator<String> keys = optJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                f87755a.getClass();
                if (optString != null && optString.length() != 0 && !Intrinsics.m17075f("null", optString)) {
                    Intrinsics.m17074g(next);
                    Intrinsics.m17074g(optString);
                    m17294d.put(next, optString);
                }
            }
            m17295c = MapsJVM.m17295c(m17294d);
            return m17295c;
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static final JSONObject m27452a(@NotNull String content) {
        Object m14549b;
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(new JSONObject(content));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        return (JSONObject) m14549b;
    }

    @NotNull
    /* renamed from: a */
    public static Json m27453a() {
        return f87756b;
    }
}
