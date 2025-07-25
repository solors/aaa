package com.iab.omid.library.appodeal.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.C17867a;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.iab.omid.library.appodeal.internal.C17882g;
import com.iab.omid.library.appodeal.internal.C17883h;
import com.iab.omid.library.appodeal.utils.C17898a;
import com.iab.omid.library.appodeal.utils.C17899b;
import com.iab.omid.library.appodeal.utils.C17900c;
import com.iab.omid.library.appodeal.utils.C17906f;
import com.iab.omid.library.appodeal.weakreference.C17926b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f45097a;

    /* renamed from: b */
    private C17926b f45098b;

    /* renamed from: c */
    private AdEvents f45099c;

    /* renamed from: d */
    private MediaEvents f45100d;

    /* renamed from: e */
    private EnumC17893a f45101e;

    /* renamed from: f */
    private long f45102f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC17893a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m64832a();
        this.f45097a = str;
        this.f45098b = new C17926b(null);
    }

    /* renamed from: a */
    public void m64832a() {
        this.f45102f = C17906f.m64770b();
        this.f45101e = EnumC17893a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo64808b() {
        this.f45098b.clear();
    }

    /* renamed from: c */
    public AdEvents m64816c() {
        return this.f45099c;
    }

    /* renamed from: d */
    public MediaEvents m64815d() {
        return this.f45100d;
    }

    /* renamed from: e */
    public boolean m64814e() {
        if (this.f45098b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m64813f() {
        C17883h.m64871a().m64870a(getWebView(), this.f45097a);
    }

    /* renamed from: g */
    public void m64812g() {
        C17883h.m64871a().m64859b(getWebView(), this.f45097a);
    }

    public WebView getWebView() {
        return this.f45098b.get();
    }

    /* renamed from: h */
    public void m64811h() {
        m64820a((JSONObject) null);
    }

    /* renamed from: a */
    public void m64831a(float f) {
        C17883h.m64871a().m64869a(getWebView(), this.f45097a, f);
    }

    /* renamed from: b */
    public void m64818b(String str, long j) {
        if (j >= this.f45102f) {
            this.f45101e = EnumC17893a.AD_STATE_VISIBLE;
            C17883h.m64871a().m64858b(getWebView(), this.f45097a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m64830a(WebView webView) {
        this.f45098b = new C17926b(webView);
    }

    /* renamed from: b */
    public void m64817b(boolean z) {
        if (m64814e()) {
            C17883h.m64871a().m64867a(getWebView(), this.f45097a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m64829a(AdEvents adEvents) {
        this.f45099c = adEvents;
    }

    /* renamed from: a */
    public void m64828a(AdSessionConfiguration adSessionConfiguration) {
        C17883h.m64871a().m64865a(getWebView(), this.f45097a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m64827a(ErrorType errorType, String str) {
        C17883h.m64871a().m64868a(getWebView(), this.f45097a, errorType, str);
    }

    /* renamed from: a */
    public void mo64810a(C17867a c17867a, AdSessionContext adSessionContext) {
        m64826a(c17867a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m64826a(C17867a c17867a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c17867a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C17900c.m64789a(jSONObject2, "environment", "app");
        C17900c.m64789a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C17900c.m64789a(jSONObject2, "deviceInfo", C17899b.m64800d());
        C17900c.m64789a(jSONObject2, "deviceCategory", C17898a.m64805a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C17900c.m64789a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C17900c.m64789a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C17900c.m64789a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C17900c.m64789a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C17900c.m64789a(jSONObject4, "libraryVersion", "1.5.2-Appodeal");
        C17900c.m64789a(jSONObject4, "appId", C17882g.m64872b().m64874a().getApplicationContext().getPackageName());
        C17900c.m64789a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C17900c.m64789a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C17900c.m64789a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C17900c.m64789a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C17883h.m64871a().m64864a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m64825a(MediaEvents mediaEvents) {
        this.f45100d = mediaEvents;
    }

    /* renamed from: a */
    public void m64824a(String str) {
        m64822a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m64823a(String str, long j) {
        if (j >= this.f45102f) {
            EnumC17893a enumC17893a = this.f45101e;
            EnumC17893a enumC17893a2 = EnumC17893a.AD_STATE_NOTVISIBLE;
            if (enumC17893a != enumC17893a2) {
                this.f45101e = enumC17893a2;
                C17883h.m64871a().m64858b(getWebView(), this.f45097a, str);
            }
        }
    }

    /* renamed from: a */
    public void m64822a(String str, @Nullable JSONObject jSONObject) {
        C17883h.m64871a().m64866a(getWebView(), this.f45097a, str, jSONObject);
    }

    /* renamed from: a */
    public void m64821a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C17900c.m64789a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C17883h.m64871a().m64861a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m64820a(@Nullable JSONObject jSONObject) {
        C17883h.m64871a().m64857b(getWebView(), this.f45097a, jSONObject);
    }

    /* renamed from: a */
    public void m64819a(boolean z) {
        if (m64814e()) {
            C17883h.m64871a().m64855c(getWebView(), this.f45097a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo64807i() {
    }
}
