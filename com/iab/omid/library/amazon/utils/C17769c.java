package com.iab.omid.library.amazon.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.amazon.adsession.OutputDeviceStatus;
import com.iab.omid.library.amazon.internal.C17751e;
import com.iab.omid.library.amazon.walking.C17782a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.utils.c */
/* loaded from: classes6.dex */
public class C17769c {

    /* renamed from: a */
    private static WindowManager f44852a;

    /* renamed from: b */
    private static String[] f44853b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f44854c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.amazon.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C17770a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44855a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f44855a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.amazon.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C17771b {

        /* renamed from: a */
        final float f44856a;

        /* renamed from: b */
        final float f44857b;

        C17771b(float f, float f2) {
            this.f44856a = f;
            this.f44857b = f2;
        }
    }

    /* renamed from: a */
    static float m65289a(int i) {
        return i / f44854c;
    }

    /* renamed from: b */
    public static void m65277b(JSONObject jSONObject) {
        C17771b m65284a = m65284a(jSONObject);
        try {
            jSONObject.put("width", m65284a.f44856a);
            jSONObject.put("height", m65284a.f44857b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m65274c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m65285a(optJSONArray, optJSONArray2)) {
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
    private static boolean m65273d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m65272e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m65271f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f44853b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m65270g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m65269h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m65271f(jSONObject, jSONObject2) && m65270g(jSONObject, jSONObject2) && m65272e(jSONObject, jSONObject2) && m65273d(jSONObject, jSONObject2) && m65274c(jSONObject, jSONObject2) && m65275b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C17771b m65284a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f44852a != null) {
            Point point = new Point(0, 0);
            f44852a.getDefaultDisplay().getRealSize(point);
            f = m65289a(point.x);
            f2 = m65289a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C17771b(f, f2);
    }

    /* renamed from: b */
    public static void m65276b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C17772d.m65267a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m65288a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m65289a(i));
            jSONObject.put("y", m65289a(i2));
            jSONObject.put("width", m65289a(i3));
            jSONObject.put("height", m65289a(i4));
        } catch (JSONException e) {
            C17772d.m65267a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static boolean m65275b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m65285a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m65269h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m65287a(Context context) {
        if (context != null) {
            f44854c = context.getResources().getDisplayMetrics().density;
            f44852a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m65283a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m65286a(outputDeviceStatus));
        } catch (JSONException e) {
            C17772d.m65267a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m65282a(JSONObject jSONObject, C17782a.C17783a c17783a) {
        C17751e m65205a = c17783a.m65205a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c17783a.m65203b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m65205a.m65364d());
            jSONObject.put("friendlyObstructionPurpose", m65205a.m65366b());
            jSONObject.put("friendlyObstructionReason", m65205a.m65367a());
        } catch (JSONException e) {
            C17772d.m65267a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m65281a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C17772d.m65267a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m65280a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C17772d.m65267a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m65279a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C17772d.m65267a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m65278a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m65286a(OutputDeviceStatus outputDeviceStatus) {
        return C17770a.f44855a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m65285a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
