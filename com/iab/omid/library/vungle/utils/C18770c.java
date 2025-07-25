package com.iab.omid.library.vungle.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.OutputDeviceStatus;
import com.iab.omid.library.vungle.internal.C18750e;
import com.iab.omid.library.vungle.walking.C18783a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.utils.c */
/* loaded from: classes6.dex */
public class C18770c {

    /* renamed from: a */
    private static WindowManager f46934a;

    /* renamed from: b */
    private static String[] f46935b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f46936c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.vungle.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18771a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46937a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f46937a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.vungle.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18772b {

        /* renamed from: a */
        final float f46938a;

        /* renamed from: b */
        final float f46939b;

        C18772b(float f, float f2) {
            this.f46938a = f;
            this.f46939b = f2;
        }
    }

    /* renamed from: a */
    static float m61419a(int i) {
        return i / f46936c;
    }

    /* renamed from: b */
    public static void m61407b(JSONObject jSONObject) {
        C18772b m61414a = m61414a(jSONObject);
        try {
            jSONObject.put("width", m61414a.f46938a);
            jSONObject.put("height", m61414a.f46939b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m61403c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m61415a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m61402d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m61401e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m61400f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f46935b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m61399g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m61398h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m61400f(jSONObject, jSONObject2) && m61399g(jSONObject, jSONObject2) && m61401e(jSONObject, jSONObject2) && m61402d(jSONObject, jSONObject2) && m61403c(jSONObject, jSONObject2) && m61404b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18772b m61414a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f46934a != null) {
            Point point = new Point(0, 0);
            f46934a.getDefaultDisplay().getRealSize(point);
            f = m61419a(point.x);
            f2 = m61419a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18772b(f, f2);
    }

    /* renamed from: b */
    public static void m61406b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C18773d.m61396a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m61418a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m61419a(i));
            jSONObject.put("y", m61419a(i2));
            jSONObject.put("width", m61419a(i3));
            jSONObject.put("height", m61419a(i4));
        } catch (JSONException e) {
            C18773d.m61396a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m61405b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18773d.m61396a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m61417a(Context context) {
        if (context != null) {
            f46936c = context.getResources().getDisplayMetrics().density;
            f46934a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m61404b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m61415a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m61398h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m61413a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m61416a(outputDeviceStatus));
        } catch (JSONException e) {
            C18773d.m61396a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m61412a(JSONObject jSONObject, C18783a.C18784a c18784a) {
        C18750e m61331a = c18784a.m61331a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18784a.m61329b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m61331a.m61502d());
            jSONObject.put("friendlyObstructionPurpose", m61331a.m61504b());
            jSONObject.put("friendlyObstructionReason", m61331a.m61505a());
        } catch (JSONException e) {
            C18773d.m61396a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m61411a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18773d.m61396a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m61410a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18773d.m61396a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m61409a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18773d.m61396a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m61408a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m61416a(OutputDeviceStatus outputDeviceStatus) {
        return C18771a.f46937a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m61415a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
