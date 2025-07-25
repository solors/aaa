package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C18737a;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.internal.C18752g;
import com.iab.omid.library.vungle.internal.C18753h;
import com.iab.omid.library.vungle.utils.C18768a;
import com.iab.omid.library.vungle.utils.C18769b;
import com.iab.omid.library.vungle.utils.C18770c;
import com.iab.omid.library.vungle.utils.C18776f;
import com.iab.omid.library.vungle.weakreference.C18796b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f46916a;

    /* renamed from: b */
    private C18796b f46917b;

    /* renamed from: c */
    private AdEvents f46918c;

    /* renamed from: d */
    private MediaEvents f46919d;

    /* renamed from: e */
    private EnumC18763a f46920e;

    /* renamed from: f */
    private long f46921f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.vungle.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18763a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m61452a();
        this.f46916a = str;
        this.f46917b = new C18796b(null);
    }

    /* renamed from: a */
    public void m61452a() {
        this.f46921f = C18776f.m61390b();
        this.f46920e = EnumC18763a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo61428b() {
        this.f46917b.clear();
    }

    /* renamed from: c */
    public AdEvents m61436c() {
        return this.f46918c;
    }

    /* renamed from: d */
    public MediaEvents m61435d() {
        return this.f46919d;
    }

    /* renamed from: e */
    public boolean m61434e() {
        if (this.f46917b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m61433f() {
        C18753h.m61491a().m61490a(getWebView(), this.f46916a);
    }

    /* renamed from: g */
    public void m61432g() {
        C18753h.m61491a().m61479b(getWebView(), this.f46916a);
    }

    public WebView getWebView() {
        return this.f46917b.get();
    }

    /* renamed from: h */
    public void m61431h() {
        m61440a((JSONObject) null);
    }

    /* renamed from: a */
    public void m61451a(float f) {
        C18753h.m61491a().m61489a(getWebView(), this.f46916a, f);
    }

    /* renamed from: b */
    public void m61438b(String str, long j) {
        if (j >= this.f46921f) {
            this.f46920e = EnumC18763a.AD_STATE_VISIBLE;
            C18753h.m61491a().m61478b(getWebView(), this.f46916a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m61450a(WebView webView) {
        this.f46917b = new C18796b(webView);
    }

    /* renamed from: b */
    public void m61437b(boolean z) {
        if (m61434e()) {
            C18753h.m61491a().m61487a(getWebView(), this.f46916a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m61449a(AdEvents adEvents) {
        this.f46918c = adEvents;
    }

    /* renamed from: a */
    public void m61448a(AdSessionConfiguration adSessionConfiguration) {
        C18753h.m61491a().m61485a(getWebView(), this.f46916a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m61447a(ErrorType errorType, String str) {
        C18753h.m61491a().m61488a(getWebView(), this.f46916a, errorType, str);
    }

    /* renamed from: a */
    public void mo61430a(C18737a c18737a, AdSessionContext adSessionContext) {
        m61446a(c18737a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m61446a(C18737a c18737a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18737a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18770c.m61409a(jSONObject2, "environment", "app");
        C18770c.m61409a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18770c.m61409a(jSONObject2, "deviceInfo", C18769b.m61420d());
        C18770c.m61409a(jSONObject2, "deviceCategory", C18768a.m61425a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18770c.m61409a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18770c.m61409a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18770c.m61409a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18770c.m61409a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18770c.m61409a(jSONObject4, "libraryVersion", "1.5.0-Vungle");
        C18770c.m61409a(jSONObject4, "appId", C18752g.m61492b().m61494a().getApplicationContext().getPackageName());
        C18770c.m61409a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18770c.m61409a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18770c.m61409a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18770c.m61409a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18753h.m61491a().m61484a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m61445a(MediaEvents mediaEvents) {
        this.f46919d = mediaEvents;
    }

    /* renamed from: a */
    public void m61444a(String str) {
        m61442a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m61443a(String str, long j) {
        if (j >= this.f46921f) {
            EnumC18763a enumC18763a = this.f46920e;
            EnumC18763a enumC18763a2 = EnumC18763a.AD_STATE_NOTVISIBLE;
            if (enumC18763a != enumC18763a2) {
                this.f46920e = enumC18763a2;
                C18753h.m61491a().m61478b(getWebView(), this.f46916a, str);
            }
        }
    }

    /* renamed from: a */
    public void m61442a(String str, @Nullable JSONObject jSONObject) {
        C18753h.m61491a().m61486a(getWebView(), this.f46916a, str, jSONObject);
    }

    /* renamed from: a */
    public void m61441a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18770c.m61409a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18753h.m61491a().m61481a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m61440a(@Nullable JSONObject jSONObject) {
        C18753h.m61491a().m61477b(getWebView(), this.f46916a, jSONObject);
    }

    /* renamed from: a */
    public void m61439a(boolean z) {
        if (m61434e()) {
            C18753h.m61491a().m61475c(getWebView(), this.f46916a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo61427i() {
    }
}
