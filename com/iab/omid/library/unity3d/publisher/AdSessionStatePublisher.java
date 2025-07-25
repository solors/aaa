package com.iab.omid.library.unity3d.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.C18678a;
import com.iab.omid.library.unity3d.adsession.ErrorType;
import com.iab.omid.library.unity3d.adsession.VerificationScriptResource;
import com.iab.omid.library.unity3d.adsession.media.MediaEvents;
import com.iab.omid.library.unity3d.internal.C18692f;
import com.iab.omid.library.unity3d.internal.C18693g;
import com.iab.omid.library.unity3d.utils.C18706a;
import com.iab.omid.library.unity3d.utils.C18707b;
import com.iab.omid.library.unity3d.utils.C18708c;
import com.iab.omid.library.unity3d.utils.C18714f;
import com.iab.omid.library.unity3d.weakreference.C18733b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f46782a;

    /* renamed from: b */
    private C18733b f46783b;

    /* renamed from: c */
    private AdEvents f46784c;

    /* renamed from: d */
    private MediaEvents f46785d;

    /* renamed from: e */
    private EnumC18701a f46786e;

    /* renamed from: f */
    private long f46787f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18701a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m61697a();
        this.f46782a = str;
        this.f46783b = new C18733b(null);
    }

    /* renamed from: a */
    public void m61697a() {
        this.f46787f = C18714f.m61638b();
        this.f46786e = EnumC18701a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo61674b() {
        this.f46783b.clear();
    }

    /* renamed from: c */
    public AdEvents m61682c() {
        return this.f46784c;
    }

    /* renamed from: d */
    public MediaEvents m61681d() {
        return this.f46785d;
    }

    /* renamed from: e */
    public boolean m61680e() {
        if (this.f46783b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m61679f() {
        C18693g.m61729a().m61728a(getWebView(), this.f46782a);
    }

    /* renamed from: g */
    public void m61678g() {
        C18693g.m61729a().m61717b(getWebView(), this.f46782a);
    }

    public WebView getWebView() {
        return this.f46783b.get();
    }

    /* renamed from: h */
    public void m61677h() {
        m61685a((JSONObject) null);
    }

    /* renamed from: a */
    public void m61696a(float f) {
        C18693g.m61729a().m61727a(getWebView(), this.f46782a, f);
    }

    /* renamed from: b */
    public void m61683b(String str, long j) {
        if (j >= this.f46787f) {
            this.f46786e = EnumC18701a.AD_STATE_VISIBLE;
            C18693g.m61729a().m61725a(getWebView(), this.f46782a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m61695a(WebView webView) {
        this.f46783b = new C18733b(webView);
    }

    /* renamed from: a */
    public void m61694a(AdEvents adEvents) {
        this.f46784c = adEvents;
    }

    /* renamed from: a */
    public void m61693a(AdSessionConfiguration adSessionConfiguration) {
        C18693g.m61729a().m61723a(getWebView(), this.f46782a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m61692a(ErrorType errorType, String str) {
        C18693g.m61729a().m61726a(getWebView(), this.f46782a, errorType, str);
    }

    /* renamed from: a */
    public void mo61676a(C18678a c18678a, AdSessionContext adSessionContext) {
        m61691a(c18678a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m61691a(C18678a c18678a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18678a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18708c.m61655a(jSONObject2, "environment", "app");
        C18708c.m61655a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18708c.m61655a(jSONObject2, "deviceInfo", C18707b.m61666d());
        C18708c.m61655a(jSONObject2, "deviceCategory", C18706a.m61671a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18708c.m61655a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18708c.m61655a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18708c.m61655a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18708c.m61655a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18708c.m61655a(jSONObject4, "libraryVersion", "1.4.9-Unity3d");
        C18708c.m61655a(jSONObject4, "appId", C18692f.m61730b().m61732a().getApplicationContext().getPackageName());
        C18708c.m61655a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18708c.m61655a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18708c.m61655a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18708c.m61655a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18693g.m61729a().m61722a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m61690a(MediaEvents mediaEvents) {
        this.f46785d = mediaEvents;
    }

    /* renamed from: a */
    public void m61689a(String str) {
        m61687a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m61688a(String str, long j) {
        if (j >= this.f46787f) {
            EnumC18701a enumC18701a = this.f46786e;
            EnumC18701a enumC18701a2 = EnumC18701a.AD_STATE_NOTVISIBLE;
            if (enumC18701a != enumC18701a2) {
                this.f46786e = enumC18701a2;
                C18693g.m61729a().m61725a(getWebView(), this.f46782a, str);
            }
        }
    }

    /* renamed from: a */
    public void m61687a(String str, @Nullable JSONObject jSONObject) {
        C18693g.m61729a().m61724a(getWebView(), this.f46782a, str, jSONObject);
    }

    /* renamed from: a */
    public void m61686a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18708c.m61655a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18693g.m61729a().m61719a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m61685a(@Nullable JSONObject jSONObject) {
        C18693g.m61729a().m61715b(getWebView(), this.f46782a, jSONObject);
    }

    /* renamed from: a */
    public void m61684a(boolean z) {
        if (m61680e()) {
            C18693g.m61729a().m61716b(getWebView(), this.f46782a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo61673i() {
    }
}
