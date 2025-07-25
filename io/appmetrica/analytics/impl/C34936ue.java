package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ue */
/* loaded from: classes9.dex */
public final class C34936ue {

    /* renamed from: a */
    public final String f95463a;

    /* renamed from: b */
    public final JSONObject f95464b;

    /* renamed from: c */
    public final EnumC34154Q7 f95465c;

    public C34936ue(String str, JSONObject jSONObject, EnumC34154Q7 enumC34154Q7) {
        this.f95463a = str;
        this.f95464b = jSONObject;
        this.f95465c = enumC34154Q7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f95463a + "', additionalParams=" + this.f95464b + ", source=" + this.f95465c + '}';
    }
}
