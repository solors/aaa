package com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.xiaomi.adsession.OutputDeviceStatus;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32489c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciii2coi2.C32617coi222o222;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.c2oc2i */
/* loaded from: classes8.dex */
public class C32604c2oc2i {
    private static WindowManager coo2iico;
    private static String[] coi222o222 = {"x", "y", "width", "height"};
    static float c2oc2i = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.c2oc2i$coi222o222 */
    /* loaded from: classes8.dex */
    public static class C32605coi222o222 {
        final float coi222o222;
        final float coo2iico;

        C32605coi222o222(float f, float f2) {
            this.coo2iico = f;
            this.coi222o222 = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.c2oc2i$coo2iico */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C32606coo2iico {
        static final /* synthetic */ int[] coo2iico;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            coo2iico = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static boolean c2oc2i(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!coo2iico(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean c2oc2o(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean cco22(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : coi222o222) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean cii2c2(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean ciii2coi2(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (cco22(jSONObject, jSONObject2) && cii2c2(jSONObject, jSONObject2) && c2oc2o(jSONObject, jSONObject2) && cioccoiococ(jSONObject, jSONObject2) && c2oc2i(jSONObject, jSONObject2) && coi222o222(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    private static boolean cioccoiococ(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    public static void coi222o222(JSONObject jSONObject) {
        C32605coi222o222 coo2iico2 = coo2iico(jSONObject);
        try {
            jSONObject.put("width", coo2iico2.coo2iico);
            jSONObject.put("height", coo2iico2.coi222o222);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    static float coo2iico(int i) {
        return i / c2oc2i;
    }

    public static void coi222o222(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C32612cioccoiococ.coo2iico("Error with setting is picture-in-picture active", e);
            }
        }
    }

    private static C32605coi222o222 coo2iico(JSONObject jSONObject) {
        float f;
        float f2;
        if (coo2iico != null) {
            Point point = new Point(0, 0);
            coo2iico.getDefaultDisplay().getRealSize(point);
            f = coo2iico(point.x);
            f2 = coo2iico(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C32605coi222o222(f, f2);
    }

    public static void coi222o222(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C32612cioccoiococ.coo2iico("Error with setting not visible reason", e);
        }
    }

    public static JSONObject coo2iico(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", coo2iico(i));
            jSONObject.put("y", coo2iico(i2));
            jSONObject.put("width", coo2iico(i3));
            jSONObject.put("height", coo2iico(i4));
        } catch (JSONException e) {
            C32612cioccoiococ.coo2iico("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    private static boolean coi222o222(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (coo2iico(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!ciii2coi2(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void coo2iico(Context context) {
        if (context != null) {
            c2oc2i = context.getResources().getDisplayMetrics().density;
            coo2iico = (WindowManager) context.getSystemService("window");
        }
    }

    public static void coo2iico(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", coo2iico(outputDeviceStatus));
        } catch (JSONException e) {
            C32612cioccoiococ.coo2iico("Error with setting output device status", e);
        }
    }

    public static void coo2iico(JSONObject jSONObject, C32617coi222o222.C32618coo2iico c32618coo2iico) {
        C32489c2oc2o coo2iico2 = c32618coo2iico.coo2iico();
        JSONArray jSONArray = new JSONArray();
        for (String str : c32618coo2iico.coi222o222()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", coo2iico2.cioccoiococ());
            jSONObject.put("friendlyObstructionPurpose", coo2iico2.coi222o222());
            jSONObject.put("friendlyObstructionReason", coo2iico2.coo2iico());
        } catch (JSONException e) {
            C32612cioccoiococ.coo2iico("Error with setting friendly obstruction", e);
        }
    }

    public static void coo2iico(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C32612cioccoiococ.coo2iico("Error with setting has window focus", e);
        }
    }

    public static void coo2iico(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C32612cioccoiococ.coo2iico("Error with setting ad session id", e);
        }
    }

    public static void coo2iico(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C32612cioccoiococ.coo2iico("JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    public static void coo2iico(JSONObject jSONObject, JSONObject jSONObject2) {
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

    private static boolean coo2iico(OutputDeviceStatus outputDeviceStatus) {
        return C32606coo2iico.coo2iico[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean coo2iico(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
