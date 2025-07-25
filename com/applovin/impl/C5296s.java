package com.applovin.impl;

import java.util.Map;

/* renamed from: com.applovin.impl.s */
/* loaded from: classes2.dex */
public class C5296s {

    /* renamed from: a */
    private final String f9535a;

    /* renamed from: b */
    private final String f9536b;

    /* renamed from: c */
    private final Map f9537c;

    /* renamed from: d */
    private final boolean f9538d;

    public C5296s(String str, String str2) {
        this(str, str2, null, false);
    }

    /* renamed from: a */
    public String m95792a() {
        return this.f9536b;
    }

    /* renamed from: b */
    public Map m95791b() {
        return this.f9537c;
    }

    /* renamed from: c */
    public String m95790c() {
        return this.f9535a;
    }

    /* renamed from: d */
    public boolean m95789d() {
        return this.f9538d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f9535a + "', backupUrl='" + this.f9536b + "', headers='" + this.f9537c + "', shouldFireInWebView='" + this.f9538d + "'}";
    }

    public C5296s(String str, String str2, Map map, boolean z) {
        this.f9535a = str;
        this.f9536b = str2;
        this.f9537c = map;
        this.f9538d = z;
    }
}
