package com.iab.omid.library.appodeal.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.adsession.OutputDeviceStatus;
import com.iab.omid.library.appodeal.internal.C17880e;
import com.iab.omid.library.appodeal.walking.C17913a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.utils.c */
/* loaded from: classes6.dex */
public class C17900c {

    /* renamed from: a */
    private static WindowManager f45115a;

    /* renamed from: b */
    private static String[] f45116b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f45117c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.appodeal.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C17901a {

        /* renamed from: a */
        static final /* synthetic */ int[] f45118a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f45118a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.appodeal.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C17902b {

        /* renamed from: a */
        final float f45119a;

        /* renamed from: b */
        final float f45120b;

        C17902b(float f, float f2) {
            this.f45119a = f;
            this.f45120b = f2;
        }
    }

    /* renamed from: a */
    static float m64799a(int i) {
        return i / f45117c;
    }

    /* renamed from: b */
    public static void m64787b(JSONObject jSONObject) {
        C17902b m64794a = m64794a(jSONObject);
        try {
            jSONObject.put("width", m64794a.f45119a);
            jSONObject.put("height", m64794a.f45120b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m64783c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m64795a(optJSONArray, optJSONArray2)) {
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
    private static boolean m64782d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m64781e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m64780f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f45116b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m64779g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m64778h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m64780f(jSONObject, jSONObject2) && m64779g(jSONObject, jSONObject2) && m64781e(jSONObject, jSONObject2) && m64782d(jSONObject, jSONObject2) && m64783c(jSONObject, jSONObject2) && m64784b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C17902b m64794a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f45115a != null) {
            Point point = new Point(0, 0);
            f45115a.getDefaultDisplay().getRealSize(point);
            f = m64799a(point.x);
            f2 = m64799a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C17902b(f, f2);
    }

    /* renamed from: b */
    public static void m64786b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C17903d.m64776a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m64798a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m64799a(i));
            jSONObject.put("y", m64799a(i2));
            jSONObject.put("width", m64799a(i3));
            jSONObject.put("height", m64799a(i4));
        } catch (JSONException e) {
            C17903d.m64776a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m64785b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C17903d.m64776a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m64797a(Context context) {
        if (context != null) {
            f45117c = context.getResources().getDisplayMetrics().density;
            f45115a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m64784b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m64795a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m64778h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m64793a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m64796a(outputDeviceStatus));
        } catch (JSONException e) {
            C17903d.m64776a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m64792a(JSONObject jSONObject, C17913a.C17914a c17914a) {
        C17880e m64711a = c17914a.m64711a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c17914a.m64709b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m64711a.m64882d());
            jSONObject.put("friendlyObstructionPurpose", m64711a.m64884b());
            jSONObject.put("friendlyObstructionReason", m64711a.m64885a());
        } catch (JSONException e) {
            C17903d.m64776a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m64791a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C17903d.m64776a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m64790a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C17903d.m64776a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m64789a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C17903d.m64776a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m64788a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m64796a(OutputDeviceStatus outputDeviceStatus) {
        return C17901a.f45118a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m64795a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
