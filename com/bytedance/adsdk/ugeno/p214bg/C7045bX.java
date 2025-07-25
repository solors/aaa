package com.bytedance.adsdk.ugeno.p214bg;

import android.text.TextUtils;
import android.util.Pair;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.p222iR.C7113IL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.bg.bX */
/* loaded from: classes3.dex */
public class C7045bX {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: IL */
    public static Interpolator m90200IL(String str) {
        char c;
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return new LinearInterpolator();
                }
                return new DecelerateInterpolator();
            }
            return new AccelerateDecelerateInterpolator();
        }
        return new AccelerateInterpolator();
    }

    /* renamed from: bX */
    public static float[] m90199bX(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray m90015bg = C7113IL.m90015bg(str, (JSONArray) null);
        if (m90015bg != null && m90015bg.length() == 2) {
            fArr[0] = (float) m90015bg.optDouble(0);
            fArr[1] = (float) m90015bg.optDouble(1);
        }
        return fArr;
    }

    /* renamed from: bg */
    public static int m90198bg(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 1;
        }
        return i - 1;
    }

    /* renamed from: bg */
    public static C7038IL m90195bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C7038IL c7038il = new C7038IL();
        c7038il.m90217IL(jSONObject.optLong("delay"));
        c7038il.m90211bg(jSONObject.optLong("duration"));
        c7038il.m90212bg(jSONObject.optInt("playCount", 1));
        c7038il.m90210bg(jSONObject.optString("playDirection"));
        c7038il.m90216IL(jSONObject.optString("transformOrigin"));
        c7038il.m90214bX(jSONObject.optString("timingFunction", "linear"));
        c7038il.m90208bg(jSONObject.optJSONObject("effect"));
        c7038il.m90209bg(m90196bg(jSONObject.optJSONArray("keyframes")));
        return c7038il;
    }

    /* renamed from: bg */
    public static Map<String, TreeMap<Float, String>> m90196bg(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                float optDouble = (float) optJSONObject.optDouble("offset");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    TreeMap treeMap = (TreeMap) hashMap.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (hashMap.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(optDouble), optJSONObject.optString(next));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            new Pair(Float.valueOf(optDouble), optJSONObject.optString(next));
                            treeMap2.put(Float.valueOf(optDouble), optJSONObject.optString(next));
                            hashMap.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: bg */
    public static int m90197bg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1408024454) {
            if (hashCode == -1039745817 && str.equals("normal")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE)) {
                c = 0;
            }
            c = 65535;
        }
        return c != 0 ? 1 : 2;
    }
}
