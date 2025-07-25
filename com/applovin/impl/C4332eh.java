package com.applovin.impl;

import java.util.Map;

/* renamed from: com.applovin.impl.eh */
/* loaded from: classes2.dex */
public class C4332eh {

    /* renamed from: a */
    private final String f5916a;

    /* renamed from: b */
    private Map f5917b;

    private C4332eh(String str, Map map) {
        this.f5916a = str;
        this.f5917b = map;
    }

    /* renamed from: a */
    public static C4332eh m99513a(String str) {
        return m99512a(str, null);
    }

    /* renamed from: b */
    public String m99511b() {
        return this.f5916a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f5916a + "'params='" + this.f5917b + "'}";
    }

    /* renamed from: a */
    public Map m99514a() {
        return this.f5917b;
    }

    /* renamed from: a */
    public static C4332eh m99512a(String str, Map map) {
        return new C4332eh(str, map);
    }
}
