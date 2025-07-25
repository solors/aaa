package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C17799a;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.C17814g;
import com.iab.omid.library.applovin.internal.C17815h;
import com.iab.omid.library.applovin.utils.C17828a;
import com.iab.omid.library.applovin.utils.C17829b;
import com.iab.omid.library.applovin.utils.C17830c;
import com.iab.omid.library.applovin.utils.C17836f;
import com.iab.omid.library.applovin.weakreference.C17856b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f44963a;

    /* renamed from: b */
    private C17856b f44964b;

    /* renamed from: c */
    private AdEvents f44965c;

    /* renamed from: d */
    private MediaEvents f44966d;

    /* renamed from: e */
    private EnumC17823a f44967e;

    /* renamed from: f */
    private long f44968f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.applovin.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC17823a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m65080a();
        this.f44963a = str;
        this.f44964b = new C17856b(null);
    }

    /* renamed from: a */
    public void m65080a() {
        this.f44968f = C17836f.m65020b();
        this.f44967e = EnumC17823a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo65057b() {
        this.f44964b.clear();
    }

    /* renamed from: c */
    public AdEvents m65065c() {
        return this.f44965c;
    }

    /* renamed from: d */
    public MediaEvents m65064d() {
        return this.f44966d;
    }

    /* renamed from: e */
    public boolean m65063e() {
        if (this.f44964b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m65062f() {
        C17815h.m65112a().m65111a(getWebView(), this.f44963a);
    }

    /* renamed from: g */
    public void m65061g() {
        C17815h.m65112a().m65100b(getWebView(), this.f44963a);
    }

    public WebView getWebView() {
        return this.f44964b.get();
    }

    /* renamed from: h */
    public void m65060h() {
        m65068a((JSONObject) null);
    }

    /* renamed from: a */
    public void m65079a(float f) {
        C17815h.m65112a().m65110a(getWebView(), this.f44963a, f);
    }

    /* renamed from: b */
    public void m65066b(String str, long j) {
        if (j >= this.f44968f) {
            this.f44967e = EnumC17823a.AD_STATE_VISIBLE;
            C17815h.m65112a().m65108a(getWebView(), this.f44963a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m65078a(WebView webView) {
        this.f44964b = new C17856b(webView);
    }

    /* renamed from: a */
    public void m65077a(AdEvents adEvents) {
        this.f44965c = adEvents;
    }

    /* renamed from: a */
    public void m65076a(AdSessionConfiguration adSessionConfiguration) {
        C17815h.m65112a().m65106a(getWebView(), this.f44963a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m65075a(ErrorType errorType, String str) {
        C17815h.m65112a().m65109a(getWebView(), this.f44963a, errorType, str);
    }

    /* renamed from: a */
    public void mo65059a(C17799a c17799a, AdSessionContext adSessionContext) {
        m65074a(c17799a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m65074a(C17799a c17799a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c17799a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C17830c.m65038a(jSONObject2, "environment", "app");
        C17830c.m65038a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C17830c.m65038a(jSONObject2, "deviceInfo", C17829b.m65049d());
        C17830c.m65038a(jSONObject2, "deviceCategory", C17828a.m65054a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C17830c.m65038a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C17830c.m65038a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C17830c.m65038a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C17830c.m65038a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C17830c.m65038a(jSONObject4, "libraryVersion", "1.4.12-Applovin");
        C17830c.m65038a(jSONObject4, "appId", C17814g.m65113b().m65115a().getApplicationContext().getPackageName());
        C17830c.m65038a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C17830c.m65038a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C17830c.m65038a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C17830c.m65038a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C17815h.m65112a().m65105a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m65073a(MediaEvents mediaEvents) {
        this.f44966d = mediaEvents;
    }

    /* renamed from: a */
    public void m65072a(String str) {
        m65070a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m65071a(String str, long j) {
        if (j >= this.f44968f) {
            EnumC17823a enumC17823a = this.f44967e;
            EnumC17823a enumC17823a2 = EnumC17823a.AD_STATE_NOTVISIBLE;
            if (enumC17823a != enumC17823a2) {
                this.f44967e = enumC17823a2;
                C17815h.m65112a().m65108a(getWebView(), this.f44963a, str);
            }
        }
    }

    /* renamed from: a */
    public void m65070a(String str, @Nullable JSONObject jSONObject) {
        C17815h.m65112a().m65107a(getWebView(), this.f44963a, str, jSONObject);
    }

    /* renamed from: a */
    public void m65069a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C17830c.m65038a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C17815h.m65112a().m65102a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m65068a(@Nullable JSONObject jSONObject) {
        C17815h.m65112a().m65098b(getWebView(), this.f44963a, jSONObject);
    }

    /* renamed from: a */
    public void m65067a(boolean z) {
        if (m65063e()) {
            C17815h.m65112a().m65099b(getWebView(), this.f44963a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo65056i() {
    }
}
