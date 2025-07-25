package com.iab.omid.library.pubnativenet.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubnativenet.adsession.OutputDeviceStatus;
import com.iab.omid.library.pubnativenet.internal.C18509e;
import com.iab.omid.library.pubnativenet.walking.C18542a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.utils.c */
/* loaded from: classes6.dex */
public class C18529c {

    /* renamed from: a */
    private static WindowManager f46408a;

    /* renamed from: b */
    private static String[] f46409b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f46410c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.pubnativenet.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18530a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46411a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f46411a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.pubnativenet.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18531b {

        /* renamed from: a */
        final float f46412a;

        /* renamed from: b */
        final float f46413b;

        C18531b(float f, float f2) {
            this.f46412a = f;
            this.f46413b = f2;
        }
    }

    /* renamed from: a */
    static float m62394a(int i) {
        return i / f46410c;
    }

    /* renamed from: b */
    public static void m62382b(JSONObject jSONObject) {
        C18531b m62389a = m62389a(jSONObject);
        try {
            jSONObject.put("width", m62389a.f46412a);
            jSONObject.put("height", m62389a.f46413b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m62378c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m62390a(optJSONArray, optJSONArray2)) {
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
    private static boolean m62377d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m62376e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m62375f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f46409b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m62374g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m62373h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m62375f(jSONObject, jSONObject2) && m62374g(jSONObject, jSONObject2) && m62376e(jSONObject, jSONObject2) && m62377d(jSONObject, jSONObject2) && m62378c(jSONObject, jSONObject2) && m62379b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18531b m62389a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f46408a != null) {
            Point point = new Point(0, 0);
            f46408a.getDefaultDisplay().getRealSize(point);
            f = m62394a(point.x);
            f2 = m62394a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18531b(f, f2);
    }

    /* renamed from: b */
    public static void m62381b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C18532d.m62371a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m62393a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m62394a(i));
            jSONObject.put("y", m62394a(i2));
            jSONObject.put("width", m62394a(i3));
            jSONObject.put("height", m62394a(i4));
        } catch (JSONException e) {
            C18532d.m62371a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m62380b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18532d.m62371a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m62392a(Context context) {
        if (context != null) {
            f46410c = context.getResources().getDisplayMetrics().density;
            f46408a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m62379b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m62390a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m62373h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m62388a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m62391a(outputDeviceStatus));
        } catch (JSONException e) {
            C18532d.m62371a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m62387a(JSONObject jSONObject, C18542a.C18543a c18543a) {
        C18509e m62306a = c18543a.m62306a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18543a.m62304b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m62306a.m62477d());
            jSONObject.put("friendlyObstructionPurpose", m62306a.m62479b());
            jSONObject.put("friendlyObstructionReason", m62306a.m62480a());
        } catch (JSONException e) {
            C18532d.m62371a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m62386a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18532d.m62371a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m62385a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18532d.m62371a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m62384a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18532d.m62371a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m62383a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m62391a(OutputDeviceStatus outputDeviceStatus) {
        return C18530a.f46411a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m62390a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
