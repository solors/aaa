package com.bytedance.sdk.component.adexpress.dynamic.p252zx;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7456IL;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7457Kg;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7459bX;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7462eqN;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7465ldr;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7466zx;
import com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7485zx;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.p241IL.C7282Ta;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.ldr */
/* loaded from: classes3.dex */
public class C7483ldr {

    /* renamed from: iR */
    private static HashMap<String, String> f16257iR;

    /* renamed from: IL */
    private JSONObject f16258IL;

    /* renamed from: bX */
    private C7459bX f16259bX;

    /* renamed from: bg */
    private JSONObject f16260bg;
    private C7484bg eqN;
    private C7462eqN ldr;

    /* renamed from: zx */
    private C7477bX f16261zx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.ldr$bg */
    /* loaded from: classes3.dex */
    public static class C7484bg {

        /* renamed from: IL */
        float f16262IL;

        /* renamed from: bX */
        boolean f16263bX;

        /* renamed from: bg */
        float f16264bg;

        /* renamed from: bg */
        public static C7484bg m88693bg(JSONObject jSONObject) {
            C7484bg c7484bg = new C7484bg();
            if (jSONObject != null) {
                c7484bg.f16264bg = (float) jSONObject.optDouble("width");
                c7484bg.f16262IL = (float) jSONObject.optDouble("height");
                c7484bg.f16263bX = jSONObject.optBoolean("isLandscape");
            }
            return c7484bg;
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f16257iR = hashMap;
        hashMap.put("subtitle", "description");
        f16257iR.put("source", "source|app.app_name");
        f16257iR.put("screenshot", "dynamic_creative.screenshot");
    }

    public C7483ldr(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f16260bg = jSONObject;
        this.f16258IL = jSONObject2;
        this.f16259bX = new C7459bX(jSONObject2);
        this.eqN = C7484bg.m88693bg(jSONObject3);
        this.ldr = C7462eqN.m88922bg(jSONObject4);
    }

    /* renamed from: IL */
    private void m88702IL(C7457Kg c7457Kg) {
        C7459bX c7459bX;
        Object m88968bg;
        Object m88968bg2;
        Object m88968bg3;
        Object m88968bg4;
        if (c7457Kg == null || (c7459bX = this.f16259bX) == null || (m88968bg = c7459bX.m88968bg("image.0.url")) == null) {
            return;
        }
        String valueOf = String.valueOf(m88968bg);
        if (TextUtils.isEmpty(valueOf) || (m88968bg2 = this.f16259bX.m88968bg("title")) == null) {
            return;
        }
        String valueOf2 = String.valueOf(m88968bg2);
        if (TextUtils.isEmpty(valueOf2) || (m88968bg3 = this.f16259bX.m88968bg("description")) == null) {
            return;
        }
        String valueOf3 = String.valueOf(m88968bg3);
        if (TextUtils.isEmpty(valueOf3) || (m88968bg4 = this.f16259bX.m88968bg("icon")) == null) {
            return;
        }
        String valueOf4 = String.valueOf(m88968bg4);
        if (TextUtils.isEmpty(valueOf4)) {
            return;
        }
        Object m88968bg5 = this.f16259bX.m88968bg("app.app_name");
        Object m88968bg6 = this.f16259bX.m88968bg("source");
        if (m88968bg5 == null && m88968bg6 == null) {
            return;
        }
        if (m88968bg5 == null) {
            m88968bg5 = m88968bg6;
        }
        String valueOf5 = String.valueOf(m88968bg5);
        if (TextUtils.isEmpty(valueOf5)) {
            return;
        }
        c7457Kg.m88981bg(UnifiedMediationParams.KEY_IMAGE_URL, valueOf);
        c7457Kg.m88981bg("title", valueOf2);
        c7457Kg.m88981bg("description", valueOf3);
        c7457Kg.m88981bg("icon", valueOf4);
        c7457Kg.m88981bg("app_name", valueOf5);
        c7457Kg.m88978bg(true);
    }

