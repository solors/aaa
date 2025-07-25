package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ki2 {

    /* renamed from: a */
    private static WindowManager f81430a;

    /* renamed from: b */
    private static String[] f81431b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f81432c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m32543a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f81432c);
            jSONObject.put("y", i2 / f81432c);
            jSONObject.put("width", i3 / f81432c);
            jSONObject.put("height", i4 / f81432c);
        } catch (JSONException e) {
            Log.e("OMIDLIB", "Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static boolean m32538b(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f81431b;
        int i = 0;
        while (true) {
            if (i < 4) {
                String str = strArr[i];
                if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                    break;
                }
                i++;
            } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")) == Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus"))) {
                JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (optJSONArray != null || optJSONArray2 != null) {
                    if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                break;
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                if (optJSONArray3 == null && optJSONArray4 == null) {
                    return true;
                }
                if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                    for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                        if (m32538b(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m32542a(Context context) {
        if (context != null) {
            f81432c = context.getResources().getDisplayMetrics().density;
            f81430a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m32541a(JSONObject jSONObject) {
        float f;
        float f2;
        Point point;
        if (f81430a != null) {
            f81430a.getDefaultDisplay().getRealSize(new Point(0, 0));
            float f3 = f81432c;
            f = point.x / f3;
            f2 = point.y / f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m32540a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + C21114v8.C21123i.f54139e, e);
        }
    }

    /* renamed from: a */
    public static void m32539a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
