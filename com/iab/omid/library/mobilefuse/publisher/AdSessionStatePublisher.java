package com.iab.omid.library.mobilefuse.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.adsession.AdEvents;
import com.iab.omid.library.mobilefuse.adsession.AdSessionConfiguration;
import com.iab.omid.library.mobilefuse.adsession.AdSessionContext;
import com.iab.omid.library.mobilefuse.adsession.C18356a;
import com.iab.omid.library.mobilefuse.adsession.ErrorType;
import com.iab.omid.library.mobilefuse.adsession.VerificationScriptResource;
import com.iab.omid.library.mobilefuse.adsession.media.MediaEvents;
import com.iab.omid.library.mobilefuse.internal.C18371g;
import com.iab.omid.library.mobilefuse.internal.C18372h;
import com.iab.omid.library.mobilefuse.utils.C18387a;
import com.iab.omid.library.mobilefuse.utils.C18388b;
import com.iab.omid.library.mobilefuse.utils.C18389c;
import com.iab.omid.library.mobilefuse.utils.C18395f;
import com.iab.omid.library.mobilefuse.weakreference.C18415b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f46120a;

    /* renamed from: b */
    private C18415b f46121b;

    /* renamed from: c */
    private AdEvents f46122c;

    /* renamed from: d */
    private MediaEvents f46123d;

    /* renamed from: e */
    private EnumC18382a f46124e;

    /* renamed from: f */
    private long f46125f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.mobilefuse.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18382a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m62933a();
        this.f46120a = str;
        this.f46121b = new C18415b(null);
    }

    /* renamed from: a */
    public void m62933a() {
        this.f46125f = C18395f.m62871b();
        this.f46124e = EnumC18382a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo62909b() {
        this.f46121b.clear();
    }

    /* renamed from: c */
    public AdEvents m62917c() {
        return this.f46122c;
    }

    /* renamed from: d */
    public MediaEvents m62916d() {
        return this.f46123d;
    }

    /* renamed from: e */
    public boolean m62915e() {
        if (this.f46121b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m62914f() {
        C18372h.m62972a().m62971a(getWebView(), this.f46120a);
    }

    /* renamed from: g */
    public void m62913g() {
        C18372h.m62972a().m62960b(getWebView(), this.f46120a);
    }

    public WebView getWebView() {
        return this.f46121b.get();
    }

    /* renamed from: h */
    public void m62912h() {
        m62921a((JSONObject) null);
    }

    /* renamed from: a */
    public void m62932a(float f) {
        C18372h.m62972a().m62970a(getWebView(), this.f46120a, f);
    }

    /* renamed from: b */
    public void m62919b(String str, long j) {
        if (j >= this.f46125f) {
            this.f46124e = EnumC18382a.AD_STATE_VISIBLE;
            C18372h.m62972a().m62959b(getWebView(), this.f46120a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m62931a(WebView webView) {
        this.f46121b = new C18415b(webView);
    }

    /* renamed from: b */
    public void m62918b(boolean z) {
        if (m62915e()) {
            C18372h.m62972a().m62968a(getWebView(), this.f46120a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m62930a(AdEvents adEvents) {
        this.f46122c = adEvents;
    }

    /* renamed from: a */
    public void m62929a(AdSessionConfiguration adSessionConfiguration) {
        C18372h.m62972a().m62966a(getWebView(), this.f46120a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m62928a(ErrorType errorType, String str) {
        C18372h.m62972a().m62969a(getWebView(), this.f46120a, errorType, str);
    }

    /* renamed from: a */
    public void mo62911a(C18356a c18356a, AdSessionContext adSessionContext) {
        m62927a(c18356a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m62927a(C18356a c18356a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18356a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18389c.m62890a(jSONObject2, "environment", "app");
        C18389c.m62890a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18389c.m62890a(jSONObject2, "deviceInfo", C18388b.m62901d());
        C18389c.m62890a(jSONObject2, "deviceCategory", C18387a.m62906a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18389c.m62890a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18389c.m62890a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18389c.m62890a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18389c.m62890a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18389c.m62890a(jSONObject4, "libraryVersion", "1.4.13-Mobilefuse");
        C18389c.m62890a(jSONObject4, "appId", C18371g.m62973b().m62975a().getApplicationContext().getPackageName());
        C18389c.m62890a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18389c.m62890a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18389c.m62890a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18389c.m62890a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18372h.m62972a().m62965a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m62926a(MediaEvents mediaEvents) {
        this.f46123d = mediaEvents;
    }

    /* renamed from: a */
    public void m62925a(String str) {
        m62923a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m62924a(String str, long j) {
        if (j >= this.f46125f) {
            EnumC18382a enumC18382a = this.f46124e;
            EnumC18382a enumC18382a2 = EnumC18382a.AD_STATE_NOTVISIBLE;
            if (enumC18382a != enumC18382a2) {
                this.f46124e = enumC18382a2;
                C18372h.m62972a().m62959b(getWebView(), this.f46120a, str);
            }
        }
    }

    /* renamed from: a */
    public void m62923a(String str, @Nullable JSONObject jSONObject) {
        C18372h.m62972a().m62967a(getWebView(), this.f46120a, str, jSONObject);
    }

    /* renamed from: a */
    public void m62922a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18389c.m62890a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18372h.m62972a().m62962a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m62921a(@Nullable JSONObject jSONObject) {
        C18372h.m62972a().m62958b(getWebView(), this.f46120a, jSONObject);
    }

    /* renamed from: a */
    public void m62920a(boolean z) {
        if (m62915e()) {
            C18372h.m62972a().m62956c(getWebView(), this.f46120a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo62908i() {
    }
}
