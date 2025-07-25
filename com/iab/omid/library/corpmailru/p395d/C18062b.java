package com.iab.omid.library.corpmailru.p395d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.corpmailru.p393b.C18050c;
import com.iab.omid.library.corpmailru.walking.C18077a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.d.b */
/* loaded from: classes6.dex */
public class C18062b {

    /* renamed from: b */
    private static WindowManager f45470b;

    /* renamed from: c */
    private static String[] f45471c = {"x", "y", "width", "height"};

    /* renamed from: a */
    static float f45469a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.iab.omid.library.corpmailru.d.b$a */
    /* loaded from: classes6.dex */
    public static class C18063a {

        /* renamed from: a */
        final float f45472a;

        /* renamed from: b */
        final float f45473b;

        public C18063a(float f, float f2) {
            this.f45472a = f;
            this.f45473b = f2;
        }
    }

    /* renamed from: a */
    public static float m64142a(int i) {
        return i / f45469a;
    }

    /* renamed from: b */
    private static C18063a m64133b(JSONObject jSONObject) {
        float f;
        float f2;
        if (f45470b != null) {
            Point point = new Point(0, 0);
            f45470b.getDefaultDisplay().getRealSize(point);
            f = m64142a(point.x);
            f2 = m64142a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18063a(f, f2);
    }

    /* renamed from: c */
    private static boolean m64130c(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f45471c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m64129d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m64128e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m64139a(optJSONArray, optJSONArray2)) {
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
    private static boolean m64127f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m64139a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m64131b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static JSONObject m64141a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m64142a(i));
            jSONObject.put("y", m64142a(i2));
            jSONObject.put("width", m64142a(i3));
            jSONObject.put("height", m64142a(i4));
        } catch (JSONException e) {
            C18064c.m64125a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m64132b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18064c.m64125a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m64140a(Context context) {
        if (context != null) {
            f45469a = context.getResources().getDisplayMetrics().density;
            f45470b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    public static boolean m64131b(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m64130c(jSONObject, jSONObject2) && m64129d(jSONObject, jSONObject2) && m64128e(jSONObject, jSONObject2) && m64127f(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m64138a(JSONObject jSONObject) {
        C18063a m64133b = m64133b(jSONObject);
        try {
            jSONObject.put("width", m64133b.f45472a);
            jSONObject.put("height", m64133b.f45473b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m64137a(JSONObject jSONObject, C18077a.C18078a c18078a) {
        C18050c m64047a = c18078a.m64047a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18078a.m64045b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m64047a.m64190b());
            jSONObject.put("friendlyObstructionPurpose", m64047a.m64189c());
            jSONObject.put("friendlyObstructionReason", m64047a.m64188d());
        } catch (JSONException e) {
            C18064c.m64125a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m64136a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18064c.m64125a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m64135a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C18064c.m64125a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m64134a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m64139a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
