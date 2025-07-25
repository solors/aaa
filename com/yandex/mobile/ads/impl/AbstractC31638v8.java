package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.v8 */
/* loaded from: classes8.dex */
public abstract class AbstractC31638v8 {

    /* renamed from: a */
    private li2 f86594a;

    /* renamed from: b */
    private C30531i3 f86595b;

    /* renamed from: c */
    private dt0 f86596c;

    /* renamed from: d */
    private int f86597d;

    /* renamed from: e */
    private long f86598e;

    public AbstractC31638v8() {
        m28491g();
        this.f86594a = new li2(null);
    }

    /* renamed from: a */
    public void mo28510a() {
    }

    /* renamed from: b */
    public void mo28497b() {
        this.f86594a.clear();
    }

    /* renamed from: c */
    public final C30531i3 m28495c() {
        return this.f86595b;
    }

    /* renamed from: d */
    public final dt0 m28494d() {
        return this.f86596c;
    }

    /* renamed from: e */
    public final void m28493e() {
        yi2.m26889a(this.f86594a.get());
    }

    /* renamed from: f */
    public final void m28492f() {
        yi2.m26882b(this.f86594a.get());
    }

    /* renamed from: g */
    public final void m28491g() {
        this.f86598e = System.nanoTime();
        this.f86597d = 1;
    }

    /* renamed from: a */
    public final void m28509a(float f) {
        yi2.m26888a(this.f86594a.get(), f);
    }

    /* renamed from: b */
    public final void m28496b(String str, long j) {
        if (j < this.f86598e || this.f86597d == 3) {
            return;
        }
        this.f86597d = 3;
        yi2.m26887a(this.f86594a.get(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m28508a(WebView webView) {
        this.f86594a = new li2(webView);
    }

    /* renamed from: a */
    public final void m28506a(C30531i3 c30531i3) {
        this.f86595b = c30531i3;
    }

    /* renamed from: a */
    public final void m28505a(C31266r8 c31266r8) {
        yi2.m26883a(this.f86594a.get(), c31266r8.m30120d());
    }

    /* renamed from: a */
    public final void m28507a(dt0 dt0Var) {
        this.f86596c = dt0Var;
    }

    /* renamed from: a */
    public void mo28504a(xh2 xh2Var, C31338s8 c31338s8) {
        m28503a(xh2Var, c31338s8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m28503a(xh2 xh2Var, C31338s8 c31338s8, JSONObject jSONObject) {
        String m27482i = xh2Var.m27482i();
        JSONObject jSONObject2 = new JSONObject();
        ki2.m32540a(jSONObject2, "environment", "app");
        ki2.m32540a(jSONObject2, "adSessionType", c31338s8.m29827a());
        ki2.m32540a(jSONObject2, "deviceInfo", ai2.m35858a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        ki2.m32540a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        ki2.m32540a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, c31338s8.m29821f().m33576b());
        ki2.m32540a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, c31338s8.m29821f().m33575c());
        ki2.m32540a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        ki2.m32540a(jSONObject4, "libraryVersion", "1.3.26-Yandex");
        ki2.m32540a(jSONObject4, "appId", ti2.m29147a().m29145b().getApplicationContext().getPackageName());
        ki2.m32540a(jSONObject2, "app", jSONObject4);
        if (c31338s8.m29825b() != null) {
            ki2.m32540a(jSONObject2, "contentUrl", c31338s8.m29825b());
        }
        if (c31338s8.m29824c() != null) {
            ki2.m32540a(jSONObject2, "customReferenceData", c31338s8.m29824c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (r52 r52Var : c31338s8.m29820g()) {
            ki2.m32540a(jSONObject5, r52Var.m30142b(), r52Var.m30141c());
        }
        yi2.m26885a(this.f86594a.get(), m27482i, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public final void m28502a(String str) {
        yi2.m26886a(this.f86594a.get(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void m28501a(String str, long j) {
        if (j >= this.f86598e) {
            this.f86597d = 2;
            yi2.m26887a(this.f86594a.get(), str);
        }
    }

    /* renamed from: a */
    public final void m28500a(String str, JSONObject jSONObject) {
        yi2.m26886a(this.f86594a.get(), str, jSONObject);
    }

    /* renamed from: a */
    public final void m28499a(@NonNull JSONObject jSONObject) {
        yi2.m26880b(this.f86594a.get(), jSONObject);
    }

    /* renamed from: a */
    public final void m28498a(boolean z) {
        if (this.f86594a.get() != null) {
            yi2.m26881b(this.f86594a.get(), z ? "foregrounded" : "backgrounded");
        }
    }
}
