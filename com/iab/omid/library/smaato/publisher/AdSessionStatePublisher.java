package com.iab.omid.library.smaato.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.C18559a;
import com.iab.omid.library.smaato.adsession.ErrorType;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.iab.omid.library.smaato.adsession.media.MediaEvents;
import com.iab.omid.library.smaato.internal.C18574g;
import com.iab.omid.library.smaato.internal.C18575h;
import com.iab.omid.library.smaato.utils.C18590a;
import com.iab.omid.library.smaato.utils.C18591b;
import com.iab.omid.library.smaato.utils.C18592c;
import com.iab.omid.library.smaato.utils.C18598f;
import com.iab.omid.library.smaato.weakreference.C18618b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f46525a;

    /* renamed from: b */
    private C18618b f46526b;

    /* renamed from: c */
    private AdEvents f46527c;

    /* renamed from: d */
    private MediaEvents f46528d;

    /* renamed from: e */
    private EnumC18585a f46529e;

    /* renamed from: f */
    private long f46530f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.smaato.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18585a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m62174a();
        this.f46525a = str;
        this.f46526b = new C18618b(null);
    }

    /* renamed from: a */
    public void m62174a() {
        this.f46530f = C18598f.m62112b();
        this.f46529e = EnumC18585a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo62150b() {
        this.f46526b.clear();
    }

    /* renamed from: c */
    public AdEvents m62158c() {
        return this.f46527c;
    }

    /* renamed from: d */
    public MediaEvents m62157d() {
        return this.f46528d;
    }

    /* renamed from: e */
    public boolean m62156e() {
        if (this.f46526b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m62155f() {
        C18575h.m62213a().m62212a(getWebView(), this.f46525a);
    }

    /* renamed from: g */
    public void m62154g() {
        C18575h.m62213a().m62201b(getWebView(), this.f46525a);
    }

    public WebView getWebView() {
        return this.f46526b.get();
    }

    /* renamed from: h */
    public void m62153h() {
        m62162a((JSONObject) null);
    }

    /* renamed from: a */
    public void m62173a(float f) {
        C18575h.m62213a().m62211a(getWebView(), this.f46525a, f);
    }

    /* renamed from: b */
    public void m62160b(String str, long j) {
        if (j >= this.f46530f) {
            this.f46529e = EnumC18585a.AD_STATE_VISIBLE;
            C18575h.m62213a().m62200b(getWebView(), this.f46525a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m62172a(WebView webView) {
        this.f46526b = new C18618b(webView);
    }

    /* renamed from: b */
    public void m62159b(boolean z) {
        if (m62156e()) {
            C18575h.m62213a().m62209a(getWebView(), this.f46525a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m62171a(AdEvents adEvents) {
        this.f46527c = adEvents;
    }

    /* renamed from: a */
    public void m62170a(AdSessionConfiguration adSessionConfiguration) {
        C18575h.m62213a().m62207a(getWebView(), this.f46525a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m62169a(ErrorType errorType, String str) {
        C18575h.m62213a().m62210a(getWebView(), this.f46525a, errorType, str);
    }

    /* renamed from: a */
    public void mo62152a(C18559a c18559a, AdSessionContext adSessionContext) {
        m62168a(c18559a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m62168a(C18559a c18559a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18559a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18592c.m62131a(jSONObject2, "environment", "app");
        C18592c.m62131a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18592c.m62131a(jSONObject2, "deviceInfo", C18591b.m62142d());
        C18592c.m62131a(jSONObject2, "deviceCategory", C18590a.m62147a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18592c.m62131a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18592c.m62131a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18592c.m62131a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18592c.m62131a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18592c.m62131a(jSONObject4, "libraryVersion", "1.5.0-Smaato");
        C18592c.m62131a(jSONObject4, "appId", C18574g.m62214b().m62216a().getApplicationContext().getPackageName());
        C18592c.m62131a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18592c.m62131a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18592c.m62131a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18592c.m62131a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18575h.m62213a().m62206a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m62167a(MediaEvents mediaEvents) {
        this.f46528d = mediaEvents;
    }

    /* renamed from: a */
    public void m62166a(String str) {
        m62164a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m62165a(String str, long j) {
        if (j >= this.f46530f) {
            EnumC18585a enumC18585a = this.f46529e;
            EnumC18585a enumC18585a2 = EnumC18585a.AD_STATE_NOTVISIBLE;
            if (enumC18585a != enumC18585a2) {
                this.f46529e = enumC18585a2;
                C18575h.m62213a().m62200b(getWebView(), this.f46525a, str);
            }
        }
    }

    /* renamed from: a */
    public void m62164a(String str, @Nullable JSONObject jSONObject) {
        C18575h.m62213a().m62208a(getWebView(), this.f46525a, str, jSONObject);
    }

    /* renamed from: a */
    public void m62163a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18592c.m62131a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18575h.m62213a().m62203a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m62162a(@Nullable JSONObject jSONObject) {
        C18575h.m62213a().m62199b(getWebView(), this.f46525a, jSONObject);
    }

    /* renamed from: a */
    public void m62161a(boolean z) {
        if (m62156e()) {
            C18575h.m62213a().m62197c(getWebView(), this.f46525a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo62149i() {
    }
}
