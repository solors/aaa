package com.iab.omid.library.smaato.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.smaato.adsession.OutputDeviceStatus;
import com.iab.omid.library.smaato.internal.C18572e;
import com.iab.omid.library.smaato.walking.C18605a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.utils.c */
/* loaded from: classes6.dex */
public class C18592c {

    /* renamed from: a */
    private static WindowManager f46543a;

    /* renamed from: b */
    private static String[] f46544b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f46545c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.smaato.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18593a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46546a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f46546a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.smaato.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18594b {

        /* renamed from: a */
        final float f46547a;

        /* renamed from: b */
        final float f46548b;

        C18594b(float f, float f2) {
            this.f46547a = f;
            this.f46548b = f2;
        }
    }

    /* renamed from: a */
    static float m62141a(int i) {
        return i / f46545c;
    }

    /* renamed from: b */
    public static void m62129b(JSONObject jSONObject) {
        C18594b m62136a = m62136a(jSONObject);
        try {
            jSONObject.put("width", m62136a.f46547a);
            jSONObject.put("height", m62136a.f46548b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m62125c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m62137a(optJSONArray, optJSONArray2)) {
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
    private static boolean m62124d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m62123e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m62122f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f46544b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m62121g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m62120h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m62122f(jSONObject, jSONObject2) && m62121g(jSONObject, jSONObject2) && m62123e(jSONObject, jSONObject2) && m62124d(jSONObject, jSONObject2) && m62125c(jSONObject, jSONObject2) && m62126b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18594b m62136a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f46543a != null) {
            Point point = new Point(0, 0);
            f46543a.getDefaultDisplay().getRealSize(point);
            f = m62141a(point.x);
            f2 = m62141a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18594b(f, f2);
    }

    /* renamed from: b */
    public static void m62128b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C18595d.m62118a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m62140a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m62141a(i));
            jSONObject.put("y", m62141a(i2));
            jSONObject.put("width", m62141a(i3));
            jSONObject.put("height", m62141a(i4));
        } catch (JSONException e) {
            C18595d.m62118a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m62127b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18595d.m62118a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m62139a(Context context) {
        if (context != null) {
            f46545c = context.getResources().getDisplayMetrics().density;
            f46543a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    private static boolean m62126b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m62137a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m62120h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m62135a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m62138a(outputDeviceStatus));
        } catch (JSONException e) {
            C18595d.m62118a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m62134a(JSONObject jSONObject, C18605a.C18606a c18606a) {
        C18572e m62053a = c18606a.m62053a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18606a.m62051b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m62053a.m62224d());
            jSONObject.put("friendlyObstructionPurpose", m62053a.m62226b());
            jSONObject.put("friendlyObstructionReason", m62053a.m62227a());
        } catch (JSONException e) {
            C18595d.m62118a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m62133a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18595d.m62118a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m62132a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18595d.m62118a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m62131a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18595d.m62118a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m62130a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m62138a(OutputDeviceStatus outputDeviceStatus) {
        return C18593a.f46546a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m62137a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
