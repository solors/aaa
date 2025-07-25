package com.moloco.sdk.internal.publisher.nativead.parser;

import com.moloco.sdk.internal.publisher.nativead.model.C24165a;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.moloco.sdk.internal.publisher.nativead.parser.a */
/* loaded from: classes7.dex */
public final class C24180a {
    /* renamed from: a */
    public final C24165a.AbstractC24166a.C24167a m46823a(JSONObject jSONObject, int i, boolean z) {
        Integer num;
        Integer num2 = null;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            num = Integer.valueOf(jSONObject.getInt("type"));
        } else {
            num = null;
        }
        if (jSONObject.has(POBNativeConstants.NATIVE_LENGTH)) {
            num2 = Integer.valueOf(jSONObject.getInt(POBNativeConstants.NATIVE_LENGTH));
        }
        String string = jSONObject.getString("value");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\"value\")");
        return new C24165a.AbstractC24166a.C24167a(i, z, num, num2, string);
    }

    /* renamed from: b */
    public final C24165a.C24172c m46822b(JSONObject jSONObject) {
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        String url = jSONObject.getString("url");
        if (jSONObject.has(POBNativeConstants.NATIVE_FALLBACK_URL)) {
            str = jSONObject.getString(POBNativeConstants.NATIVE_FALLBACK_URL);
        }
        List<String> m46816h = m46816h(jSONObject.optJSONArray(POBNativeConstants.NATIVE_CLICK_TRACKER));
        Intrinsics.checkNotNullExpressionValue(url, "url");
        return new C24165a.C24172c(url, m46816h, str);
    }

    @NotNull
    /* renamed from: c */
    public final Object m46821c(@NotNull String nativeOrtbString) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(nativeOrtbString, "nativeOrtbString");
        try {
            JSONObject jSONObject = new JSONObject(nativeOrtbString);
            JSONObject optJSONObject = jSONObject.optJSONObject("native");
            if (optJSONObject != null) {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "it.optJSONObject(\"native\") ?: it");
                jSONObject = optJSONObject;
            }
            Result.C38506a c38506a = Result.f101870c;
            if (jSONObject.has(POBNativeConstants.NATIVE_VERSION)) {
                str = jSONObject.getString(POBNativeConstants.NATIVE_VERSION);
            } else {
                str = null;
            }
            List<C24165a.AbstractC24166a> m46820d = m46820d(jSONObject.optJSONArray(POBNativeConstants.NATIVE_ASSETS));
            C24165a.C24172c m46822b = m46822b(jSONObject.optJSONObject("link"));
            List<String> m46816h = m46816h(jSONObject.optJSONArray(POBNativeConstants.NATIVE_IMPRESSION_TRACKER));
            List<C24165a.C24171b> m46818f = m46818f(jSONObject.optJSONArray(POBNativeConstants.NATIVE_EVENT_TRACKERS));
            if (jSONObject.has("privacy")) {
                str2 = jSONObject.getString("privacy");
            } else {
                str2 = null;
            }
            return Result.m14549b(new C24165a(str, m46820d, m46822b, m46816h, m46818f, str2));
        } catch (Exception e) {
            Result.C38506a c38506a2 = Result.f101870c;
            return Result.m14549b(C38508r.m14540a(e));
        }
    }

    /* renamed from: d */
    public final List<C24165a.AbstractC24166a> m46820d(JSONArray jSONArray) {
        List<C24165a.AbstractC24166a> m17166m;
        if (jSONArray == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("id")) {
                int i2 = jSONObject.getInt("id");
                boolean z = true;
                if (jSONObject.optInt("required", 0) != 1) {
                    z = false;
                }
                Object m46817g = m46817g(jSONObject.optJSONObject("title"), i2, z);
                if (m46817g == null && (m46817g = m46819e(jSONObject.optJSONObject(POBNativeConstants.NATIVE_IMAGE), i2, z)) == null && (m46817g = m46815i(jSONObject.optJSONObject("video"), i2, z)) == null) {
                    m46817g = m46823a(jSONObject.optJSONObject("data"), i2, z);
                }
                if (m46817g != null) {
                    arrayList.add(m46817g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final C24165a.AbstractC24166a.C24168b m46819e(JSONObject jSONObject, int i, boolean z) {
        Integer num;
        Integer num2;
        Integer num3 = null;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            num = Integer.valueOf(jSONObject.getInt("type"));
        } else {
            num = null;
        }
        String string = jSONObject.getString("url");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\"url\")");
        if (jSONObject.has(POBNativeConstants.NATIVE_IMAGE_WIDTH)) {
            num2 = Integer.valueOf(jSONObject.getInt(POBNativeConstants.NATIVE_IMAGE_WIDTH));
        } else {
            num2 = null;
        }
        if (jSONObject.has("h")) {
            num3 = Integer.valueOf(jSONObject.getInt("h"));
        }
        return new C24165a.AbstractC24166a.C24168b(i, z, num, string, num2, num3);
    }

    /* renamed from: f */
    public final List<C24165a.C24171b> m46818f(JSONArray jSONArray) {
        String str;
        List<C24165a.C24171b> m17166m;
        if (jSONArray == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            int i2 = jSONObject.getInt("event");
            int i3 = jSONObject.getInt("method");
            if (jSONObject.has("url")) {
                str = jSONObject.getString("url");
            } else {
                str = null;
            }
            arrayList.add(new C24165a.C24171b(i2, i3, str));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C24165a.AbstractC24166a.C24169c m46817g(JSONObject jSONObject, int i, boolean z) {
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("text");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\"text\")");
        if (jSONObject.has(POBNativeConstants.NATIVE_LENGTH)) {
            num = Integer.valueOf(jSONObject.getInt(POBNativeConstants.NATIVE_LENGTH));
        }
        return new C24165a.AbstractC24166a.C24169c(i, z, string, num);
    }

    /* renamed from: h */
    public final List<String> m46816h(JSONArray jSONArray) {
        List<String> m17166m;
        if (jSONArray == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final C24165a.AbstractC24166a.C24170d m46815i(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("vasttag");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\"vasttag\")");
        return new C24165a.AbstractC24166a.C24170d(i, z, string);
    }
}
