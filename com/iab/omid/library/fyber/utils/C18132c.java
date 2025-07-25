package com.iab.omid.library.fyber.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.adsession.OutputDeviceStatus;
import com.iab.omid.library.fyber.internal.C18112e;
import com.iab.omid.library.fyber.walking.C18145a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.utils.c */
/* loaded from: classes6.dex */
public class C18132c {

    /* renamed from: a */
    private static WindowManager f45614a;

    /* renamed from: b */
    private static String[] f45615b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f45616c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.fyber.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18133a {

        /* renamed from: a */
        static final /* synthetic */ int[] f45617a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f45617a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.fyber.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18134b {

        /* renamed from: a */
        final float f45618a;

        /* renamed from: b */
        final float f45619b;

        C18134b(float f, float f2) {
            this.f45618a = f;
            this.f45619b = f2;
        }
    }

    /* renamed from: a */
    static float m63882a(int i) {
        return i / f45616c;
    }

    /* renamed from: b */
    public static void m63870b(JSONObject jSONObject) {
        C18134b m63877a = m63877a(jSONObject);
        try {
            jSONObject.put("width", m63877a.f45618a);
            jSONObject.put("height", m63877a.f45619b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m63866c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m63878a(optJSONArray, optJSONArray2)) {
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
    private static boolean m63865d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m63864e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m63863f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f45615b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m63862g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m63861h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m63863f(jSONObject, jSONObject2) && m63862g(jSONObject, jSONObject2) && m63864e(jSONObject, jSONObject2) && m63865d(jSONObject, jSONObject2) && m63866c(jSONObject, jSONObject2) && m63867b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18134b m63877a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f45614a != null) {
            Point point = new Point(0, 0);
            f45614a.getDefaultDisplay().getRealSize(point);
            f = m63882a(point.x);
            f2 = m63882a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18134b(f, f2);
    }

    /* renamed from: b */
    public static void m63869b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C18135d.m63859a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m63881a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m63882a(i));
            jSONObject.put("y", m63882a(i2));
            jSONObject.put("width", m63882a(i3));
            jSONObject.put("height", m63882a(i4));
        } catch (JSONException e) {
            C18135d.m63859a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m63868b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18135d.m63859a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m63880a(Context context) {
        if (context != null) {
            f45616c = context.getResources().getDisplayMetrics().density;
            f45614a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m63867b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m63878a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m63861h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m63876a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m63879a(outputDeviceStatus));
        } catch (JSONException e) {
            C18135d.m63859a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m63875a(JSONObject jSONObject, C18145a.C18146a c18146a) {
        C18112e m63794a = c18146a.m63794a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18146a.m63792b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m63794a.m63965d());
            jSONObject.put("friendlyObstructionPurpose", m63794a.m63967b());
            jSONObject.put("friendlyObstructionReason", m63794a.m63968a());
        } catch (JSONException e) {
            C18135d.m63859a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m63874a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18135d.m63859a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m63873a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18135d.m63859a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m63872a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18135d.m63859a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m63871a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m63879a(OutputDeviceStatus outputDeviceStatus) {
        return C18133a.f45617a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m63878a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
