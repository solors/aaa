package com.iab.omid.library.corpmailru.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.corpmailru.adsession.AdEvents;
import com.iab.omid.library.corpmailru.adsession.AdSessionConfiguration;
import com.iab.omid.library.corpmailru.adsession.AdSessionContext;
import com.iab.omid.library.corpmailru.adsession.C18045a;
import com.iab.omid.library.corpmailru.adsession.ErrorType;
import com.iab.omid.library.corpmailru.adsession.VerificationScriptResource;
import com.iab.omid.library.corpmailru.adsession.media.MediaEvents;
import com.iab.omid.library.corpmailru.p393b.C18051d;
import com.iab.omid.library.corpmailru.p393b.C18052e;
import com.iab.omid.library.corpmailru.p395d.C18061a;
import com.iab.omid.library.corpmailru.p395d.C18062b;
import com.iab.omid.library.corpmailru.p395d.C18065d;
import com.iab.omid.library.corpmailru.p396e.C18069b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C18069b f45474a;

    /* renamed from: b */
    private AdEvents f45475b;

    /* renamed from: c */
    private MediaEvents f45476c;

    /* renamed from: d */
    private EnumC18070a f45477d;

    /* renamed from: e */
    private long f45478e;

    /* renamed from: com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18070a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        m64086i();
        this.f45474a = new C18069b(null);
    }

    /* renamed from: a */
    public void mo64085a() {
    }

    /* renamed from: b */
    public void mo64082b() {
        this.f45474a.clear();
    }

    /* renamed from: c */
    public AdEvents m64092c() {
        return this.f45475b;
    }

    /* renamed from: d */
    public MediaEvents m64091d() {
        return this.f45476c;
    }

    /* renamed from: e */
    public boolean m64090e() {
        if (this.f45474a.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m64089f() {
        C18052e.m64184a().m64183a(getWebView());
    }

    /* renamed from: g */
    public void m64088g() {
        C18052e.m64184a().m64172b(getWebView());
    }

    public WebView getWebView() {
        return this.f45474a.get();
    }

    /* renamed from: h */
    public void m64087h() {
        C18052e.m64184a().m64169c(getWebView());
    }

    /* renamed from: i */
    public void m64086i() {
        this.f45478e = C18065d.m64124a();
        this.f45477d = EnumC18070a.AD_STATE_IDLE;
    }

    /* renamed from: a */
    public void m64105a(float f) {
        C18052e.m64184a().m64182a(getWebView(), f);
    }

    /* renamed from: b */
    public void m64093b(String str, long j) {
        if (j >= this.f45478e) {
            EnumC18070a enumC18070a = this.f45477d;
            EnumC18070a enumC18070a2 = EnumC18070a.AD_STATE_NOTVISIBLE;
            if (enumC18070a != enumC18070a2) {
                this.f45477d = enumC18070a2;
                C18052e.m64184a().m64171b(getWebView(), str);
            }
        }
    }

    /* renamed from: a */
    public void m64104a(WebView webView) {
        this.f45474a = new C18069b(webView);
    }

    /* renamed from: a */
    public void m64103a(AdEvents adEvents) {
        this.f45475b = adEvents;
    }

    /* renamed from: a */
    public void m64102a(AdSessionConfiguration adSessionConfiguration) {
        C18052e.m64184a().m64174a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m64101a(ErrorType errorType, String str) {
        C18052e.m64184a().m64181a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo64084a(C18045a c18045a, AdSessionContext adSessionContext) {
        m64100a(c18045a, adSessionContext, null);
    }

    /* renamed from: a */
    public void m64100a(C18045a c18045a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18045a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18062b.m64135a(jSONObject2, "environment", "app");
        C18062b.m64135a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18062b.m64135a(jSONObject2, "deviceInfo", C18061a.m64143d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18062b.m64135a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18062b.m64135a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18062b.m64135a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18062b.m64135a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18062b.m64135a(jSONObject4, "libraryVersion", "1.3.20-Corpmailru");
        C18062b.m64135a(jSONObject4, "appId", C18051d.m64187a().m64185b().getApplicationContext().getPackageName());
        C18062b.m64135a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18062b.m64135a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18062b.m64135a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18062b.m64135a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18052e.m64184a().m64177a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m64099a(MediaEvents mediaEvents) {
        this.f45476c = mediaEvents;
    }

    /* renamed from: a */
    public void m64098a(String str) {
        C18052e.m64184a().m64178a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m64097a(String str, long j) {
        if (j >= this.f45478e) {
            this.f45477d = EnumC18070a.AD_STATE_VISIBLE;
            C18052e.m64184a().m64171b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void m64096a(String str, JSONObject jSONObject) {
        C18052e.m64184a().m64178a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void m64095a(@NonNull JSONObject jSONObject) {
        C18052e.m64184a().m64170b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m64094a(boolean z) {
        if (m64090e()) {
            C18052e.m64184a().m64168c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }
}
