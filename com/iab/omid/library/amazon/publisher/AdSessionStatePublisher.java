package com.iab.omid.library.amazon.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.amazon.adsession.AdEvents;
import com.iab.omid.library.amazon.adsession.AdSessionConfiguration;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.C17738a;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.adsession.media.MediaEvents;
import com.iab.omid.library.amazon.internal.C17753g;
import com.iab.omid.library.amazon.internal.C17754h;
import com.iab.omid.library.amazon.utils.C17767a;
import com.iab.omid.library.amazon.utils.C17768b;
import com.iab.omid.library.amazon.utils.C17769c;
import com.iab.omid.library.amazon.utils.C17775f;
import com.iab.omid.library.amazon.weakreference.C17795b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f44834a;

    /* renamed from: b */
    private C17795b f44835b;

    /* renamed from: c */
    private AdEvents f44836c;

    /* renamed from: d */
    private MediaEvents f44837d;

    /* renamed from: e */
    private EnumC17762a f44838e;

    /* renamed from: f */
    private long f44839f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.amazon.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC17762a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m65321a();
        this.f44834a = str;
        this.f44835b = new C17795b(null);
    }

    /* renamed from: a */
    public void m65321a() {
        this.f44839f = C17775f.m65261b();
        this.f44838e = EnumC17762a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo65298b() {
        this.f44835b.clear();
    }

    /* renamed from: c */
    public AdEvents m65306c() {
        return this.f44836c;
    }

    /* renamed from: d */
    public MediaEvents m65305d() {
        return this.f44837d;
    }

    /* renamed from: e */
    public boolean m65304e() {
        if (this.f44835b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m65303f() {
        C17754h.m65353a().m65352a(getWebView(), this.f44834a);
    }

    /* renamed from: g */
    public void m65302g() {
        C17754h.m65353a().m65341b(getWebView(), this.f44834a);
    }

    public WebView getWebView() {
        return this.f44835b.get();
    }

    /* renamed from: h */
    public void m65301h() {
        m65309a((JSONObject) null);
    }

    /* renamed from: a */
    public void m65320a(float f) {
        C17754h.m65353a().m65351a(getWebView(), this.f44834a, f);
    }

    /* renamed from: b */
    public void m65307b(String str, long j) {
        if (j >= this.f44839f) {
            this.f44838e = EnumC17762a.AD_STATE_VISIBLE;
            C17754h.m65353a().m65349a(getWebView(), this.f44834a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m65319a(WebView webView) {
        this.f44835b = new C17795b(webView);
    }

    /* renamed from: a */
    public void m65318a(AdEvents adEvents) {
        this.f44836c = adEvents;
    }

    /* renamed from: a */
    public void m65317a(AdSessionConfiguration adSessionConfiguration) {
        C17754h.m65353a().m65347a(getWebView(), this.f44834a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m65316a(ErrorType errorType, String str) {
        C17754h.m65353a().m65350a(getWebView(), this.f44834a, errorType, str);
    }

    /* renamed from: a */
    public void mo65300a(C17738a c17738a, AdSessionContext adSessionContext) {
        m65315a(c17738a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m65315a(C17738a c17738a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c17738a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C17769c.m65279a(jSONObject2, "environment", "app");
        C17769c.m65279a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C17769c.m65279a(jSONObject2, "deviceInfo", C17768b.m65290d());
        C17769c.m65279a(jSONObject2, "deviceCategory", C17767a.m65295a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C17769c.m65279a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C17769c.m65279a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C17769c.m65279a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C17769c.m65279a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C17769c.m65279a(jSONObject4, "libraryVersion", "1.4.10-Amazon");
        C17769c.m65279a(jSONObject4, "appId", C17753g.m65354b().m65356a().getApplicationContext().getPackageName());
        C17769c.m65279a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C17769c.m65279a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C17769c.m65279a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C17769c.m65279a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C17754h.m65353a().m65346a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m65314a(MediaEvents mediaEvents) {
        this.f44837d = mediaEvents;
    }

    /* renamed from: a */
    public void m65313a(String str) {
        m65311a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m65312a(String str, long j) {
        if (j >= this.f44839f) {
            EnumC17762a enumC17762a = this.f44838e;
            EnumC17762a enumC17762a2 = EnumC17762a.AD_STATE_NOTVISIBLE;
            if (enumC17762a != enumC17762a2) {
                this.f44838e = enumC17762a2;
                C17754h.m65353a().m65349a(getWebView(), this.f44834a, str);
            }
        }
    }

    /* renamed from: a */
    public void m65311a(String str, @Nullable JSONObject jSONObject) {
        C17754h.m65353a().m65348a(getWebView(), this.f44834a, str, jSONObject);
    }

    /* renamed from: a */
    public void m65310a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C17769c.m65279a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C17754h.m65353a().m65343a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m65309a(@Nullable JSONObject jSONObject) {
        C17754h.m65353a().m65339b(getWebView(), this.f44834a, jSONObject);
    }

    /* renamed from: a */
    public void m65308a(boolean z) {
        if (m65304e()) {
            C17754h.m65353a().m65340b(getWebView(), this.f44834a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo65297i() {
    }
}
