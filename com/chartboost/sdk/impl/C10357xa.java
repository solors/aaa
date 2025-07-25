package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.xa */
/* loaded from: classes3.dex */
public final class C10357xa {

    /* renamed from: a */
    public final String f23544a;

    /* renamed from: b */
    public final EnumC9726b3 f23545b;

    public C10357xa(String url, EnumC9726b3 clickPreference) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        this.f23544a = url;
        this.f23545b = clickPreference;
    }

    /* renamed from: a */
    public final C10357xa m80062a(String url, EnumC9726b3 clickPreference) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        return new C10357xa(url, clickPreference);
    }

    /* renamed from: b */
    public final String m80061b() {
        return this.f23544a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10357xa)) {
            return false;
        }
        C10357xa c10357xa = (C10357xa) obj;
        if (Intrinsics.m17075f(this.f23544a, c10357xa.f23544a) && this.f23545b == c10357xa.f23545b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f23544a.hashCode() * 31) + this.f23545b.hashCode();
    }

    public String toString() {
        String str = this.f23544a;
        EnumC9726b3 enumC9726b3 = this.f23545b;
        return "UrlArgs(url=" + str + ", clickPreference=" + enumC9726b3 + ")";
    }

    /* renamed from: a */
    public static /* synthetic */ C10357xa m80063a(C10357xa c10357xa, String str, EnumC9726b3 enumC9726b3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c10357xa.f23544a;
        }
        if ((i & 2) != 0) {
            enumC9726b3 = c10357xa.f23545b;
        }
        return c10357xa.m80062a(str, enumC9726b3);
    }

    /* renamed from: a */
    public final EnumC9726b3 m80064a() {
        return this.f23545b;
    }
}
