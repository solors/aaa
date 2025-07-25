package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.w9 */
/* loaded from: classes3.dex */
public final class C10322w9 {

    /* renamed from: a */
    public final String f23457a;

    /* renamed from: b */
    public final String f23458b;

    /* renamed from: c */
    public final int f23459c;

    /* renamed from: d */
    public final String f23460d;

    /* renamed from: e */
    public final Mediation f23461e;

    public C10322w9(String str, String location, int i, String adTypeName, Mediation mediation) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        this.f23457a = str;
        this.f23458b = location;
        this.f23459c = i;
        this.f23460d = adTypeName;
        this.f23461e = mediation;
    }

    /* renamed from: a */
    public final String m80152a() {
        return this.f23457a;
    }

    /* renamed from: b */
    public final String m80151b() {
        return this.f23460d;
    }

    /* renamed from: c */
    public final String m80150c() {
        return this.f23458b;
    }

    /* renamed from: d */
    public final Mediation m80149d() {
        return this.f23461e;
    }

    /* renamed from: e */
    public final int m80148e() {
        return this.f23459c;
    }
}
