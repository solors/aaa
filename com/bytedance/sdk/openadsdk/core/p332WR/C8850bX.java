package com.bytedance.sdk.openadsdk.core.p332WR;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7768zx;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.WR.bX */
/* loaded from: classes3.dex */
public class C8850bX {

    /* renamed from: bg */
    private static boolean f19543bg;

    /* renamed from: IL */
    public static void m84681IL(String str) {
        if (TextUtils.isEmpty(str) || !C8838VzQ.eqN().Pae()) {
            return;
        }
        C8847IL.m84693IL().m84692IL(str);
    }

    /* renamed from: bX */
    public static String m84680bX() {
        if (C8838VzQ.eqN().Pae()) {
            return C8847IL.m84693IL().m84684zx();
        }
        return "";
    }

    /* renamed from: bg */
    public static void m84679bg() {
        if (!f19543bg && C8838VzQ.eqN().Pae()) {
            C8847IL.m84693IL();
            f19543bg = C8847IL.m84693IL().m84691bX();
        }
    }

    public static long eqN() {
        if (C8838VzQ.eqN().Pae()) {
            return C8847IL.m84693IL().ldr();
        }
        return 0L;
    }

    public static String ldr() {
        if (C8838VzQ.eqN().Pae()) {
            return C8847IL.m84693IL().eqN();
        }
        return null;
    }

    /* renamed from: zx */
    public static int m84673zx() {
        if (C8838VzQ.eqN().Pae()) {
            return C8847IL.m84693IL().m84685iR();
        }
        return 6;
    }

    /* renamed from: IL */
    public static void m84682IL() {
        if (C8838VzQ.eqN().Pae()) {
            C8847IL.m84693IL().m84690bg();
        }
    }

    /* renamed from: bg */
    public static void m84676bg(String str) {
        if (TextUtils.isEmpty(str) && C8838VzQ.eqN().Pae()) {
            C8847IL.m84693IL().m84688bg(str);
        }
    }

    /* renamed from: bg */
    public static void m84677bg(AbstractC8967tuV abstractC8967tuV, String str) {
        long j;
        long j2;
        long j3;
        Object obj;
        if (C8838VzQ.eqN().Pae()) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            hashMap.put("au_show", str);
            if (abstractC8967tuV != null) {
                String waE = abstractC8967tuV.waE();
                String str2 = "-1";
                if (!TextUtils.isEmpty(waE)) {
                    hashMap.put("request_id", waE);
                } else {
                    hashMap.put("request_id", "-1");
                }
                try {
                    long j4 = -1;
                    if (abstractC8967tuV.DCn() != null) {
                        j = abstractC8967tuV.DCn().optLong("ad_id", -1L);
                        j2 = abstractC8967tuV.DCn().optLong("rit", -1L);
                        j3 = abstractC8967tuV.DCn().optLong("ad_slot_type", -1L);
                        str2 = abstractC8967tuV.DCn().optString("ad_type", "-1");
                    } else {
                        j = -1;
                        j2 = -1;
                        j3 = -1;
                    }
                    hashMap.put("ad_id", Long.valueOf(j));
                    hashMap.put("rit", Long.valueOf(j2));
                    hashMap.put("ad_slot_type", Long.valueOf(j3));
                    hashMap.put("ad_type", str2);
                    Map<String, Object> mo84006jA = abstractC8967tuV.mo84006jA();
                    if (mo84006jA != null && (obj = mo84006jA.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j4 = Long.parseLong(obj.toString());
                    }
                    hashMap.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j4));
                    C8847IL.m84693IL().m84687bg(PglSSManager.REPORT_SCENE_ADSHOW, hashMap);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: bg */
    public static Map<String, String> m84675bg(String str, String str2) {
        if (C8838VzQ.eqN().Pae()) {
            return C8847IL.m84693IL().m84686bg(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    /* renamed from: bg */
    public static void m84678bg(MotionEvent motionEvent) {
        if (C8838VzQ.eqN().Pae()) {
            C8847IL.m84693IL().m84689bg(motionEvent);
        }
    }

    /* renamed from: bg */
    public static void m84674bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (C8838VzQ.eqN().Pae()) {
                m84679bg();
                if (m84673zx() == 0) {
                    jSONObject.put("sec_did", C8847IL.m84693IL().eqN());
                    String m87788bg = C7768zx.m87788bg(jSONObject.toString());
                    Map<String, String> m84686bg = C8847IL.m84693IL().m84686bg("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", m87788bg != null ? m87788bg.getBytes() : new byte[0]);
                    if (m84686bg != null && m84686bg.size() > 0) {
                        for (String str : m84686bg.keySet()) {
                            jSONObject.put(str, m84686bg.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", m87788bg);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", C8847IL.m84693IL().ldr());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(m84673zx()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            C7741PX.m87873bg("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
