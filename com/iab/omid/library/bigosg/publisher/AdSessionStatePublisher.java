package com.iab.omid.library.bigosg.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.bigosg.adsession.AdEvents;
import com.iab.omid.library.bigosg.adsession.AdSessionConfiguration;
import com.iab.omid.library.bigosg.adsession.AdSessionContext;
import com.iab.omid.library.bigosg.adsession.C17933a;
import com.iab.omid.library.bigosg.adsession.ErrorType;
import com.iab.omid.library.bigosg.adsession.VerificationScriptResource;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.iab.omid.library.bigosg.p387b.C17940d;
import com.iab.omid.library.bigosg.p387b.C17941e;
import com.iab.omid.library.bigosg.p389d.C17950a;
import com.iab.omid.library.bigosg.p389d.C17951b;
import com.iab.omid.library.bigosg.p389d.C17954d;
import com.iab.omid.library.bigosg.p390e.C17958b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C17958b f45232a;

    /* renamed from: b */
    private AdEvents f45233b;

    /* renamed from: c */
    private MediaEvents f45234c;

    /* renamed from: d */
    private EnumC17959a f45235d;

    /* renamed from: e */
    private long f45236e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC17959a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        m64536i();
        this.f45232a = new C17958b(null);
    }

    /* renamed from: a */
    public void mo64535a() {
    }

    /* renamed from: b */
    public void mo64532b() {
        this.f45232a.clear();
    }

    /* renamed from: c */
    public AdEvents m64542c() {
        return this.f45233b;
    }

    /* renamed from: d */
    public MediaEvents m64541d() {
        return this.f45234c;
    }

    /* renamed from: e */
    public boolean m64540e() {
        if (this.f45232a.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m64539f() {
        C17941e.m64634a().m64633a(getWebView());
    }

    /* renamed from: g */
    public void m64538g() {
        C17941e.m64634a().m64622b(getWebView());
    }

    public WebView getWebView() {
        return this.f45232a.get();
    }

    /* renamed from: h */
    public void m64537h() {
        C17941e.m64634a().m64619c(getWebView());
    }

    /* renamed from: i */
    public void m64536i() {
        this.f45236e = C17954d.m64574a();
        this.f45235d = EnumC17959a.AD_STATE_IDLE;
    }

    /* renamed from: a */
    public void m64555a(float f) {
        C17941e.m64634a().m64632a(getWebView(), f);
    }

    /* renamed from: b */
    public void m64543b(String str, long j) {
        if (j >= this.f45236e) {
            EnumC17959a enumC17959a = this.f45235d;
            EnumC17959a enumC17959a2 = EnumC17959a.AD_STATE_NOTVISIBLE;
            if (enumC17959a != enumC17959a2) {
                this.f45235d = enumC17959a2;
                C17941e.m64634a().m64621b(getWebView(), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m64554a(WebView webView) {
        this.f45232a = new C17958b(webView);
    }

    /* renamed from: a */
    public void m64553a(AdEvents adEvents) {
        this.f45233b = adEvents;
    }

    /* renamed from: a */
    public void m64552a(AdSessionConfiguration adSessionConfiguration) {
        C17941e.m64634a().m64624a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m64551a(ErrorType errorType, String str) {
        C17941e.m64634a().m64631a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo64534a(C17933a c17933a, AdSessionContext adSessionContext) {
        m64550a(c17933a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m64550a(C17933a c17933a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c17933a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C17951b.m64585a(jSONObject2, "environment", "app");
        C17951b.m64585a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C17951b.m64585a(jSONObject2, "deviceInfo", C17950a.m64593d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C17951b.m64585a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C17951b.m64585a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C17951b.m64585a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C17951b.m64585a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C17951b.m64585a(jSONObject4, "libraryVersion", "1.3.0-Bigosg");
        C17951b.m64585a(jSONObject4, "appId", C17940d.m64637a().m64635b().getApplicationContext().getPackageName());
        C17951b.m64585a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C17951b.m64585a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C17951b.m64585a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C17951b.m64585a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C17941e.m64634a().m64627a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m64549a(MediaEvents mediaEvents) {
        this.f45234c = mediaEvents;
    }

    /* renamed from: a */
    public void m64548a(String str) {
        C17941e.m64634a().m64628a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m64547a(String str, long j) {
        if (j >= this.f45236e) {
            this.f45235d = EnumC17959a.AD_STATE_VISIBLE;
            C17941e.m64634a().m64621b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void m64546a(String str, JSONObject jSONObject) {
        C17941e.m64634a().m64628a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void m64545a(@NonNull JSONObject jSONObject) {
        C17941e.m64634a().m64620b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m64544a(boolean z) {
        if (m64540e()) {
            C17941e.m64634a().m64618c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }
}
