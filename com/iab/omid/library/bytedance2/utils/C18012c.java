package com.iab.omid.library.bytedance2.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus;
import com.iab.omid.library.bytedance2.internal.C17994e;
import com.iab.omid.library.bytedance2.walking.C18025a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.utils.c */
/* loaded from: classes6.dex */
public class C18012c {

    /* renamed from: a */
    private static WindowManager f45366a;

    /* renamed from: b */
    private static String[] f45367b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f45368c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.bytedance2.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18013a {

        /* renamed from: a */
        static final /* synthetic */ int[] f45369a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f45369a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.bytedance2.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18014b {

        /* renamed from: a */
        final float f45370a;

        /* renamed from: b */
        final float f45371b;

        C18014b(float f, float f2) {
            this.f45370a = f;
            this.f45371b = f2;
        }
    }

    /* renamed from: a */
    static float m64340a(int i) {
        return i / f45368c;
    }

    /* renamed from: b */
    public static void m64328b(JSONObject jSONObject) {
        C18014b m64335a = m64335a(jSONObject);
        try {
            jSONObject.put("width", m64335a.f45370a);
            jSONObject.put("height", m64335a.f45371b);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    private static boolean m64325c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m64336a(optJSONArray, optJSONArray2)) {
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
    private static boolean m64324d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m64323e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m64322f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f45367b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m64321g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m64320h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null && m64322f(jSONObject, jSONObject2) && m64321g(jSONObject, jSONObject2) && m64323e(jSONObject, jSONObject2) && m64324d(jSONObject, jSONObject2) && m64325c(jSONObject, jSONObject2) && m64326b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18014b m64335a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f45366a != null) {
            Point point = new Point(0, 0);
            f45366a.getDefaultDisplay().getRealSize(point);
            f = m64340a(point.x);
            f2 = m64340a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18014b(f, f2);
    }

    /* renamed from: b */
    public static void m64327b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18015d.m64318a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m64339a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m64340a(i));
            jSONObject.put("y", m64340a(i2));
            jSONObject.put("width", m64340a(i3));
            jSONObject.put("height", m64340a(i4));
        } catch (JSONException e) {
            C18015d.m64318a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static boolean m64326b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m64336a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m64320h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m64338a(Context context) {
        if (context != null) {
            f45368c = context.getResources().getDisplayMetrics().density;
            f45366a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m64334a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m64337a(outputDeviceStatus));
        } catch (JSONException e) {
            C18015d.m64318a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m64333a(JSONObject jSONObject, C18025a.C18026a c18026a) {
        C17994e m64256a = c18026a.m64256a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18026a.m64254b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m64256a.m64415d());
            jSONObject.put("friendlyObstructionPurpose", m64256a.m64417b());
            jSONObject.put("friendlyObstructionReason", m64256a.m64418a());
        } catch (JSONException e) {
            C18015d.m64318a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m64332a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18015d.m64318a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m64331a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18015d.m64318a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m64330a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18015d.m64318a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m64329a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m64337a(OutputDeviceStatus outputDeviceStatus) {
        return C18013a.f45369a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m64336a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
