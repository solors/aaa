package com.bytedance.sdk.openadsdk.core.p314Kg.p315bg;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6493IL;
import com.bytedance.sdk.component.adexpress.p243bg.p244IL.C7302IL;
import com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7316IL;
import com.bytedance.sdk.openadsdk.core.C8617PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.core.aGH;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.model.C8942Fy;
import com.bytedance.sdk.openadsdk.core.model.C8945Ja;
import com.bytedance.sdk.openadsdk.core.model.C8948Lq;
import com.bytedance.sdk.openadsdk.core.model.C8957bg;
import com.bytedance.sdk.openadsdk.core.p326VB.p330bg.C8813IL;
import com.bytedance.sdk.openadsdk.core.p326VB.p331zx.InterfaceC8833bX;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.Kg.bg.IL */
/* loaded from: classes3.dex */
public class C8566IL {

    /* renamed from: IL */
    private static String f18873IL = "";

    /* renamed from: bg */
    public static String f18874bg = "https://pag_open_icon_id/appicon.png";

    /* renamed from: IL */
    public static boolean m85728IL() {
        return true;
    }

    /* renamed from: bg */
    public static String m85725bg() {
        return f18873IL;
    }

    /* renamed from: IL */
    private static JSONObject m85726IL(AbstractC8967tuV abstractC8967tuV) {
        JSONObject jSONObject = new JSONObject();
        try {
            aGH.m84570bg(jSONObject, abstractC8967tuV);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: bg */
    public static JSONObject m85724bg(float f, float f2, boolean z, @NonNull AbstractC8967tuV abstractC8967tuV) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            if ((abstractC8967tuV instanceof C8942Fy) && ((C8942Fy) abstractC8967tuV).Uzu()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("choose_ui_data", jSONObject3);
                C8957bg.C8958bg m84345IN = ((C8942Fy) abstractC8967tuV).m84345IN();
                JSONObject m84232IL = m84345IN.m84232IL();
                if (TextUtils.isEmpty(m84345IN.m83963WR())) {
                    m84232IL.put("data", m85727IL(m84345IN));
                }
                jSONObject3.put("tpl_info", m84232IL);
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("creatives", jSONArray);
                for (AbstractC8967tuV abstractC8967tuV2 : ((C8942Fy) abstractC8967tuV).m84342mm()) {
                    JSONObject m85716bg = m85716bg(false, abstractC8967tuV2);
                    if (m85716bg != null) {
                        m85716bg.put("template_Plugin", m85727IL(abstractC8967tuV2.LKE()));
                        m85716bg.put("diff_template_Plugin", m85722bg(abstractC8967tuV2.LKE()));
                        jSONArray.put(m85716bg);
                    }
                }
                return jSONObject;
            }
            jSONObject.put(Reporting.Key.CREATIVE, m85716bg(false, abstractC8967tuV));
            jSONObject.put("template_Plugin", m85727IL(abstractC8967tuV.LKE()));
            jSONObject.put("diff_template_Plugin", m85722bg(abstractC8967tuV.LKE()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: IL */
    private static String m85727IL(AbstractC8967tuV.C8968bg c8968bg) {
        C7316IL m89237bX;
        if (c8968bg != null) {
            String m83963WR = c8968bg.m83963WR();
            return (!TextUtils.isEmpty(m83963WR) || (m89237bX = C7302IL.m89237bX(c8968bg.ldr())) == null) ? m83963WR : m89237bX.m89155zx();
        }
        return "";
    }

    /* renamed from: bg */
    public static JSONObject m85723bg(float f, float f2, boolean z, @NonNull AbstractC8967tuV abstractC8967tuV, String str, InterfaceC8833bX interfaceC8833bX) {
        f18873IL = "";
        JSONObject jSONObject = null;
        if (abstractC8967tuV == null) {
            return null;
        }
        try {
            jSONObject = abstractC8967tuV.ZTq();
            m85718bg(jSONObject, abstractC8967tuV, str);
            JSONObject m84637IL = aGH.m84637IL(abstractC8967tuV);
            m84637IL.put("language", C8617PX.m85533bg());
            jSONObject.put("xSetting", m84637IL);
            jSONObject.put("xAdInfo", m85719bg(str, m85726IL(abstractC8967tuV), abstractC8967tuV));
            JSONObject jSONObject2 = new JSONObject();
            aGH.m84633IL(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", f);
            jSONObject3.put("height", f2);
            if (z) {
                jSONObject3.put("isLandscape", true);
            }
            jSONObject.put("xSize", jSONObject3);
            interfaceC8833bX.mo84767bg("adv3");
            C8945Ja mo83991uu = abstractC8967tuV.mo83991uu();
            if (mo83991uu != null) {
                String eqN = mo83991uu.eqN();
                if (!TextUtils.isEmpty(eqN)) {
                    jSONObject.put("xTemplate", new JSONObject(eqN));
                    f18873IL = "getTemplate success by local data";
                    interfaceC8833bX.mo84769IL("local");
                } else {
                    String m84866bg = C8813IL.m84873bg().m84866bg("adv3", mo83991uu.m84317bg(), mo83991uu.m84319IL());
                    if (!TextUtils.isEmpty(m84866bg)) {
                        jSONObject.put("xTemplate", new JSONObject(m84866bg));
                        f18873IL = "getTemplate success by db data";
                        interfaceC8833bX.mo84769IL("local");
                    } else {
                        String str2 = "local db data is null id is " + mo83991uu.m84317bg() + " md5 is " + mo83991uu.m84319IL();
                        f18873IL = str2;
                        interfaceC8833bX.mo84768bg(3, str2, "net");
                    }
                }
            }
        } catch (Exception e) {
            String str3 = "load template exception " + e.getMessage();
            f18873IL = str3;
            interfaceC8833bX.mo84768bg(3, str3, "net");
        }
        return jSONObject;
    }

    /* renamed from: bg */
    private static void m85718bg(JSONObject jSONObject, AbstractC8967tuV abstractC8967tuV, String str) {
        C6493IL Dxa;
        if (abstractC8967tuV == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (Dxa = abstractC8967tuV.Dxa()) == null) {
                return;
            }
            JSONObject VzQ = Dxa.VzQ();
            if (VzQ != null) {
                if ("open_ad".equals(str)) {
                    VzQ.put("video_duration", C8838VzQ.eqN().rri(String.valueOf(abstractC8967tuV.IGR())));
                } else {
                    VzQ.put("video_duration", Dxa.ldr() * Dxa.m91728tC());
                }
            }
            jSONObject.put("video", VzQ);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: bg */
    private static JSONObject m85719bg(String str, JSONObject jSONObject, AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return jSONObject;
        }
        try {
            if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_name", C8840WR.m84734IL().ldr());
                int m84700iR = C8840WR.m84734IL().m84700iR();
                if (m84700iR != 0) {
                    int JAA = abstractC8967tuV.JAA();
                    if (9 == JAA) {
                        jSONObject2.put("app_icon", f18874bg);
                    } else if (10 == JAA) {
                        jSONObject2.put("app_icon", "@".concat(String.valueOf(m84700iR)));
                    }
                }
                jSONObject.put("open_app_info", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: bg */
    public static JSONObject m85717bg(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray optJSONArray = jSONObject2.optJSONArray(UserMetadata.KEYDATA_FILENAME);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (jSONObject.has(optString)) {
                        jSONObject3.put(optString, jSONObject.opt(optString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: bg */
    private static String m85722bg(AbstractC8967tuV.C8968bg c8968bg) {
        return c8968bg != null ? c8968bg.m83956eo() : "";
    }

    /* renamed from: bg */
    public static JSONObject m85716bg(boolean z, @NonNull AbstractC8967tuV abstractC8967tuV) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", abstractC8967tuV.zCS());
            if (abstractC8967tuV.sVc() != null) {
                if (abstractC8967tuV.sVc() != null && !TextUtils.isEmpty(abstractC8967tuV.sVc().m84303bg())) {
                    jSONObject.put("icon", abstractC8967tuV.sVc().m84303bg());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (abstractC8967tuV.mo84001lM() != null) {
                for (int i = 0; i < abstractC8967tuV.mo84001lM().size(); i++) {
                    C8948Lq c8948Lq = abstractC8967tuV.mo84001lM().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", c8948Lq.m84304bX());
                    jSONObject2.put("width", c8948Lq.m84307IL());
                    jSONObject2.put("url", c8948Lq.m84303bg());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", abstractC8967tuV.bOf());
            jSONObject.put("interaction_type", abstractC8967tuV.mo84003jz());
            jSONObject.put("interaction_method", abstractC8967tuV.xxp());
            jSONObject.put("is_compliance_template", m85728IL());
            jSONObject.put("title", abstractC8967tuV.mo83985wS());
            jSONObject.put("description", abstractC8967tuV.cZH());
            jSONObject.put("source", abstractC8967tuV.mo84068bN());
            if (abstractC8967tuV.RiO() != null) {
                jSONObject.put("comment_num", abstractC8967tuV.RiO().m84258zx());
                jSONObject.put("score", abstractC8967tuV.RiO().eqN());
                jSONObject.put("app_size", abstractC8967tuV.RiO().ldr());
                jSONObject.put("app", abstractC8967tuV.RiO().m84266Kg());
            }
            C6493IL Dxa = abstractC8967tuV.Dxa();
            if (Dxa != null) {
                JSONObject VzQ = Dxa.VzQ();
                VzQ.put("video_duration", Dxa.ldr() * Dxa.m91728tC());
                jSONObject.put("video", VzQ);
            }
            if (abstractC8967tuV.LKE() != null) {
                jSONObject.put("dynamic_creative", abstractC8967tuV.LKE().m83965VB());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static String m85720bg(AbstractC8967tuV abstractC8967tuV, String str) {
        List<C8948Lq> mo84001lM;
        if (abstractC8967tuV != null && (mo84001lM = abstractC8967tuV.mo84001lM()) != null && mo84001lM.size() > 0) {
            for (C8948Lq c8948Lq : mo84001lM) {
                if (c8948Lq != null && TextUtils.equals(str, c8948Lq.m84303bg())) {
                    return c8948Lq.m84299iR();
                }
            }
        }
        return null;
    }

    /* renamed from: bg */
    public static Map<String, String> m85721bg(AbstractC8967tuV abstractC8967tuV) {
        HashMap hashMap = null;
        if (abstractC8967tuV == null) {
            return null;
        }
        List<C8948Lq> mo84001lM = abstractC8967tuV.mo84001lM();
        if (mo84001lM != null && mo84001lM.size() > 0) {
            hashMap = new HashMap();
            for (C8948Lq c8948Lq : mo84001lM) {
                if (c8948Lq != null) {
                    hashMap.put(c8948Lq.m84303bg(), c8948Lq.m84299iR());
                }
            }
            C8948Lq sVc = abstractC8967tuV.sVc();
            if (sVc != null) {
                hashMap.put(sVc.m84303bg(), sVc.m84299iR());
            }
        }
        return hashMap;
    }
}
