package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.chartboost.sdk.impl.C9934hc;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.xc */
/* loaded from: classes3.dex */
public abstract class AbstractC10359xc {

    /* renamed from: a */
    public static WindowManager f23550a;

    /* renamed from: b */
    public static String[] f23551b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f23552c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.chartboost.sdk.impl.xc$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C10360a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23553a;

        static {
            int[] iArr = new int[EnumC9831e8.values().length];
            f23553a = iArr;
            try {
                iArr[EnumC9831e8.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.xc$b */
    /* loaded from: classes3.dex */
    public static class C10361b {

        /* renamed from: a */
        public final float f23554a;

        /* renamed from: b */
        public final float f23555b;

        public C10361b(float f, float f2) {
            this.f23554a = f;
            this.f23555b = f2;
        }
    }

    /* renamed from: a */
    public static float m80059a(int i) {
        return i / f23552c;
    }

    /* renamed from: b */
    public static void m80047b(JSONObject jSONObject) {
        C10361b m80054a = m80054a(jSONObject);
        try {
            jSONObject.put("width", m80054a.f23554a);
            jSONObject.put("height", m80054a.f23555b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m80043c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m80055a(optJSONArray, optJSONArray2)) {
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
    public static boolean m80042d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    public static boolean m80041e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    public static boolean m80040f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f23551b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m80039g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m80038h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m80040f(jSONObject, jSONObject2) && m80039g(jSONObject, jSONObject2) && m80041e(jSONObject, jSONObject2) && m80042d(jSONObject, jSONObject2) && m80043c(jSONObject, jSONObject2) && m80044b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C10361b m80054a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f23550a != null) {
            Point point = new Point(0, 0);
            f23550a.getDefaultDisplay().getRealSize(point);
            f = m80059a(point.x);
            f2 = m80059a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C10361b(f, f2);
    }

    /* renamed from: b */
    public static void m80046b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                AbstractC9819dd.m81768a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m80058a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m80059a(i));
            jSONObject.put("y", m80059a(i2));
            jSONObject.put("width", m80059a(i3));
            jSONObject.put("height", m80059a(i4));
        } catch (JSONException e) {
            AbstractC9819dd.m81768a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m80045b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            AbstractC9819dd.m81768a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m80057a(Context context) {
        if (context != null) {
            f23552c = context.getResources().getDisplayMetrics().density;
            f23550a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    public static boolean m80044b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m80055a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m80038h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m80053a(JSONObject jSONObject, EnumC9831e8 enumC9831e8) {
        try {
            jSONObject.put("noOutputDevice", m80056a(enumC9831e8));
        } catch (JSONException e) {
            AbstractC9819dd.m81768a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m80052a(JSONObject jSONObject, C9934hc.C9935a c9935a) {
        C9936hd m81461a = c9935a.m81461a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c9935a.m81459b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m81461a.m81455d());
            jSONObject.put("friendlyObstructionPurpose", m81461a.m81457b());
            jSONObject.put("friendlyObstructionReason", m81461a.m81458a());
        } catch (JSONException e) {
            AbstractC9819dd.m81768a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m80051a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            AbstractC9819dd.m81768a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m80050a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            AbstractC9819dd.m81768a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m80049a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            AbstractC9819dd.m81768a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m80048a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    public static boolean m80056a(EnumC9831e8 enumC9831e8) {
        return C10360a.f23553a[enumC9831e8.ordinal()] == 1;
    }

    /* renamed from: a */
    public static boolean m80055a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
