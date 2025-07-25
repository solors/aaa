package com.iab.omid.library.taurusx.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.taurusx.adsession.OutputDeviceStatus;
import com.iab.omid.library.taurusx.internal.C18634e;
import com.iab.omid.library.taurusx.walking.C18663a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.utils.c */
/* loaded from: classes6.dex */
public class C18651c {

    /* renamed from: a */
    private static WindowManager f46672a;

    /* renamed from: b */
    private static String[] f46673b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f46674c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.taurusx.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18652a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46675a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f46675a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.taurusx.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C18653b {

        /* renamed from: a */
        final float f46676a;

        /* renamed from: b */
        final float f46677b;

        C18653b(float f, float f2) {
            this.f46676a = f;
            this.f46677b = f2;
        }
    }

    /* renamed from: a */
    static float m61899a(int i) {
        return i / f46674c;
    }

    /* renamed from: b */
    public static void m61887b(JSONObject jSONObject) {
        C18653b m61894a = m61894a(jSONObject);
        try {
            jSONObject.put("width", m61894a.f46676a);
            jSONObject.put("height", m61894a.f46677b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m61884c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m61895a(optJSONArray, optJSONArray2)) {
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
    private static boolean m61883d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m61882e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m61881f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f46673b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m61880g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m61879h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m61881f(jSONObject, jSONObject2) && m61880g(jSONObject, jSONObject2) && m61882e(jSONObject, jSONObject2) && m61883d(jSONObject, jSONObject2) && m61884c(jSONObject, jSONObject2) && m61885b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C18653b m61894a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f46672a != null) {
            Point point = new Point(0, 0);
            f46672a.getDefaultDisplay().getRealSize(point);
            f = m61899a(point.x);
            f2 = m61899a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C18653b(f, f2);
    }

    /* renamed from: b */
    public static void m61886b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C18654d.m61877a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m61898a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m61899a(i));
            jSONObject.put("y", m61899a(i2));
            jSONObject.put("width", m61899a(i3));
            jSONObject.put("height", m61899a(i4));
        } catch (JSONException e) {
            C18654d.m61877a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static boolean m61885b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m61895a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m61879h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m61897a(Context context) {
        if (context != null) {
            f46674c = context.getResources().getDisplayMetrics().density;
            f46672a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m61893a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m61896a(outputDeviceStatus));
        } catch (JSONException e) {
            C18654d.m61877a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m61892a(JSONObject jSONObject, C18663a.C18664a c18664a) {
        C18634e m61818a = c18664a.m61818a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c18664a.m61816b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m61818a.m61968d());
            jSONObject.put("friendlyObstructionPurpose", m61818a.m61970b());
            jSONObject.put("friendlyObstructionReason", m61818a.m61971a());
        } catch (JSONException e) {
            C18654d.m61877a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m61891a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C18654d.m61877a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m61890a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C18654d.m61877a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m61889a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C18654d.m61877a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m61888a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m61896a(OutputDeviceStatus outputDeviceStatus) {
        return C18652a.f46675a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m61895a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