    /* renamed from: bg */
    public C7457Kg m88700bg(double d, int i, double d2, String str, C7282Ta c7282Ta) {
        JSONObject jSONObject;
        this.f16259bX.m88969bg();
        try {
            jSONObject = new JSONObject(this.ldr.f16175IL);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        C7457Kg m88694bg = m88694bg(C7480eqN.m88707bg(this.f16260bg, jSONObject), (C7457Kg) null);
        m88699bg(m88694bg);
        C7485zx c7485zx = new C7485zx(d, i, d2, str, c7282Ta);
        C7485zx.C7486bg c7486bg = new C7485zx.C7486bg();
        C7484bg c7484bg = this.eqN;
        c7486bg.f16270bg = c7484bg.f16264bg;
        c7486bg.f16268IL = c7484bg.f16262IL;
        c7486bg.f16269bX = 0.0f;
        c7485zx.m88686bg(c7486bg);
        c7485zx.m88688bg(m88694bg, 0.0f, 0.0f);
        c7485zx.m88692bg();
        C7456IL c7456il = c7485zx.f16267bg;
        if (c7456il.eqN == 65536.0f) {
            return null;
        }
        return c7456il.ldr;
    }

    /* renamed from: bg */
    private void m88699bg(C7457Kg c7457Kg) {
        int m88676bg;
        if (c7457Kg == null) {
            return;
        }
        if (C7324bg.m89118bg().m89119bX() != null) {
            m88676bg = C7324bg.m89118bg().m89119bX().mo85792Lq();
        } else {
            m88676bg = C7489Kg.m88676bg(C7487eqN.m88683bg());
        }
        int m88680IL = C7489Kg.m88680IL(C7487eqN.m88683bg(), m88676bg);
        C7484bg c7484bg = this.eqN;
        float min = c7484bg.f16263bX ? c7484bg.f16264bg : Math.min(c7484bg.f16264bg, m88680IL);
        if (this.eqN.f16262IL == 0.0f) {
            c7457Kg.m88971zx(min);
            c7457Kg.m88977eo().m88755zx().m88799eo("auto");
            c7457Kg.ldr(0.0f);
            return;
        }
        c7457Kg.m88971zx(min);
        int m88680IL2 = C7489Kg.m88680IL(C7487eqN.m88683bg(), C7489Kg.m88681IL(C7487eqN.m88683bg()));
        C7484bg c7484bg2 = this.eqN;
        c7457Kg.ldr(c7484bg2.f16263bX ? c7484bg2.f16262IL : Math.min(c7484bg2.f16262IL, m88680IL2));
        c7457Kg.m88977eo().m88755zx().m88799eo("fixed");
    }

    /* renamed from: bg */
    public C7457Kg m88694bg(JSONObject jSONObject, C7457Kg c7457Kg) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.ldr != null) {
                C7477bX c7477bX = new C7477bX();
                this.f16261zx = c7477bX;
                JSONObject m88713bg = c7477bX.m88713bg(this.ldr.f16177bg, optInt, jSONObject);
                if (m88713bg != null) {
                    jSONObject = m88713bg;
                }
            }
        }
        C7457Kg m88695bg = m88695bg(jSONObject);
        m88695bg.m88984bg(c7457Kg);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            m88695bg.m88980bg((List<C7457Kg>) null);
            return m88695bg;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    length = m88695bg.m88977eo().m88755zx().m88880Dt();
                } else {
                    length = optJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    C7457Kg m88694bg = m88694bg(optJSONArray2.optJSONObject(i2), m88695bg);
                    if (C7487eqN.m88685IL() && "skip-with-time".equals(m88695bg.m88977eo().m88764IL()) && !C21114v8.C21122h.f54047T.equals(m88695bg.rri()) && !TextUtils.isEmpty(m88695bg.rri())) {
                        m88694bg.m88988bX(m88695bg.rri());
                    }
                    arrayList.add(m88694bg);
                    arrayList3.add(m88694bg);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            m88695bg.m88980bg(arrayList);
        }
        if (arrayList2.size() > 0) {
            m88695bg.m88998IL(arrayList2);
        }
        return m88695bg;
    }

    /* renamed from: bg */
    public C7457Kg m88695bg(JSONObject jSONObject) {
        String m88696bg;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        C7476WR.m88718bg(optString, optJSONObject);
        JSONObject m88717bg = C7476WR.m88717bg(optString, C7476WR.m88716bg(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        C7457Kg c7457Kg = new C7457Kg();
        if (TextUtils.isEmpty(optString2)) {
            c7457Kg.m88999IL(String.valueOf(c7457Kg.hashCode()));
        } else {
            c7457Kg.m88999IL(optString2);
        }
        if (optJSONObject != null) {
            m88702IL(c7457Kg);
            c7457Kg.m88989bX((float) optJSONObject.optDouble("x"));
            c7457Kg.eqN((float) optJSONObject.optDouble("y"));
            c7457Kg.m88971zx((float) optJSONObject.optDouble("width"));
            c7457Kg.ldr((float) optJSONObject.optDouble("height"));
            c7457Kg.m88975iR(optJSONObject.optInt("remainWidth"));
            C7466zx c7466zx = new C7466zx();
            c7466zx.m88757bg(optString);
            c7466zx.m88762IL(optJSONObject.optString("data"));
            c7466zx.m88760bX(optJSONObject.optString("dataExtraInfo"));
            C7465ldr m88806bg = C7465ldr.m88806bg(optJSONObject);
            c7466zx.m88758bg(m88806bg);
            C7465ldr m88806bg2 = C7465ldr.m88806bg(m88717bg);
            if (m88806bg2 == null) {
                c7466zx.m88763IL(m88806bg);
            } else {
                c7466zx.m88763IL(m88806bg2);
            }
            m88698bg(m88806bg);
            m88698bg(m88806bg2);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.f16258IL) != null) {
                m88697bg(c7466zx, jSONObject2.optInt("image_mode"));
            }
            String m88764IL = c7466zx.m88764IL();
            C7465ldr m88755zx = c7466zx.m88755zx();
            if (f16257iR.containsKey(m88764IL) && !m88755zx.m88787lM()) {
                m88755zx.m88877Fy(f16257iR.get(m88764IL));
            }
            if (m88755zx.m88787lM()) {
                m88696bg = c7466zx.m88761bX();
            } else {
                m88696bg = m88696bg(c7466zx.m88761bX());
            }
            if (C7487eqN.m88685IL()) {
                if (TextUtils.equals(m88764IL, "star") || TextUtils.equals(m88764IL, "text_star")) {
                    m88696bg = m88696bg("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(m88764IL, "score-count") || TextUtils.equals(m88764IL, "score-count-type-1") || TextUtils.equals(m88764IL, "score-count-type-2")) {
                    m88696bg = m88696bg("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(m88764IL) && m88806bg.uny()) {
                    m88696bg = m88696bg("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(m88701bg()) && (TextUtils.equals("logo-union", optString) || TextUtils.equals("logo", optString))) {
                c7466zx.m88762IL(m88696bg + "adx:" + m88701bg());
            } else {
                c7466zx.m88762IL(m88696bg);
            }
            c7457Kg.m88983bg(c7466zx);
        }
        return c7457Kg;
    }

    /* renamed from: bg */
    private void m88697bg(C7466zx c7466zx, int i) {
        int lastIndexOf;
        if (i != 5 && i != 15 && i != 50 && i != 154) {
            c7466zx.m88757bg("image");
            String m88720bg = C7476WR.m88720bg("image");
            C7465ldr m88755zx = c7466zx.m88755zx();
            m88755zx.m88877Fy(m88720bg);
            c7466zx.m88756iR().m88877Fy(m88720bg);
            String m88719bg = C7476WR.m88719bg("image", "clickArea");
            if (!TextUtils.isEmpty(m88719bg)) {
                m88755zx.m88853Lq(m88719bg);
                c7466zx.m88756iR().m88853Lq(m88719bg);
            }
            JSONObject m88780uV = m88755zx.m88780uV();
            if (m88780uV != null) {
                m88755zx.rri(m88780uV.optString("imageLottieTosPath"));
                m88755zx.m88847PX(m88780uV.optBoolean("animationsLoop"));
                m88755zx.m88866Ja(m88780uV.optInt("lottieAppNameMaxLength"));
                m88755zx.DDQ(m88780uV.optInt("lottieAdDescMaxLength"));
                m88755zx.m88838Uw(m88780uV.optInt("lottieAdTitleMaxLength"));
            }
            c7466zx.m88762IL(m88720bg);
            if (m88720bg != null && (lastIndexOf = m88720bg.lastIndexOf(".")) > 0) {
                String substring = m88720bg.substring(0, lastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", m88696bg(substring + ".width"));
                    jSONObject.put("height", m88696bg(substring + ".height"));
                } catch (JSONException unused) {
                }
                c7466zx.m88760bX(jSONObject.toString());
            }
            m88755zx.m88876GR();
            return;
        }
        c7466zx.m88757bg("video");
        String m88720bg2 = C7476WR.m88720bg("video");
        c7466zx.m88755zx().m88877Fy(m88720bg2);
        String m88719bg2 = C7476WR.m88719bg("video", "clickArea");
        if (!TextUtils.isEmpty(m88719bg2)) {
            c7466zx.m88755zx().m88853Lq(m88719bg2);
            c7466zx.m88756iR().m88853Lq(m88719bg2);
        }
        c7466zx.m88756iR().m88877Fy(m88720bg2);
        c7466zx.m88762IL(m88720bg2);
        c7466zx.m88755zx().m88773wq();
    }

    /* renamed from: bg */
    private String m88696bg(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f16259bX.m88970IL(str2)) {
                String valueOf = String.valueOf(this.f16259bX.m88968bg(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    /* renamed from: bg */
    private String m88701bg() {
        C7459bX c7459bX = this.f16259bX;
        return c7459bX == null ? "" : String.valueOf(c7459bX.m88968bg("adx_name"));
    }

    /* renamed from: bg */
    private void m88698bg(C7465ldr c7465ldr) {
        if (c7465ldr == null) {
            return;
        }
        String m88841Uq = c7465ldr.m88841Uq();
        if (C7487eqN.m88685IL()) {
            String m88679bX = C7489Kg.m88679bX(C7487eqN.m88683bg());
            if ("zh".equals(m88679bX)) {
                m88679bX = "cn";
            }
            if (!TextUtils.isEmpty(m88679bX) && c7465ldr.ldr() != null) {
                String optString = c7465ldr.ldr().optString(m88679bX);
                if (!TextUtils.isEmpty(optString)) {
                    m88841Uq = optString;
                }
            }
        }
        if (TextUtils.isEmpty(m88841Uq)) {
            return;
        }
        int indexOf = m88841Uq.indexOf("{{");
        int indexOf2 = m88841Uq.indexOf("}}");
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf2 >= indexOf) {
            String m88696bg = m88696bg(m88841Uq.substring(indexOf + 2, indexOf2));
            StringBuilder sb2 = new StringBuilder(m88841Uq.substring(0, indexOf));
            if (!TextUtils.isEmpty(m88696bg)) {
                sb2.append(m88696bg);
            }
            sb2.append(m88841Uq.substring(indexOf2 + 2));
            c7465ldr.m88848PX(sb2.toString());
            return;
        }
        c7465ldr.m88848PX(m88841Uq);
    }
}
