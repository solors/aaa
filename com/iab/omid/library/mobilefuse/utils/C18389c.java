package com.iab.omid.library.mobilefuse.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.adsession.OutputDeviceStatus;
import com.iab.omid.library.mobilefuse.internal.C18369e;
import com.iab.omid.library.mobilefuse.walking.C18402a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.utils.c */
/* loaded from: classes6.dex */
public class C18389c {

    /* renamed from: a */
    private static WindowManager f46138a;

    /* renamed from: b */
    private static String[] f46139b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f46140c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.mobilefuse.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18390a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46141a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f46141a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.mobilefuse.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18391b {

        /* renamed from: a */
        final float f46142a;

        /* renamed from: b */
        final float f46143b;

        C18391b(float f, float f2) {
            this.f46142a = f;
            this.f46143b = f2;
        }
    }

    /* renamed from: a */
    static float m62900a(int i) {
        return i / f46140c;
    }

    /* renamed from: b */
    public static void m62888b(JSONObject jSONObject) {
        C18391b m62895a = m62895a(jSONObject);
        try {
            jSONObject.put("width", m62895a.f46142a);
            jSONObject.put("height", m62895a.f46143b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m62884c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m62896a(optJSONArray, optJSONArray2)) {
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
    private static boolean m62883d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m62882e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m62881f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f46139b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m62880g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m62879h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m62881f(jSONObject, jSONObject2) && m62880g(jSONObject, jSONObject2) && m62882e(jSONObject, jSONObject2) && m62883d(jSONObject, jSONObject2) && m62884c(jSONObject, jSONObject2) && m62885b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18391b m62895a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f46138a != null) {
            Point point = new Point(0, 0);
            f46138a.getDefaultDisplay().getRealSize(point);
            f = m62900a(point.x);
            f2 = m62900a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18391b(f, f2);
    }

    /* renamed from: b */
    public static void m62887b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C18392d.m62877a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m62899a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m62900a(i));
            jSONObject.put("y", m62900a(i2));
            jSONObject.put("width", m62900a(i3));
            jSONObject.put("height", m62900a(i4));
        } catch (JSONException e) {
            C18392d.m62877a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m62886b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18392d.m62877a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m62898a(Context context) {
        if (context != null) {
            f46140c = context.getResources().getDisplayMetrics().density;
            f46138a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m62885b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m62896a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m62879h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m62894a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m62897a(outputDeviceStatus));
        } catch (JSONException e) {
            C18392d.m62877a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m62893a(JSONObject jSONObject, C18402a.C18403a c18403a) {
        C18369e m62812a = c18403a.m62812a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18403a.m62810b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m62812a.m62983d());
            jSONObject.put("friendlyObstructionPurpose", m62812a.m62985b());
            jSONObject.put("friendlyObstructionReason", m62812a.m62986a());
        } catch (JSONException e) {
            C18392d.m62877a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m62892a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18392d.m62877a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m62891a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18392d.m62877a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m62890a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18392d.m62877a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m62889a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m62897a(OutputDeviceStatus outputDeviceStatus) {
        return C18390a.f46141a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m62896a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
