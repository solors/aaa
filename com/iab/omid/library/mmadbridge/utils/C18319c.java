package com.iab.omid.library.mmadbridge.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.OutputDeviceStatus;
import com.iab.omid.library.mmadbridge.internal.C18299e;
import com.iab.omid.library.mmadbridge.walking.C18332a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.utils.c */
/* loaded from: classes6.dex */
public class C18319c {

    /* renamed from: a */
    private static WindowManager f46003a;

    /* renamed from: b */
    private static String[] f46004b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f46005c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.mmadbridge.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18320a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46006a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f46006a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.mmadbridge.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18321b {

        /* renamed from: a */
        final float f46007a;

        /* renamed from: b */
        final float f46008b;

        C18321b(float f, float f2) {
            this.f46007a = f;
            this.f46008b = f2;
        }
    }

    /* renamed from: a */
    static float m63153a(int i) {
        return i / f46005c;
    }

    /* renamed from: b */
    public static void m63141b(JSONObject jSONObject) {
        C18321b m63148a = m63148a(jSONObject);
        try {
            jSONObject.put("width", m63148a.f46007a);
            jSONObject.put("height", m63148a.f46008b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m63137c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m63149a(optJSONArray, optJSONArray2)) {
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
    private static boolean m63136d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m63135e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m63134f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f46004b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m63133g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m63132h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m63134f(jSONObject, jSONObject2) && m63133g(jSONObject, jSONObject2) && m63135e(jSONObject, jSONObject2) && m63136d(jSONObject, jSONObject2) && m63137c(jSONObject, jSONObject2) && m63138b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18321b m63148a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f46003a != null) {
            Point point = new Point(0, 0);
            f46003a.getDefaultDisplay().getRealSize(point);
            f = m63153a(point.x);
            f2 = m63153a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18321b(f, f2);
    }

    /* renamed from: b */
    public static void m63140b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C18322d.m63130a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m63152a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m63153a(i));
            jSONObject.put("y", m63153a(i2));
            jSONObject.put("width", m63153a(i3));
            jSONObject.put("height", m63153a(i4));
        } catch (JSONException e) {
            C18322d.m63130a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m63139b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18322d.m63130a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m63151a(Context context) {
        if (context != null) {
            f46005c = context.getResources().getDisplayMetrics().density;
            f46003a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m63138b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m63149a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m63132h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m63147a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m63150a(outputDeviceStatus));
        } catch (JSONException e) {
            C18322d.m63130a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m63146a(JSONObject jSONObject, C18332a.C18333a c18333a) {
        C18299e m63065a = c18333a.m63065a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18333a.m63063b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m63065a.m63236d());
            jSONObject.put("friendlyObstructionPurpose", m63065a.m63238b());
            jSONObject.put("friendlyObstructionReason", m63065a.m63239a());
        } catch (JSONException e) {
            C18322d.m63130a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m63145a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18322d.m63130a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m63144a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18322d.m63130a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m63143a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18322d.m63130a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m63142a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m63150a(OutputDeviceStatus outputDeviceStatus) {
        return C18320a.f46006a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m63149a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
