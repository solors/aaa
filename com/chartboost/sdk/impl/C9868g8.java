package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.g8 */
/* loaded from: classes3.dex */
public class C9868g8 {

    /* renamed from: a */
    public final String f22098a;

    /* renamed from: b */
    public final String f22099b;

    public C9868g8(String str, String str2) {
        this.f22098a = str;
        this.f22099b = str2;
    }

    /* renamed from: a */
    public static C9868g8 m81622a(String str, String str2) {
        AbstractC10085nd.m80980a(str, "Name is null or empty");
        AbstractC10085nd.m80980a(str2, "Version is null or empty");
        return new C9868g8(str, str2);
    }

    /* renamed from: b */
    public String m81621b() {
        return this.f22099b;
    }

    /* renamed from: a */
    public String m81623a() {
        return this.f22098a;
    }
}
