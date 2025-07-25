package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.ironsource.v2 */
/* loaded from: classes6.dex */
public class C21108v2 {

    /* renamed from: a */
    private NetworkSettings f53843a;

    /* renamed from: b */
    private JSONObject f53844b;

    /* renamed from: c */
    private IronSource.AD_UNIT f53845c;

    /* renamed from: d */
    private boolean f53846d;

    /* renamed from: e */
    private boolean f53847e;

    /* renamed from: f */
    private int f53848f;

    /* renamed from: g */
    private int f53849g;

    public C21108v2(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        boolean z;
        this.f53843a = networkSettings;
        this.f53844b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f53848f = optInt;
        if (optInt == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f53846d = z;
        this.f53847e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f53849g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f53845c = ad_unit;
    }

    /* renamed from: a */
    public String m54539a() {
        return this.f53843a.getAdSourceNameForEvents();
    }

    /* renamed from: b */
    public IronSource.AD_UNIT m54538b() {
        return this.f53845c;
    }

    /* renamed from: c */
    public JSONObject m54537c() {
        return this.f53844b;
    }

    /* renamed from: d */
    public int m54536d() {
        return this.f53848f;
    }

    /* renamed from: e */
    public int m54535e() {
        return this.f53849g;
    }

    /* renamed from: f */
    public String m54534f() {
        return this.f53843a.getProviderName();
    }

    /* renamed from: g */
    public String m54533g() {
        return this.f53843a.getProviderTypeForReflection();
    }

    /* renamed from: h */
    public NetworkSettings m54532h() {
        return this.f53843a;
    }

    /* renamed from: i */
    public String m54531i() {
        return this.f53843a.getSubProviderId();
    }

    /* renamed from: j */
    public boolean m54530j() {
        return this.f53846d;
    }

    /* renamed from: k */
    public boolean m54529k() {
        return this.f53847e;
    }
}
