package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.q */
/* loaded from: classes3.dex */
public class C10138q {

    /* renamed from: a */
    public final EnumC9849f8 f22958a;

    /* renamed from: b */
    public final EnumC9849f8 f22959b;

    /* renamed from: c */
    public final boolean f22960c;

    /* renamed from: d */
    public final EnumC10143q3 f22961d;

    /* renamed from: e */
    public final EnumC10098o6 f22962e;

    public C10138q(EnumC10143q3 enumC10143q3, EnumC10098o6 enumC10098o6, EnumC9849f8 enumC9849f8, EnumC9849f8 enumC9849f82, boolean z) {
        this.f22961d = enumC10143q3;
        this.f22962e = enumC10098o6;
        this.f22958a = enumC9849f8;
        if (enumC9849f82 == null) {
            this.f22959b = EnumC9849f8.NONE;
        } else {
            this.f22959b = enumC9849f82;
        }
        this.f22960c = z;
    }

    /* renamed from: a */
    public static C10138q m80778a(EnumC10143q3 enumC10143q3, EnumC10098o6 enumC10098o6, EnumC9849f8 enumC9849f8, EnumC9849f8 enumC9849f82, boolean z) {
        AbstractC10085nd.m80982a(enumC10143q3, "CreativeType is null");
        AbstractC10085nd.m80982a(enumC10098o6, "ImpressionType is null");
        AbstractC10085nd.m80982a(enumC9849f8, "Impression owner is null");
        AbstractC10085nd.m80983a(enumC9849f8, enumC10143q3, enumC10098o6);
        return new C10138q(enumC10143q3, enumC10098o6, enumC9849f8, enumC9849f82, z);
    }

    /* renamed from: b */
    public boolean m80777b() {
        if (EnumC9849f8.NATIVE == this.f22959b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public JSONObject m80776c() {
        JSONObject jSONObject = new JSONObject();
        AbstractC10359xc.m80049a(jSONObject, "impressionOwner", this.f22958a);
        AbstractC10359xc.m80049a(jSONObject, "mediaEventsOwner", this.f22959b);
        AbstractC10359xc.m80049a(jSONObject, "creativeType", this.f22961d);
        AbstractC10359xc.m80049a(jSONObject, "impressionType", this.f22962e);
        AbstractC10359xc.m80049a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f22960c));
        return jSONObject;
    }

    /* renamed from: a */
    public boolean m80779a() {
        return EnumC9849f8.NATIVE == this.f22958a;
    }
}
