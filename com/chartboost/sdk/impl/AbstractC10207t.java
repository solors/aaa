package com.chartboost.sdk.impl;

import android.webkit.WebView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.t */
/* loaded from: classes3.dex */
public abstract class AbstractC10207t {

    /* renamed from: a */
    public String f23143a;

    /* renamed from: b */
    public C10204sc f23144b;

    /* renamed from: c */
    public C9991k f23145c;

    /* renamed from: d */
    public C9811d7 f23146d;

    /* renamed from: e */
    public EnumC10208a f23147e;

    /* renamed from: f */
    public long f23148f;

    /* renamed from: com.chartboost.sdk.impl.t$a */
    /* loaded from: classes3.dex */
    public enum EnumC10208a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AbstractC10207t(String str) {
        m80586a();
        this.f23143a = str;
        this.f23144b = new C10204sc(null);
    }

    /* renamed from: a */
    public void m80586a() {
        this.f23148f = C10011kd.m81200b();
        this.f23147e = EnumC10208a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo80572b() {
        this.f23144b.clear();
    }

    /* renamed from: c */
    public C9991k m80569c() {
        return this.f23145c;
    }

    /* renamed from: d */
    public C9811d7 m80568d() {
        return this.f23146d;
    }

    /* renamed from: e */
    public boolean m80567e() {
        if (this.f23144b.get() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m80566f() {
        C10136pd.m80796a().m80795a(m80564h(), this.f23143a);
    }

    /* renamed from: g */
    public void m80565g() {
        C10136pd.m80796a().m80785b(m80564h(), this.f23143a);
    }

    /* renamed from: h */
    public WebView m80564h() {
        return (WebView) this.f23144b.get();
    }

    /* renamed from: i */
    public void m80563i() {
        m80574a((JSONObject) null);
    }

    /* renamed from: a */
    public void m80585a(float f) {
        C10136pd.m80796a().m80794a(m80564h(), this.f23143a, f);
    }

    /* renamed from: b */
    public void m80571b(String str, long j) {
        if (j >= this.f23148f) {
            this.f23147e = EnumC10208a.AD_STATE_VISIBLE;
            C10136pd.m80796a().m80784b(m80564h(), this.f23143a, str);
        }
    }

    /* renamed from: a */
    public void m80584a(WebView webView) {
        this.f23144b = new C10204sc(webView);
    }

    /* renamed from: b */
    public void m80570b(boolean z) {
        if (m80567e()) {
            C10136pd.m80796a().m80793a(m80564h(), this.f23143a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m80580a(C9991k c9991k) {
        this.f23145c = c9991k;
    }

    /* renamed from: a */
    public void m80579a(C10138q c10138q) {
        C10136pd.m80796a().m80791a(m80564h(), this.f23143a, c10138q.m80776c());
    }

    /* renamed from: a */
    public void m80581a(C9811d7 c9811d7) {
        this.f23146d = c9811d7;
    }

    /* renamed from: a */
    public void mo80583a(C9746bc c9746bc, C10157r c10157r) {
        m80582a(c9746bc, c10157r, null);
    }

    /* renamed from: a */
    public void m80582a(C9746bc c9746bc, C10157r c10157r, JSONObject jSONObject) {
        String m81975j = c9746bc.m81975j();
        JSONObject jSONObject2 = new JSONObject();
        AbstractC10359xc.m80049a(jSONObject2, "environment", "app");
        AbstractC10359xc.m80049a(jSONObject2, "adSessionType", c10157r.m80707a());
        AbstractC10359xc.m80049a(jSONObject2, "deviceInfo", AbstractC10135pc.m80797d());
        AbstractC10359xc.m80049a(jSONObject2, "deviceCategory", AbstractC9872gc.m81602a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        AbstractC10359xc.m80049a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        AbstractC10359xc.m80049a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, c10157r.m80700f().m81623a());
        AbstractC10359xc.m80049a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, c10157r.m80700f().m81621b());
        AbstractC10359xc.m80049a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        AbstractC10359xc.m80049a(jSONObject4, "libraryVersion", "1.5.0-Chartboost");
        AbstractC10359xc.m80049a(jSONObject4, "appId", C10105od.m80876b().m80878a().getApplicationContext().getPackageName());
        AbstractC10359xc.m80049a(jSONObject2, "app", jSONObject4);
        if (c10157r.m80704b() != null) {
            AbstractC10359xc.m80049a(jSONObject2, "contentUrl", c10157r.m80704b());
        }
        if (c10157r.m80703c() != null) {
            AbstractC10359xc.m80049a(jSONObject2, "customReferenceData", c10157r.m80703c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (C9933hb c9933hb : c10157r.m80699g()) {
            AbstractC10359xc.m80049a(jSONObject5, c9933hb.m81480b(), c9933hb.m81479c());
        }
        C10136pd.m80796a().m80790a(m80564h(), m81975j, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m80578a(String str) {
        m80576a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m80577a(String str, long j) {
        if (j >= this.f23148f) {
            EnumC10208a enumC10208a = this.f23147e;
            EnumC10208a enumC10208a2 = EnumC10208a.AD_STATE_NOTVISIBLE;
            if (enumC10208a != enumC10208a2) {
                this.f23147e = enumC10208a2;
                C10136pd.m80796a().m80784b(m80564h(), this.f23143a, str);
            }
        }
    }

    /* renamed from: a */
    public void m80576a(String str, JSONObject jSONObject) {
        C10136pd.m80796a().m80792a(m80564h(), this.f23143a, str, jSONObject);
    }

    /* renamed from: a */
    public void m80575a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC10359xc.m80049a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C10136pd.m80796a().m80787a(m80564h(), jSONObject);
    }

    /* renamed from: a */
    public void m80574a(JSONObject jSONObject) {
        C10136pd.m80796a().m80783b(m80564h(), this.f23143a, jSONObject);
    }

    /* renamed from: a */
    public void m80573a(boolean z) {
        if (m80567e()) {
            C10136pd.m80796a().m80781c(m80564h(), this.f23143a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: j */
    public void mo80562j() {
    }
}
