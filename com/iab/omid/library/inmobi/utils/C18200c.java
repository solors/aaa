package com.iab.omid.library.inmobi.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.OutputDeviceStatus;
import com.iab.omid.library.inmobi.internal.C18182e;
import com.iab.omid.library.inmobi.walking.C18213a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.utils.c */
/* loaded from: classes6.dex */
public class C18200c {

    /* renamed from: a */
    private static WindowManager f45744a;

    /* renamed from: b */
    private static String[] f45745b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f45746c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.inmobi.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18201a {

        /* renamed from: a */
        static final /* synthetic */ int[] f45747a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f45747a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.inmobi.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18202b {

        /* renamed from: a */
        final float f45748a;

        /* renamed from: b */
        final float f45749b;

        C18202b(float f, float f2) {
            this.f45748a = f;
            this.f45749b = f2;
        }
    }

    /* renamed from: a */
    static float m63637a(int i) {
        return i / f45746c;
    }

    /* renamed from: b */
    public static void m63625b(JSONObject jSONObject) {
        C18202b m63632a = m63632a(jSONObject);
        try {
            jSONObject.put("width", m63632a.f45748a);
            jSONObject.put("height", m63632a.f45749b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m63622c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m63633a(optJSONArray, optJSONArray2)) {
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
    private static boolean m63621d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m63620e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m63619f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f45745b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m63618g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m63617h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m63619f(jSONObject, jSONObject2) && m63618g(jSONObject, jSONObject2) && m63620e(jSONObject, jSONObject2) && m63621d(jSONObject, jSONObject2) && m63622c(jSONObject, jSONObject2) && m63623b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18202b m63632a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f45744a != null) {
            Point point = new Point(0, 0);
            f45744a.getDefaultDisplay().getRealSize(point);
            f = m63637a(point.x);
            f2 = m63637a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18202b(f, f2);
    }

    /* renamed from: b */
    public static void m63624b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18203d.m63615a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m63636a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m63637a(i));
            jSONObject.put("y", m63637a(i2));
            jSONObject.put("width", m63637a(i3));
            jSONObject.put("height", m63637a(i4));
        } catch (JSONException e) {
            C18203d.m63615a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static boolean m63623b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m63633a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m63617h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m63635a(Context context) {
        if (context != null) {
            f45746c = context.getResources().getDisplayMetrics().density;
            f45744a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m63631a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m63634a(outputDeviceStatus));
        } catch (JSONException e) {
            C18203d.m63615a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m63630a(JSONObject jSONObject, C18213a.C18214a c18214a) {
        C18182e m63553a = c18214a.m63553a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18214a.m63551b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m63553a.m63712d());
            jSONObject.put("friendlyObstructionPurpose", m63553a.m63714b());
            jSONObject.put("friendlyObstructionReason", m63553a.m63715a());
        } catch (JSONException e) {
            C18203d.m63615a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m63629a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18203d.m63615a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m63628a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18203d.m63615a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m63627a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18203d.m63615a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m63626a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m63634a(OutputDeviceStatus outputDeviceStatus) {
        return C18201a.f45747a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m63633a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
