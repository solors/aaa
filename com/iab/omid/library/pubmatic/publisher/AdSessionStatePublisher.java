package com.iab.omid.library.pubmatic.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.adsession.AdEvents;
import com.iab.omid.library.pubmatic.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubmatic.adsession.AdSessionContext;
import com.iab.omid.library.pubmatic.adsession.C18426a;
import com.iab.omid.library.pubmatic.adsession.ErrorType;
import com.iab.omid.library.pubmatic.adsession.VerificationScriptResource;
import com.iab.omid.library.pubmatic.adsession.media.MediaEvents;
import com.iab.omid.library.pubmatic.internal.C18441g;
import com.iab.omid.library.pubmatic.internal.C18442h;
import com.iab.omid.library.pubmatic.utils.C18457a;
import com.iab.omid.library.pubmatic.utils.C18458b;
import com.iab.omid.library.pubmatic.utils.C18459c;
import com.iab.omid.library.pubmatic.utils.C18465f;
import com.iab.omid.library.pubmatic.weakreference.C18485b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f46255a;

    /* renamed from: b */
    private C18485b f46256b;

    /* renamed from: c */
    private AdEvents f46257c;

    /* renamed from: d */
    private MediaEvents f46258d;

    /* renamed from: e */
    private EnumC18452a f46259e;

    /* renamed from: f */
    private long f46260f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.pubmatic.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18452a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m62680a();
        this.f46255a = str;
        this.f46256b = new C18485b(null);
    }

    /* renamed from: a */
    public void m62680a() {
        this.f46260f = C18465f.m62618b();
        this.f46259e = EnumC18452a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo62656b() {
        this.f46256b.clear();
    }

    /* renamed from: c */
    public AdEvents m62664c() {
        return this.f46257c;
    }

    /* renamed from: d */
    public MediaEvents m62663d() {
        return this.f46258d;
    }

    /* renamed from: e */
    public boolean m62662e() {
        if (this.f46256b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m62661f() {
        C18442h.m62719a().m62718a(getWebView(), this.f46255a);
    }

    /* renamed from: g */
    public void m62660g() {
        C18442h.m62719a().m62707b(getWebView(), this.f46255a);
    }

    public WebView getWebView() {
        return this.f46256b.get();
    }

    /* renamed from: h */
    public void m62659h() {
        m62668a((JSONObject) null);
    }

    /* renamed from: a */
    public void m62679a(float f) {
        C18442h.m62719a().m62717a(getWebView(), this.f46255a, f);
    }

    /* renamed from: b */
    public void m62666b(String str, long j) {
        if (j >= this.f46260f) {
            this.f46259e = EnumC18452a.AD_STATE_VISIBLE;
            C18442h.m62719a().m62706b(getWebView(), this.f46255a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m62678a(WebView webView) {
        this.f46256b = new C18485b(webView);
    }

    /* renamed from: b */
    public void m62665b(boolean z) {
        if (m62662e()) {
            C18442h.m62719a().m62715a(getWebView(), this.f46255a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m62677a(AdEvents adEvents) {
        this.f46257c = adEvents;
    }

    /* renamed from: a */
    public void m62676a(AdSessionConfiguration adSessionConfiguration) {
        C18442h.m62719a().m62713a(getWebView(), this.f46255a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m62675a(ErrorType errorType, String str) {
        C18442h.m62719a().m62716a(getWebView(), this.f46255a, errorType, str);
    }

    /* renamed from: a */
    public void mo62658a(C18426a c18426a, AdSessionContext adSessionContext) {
        m62674a(c18426a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m62674a(C18426a c18426a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18426a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18459c.m62637a(jSONObject2, "environment", "app");
        C18459c.m62637a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18459c.m62637a(jSONObject2, "deviceInfo", C18458b.m62648d());
        C18459c.m62637a(jSONObject2, "deviceCategory", C18457a.m62653a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18459c.m62637a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18459c.m62637a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18459c.m62637a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18459c.m62637a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18459c.m62637a(jSONObject4, "libraryVersion", "1.5.1-Pubmatic");
        C18459c.m62637a(jSONObject4, "appId", C18441g.m62720b().m62722a().getApplicationContext().getPackageName());
        C18459c.m62637a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18459c.m62637a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18459c.m62637a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18459c.m62637a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18442h.m62719a().m62712a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m62673a(MediaEvents mediaEvents) {
        this.f46258d = mediaEvents;
    }

    /* renamed from: a */
    public void m62672a(String str) {
        m62670a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m62671a(String str, long j) {
        if (j >= this.f46260f) {
            EnumC18452a enumC18452a = this.f46259e;
            EnumC18452a enumC18452a2 = EnumC18452a.AD_STATE_NOTVISIBLE;
            if (enumC18452a != enumC18452a2) {
                this.f46259e = enumC18452a2;
                C18442h.m62719a().m62706b(getWebView(), this.f46255a, str);
            }
        }
    }

    /* renamed from: a */
    public void m62670a(String str, @Nullable JSONObject jSONObject) {
        C18442h.m62719a().m62714a(getWebView(), this.f46255a, str, jSONObject);
    }

    /* renamed from: a */
    public void m62669a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18459c.m62637a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18442h.m62719a().m62709a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m62668a(@Nullable JSONObject jSONObject) {
        C18442h.m62719a().m62705b(getWebView(), this.f46255a, jSONObject);
    }

    /* renamed from: a */
    public void m62667a(boolean z) {
        if (m62662e()) {
            C18442h.m62719a().m62703c(getWebView(), this.f46255a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo62655i() {
    }
}
