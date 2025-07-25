package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.smaato.sdk.video.vast.model.Companion;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.b1 */
/* loaded from: classes7.dex */
public abstract class AbstractC25652b1 {

    /* renamed from: a */
    public final C26073s f66624a;

    /* renamed from: b */
    public final C25832j f66625b;

    /* renamed from: c */
    public final Context f66626c;

    /* renamed from: d */
    public final C25625a1 f66627d;

    /* renamed from: e */
    public boolean f66628e = true;

    public AbstractC25652b1(C26073s c26073s, C25832j c25832j, int i, Context context) {
        this.f66624a = c26073s;
        this.f66625b = c25832j;
        this.f66626c = context;
        C25625a1 m44252a = C25625a1.m44252a(c26073s, c25832j, context);
        this.f66627d = m44252a;
        m44252a.m44248b(i);
    }

    /* renamed from: a */
    public void m44191a(JSONObject jSONObject, AbstractC25742f0 abstractC25742f0) {
        m44189b(jSONObject, abstractC25742f0);
        Boolean m42979d = this.f66624a.m42979d();
        abstractC25742f0.setAllowClose(m42979d != null ? m42979d.booleanValue() : jSONObject.optBoolean("allowClose", abstractC25742f0.isAllowClose()));
        Boolean m42971f = this.f66624a.m42971f();
        abstractC25742f0.setAllowPause(m42971f != null ? m42971f.booleanValue() : jSONObject.optBoolean("hasPause", abstractC25742f0.isAllowPause()));
        Boolean m42968g = this.f66624a.m42968g();
        abstractC25742f0.setAllowReplay(m42968g != null ? m42968g.booleanValue() : jSONObject.optBoolean("allowReplay", abstractC25742f0.isAllowReplay()));
        float m42975e = this.f66624a.m42975e();
        if (m42975e < 0.0f) {
            m42975e = (float) jSONObject.optDouble("allowCloseDelay", abstractC25742f0.getAllowCloseDelay());
        }
        abstractC25742f0.setAllowCloseDelay(m42975e);
    }

    /* renamed from: b */
    public void m44189b(JSONObject jSONObject, AbstractC25742f0 abstractC25742f0) {
        float m42944y = this.f66624a.m42944y();
        if (m42944y < 0.0f && jSONObject.has("point")) {
            m42944y = (float) jSONObject.optDouble("point");
            if (m42944y < 0.0f) {
                m44192a("Bad value", "Wrong value " + m42944y + " for point", abstractC25742f0.getId());
            }
        }
        float m42943z = this.f66624a.m42943z();
        if (m42943z < 0.0f && jSONObject.has("pointP")) {
            m42943z = (float) jSONObject.optDouble("pointP");
            if (m42943z < 0.0f) {
                m44192a("Bad value", "Wrong value " + m42943z + " for pointP", abstractC25742f0.getId());
            }
        }
        if (m42944y < 0.0f && m42943z < 0.0f) {
            m42944y = -1.0f;
            m42943z = -1.0f;
        }
        abstractC25742f0.setPoint(m42944y);
        abstractC25742f0.setPointP(m42943z);
    }

    /* renamed from: c */
    public void m44188c(JSONObject jSONObject, AbstractC25742f0 abstractC25742f0) {
        C25726e1 m44190a;
        JSONArray optJSONArray = jSONObject.optJSONArray("companionAds");
        if (optJSONArray == null) {
            return;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (m44190a = m44190a(optJSONObject, abstractC25742f0.getId())) != null) {
                abstractC25742f0.addCompanion(m44190a);
            }
        }
    }

    /* renamed from: d */
    public boolean m44187d(JSONObject jSONObject, AbstractC25742f0 abstractC25742f0) {
        this.f66627d.m44250a(jSONObject, abstractC25742f0);
        this.f66628e = abstractC25742f0.isLogErrors();
        if ("statistics".equals(abstractC25742f0.getType())) {
            m44189b(jSONObject, abstractC25742f0);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public C25845j9 m44186e(JSONObject jSONObject, AbstractC25742f0 abstractC25742f0) {
        int i;
        String optString = jSONObject.optString("src");
        if (TextUtils.isEmpty(optString)) {
            AbstractC25846ja.m43680a("CommonVideoParser: encoded shoppable source is empty or null");
            return null;
        }
        try {
            String str = new String(Base64.decode(optString, 0));
            int i2 = 2;
            if (jSONObject.has("interactionTimeout")) {
                i = jSONObject.optInt("interactionTimeout");
            } else {
                m44192a("Bad value", "Shoppable banner hasn't interactionTimeout", abstractC25742f0.getId());
                i = 2;
            }
            if (i < 0) {
                m44192a("Bad value", "Shoppable banner has invalid interactionTimeout", abstractC25742f0.getId());
            } else {
                i2 = i;
            }
            C25845j9 newBanner = C25845j9.newBanner(str, Math.min(i2, abstractC25742f0.getDuration()) * 1000.0f);
            this.f66627d.m44250a(jSONObject, newBanner);
            return newBanner;
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("CommonVideoParser: shoppable source parsing is ended with exception - " + th);
            m44192a("Bad value", "Shoppable banner has invalid or empty source", abstractC25742f0.getId());
            return null;
        }
    }

    /* renamed from: a */
    public C25726e1 m44190a(JSONObject jSONObject, String str) {
        C25726e1 newBanner = C25726e1.newBanner();
        this.f66627d.m44250a(jSONObject, newBanner);
        if (newBanner.getWidth() == 0 || newBanner.getHeight() == 0) {
            m44192a("Required field", "Unable to add companion banner with width " + newBanner.getWidth() + " and height " + newBanner.getHeight(), str);
            return null;
        }
        newBanner.setAssetWidth(jSONObject.optInt(Companion.ASSET_WIDTH));
        newBanner.setAssetHeight(jSONObject.optInt(Companion.ASSET_HEIGHT));
        newBanner.setExpandedWidth(jSONObject.optInt(Companion.EXPANDED_WIDTH));
        newBanner.setExpandedHeight(jSONObject.optInt(Companion.EXPANDED_HEIGHT));
        newBanner.setStaticResource(jSONObject.optString("staticResource"));
        newBanner.setIframeResource(jSONObject.optString("iframeResource"));
        newBanner.setHtmlResource(jSONObject.optString("htmlResource"));
        newBanner.setApiFramework(jSONObject.optString("apiFramework"));
        newBanner.setAdSlotID(jSONObject.optString(Companion.AD_SLOT_ID));
        String optString = jSONObject.optString("required");
        if (!TextUtils.isEmpty(optString)) {
            if ("all".equals(optString) || "any".equals(optString) || "none".equals(optString)) {
                newBanner.setRequired(optString);
            } else {
                m44192a("Bad value", "Wrong companion required attribute:" + optString, str);
            }
        }
        return newBanner;
    }

    /* renamed from: a */
    public void m44192a(String str, String str2, String str3) {
        if (this.f66628e) {
            String str4 = this.f66624a.f67806a;
            C25656b5 m44175c = C25656b5.m44178a(str).m44173e(str2).m44180a(this.f66625b.getSlotId()).m44175c(str3);
            if (str4 == null) {
                str4 = this.f66624a.f67807b;
            }
            m44175c.m44176b(str4).m44177b(this.f66626c);
        }
    }
}
