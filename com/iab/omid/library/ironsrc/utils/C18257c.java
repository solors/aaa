package com.iab.omid.library.ironsrc.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.OutputDeviceStatus;
import com.iab.omid.library.ironsrc.internal.C18241e;
import com.iab.omid.library.ironsrc.walking.C18269a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.utils.c */
/* loaded from: classes6.dex */
public class C18257c {

    /* renamed from: a */
    private static WindowManager f45869a;

    /* renamed from: b */
    private static String[] f45870b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f45871c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.ironsrc.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18258a {

        /* renamed from: a */
        static final /* synthetic */ int[] f45872a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f45872a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.ironsrc.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18259b {

        /* renamed from: a */
        final float f45873a;

        /* renamed from: b */
        final float f45874b;

        C18259b(float f, float f2) {
            this.f45873a = f;
            this.f45874b = f2;
        }
    }

    /* renamed from: a */
    static float m63399a(int i) {
        return i / f45871c;
    }

    /* renamed from: b */
    public static void m63387b(JSONObject jSONObject) {
        C18259b m63394a = m63394a(jSONObject);
        try {
            jSONObject.put("width", m63394a.f45873a);
            jSONObject.put("height", m63394a.f45874b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m63384c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m63395a(optJSONArray, optJSONArray2)) {
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
    private static boolean m63383d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m63382e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m63381f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f45870b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m63380g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m63379h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m63381f(jSONObject, jSONObject2) && m63380g(jSONObject, jSONObject2) && m63382e(jSONObject, jSONObject2) && m63383d(jSONObject, jSONObject2) && m63384c(jSONObject, jSONObject2) && m63385b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18259b m63394a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f45869a != null) {
            Point point = new Point(0, 0);
            f45869a.getDefaultDisplay().getRealSize(point);
            f = m63399a(point.x);
            f2 = m63399a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18259b(f, f2);
    }

    /* renamed from: b */
    public static void m63386b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18260d.m63377a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m63398a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m63399a(i));
            jSONObject.put("y", m63399a(i2));
            jSONObject.put("width", m63399a(i3));
            jSONObject.put("height", m63399a(i4));
        } catch (JSONException e) {
            C18260d.m63377a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static boolean m63385b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m63395a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m63379h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m63397a(Context context) {
        if (context != null) {
            f45871c = context.getResources().getDisplayMetrics().density;
            f45869a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m63393a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m63396a(outputDeviceStatus));
        } catch (JSONException e) {
            C18260d.m63377a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m63392a(JSONObject jSONObject, C18269a.C18270a c18270a) {
        C18241e m63318a = c18270a.m63318a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18270a.m63316b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m63318a.m63468d());
            jSONObject.put("friendlyObstructionPurpose", m63318a.m63470b());
            jSONObject.put("friendlyObstructionReason", m63318a.m63471a());
        } catch (JSONException e) {
            C18260d.m63377a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m63391a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18260d.m63377a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m63390a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18260d.m63377a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m63389a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18260d.m63377a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m63388a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m63396a(OutputDeviceStatus outputDeviceStatus) {
        return C18258a.f45872a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m63395a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
