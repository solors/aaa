package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.j3 */
/* loaded from: classes3.dex */
public final class C9975j3 {

    /* renamed from: a */
    public final String f22385a;

    /* renamed from: b */
    public final String f22386b;

    /* renamed from: c */
    public final String f22387c;

    /* renamed from: d */
    public final int f22388d;

    /* renamed from: e */
    public final String f22389e;

    /* renamed from: f */
    public final Float f22390f;

    /* renamed from: g */
    public final Float f22391g;

    public C9975j3(String location, String adId, String cgn, int i, String rewardCurrency, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        this.f22385a = location;
        this.f22386b = adId;
        this.f22387c = cgn;
        this.f22388d = i;
        this.f22389e = rewardCurrency;
        this.f22390f = f;
        this.f22391g = f2;
    }

    /* renamed from: a */
    public final String m81343a() {
        return this.f22386b;
    }

    /* renamed from: b */
    public final String m81342b() {
        return this.f22387c;
    }

    /* renamed from: c */
    public final String m81341c() {
        return this.f22385a;
    }

    /* renamed from: d */
    public final int m81340d() {
        return this.f22388d;
    }

    /* renamed from: e */
    public final String m81339e() {
        return this.f22389e;
    }

    /* renamed from: f */
    public final Float m81338f() {
        return this.f22391g;
    }

    /* renamed from: g */
    public final Float m81337g() {
        return this.f22390f;
    }
}
