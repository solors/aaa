package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.r8 */
/* loaded from: classes8.dex */
public final class C31266r8 {

    /* renamed from: a */
    private final xb1 f84668a;

    /* renamed from: b */
    private final xb1 f84669b;

    /* renamed from: c */
    private final boolean f84670c;

    /* renamed from: d */
    private final EnumC31396st f84671d;

    /* renamed from: e */
    private final bi0 f84672e;

    private C31266r8() {
        EnumC31396st enumC31396st = EnumC31396st.f85370c;
        bi0 bi0Var = bi0.f77314c;
        xb1 xb1Var = xb1.f87624c;
        this.f84671d = enumC31396st;
        this.f84672e = bi0Var;
        this.f84668a = xb1Var;
        this.f84669b = xb1Var;
        this.f84670c = false;
    }

    /* renamed from: a */
    public static C31266r8 m30123a() {
        return new C31266r8();
    }

    /* renamed from: b */
    public final boolean m30122b() {
        if (xb1.f87624c == this.f84668a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m30121c() {
        if (xb1.f87624c == this.f84669b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final JSONObject m30120d() {
        JSONObject jSONObject = new JSONObject();
        ki2.m32540a(jSONObject, "impressionOwner", this.f84668a);
        ki2.m32540a(jSONObject, "mediaEventsOwner", this.f84669b);
        ki2.m32540a(jSONObject, "creativeType", this.f84671d);
        ki2.m32540a(jSONObject, "impressionType", this.f84672e);
        ki2.m32540a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f84670c));
        return jSONObject;
    }
}
