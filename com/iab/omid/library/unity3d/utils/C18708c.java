package com.iab.omid.library.unity3d.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.OutputDeviceStatus;
import com.iab.omid.library.unity3d.internal.C18691e;
import com.iab.omid.library.unity3d.walking.C18720a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.utils.c */
/* loaded from: classes6.dex */
public class C18708c {

    /* renamed from: a */
    private static WindowManager f46800a;

    /* renamed from: b */
    private static String[] f46801b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f46802c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.unity3d.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18709a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46803a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f46803a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.unity3d.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18710b {

        /* renamed from: a */
        final float f46804a;

        /* renamed from: b */
        final float f46805b;

        C18710b(float f, float f2) {
            this.f46804a = f;
            this.f46805b = f2;
        }
    }

    /* renamed from: a */
    static float m61665a(int i) {
        return i / f46802c;
    }

    /* renamed from: b */
    public static void m61653b(JSONObject jSONObject) {
        C18710b m61660a = m61660a(jSONObject);
        try {
            jSONObject.put("width", m61660a.f46804a);
            jSONObject.put("height", m61660a.f46805b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m61650c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m61661a(optJSONArray, optJSONArray2)) {
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
    private static boolean m61649d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m61648e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m61647f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f46801b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m61646g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m61645h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m61647f(jSONObject, jSONObject2) && m61646g(jSONObject, jSONObject2) && m61648e(jSONObject, jSONObject2) && m61649d(jSONObject, jSONObject2) && m61650c(jSONObject, jSONObject2) && m61651b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18710b m61660a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f46800a != null) {
            Point point = new Point(0, 0);
            f46800a.getDefaultDisplay().getRealSize(point);
            f = m61665a(point.x);
            f2 = m61665a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18710b(f, f2);
    }

    /* renamed from: b */
    public static void m61652b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18711d.m61643a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m61664a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m61665a(i));
            jSONObject.put("y", m61665a(i2));
            jSONObject.put("width", m61665a(i3));
            jSONObject.put("height", m61665a(i4));
        } catch (JSONException e) {
            C18711d.m61643a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static boolean m61651b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m61661a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m61645h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m61663a(Context context) {
        if (context != null) {
            f46802c = context.getResources().getDisplayMetrics().density;
            f46800a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m61659a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m61662a(outputDeviceStatus));
        } catch (JSONException e) {
            C18711d.m61643a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m61658a(JSONObject jSONObject, C18720a.C18721a c18721a) {
        C18691e m61584a = c18721a.m61584a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18721a.m61582b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m61584a.m61733d());
            jSONObject.put("friendlyObstructionPurpose", m61584a.m61735b());
            jSONObject.put("friendlyObstructionReason", m61584a.m61736a());
        } catch (JSONException e) {
            C18711d.m61643a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m61657a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18711d.m61643a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m61656a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18711d.m61643a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m61655a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18711d.m61643a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m61654a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m61662a(OutputDeviceStatus outputDeviceStatus) {
        return C18709a.f46803a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m61661a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
