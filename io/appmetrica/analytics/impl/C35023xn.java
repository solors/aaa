package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xn */
/* loaded from: classes9.dex */
public final class C35023xn {

    /* renamed from: a */
    public final InterfaceC33779An f95622a;

    /* renamed from: b */
    public final InterfaceC33779An f95623b;

    /* renamed from: c */
    public final InterfaceC35049yn f95624c;

    /* renamed from: d */
    public JSONObject f95625d;

    public C35023xn(InterfaceC33779An interfaceC33779An, InterfaceC33779An interfaceC33779An2, InterfaceC35049yn interfaceC35049yn) {
        this.f95622a = interfaceC33779An;
        this.f95623b = interfaceC33779An2;
        this.f95624c = interfaceC35049yn;
    }

    /* renamed from: a */
    public final synchronized JSONObject m20761a() {
        JSONObject jSONObject;
        if (this.f95625d == null) {
            JSONObject mo20730a = this.f95624c.mo20730a(m20760a(this.f95622a), m20760a(this.f95623b));
            this.f95625d = mo20730a;
            m20759a(mo20730a);
        }
        jSONObject = this.f95625d;
        if (jSONObject == null) {
            Intrinsics.m17056y("fileContents");
            jSONObject = null;
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m20760a(InterfaceC33779An interfaceC33779An) {
        try {
            String mo21029a = interfaceC33779An.mo21029a();
            return mo21029a != null ? new JSONObject(mo21029a) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public final synchronized void m20759a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f95622a.mo21024a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f95623b.mo21024a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
