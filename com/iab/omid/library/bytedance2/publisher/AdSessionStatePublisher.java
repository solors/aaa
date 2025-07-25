package com.iab.omid.library.bytedance2.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.C17981a;
import com.iab.omid.library.bytedance2.adsession.ErrorType;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.internal.C17996g;
import com.iab.omid.library.bytedance2.internal.C17997h;
import com.iab.omid.library.bytedance2.utils.C18010a;
import com.iab.omid.library.bytedance2.utils.C18011b;
import com.iab.omid.library.bytedance2.utils.C18012c;
import com.iab.omid.library.bytedance2.utils.C18018f;
import com.iab.omid.library.bytedance2.weakreference.C18038b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f45348a;

    /* renamed from: b */
    private C18038b f45349b;

    /* renamed from: c */
    private AdEvents f45350c;

    /* renamed from: d */
    private MediaEvents f45351d;

    /* renamed from: e */
    private EnumC18005a f45352e;

    /* renamed from: f */
    private long f45353f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18005a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m64372a();
        this.f45348a = str;
        this.f45349b = new C18038b(null);
    }

    /* renamed from: a */
    public void m64372a() {
        this.f45353f = C18018f.m64312b();
        this.f45352e = EnumC18005a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo64349b() {
        this.f45349b.clear();
    }

    /* renamed from: c */
    public AdEvents m64357c() {
        return this.f45350c;
    }

    /* renamed from: d */
    public MediaEvents m64356d() {
        return this.f45351d;
    }

    /* renamed from: e */
    public boolean m64355e() {
        if (this.f45349b.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m64354f() {
        C17997h.m64404a().m64403a(getWebView(), this.f45348a);
    }

    /* renamed from: g */
    public void m64353g() {
        C17997h.m64404a().m64392b(getWebView(), this.f45348a);
    }

    public WebView getWebView() {
        return this.f45349b.get();
    }

    /* renamed from: h */
    public void m64352h() {
        m64360a((JSONObject) null);
    }

    /* renamed from: a */
    public void m64371a(float f) {
        C17997h.m64404a().m64402a(getWebView(), this.f45348a, f);
    }

    /* renamed from: b */
    public void m64358b(String str, long j) {
        if (j >= this.f45353f) {
            this.f45352e = EnumC18005a.AD_STATE_VISIBLE;
            C17997h.m64404a().m64400a(getWebView(), this.f45348a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m64370a(WebView webView) {
        this.f45349b = new C18038b(webView);
    }

    /* renamed from: a */
    public void m64369a(AdEvents adEvents) {
        this.f45350c = adEvents;
    }

    /* renamed from: a */
    public void m64368a(AdSessionConfiguration adSessionConfiguration) {
        C17997h.m64404a().m64398a(getWebView(), this.f45348a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m64367a(ErrorType errorType, String str) {
        C17997h.m64404a().m64401a(getWebView(), this.f45348a, errorType, str);
    }

    /* renamed from: a */
    public void mo64351a(C17981a c17981a, AdSessionContext adSessionContext) {
        m64366a(c17981a, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m64366a(C17981a c17981a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c17981a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C18012c.m64330a(jSONObject2, "environment", "app");
        C18012c.m64330a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C18012c.m64330a(jSONObject2, "deviceInfo", C18011b.m64341d());
        C18012c.m64330a(jSONObject2, "deviceCategory", C18010a.m64346a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18012c.m64330a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C18012c.m64330a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C18012c.m64330a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C18012c.m64330a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C18012c.m64330a(jSONObject4, "libraryVersion", "1.4.12-Bytedance2");
        C18012c.m64330a(jSONObject4, "appId", C17996g.m64405b().m64407a().getApplicationContext().getPackageName());
        C18012c.m64330a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C18012c.m64330a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C18012c.m64330a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C18012c.m64330a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C17997h.m64404a().m64397a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m64365a(MediaEvents mediaEvents) {
        this.f45351d = mediaEvents;
    }

    /* renamed from: a */
    public void m64364a(String str) {
        m64362a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m64363a(String str, long j) {
        if (j >= this.f45353f) {
            EnumC18005a enumC18005a = this.f45352e;
            EnumC18005a enumC18005a2 = EnumC18005a.AD_STATE_NOTVISIBLE;
            if (enumC18005a != enumC18005a2) {
                this.f45352e = enumC18005a2;
                C17997h.m64404a().m64400a(getWebView(), this.f45348a, str);
            }
        }
    }

    /* renamed from: a */
    public void m64362a(String str, @Nullable JSONObject jSONObject) {
        C17997h.m64404a().m64399a(getWebView(), this.f45348a, str, jSONObject);
    }

    /* renamed from: a */
    public void m64361a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C18012c.m64330a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C17997h.m64404a().m64394a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m64360a(@Nullable JSONObject jSONObject) {
        C17997h.m64404a().m64390b(getWebView(), this.f45348a, jSONObject);
    }

    /* renamed from: a */
    public void m64359a(boolean z) {
        if (m64355e()) {
            C17997h.m64404a().m64391b(getWebView(), this.f45348a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: i */
    public void mo64348i() {
    }
}
