package com.iab.omid.library.pubnativenet.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubnativenet.adsession.AdEvents;
import com.iab.omid.library.pubnativenet.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubnativenet.adsession.AdSessionContext;
import com.iab.omid.library.pubnativenet.adsession.C18496a;
import com.iab.omid.library.pubnativenet.adsession.ErrorType;
import com.iab.omid.library.pubnativenet.adsession.VerificationScriptResource;
import com.iab.omid.library.pubnativenet.adsession.media.MediaEvents;
import com.iab.omid.library.pubnativenet.internal.C18511g;
import com.iab.omid.library.pubnativenet.internal.C18512h;
import com.iab.omid.library.pubnativenet.utils.C18527a;
import com.iab.omid.library.pubnativenet.utils.C18528b;
import com.iab.omid.library.pubnativenet.utils.C18529c;
import com.iab.omid.library.pubnativenet.utils.C18535f;
import com.iab.omid.library.pubnativenet.weakreference.C18555b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f46390a;

    /* renamed from: b */
    private C18555b f46391b;

    /* renamed from: c */
    private AdEvents f46392c;

    /* renamed from: d */
    private MediaEvents f46393d;

    /* renamed from: e */
    private EnumC18522a f46394e;

    /* renamed from: f */
    private long f46395f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.pubnativenet.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18522a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m62427a();
        this.f46390a = str;
        this.f46391b = new C18555b(null);
    }

    /* renamed from: a */
    public void m62427a() {
        this.f46395f = C18535f.m62365b();
        this.f46394e = EnumC18522a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo62403b() {
        this.f46391b.clear();
    }

    /* renamed from: c */
    public AdEvents m62411c() {
        return this.f46392c;
    }

    /* renamed from: d */
    public MediaEvents m62410d() {
        return this.f46393d;
    }

    /* renamed from: e */
    public boolean m62409e() {
        if (this.f46391b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m62408f() {
        C18512h.m62466a().m62465a(getWebView(), this.f46390a);
    }

    /* renamed from: g */
    public void m62407g() {
        C18512h.m62466a().m62454b(getWebView(), this.f46390a);
    }

    public WebView getWebView() {
        return this.f46391b.get();
    }

    /* renamed from: h */
    public void m62406h() {
        m62415a((JSONObject) null);
    }

    /* renamed from: a */
    public void m62426a(float f) {
        C18512h.m62466a().m62464a(getWebView(), this.f46390a, f);
    }

    /* renamed from: b */
    public void m62413b(String str, long j) {
        if (j >= this.f46395f) {
            this.f46394e = EnumC18522a.AD_STATE_VISIBLE;
            C18512h.m62466a().m62453b(getWebView(), this.f46390a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m62425a(WebView webView) {
        this.f46391b = new C18555b(webView);
    }

    /* renamed from: b */
    public void m62412b(boolean z) {
        if (m62409e()) {
            C18512h.m62466a().m62462a(getWebView(), this.f46390a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m62424a(AdEvents adEvents) {
        this.f46392c = adEvents;
    }

    /* renamed from: a */
    public void m62423a(AdSessionConfiguration adSessionConfiguration) {
        C18512h.m62466a().m62460a(getWebView(), this.f46390a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m62422a(ErrorType errorType, String str) {
        C18512h.m62466a().m62463a(getWebView(), this.f46390a, errorType, str);
    }

    /* renamed from: a */
    public void mo62405a(C18496a c18496a, AdSessionContext adSessionContext) {
        m62421a(c18496a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m62421a(C18496a c18496a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18496a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18529c.m62384a(jSONObject2, "environment", "app");
        C18529c.m62384a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18529c.m62384a(jSONObject2, "deviceInfo", C18528b.m62395d());
        C18529c.m62384a(jSONObject2, "deviceCategory", C18527a.m62400a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18529c.m62384a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18529c.m62384a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18529c.m62384a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18529c.m62384a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18529c.m62384a(jSONObject4, "libraryVersion", "1.5.1-Pubnativenet");
        C18529c.m62384a(jSONObject4, "appId", C18511g.m62467b().m62469a().getApplicationContext().getPackageName());
        C18529c.m62384a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18529c.m62384a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18529c.m62384a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18529c.m62384a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18512h.m62466a().m62459a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m62420a(MediaEvents mediaEvents) {
        this.f46393d = mediaEvents;
    }

    /* renamed from: a */
    public void m62419a(String str) {
        m62417a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m62418a(String str, long j) {
        if (j >= this.f46395f) {
            EnumC18522a enumC18522a = this.f46394e;
            EnumC18522a enumC18522a2 = EnumC18522a.AD_STATE_NOTVISIBLE;
            if (enumC18522a != enumC18522a2) {
                this.f46394e = enumC18522a2;
                C18512h.m62466a().m62453b(getWebView(), this.f46390a, str);
            }
        }
    }

    /* renamed from: a */
    public void m62417a(String str, @Nullable JSONObject jSONObject) {
        C18512h.m62466a().m62461a(getWebView(), this.f46390a, str, jSONObject);
    }

    /* renamed from: a */
    public void m62416a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18529c.m62384a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18512h.m62466a().m62456a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m62415a(@Nullable JSONObject jSONObject) {
        C18512h.m62466a().m62452b(getWebView(), this.f46390a, jSONObject);
    }

    /* renamed from: a */
    public void m62414a(boolean z) {
        if (m62409e()) {
            C18512h.m62466a().m62450c(getWebView(), this.f46390a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo62402i() {
    }
}
