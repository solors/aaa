package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.C18099a;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import com.iab.omid.library.fyber.internal.C18114g;
import com.iab.omid.library.fyber.internal.C18115h;
import com.iab.omid.library.fyber.utils.C18130a;
import com.iab.omid.library.fyber.utils.C18131b;
import com.iab.omid.library.fyber.utils.C18132c;
import com.iab.omid.library.fyber.utils.C18138f;
import com.iab.omid.library.fyber.weakreference.C18158b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f45596a;

    /* renamed from: b */
    private C18158b f45597b;

    /* renamed from: c */
    private AdEvents f45598c;

    /* renamed from: d */
    private MediaEvents f45599d;

    /* renamed from: e */
    private EnumC18125a f45600e;

    /* renamed from: f */
    private long f45601f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.fyber.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18125a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m63915a();
        this.f45596a = str;
        this.f45597b = new C18158b(null);
    }

    /* renamed from: a */
    public void m63915a() {
        this.f45601f = C18138f.m63853b();
        this.f45600e = EnumC18125a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo63891b() {
        this.f45597b.clear();
    }

    /* renamed from: c */
    public AdEvents m63899c() {
        return this.f45598c;
    }

    /* renamed from: d */
    public MediaEvents m63898d() {
        return this.f45599d;
    }

    /* renamed from: e */
    public boolean m63897e() {
        if (this.f45597b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m63896f() {
        C18115h.m63954a().m63953a(getWebView(), this.f45596a);
    }

    /* renamed from: g */
    public void m63895g() {
        C18115h.m63954a().m63942b(getWebView(), this.f45596a);
    }

    public WebView getWebView() {
        return this.f45597b.get();
    }

    /* renamed from: h */
    public void m63894h() {
        m63903a((JSONObject) null);
    }

    /* renamed from: a */
    public void m63914a(float f) {
        C18115h.m63954a().m63952a(getWebView(), this.f45596a, f);
    }

    /* renamed from: b */
    public void m63901b(String str, long j) {
        if (j >= this.f45601f) {
            this.f45600e = EnumC18125a.AD_STATE_VISIBLE;
            C18115h.m63954a().m63941b(getWebView(), this.f45596a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m63913a(WebView webView) {
        this.f45597b = new C18158b(webView);
    }

    /* renamed from: b */
    public void m63900b(boolean z) {
        if (m63897e()) {
            C18115h.m63954a().m63950a(getWebView(), this.f45596a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m63912a(AdEvents adEvents) {
        this.f45598c = adEvents;
    }

    /* renamed from: a */
    public void m63911a(AdSessionConfiguration adSessionConfiguration) {
        C18115h.m63954a().m63948a(getWebView(), this.f45596a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m63910a(ErrorType errorType, String str) {
        C18115h.m63954a().m63951a(getWebView(), this.f45596a, errorType, str);
    }

    /* renamed from: a */
    public void mo63893a(C18099a c18099a, AdSessionContext adSessionContext) {
        m63909a(c18099a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m63909a(C18099a c18099a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18099a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18132c.m63872a(jSONObject2, "environment", "app");
        C18132c.m63872a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18132c.m63872a(jSONObject2, "deviceInfo", C18131b.m63883d());
        C18132c.m63872a(jSONObject2, "deviceCategory", C18130a.m63888a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18132c.m63872a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18132c.m63872a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18132c.m63872a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18132c.m63872a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18132c.m63872a(jSONObject4, "libraryVersion", "1.5.1-Fyber");
        C18132c.m63872a(jSONObject4, "appId", C18114g.m63955b().m63957a().getApplicationContext().getPackageName());
        C18132c.m63872a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18132c.m63872a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18132c.m63872a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18132c.m63872a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18115h.m63954a().m63947a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m63908a(MediaEvents mediaEvents) {
        this.f45599d = mediaEvents;
    }

    /* renamed from: a */
    public void m63907a(String str) {
        m63905a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m63906a(String str, long j) {
        if (j >= this.f45601f) {
            EnumC18125a enumC18125a = this.f45600e;
            EnumC18125a enumC18125a2 = EnumC18125a.AD_STATE_NOTVISIBLE;
            if (enumC18125a != enumC18125a2) {
                this.f45600e = enumC18125a2;
                C18115h.m63954a().m63941b(getWebView(), this.f45596a, str);
            }
        }
    }

    /* renamed from: a */
    public void m63905a(String str, @Nullable JSONObject jSONObject) {
        C18115h.m63954a().m63949a(getWebView(), this.f45596a, str, jSONObject);
    }

    /* renamed from: a */
    public void m63904a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18132c.m63872a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18115h.m63954a().m63944a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m63903a(@Nullable JSONObject jSONObject) {
        C18115h.m63954a().m63940b(getWebView(), this.f45596a, jSONObject);
    }

    /* renamed from: a */
    public void m63902a(boolean z) {
        if (m63897e()) {
            C18115h.m63954a().m63938c(getWebView(), this.f45596a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo63890i() {
    }
}
