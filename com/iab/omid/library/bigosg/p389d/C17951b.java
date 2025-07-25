package com.iab.omid.library.bigosg.p389d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.p387b.C17939c;
import com.iab.omid.library.bigosg.walking.C17966a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.d.b */
/* loaded from: classes6.dex */
public class C17951b {

    /* renamed from: b */
    private static WindowManager f45228b;

    /* renamed from: c */
    private static String[] f45229c = {"x", "y", "width", "height"};

    /* renamed from: a */
    static float f45227a = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.bigosg.d.b$a */
    /* loaded from: classes6.dex */
    public static class C17952a {

        /* renamed from: a */
        final float f45230a;

        /* renamed from: b */
        final float f45231b;

        C17952a(float f, float f2) {
            this.f45230a = f;
            this.f45231b = f2;
        }
    }

    /* renamed from: a */
    static float m64592a(int i) {
        return i / f45227a;
    }

    /* renamed from: b */
    private static C17952a m64583b(JSONObject jSONObject) {
        float f;
        float f2;
        if (f45228b != null) {
            Point point = new Point(0, 0);
            f45228b.getDefaultDisplay().getRealSize(point);
            f = m64592a(point.x);
            f2 = m64592a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C17952a(f, f2);
    }

    /* renamed from: c */
    private static boolean m64580c(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f45229c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m64579d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m64578e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m64589a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m64577f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m64589a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m64581b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static JSONObject m64591a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m64592a(i));
            jSONObject.put("y", m64592a(i2));
            jSONObject.put("width", m64592a(i3));
            jSONObject.put("height", m64592a(i4));
        } catch (JSONException e) {
            C17953c.m64575a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m64582b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C17953c.m64575a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m64590a(Context context) {
        if (context != null) {
            f45227a = context.getResources().getDisplayMetrics().density;
            f45228b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    public static boolean m64581b(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m64580c(jSONObject, jSONObject2) && m64579d(jSONObject, jSONObject2) && m64578e(jSONObject, jSONObject2) && m64577f(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m64588a(JSONObject jSONObject) {
        C17952a m64583b = m64583b(jSONObject);
        try {
            jSONObject.put("width", m64583b.f45230a);
            jSONObject.put("height", m64583b.f45231b);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m64587a(JSONObject jSONObject, C17966a.C17967a c17967a) {
        C17939c m64497a = c17967a.m64497a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c17967a.m64495b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m64497a.m64640b());
            jSONObject.put("friendlyObstructionPurpose", m64497a.m64639c());
            jSONObject.put("friendlyObstructionReason", m64497a.m64638d());
        } catch (JSONException e) {
            C17953c.m64575a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m64586a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C17953c.m64575a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m64585a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C17953c.m64575a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m64584a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static boolean m64589a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
