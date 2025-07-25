package com.iab.omid.library.pubmatic.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.adsession.OutputDeviceStatus;
import com.iab.omid.library.pubmatic.internal.C18439e;
import com.iab.omid.library.pubmatic.walking.C18472a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.utils.c */
/* loaded from: classes6.dex */
public class C18459c {

    /* renamed from: a */
    private static WindowManager f46273a;

    /* renamed from: b */
    private static String[] f46274b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f46275c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.pubmatic.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18460a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46276a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f46276a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.pubmatic.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18461b {

        /* renamed from: a */
        final float f46277a;

        /* renamed from: b */
        final float f46278b;

        C18461b(float f, float f2) {
            this.f46277a = f;
            this.f46278b = f2;
        }
    }

    /* renamed from: a */
    static float m62647a(int i) {
        return i / f46275c;
    }

    /* renamed from: b */
    public static void m62635b(JSONObject jSONObject) {
        C18461b m62642a = m62642a(jSONObject);
        try {
            jSONObject.put("width", m62642a.f46277a);
            jSONObject.put("height", m62642a.f46278b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m62631c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m62643a(optJSONArray, optJSONArray2)) {
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
    private static boolean m62630d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m62629e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m62628f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f46274b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m62627g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m62626h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m62628f(jSONObject, jSONObject2) && m62627g(jSONObject, jSONObject2) && m62629e(jSONObject, jSONObject2) && m62630d(jSONObject, jSONObject2) && m62631c(jSONObject, jSONObject2) && m62632b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18461b m62642a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f46273a != null) {
            Point point = new Point(0, 0);
            f46273a.getDefaultDisplay().getRealSize(point);
            f = m62647a(point.x);
            f2 = m62647a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18461b(f, f2);
    }

    /* renamed from: b */
    public static void m62634b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C18462d.m62624a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m62646a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m62647a(i));
            jSONObject.put("y", m62647a(i2));
            jSONObject.put("width", m62647a(i3));
            jSONObject.put("height", m62647a(i4));
        } catch (JSONException e) {
            C18462d.m62624a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m62633b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18462d.m62624a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m62645a(Context context) {
        if (context != null) {
            f46275c = context.getResources().getDisplayMetrics().density;
            f46273a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m62632b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m62643a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m62626h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m62641a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m62644a(outputDeviceStatus));
        } catch (JSONException e) {
            C18462d.m62624a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m62640a(JSONObject jSONObject, C18472a.C18473a c18473a) {
        C18439e m62559a = c18473a.m62559a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18473a.m62557b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m62559a.m62730d());
            jSONObject.put("friendlyObstructionPurpose", m62559a.m62732b());
            jSONObject.put("friendlyObstructionReason", m62559a.m62733a());
        } catch (JSONException e) {
            C18462d.m62624a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m62639a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18462d.m62624a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m62638a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18462d.m62624a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m62637a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18462d.m62624a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m62636a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m62644a(OutputDeviceStatus outputDeviceStatus) {
        return C18460a.f46276a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m62643a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
