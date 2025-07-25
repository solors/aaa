package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.C18169a;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.internal.C18184g;
import com.iab.omid.library.inmobi.internal.C18185h;
import com.iab.omid.library.inmobi.utils.C18198a;
import com.iab.omid.library.inmobi.utils.C18199b;
import com.iab.omid.library.inmobi.utils.C18200c;
import com.iab.omid.library.inmobi.utils.C18206f;
import com.iab.omid.library.inmobi.weakreference.C18226b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f45726a;

    /* renamed from: b */
    private C18226b f45727b;

    /* renamed from: c */
    private AdEvents f45728c;

    /* renamed from: d */
    private MediaEvents f45729d;

    /* renamed from: e */
    private EnumC18193a f45730e;

    /* renamed from: f */
    private long f45731f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18193a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m63669a();
        this.f45726a = str;
        this.f45727b = new C18226b(null);
    }

    /* renamed from: a */
    public void m63669a() {
        this.f45731f = C18206f.m63609b();
        this.f45730e = EnumC18193a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo63646b() {
        this.f45727b.clear();
    }

    /* renamed from: c */
    public AdEvents m63654c() {
        return this.f45728c;
    }

    /* renamed from: d */
    public MediaEvents m63653d() {
        return this.f45729d;
    }

    /* renamed from: e */
    public boolean m63652e() {
        if (this.f45727b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m63651f() {
        C18185h.m63701a().m63700a(getWebView(), this.f45726a);
    }

    /* renamed from: g */
    public void m63650g() {
        C18185h.m63701a().m63689b(getWebView(), this.f45726a);
    }

    public WebView getWebView() {
        return this.f45727b.get();
    }

    /* renamed from: h */
    public void m63649h() {
        m63657a((JSONObject) null);
    }

    /* renamed from: a */
    public void m63668a(float f) {
        C18185h.m63701a().m63699a(getWebView(), this.f45726a, f);
    }

    /* renamed from: b */
    public void m63655b(String str, long j) {
        if (j >= this.f45731f) {
            this.f45730e = EnumC18193a.AD_STATE_VISIBLE;
            C18185h.m63701a().m63697a(getWebView(), this.f45726a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m63667a(WebView webView) {
        this.f45727b = new C18226b(webView);
    }

    /* renamed from: a */
    public void m63666a(AdEvents adEvents) {
        this.f45728c = adEvents;
    }

    /* renamed from: a */
    public void m63665a(AdSessionConfiguration adSessionConfiguration) {
        C18185h.m63701a().m63695a(getWebView(), this.f45726a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m63664a(ErrorType errorType, String str) {
        C18185h.m63701a().m63698a(getWebView(), this.f45726a, errorType, str);
    }

    /* renamed from: a */
    public void mo63648a(C18169a c18169a, AdSessionContext adSessionContext) {
        m63663a(c18169a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m63663a(C18169a c18169a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18169a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18200c.m63627a(jSONObject2, "environment", "app");
        C18200c.m63627a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18200c.m63627a(jSONObject2, "deviceInfo", C18199b.m63638d());
        C18200c.m63627a(jSONObject2, "deviceCategory", C18198a.m63643a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18200c.m63627a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18200c.m63627a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18200c.m63627a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18200c.m63627a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18200c.m63627a(jSONObject4, "libraryVersion", "1.4.12-Inmobi");
        C18200c.m63627a(jSONObject4, "appId", C18184g.m63702b().m63704a().getApplicationContext().getPackageName());
        C18200c.m63627a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18200c.m63627a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18200c.m63627a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18200c.m63627a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18185h.m63701a().m63694a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m63662a(MediaEvents mediaEvents) {
        this.f45729d = mediaEvents;
    }

    /* renamed from: a */
    public void m63661a(String str) {
        m63659a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m63660a(String str, long j) {
        if (j >= this.f45731f) {
            EnumC18193a enumC18193a = this.f45730e;
            EnumC18193a enumC18193a2 = EnumC18193a.AD_STATE_NOTVISIBLE;
            if (enumC18193a != enumC18193a2) {
                this.f45730e = enumC18193a2;
                C18185h.m63701a().m63697a(getWebView(), this.f45726a, str);
            }
        }
    }

    /* renamed from: a */
    public void m63659a(String str, @Nullable JSONObject jSONObject) {
        C18185h.m63701a().m63696a(getWebView(), this.f45726a, str, jSONObject);
    }

    /* renamed from: a */
    public void m63658a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18200c.m63627a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18185h.m63701a().m63691a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m63657a(@Nullable JSONObject jSONObject) {
        C18185h.m63701a().m63687b(getWebView(), this.f45726a, jSONObject);
    }

    /* renamed from: a */
    public void m63656a(boolean z) {
        if (m63652e()) {
            C18185h.m63701a().m63688b(getWebView(), this.f45726a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo63645i() {
    }
}
