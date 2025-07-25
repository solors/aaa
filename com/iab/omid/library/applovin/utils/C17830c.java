package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.internal.C17812e;
import com.iab.omid.library.applovin.walking.C17843a;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.utils.c */
/* loaded from: classes6.dex */
public class C17830c {

    /* renamed from: a */
    private static WindowManager f44981a;

    /* renamed from: b */
    private static String[] f44982b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f44983c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.applovin.utils.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C17831a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44984a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f44984a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.iab.omid.library.applovin.utils.c$b */
    /* loaded from: classes6.dex */
    public static class C17832b {

        /* renamed from: a */
        final float f44985a;

        /* renamed from: b */
        final float f44986b;

        C17832b(float f, float f2) {
            this.f44985a = f;
            this.f44986b = f2;
        }
    }

    /* renamed from: a */
    static float m65048a(int i) {
        return i / f44983c;
    }

    /* renamed from: b */
    public static void m65036b(JSONObject jSONObject) {
        C17832b m65043a = m65043a(jSONObject);
        try {
            jSONObject.put("width", m65043a.f44985a);
            jSONObject.put("height", m65043a.f44986b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m65033c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m65044a(optJSONArray, optJSONArray2)) {
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
    private static boolean m65032d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m65031e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m65030f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f44982b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m65029g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m65028h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (m65030f(jSONObject, jSONObject2) && m65029g(jSONObject, jSONObject2) && m65031e(jSONObject, jSONObject2) && m65032d(jSONObject, jSONObject2) && m65033c(jSONObject, jSONObject2) && m65034b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C17832b m65043a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f44981a != null) {
            Point point = new Point(0, 0);
            f44981a.getDefaultDisplay().getRealSize(point);
            f = m65048a(point.x);
            f2 = m65048a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C17832b(f, f2);
    }

    /* renamed from: b */
    public static void m65035b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C17833d.m65026a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m65047a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m65048a(i));
            jSONObject.put("y", m65048a(i2));
            jSONObject.put("width", m65048a(i3));
            jSONObject.put("height", m65048a(i4));
        } catch (JSONException e) {
            C17833d.m65026a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static boolean m65034b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m65044a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m65028h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m65046a(Context context) {
        if (context != null) {
            f44983c = context.getResources().getDisplayMetrics().density;
            f44981a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m65042a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m65045a(outputDeviceStatus));
        } catch (JSONException e) {
            C17833d.m65026a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m65041a(JSONObject jSONObject, C17843a.C17844a c17844a) {
        C17812e m64964a = c17844a.m64964a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c17844a.m64962b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m64964a.m65123d());
            jSONObject.put("friendlyObstructionPurpose", m64964a.m65125b());
            jSONObject.put("friendlyObstructionReason", m64964a.m65126a());
        } catch (JSONException e) {
            C17833d.m65026a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m65040a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C17833d.m65026a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m65039a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C17833d.m65026a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m65038a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C17833d.m65026a("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m65037a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m65045a(OutputDeviceStatus outputDeviceStatus) {
        return C17831a.f44984a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m65044a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
