package com.iab.omid.library.taurusx.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSessionConfiguration;
import com.iab.omid.library.taurusx.adsession.AdSessionContext;
import com.iab.omid.library.taurusx.adsession.C18621a;
import com.iab.omid.library.taurusx.adsession.ErrorType;
import com.iab.omid.library.taurusx.adsession.VerificationScriptResource;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.iab.omid.library.taurusx.internal.C18635f;
import com.iab.omid.library.taurusx.internal.C18636g;
import com.iab.omid.library.taurusx.utils.C18649a;
import com.iab.omid.library.taurusx.utils.C18650b;
import com.iab.omid.library.taurusx.utils.C18651c;
import com.iab.omid.library.taurusx.utils.C18657f;
import com.iab.omid.library.taurusx.weakreference.C18676b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C18676b f46654a;

    /* renamed from: b */
    private AdEvents f46655b;

    /* renamed from: c */
    private MediaEvents f46656c;

    /* renamed from: d */
    private EnumC18644a f46657d;

    /* renamed from: e */
    private long f46658e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.taurusx.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18644a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        m61931a();
        this.f46654a = new C18676b(null);
    }

    /* renamed from: a */
    public void m61931a() {
        this.f46658e = C18657f.m61872b();
        this.f46657d = EnumC18644a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo61908b() {
        this.f46654a.clear();
    }

    /* renamed from: c */
    public AdEvents m61916c() {
        return this.f46655b;
    }

    /* renamed from: d */
    public MediaEvents m61915d() {
        return this.f46656c;
    }

    /* renamed from: e */
    public boolean m61914e() {
        if (this.f46654a.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m61913f() {
        C18636g.m61964a().m61963a(getWebView());
    }

    /* renamed from: g */
    public void m61912g() {
        C18636g.m61964a().m61952b(getWebView());
    }

    public WebView getWebView() {
        return this.f46654a.get();
    }

    /* renamed from: h */
    public void m61911h() {
        C18636g.m61964a().m61949c(getWebView());
    }

    /* renamed from: a */
    public void m61930a(float f) {
        C18636g.m61964a().m61962a(getWebView(), f);
    }

    /* renamed from: b */
    public void m61917b(String str, long j) {
        if (j >= this.f46658e) {
            this.f46657d = EnumC18644a.AD_STATE_VISIBLE;
            C18636g.m61964a().m61960a(getWebView(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m61929a(WebView webView) {
        this.f46654a = new C18676b(webView);
    }

    /* renamed from: a */
    public void m61928a(AdEvents adEvents) {
        this.f46655b = adEvents;
    }

    /* renamed from: a */
    public void m61927a(AdSessionConfiguration adSessionConfiguration) {
        C18636g.m61964a().m61954a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m61926a(ErrorType errorType, String str) {
        C18636g.m61964a().m61961a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo61910a(C18621a c18621a, AdSessionContext adSessionContext) {
        m61925a(c18621a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m61925a(C18621a c18621a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18621a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18651c.m61889a(jSONObject2, "environment", "app");
        C18651c.m61889a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18651c.m61889a(jSONObject2, "deviceInfo", C18650b.m61900d());
        C18651c.m61889a(jSONObject2, "deviceCategory", C18649a.m61905a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18651c.m61889a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18651c.m61889a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18651c.m61889a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18651c.m61889a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18651c.m61889a(jSONObject4, "libraryVersion", "1.4.8-Taurusx");
        C18651c.m61889a(jSONObject4, "appId", C18635f.m61965b().m61967a().getApplicationContext().getPackageName());
        C18651c.m61889a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18651c.m61889a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18651c.m61889a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18651c.m61889a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18636g.m61964a().m61957a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m61924a(MediaEvents mediaEvents) {
        this.f46656c = mediaEvents;
    }

    /* renamed from: a */
    public void m61923a(String str) {
        C18636g.m61964a().m61958a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m61922a(String str, long j) {
        if (j >= this.f46658e) {
            EnumC18644a enumC18644a = this.f46657d;
            EnumC18644a enumC18644a2 = EnumC18644a.AD_STATE_NOTVISIBLE;
            if (enumC18644a != enumC18644a2) {
                this.f46657d = enumC18644a2;
                C18636g.m61964a().m61960a(getWebView(), str);
            }
        }
    }

    /* renamed from: a */
    public void m61921a(String str, JSONObject jSONObject) {
        C18636g.m61964a().m61958a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void m61920a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18651c.m61889a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18636g.m61964a().m61947c(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m61919a(@NonNull JSONObject jSONObject) {
        C18636g.m61964a().m61950b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m61918a(boolean z) {
        if (m61914e()) {
            C18636g.m61964a().m61951b(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo61907i() {
    }
}
