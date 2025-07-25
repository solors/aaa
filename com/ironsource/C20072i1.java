package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* renamed from: com.ironsource.i1 */
/* loaded from: classes6.dex */
public class C20072i1 {

    /* renamed from: a */
    private IronSource.AD_UNIT f50503a;

    /* renamed from: b */
    private String f50504b;

    /* renamed from: c */
    private NetworkSettings f50505c;

    /* renamed from: d */
    private int f50506d;

    /* renamed from: e */
    private int f50507e;

    /* renamed from: f */
    private JSONObject f50508f;

    /* renamed from: g */
    private String f50509g;

    /* renamed from: h */
    private int f50510h;

    /* renamed from: i */
    private String f50511i;

    public C20072i1(IronSource.AD_UNIT ad_unit, String str, int i, JSONObject jSONObject, String str2, int i2, String str3, NetworkSettings networkSettings, int i3) {
        this.f50503a = ad_unit;
        this.f50504b = str;
        this.f50507e = i;
        this.f50508f = jSONObject;
        this.f50509g = str2;
        this.f50510h = i2;
        this.f50511i = str3;
        this.f50505c = networkSettings;
        this.f50506d = i3;
    }

    /* renamed from: a */
    public IronSource.AD_UNIT m58063a() {
        return this.f50503a;
    }

    /* renamed from: b */
    public String m58062b() {
        return this.f50511i;
    }

    /* renamed from: c */
    public String m58061c() {
        return this.f50509g;
    }

    /* renamed from: d */
    public int m58060d() {
        return this.f50510h;
    }

    /* renamed from: e */
    public JSONObject m58059e() {
        return this.f50508f;
    }

    /* renamed from: f */
    public int m58058f() {
        return this.f50506d;
    }

    /* renamed from: g */
    public NetworkSettings m58057g() {
        return this.f50505c;
    }

    /* renamed from: h */
    public int m58056h() {
        return this.f50507e;
    }

    /* renamed from: i */
    public String m58055i() {
        return this.f50504b;
    }
}
