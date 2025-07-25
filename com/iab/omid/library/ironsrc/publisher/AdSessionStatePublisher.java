package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C18228a;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.internal.C18242f;
import com.iab.omid.library.ironsrc.internal.C18243g;
import com.iab.omid.library.ironsrc.utils.C18255a;
import com.iab.omid.library.ironsrc.utils.C18256b;
import com.iab.omid.library.ironsrc.utils.C18257c;
import com.iab.omid.library.ironsrc.utils.C18263f;
import com.iab.omid.library.ironsrc.weakreference.C18282b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C18282b f45853a;

    /* renamed from: b */
    private AdEvents f45854b;

    /* renamed from: c */
    private MediaEvents f45855c;

    /* renamed from: d */
    private EnumC18251a f45856d;

    /* renamed from: e */
    private long f45857e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18251a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        m63431a();
        this.f45853a = new C18282b(null);
    }

    /* renamed from: a */
    public void m63431a() {
        this.f45857e = C18263f.m63372b();
        this.f45856d = EnumC18251a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo63408b() {
        this.f45853a.clear();
    }

    /* renamed from: c */
    public AdEvents m63416c() {
        return this.f45854b;
    }

    /* renamed from: d */
    public MediaEvents m63415d() {
        return this.f45855c;
    }

    /* renamed from: e */
    public boolean m63414e() {
        if (this.f45853a.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m63413f() {
        C18243g.m63464a().m63463a(getWebView());
    }

    /* renamed from: g */
    public void m63412g() {
        C18243g.m63464a().m63452b(getWebView());
    }

    public WebView getWebView() {
        return this.f45853a.get();
    }

    /* renamed from: h */
    public void m63411h() {
        C18243g.m63464a().m63449c(getWebView());
    }

    /* renamed from: a */
    public void m63430a(float f) {
        C18243g.m63464a().m63462a(getWebView(), f);
    }

    /* renamed from: b */
    public void m63417b(String str, long j) {
        if (j >= this.f45857e) {
            this.f45856d = EnumC18251a.AD_STATE_VISIBLE;
            C18243g.m63464a().m63460a(getWebView(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m63429a(WebView webView) {
        this.f45853a = new C18282b(webView);
    }

    /* renamed from: a */
    public void m63428a(AdEvents adEvents) {
        this.f45854b = adEvents;
    }

    /* renamed from: a */
    public void m63427a(AdSessionConfiguration adSessionConfiguration) {
        C18243g.m63464a().m63454a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m63426a(ErrorType errorType, String str) {
        C18243g.m63464a().m63461a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo63410a(C18228a c18228a, AdSessionContext adSessionContext) {
        m63425a(c18228a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m63425a(C18228a c18228a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18228a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18257c.m63389a(jSONObject2, "environment", "app");
        C18257c.m63389a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18257c.m63389a(jSONObject2, "deviceInfo", C18256b.m63400d());
        C18257c.m63389a(jSONObject2, "deviceCategory", C18255a.m63405a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18257c.m63389a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18257c.m63389a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18257c.m63389a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18257c.m63389a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18257c.m63389a(jSONObject4, "libraryVersion", "1.4.2-Ironsrc");
        C18257c.m63389a(jSONObject4, "appId", C18242f.m63465b().m63467a().getApplicationContext().getPackageName());
        C18257c.m63389a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18257c.m63389a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18257c.m63389a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18257c.m63389a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18243g.m63464a().m63457a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m63424a(MediaEvents mediaEvents) {
        this.f45855c = mediaEvents;
    }

    /* renamed from: a */
    public void m63423a(String str) {
        C18243g.m63464a().m63458a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m63422a(String str, long j) {
        if (j >= this.f45857e) {
            EnumC18251a enumC18251a = this.f45856d;
            EnumC18251a enumC18251a2 = EnumC18251a.AD_STATE_NOTVISIBLE;
            if (enumC18251a != enumC18251a2) {
                this.f45856d = enumC18251a2;
                C18243g.m63464a().m63460a(getWebView(), str);
            }
        }
    }

    /* renamed from: a */
    public void m63421a(String str, JSONObject jSONObject) {
        C18243g.m63464a().m63458a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void m63420a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18257c.m63389a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18243g.m63464a().m63447c(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m63419a(@NonNull JSONObject jSONObject) {
        C18243g.m63464a().m63450b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m63418a(boolean z) {
        if (m63414e()) {
            C18243g.m63464a().m63451b(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo63407i() {
    }
}
