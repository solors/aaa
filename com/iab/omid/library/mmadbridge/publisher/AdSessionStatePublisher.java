package com.iab.omid.library.mmadbridge.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.C18286a;
import com.iab.omid.library.mmadbridge.adsession.ErrorType;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.internal.C18301g;
import com.iab.omid.library.mmadbridge.internal.C18302h;
import com.iab.omid.library.mmadbridge.utils.C18317a;
import com.iab.omid.library.mmadbridge.utils.C18318b;
import com.iab.omid.library.mmadbridge.utils.C18319c;
import com.iab.omid.library.mmadbridge.utils.C18325f;
import com.iab.omid.library.mmadbridge.weakreference.C18345b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f45985a;

    /* renamed from: b */
    private C18345b f45986b;

    /* renamed from: c */
    private AdEvents f45987c;

    /* renamed from: d */
    private MediaEvents f45988d;

    /* renamed from: e */
    private EnumC18312a f45989e;

    /* renamed from: f */
    private long f45990f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18312a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m63186a();
        this.f45985a = str;
        this.f45986b = new C18345b(null);
    }

    /* renamed from: a */
    public void m63186a() {
        this.f45990f = C18325f.m63124b();
        this.f45989e = EnumC18312a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo63162b() {
        this.f45986b.clear();
    }

    /* renamed from: c */
    public AdEvents m63170c() {
        return this.f45987c;
    }

    /* renamed from: d */
    public MediaEvents m63169d() {
        return this.f45988d;
    }

    /* renamed from: e */
    public boolean m63168e() {
        if (this.f45986b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m63167f() {
        C18302h.m63225a().m63224a(getWebView(), this.f45985a);
    }

    /* renamed from: g */
    public void m63166g() {
        C18302h.m63225a().m63213b(getWebView(), this.f45985a);
    }

    public WebView getWebView() {
        return this.f45986b.get();
    }

    /* renamed from: h */
    public void m63165h() {
        m63174a((JSONObject) null);
    }

    /* renamed from: a */
    public void m63185a(float f) {
        C18302h.m63225a().m63223a(getWebView(), this.f45985a, f);
    }

    /* renamed from: b */
    public void m63172b(String str, long j) {
        if (j >= this.f45990f) {
            this.f45989e = EnumC18312a.AD_STATE_VISIBLE;
            C18302h.m63225a().m63212b(getWebView(), this.f45985a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m63184a(WebView webView) {
        this.f45986b = new C18345b(webView);
    }

    /* renamed from: b */
    public void m63171b(boolean z) {
        if (m63168e()) {
            C18302h.m63225a().m63221a(getWebView(), this.f45985a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m63183a(AdEvents adEvents) {
        this.f45987c = adEvents;
    }

    /* renamed from: a */
    public void m63182a(AdSessionConfiguration adSessionConfiguration) {
        C18302h.m63225a().m63219a(getWebView(), this.f45985a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m63181a(ErrorType errorType, String str) {
        C18302h.m63225a().m63222a(getWebView(), this.f45985a, errorType, str);
    }

    /* renamed from: a */
    public void mo63164a(C18286a c18286a, AdSessionContext adSessionContext) {
        m63180a(c18286a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m63180a(C18286a c18286a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c18286a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18319c.m63143a(jSONObject2, "environment", "app");
        C18319c.m63143a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18319c.m63143a(jSONObject2, "deviceInfo", C18318b.m63154d());
        C18319c.m63143a(jSONObject2, "deviceCategory", C18317a.m63159a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18319c.m63143a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18319c.m63143a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18319c.m63143a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18319c.m63143a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18319c.m63143a(jSONObject4, "libraryVersion", "1.4.13-Mmadbridge");
        C18319c.m63143a(jSONObject4, "appId", C18301g.m63226b().m63228a().getApplicationContext().getPackageName());
        C18319c.m63143a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18319c.m63143a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18319c.m63143a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18319c.m63143a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C18302h.m63225a().m63218a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m63179a(MediaEvents mediaEvents) {
        this.f45988d = mediaEvents;
    }

    /* renamed from: a */
    public void m63178a(String str) {
        m63176a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m63177a(String str, long j) {
        if (j >= this.f45990f) {
            EnumC18312a enumC18312a = this.f45989e;
            EnumC18312a enumC18312a2 = EnumC18312a.AD_STATE_NOTVISIBLE;
            if (enumC18312a != enumC18312a2) {
                this.f45989e = enumC18312a2;
                C18302h.m63225a().m63212b(getWebView(), this.f45985a, str);
            }
        }
    }

    /* renamed from: a */
    public void m63176a(String str, @Nullable JSONObject jSONObject) {
        C18302h.m63225a().m63220a(getWebView(), this.f45985a, str, jSONObject);
    }

    /* renamed from: a */
    public void m63175a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18319c.m63143a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C18302h.m63225a().m63215a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m63174a(@Nullable JSONObject jSONObject) {
        C18302h.m63225a().m63211b(getWebView(), this.f45985a, jSONObject);
    }

    /* renamed from: a */
    public void m63173a(boolean z) {
        if (m63168e()) {
            C18302h.m63225a().m63209c(getWebView(), this.f45985a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo63161i() {
    }
}
