package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.m2 */
/* loaded from: classes3.dex */
public final class C10043m2 {

    /* renamed from: a */
    public final String f22600a;

    /* renamed from: b */
    public final Boolean f22601b;

    public C10043m2(String url, Boolean bool) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f22600a = url;
        this.f22601b = bool;
    }

    /* renamed from: a */
    public final Boolean m81107a() {
        return this.f22601b;
    }

    /* renamed from: b */
    public final String m81106b() {
        return this.f22600a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10043m2)) {
            return false;
        }
        C10043m2 c10043m2 = (C10043m2) obj;
        if (Intrinsics.m17075f(this.f22600a, c10043m2.f22600a) && Intrinsics.m17075f(this.f22601b, c10043m2.f22601b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f22600a.hashCode() * 31;
        Boolean bool = this.f22601b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.f22600a;
        Boolean bool = this.f22601b;
        return "CBUrl(url=" + str + ", shouldDismiss=" + bool + ")";
    }
}
