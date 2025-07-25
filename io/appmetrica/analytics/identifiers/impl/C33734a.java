package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.identifiers.impl.a */
/* loaded from: classes9.dex */
public final class C33734a {

    /* renamed from: a */
    public final String f92517a;

    /* renamed from: b */
    public final String f92518b;

    /* renamed from: c */
    public final Boolean f92519c;

    public C33734a(String str, String str2, Boolean bool) {
        this.f92517a = str;
        this.f92518b = str2;
        this.f92519c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33734a)) {
            return false;
        }
        C33734a c33734a = (C33734a) obj;
        if (Intrinsics.m17075f(this.f92517a, c33734a.f92517a) && Intrinsics.m17075f(this.f92518b, c33734a.f92518b) && Intrinsics.m17075f(this.f92519c, c33734a.f92519c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f92517a.hashCode() * 31;
        String str = this.f92518b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Boolean bool = this.f92519c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f92517a + ", advId=" + this.f92518b + ", limitedAdTracking=" + this.f92519c + ')';
    }
}
