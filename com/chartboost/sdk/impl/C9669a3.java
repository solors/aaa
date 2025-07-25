package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.a3 */
/* loaded from: classes3.dex */
public final class C9669a3 {

    /* renamed from: a */
    public final String f21544a;

    /* renamed from: b */
    public final String f21545b;

    /* renamed from: c */
    public final String f21546c;

    /* renamed from: d */
    public final String f21547d;

    /* renamed from: e */
    public final String f21548e;

    /* renamed from: f */
    public final Float f21549f;

    /* renamed from: g */
    public final Float f21550g;

    /* renamed from: h */
    public final EnumC10020l6 f21551h;

    /* renamed from: i */
    public final Boolean f21552i;

    public C9669a3(String location, String adId, String to, String cgn, String creative, Float f, Float f2, EnumC10020l6 impressionMediaType, Boolean bool) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(impressionMediaType, "impressionMediaType");
        this.f21544a = location;
        this.f21545b = adId;
        this.f21546c = to;
        this.f21547d = cgn;
        this.f21548e = creative;
        this.f21549f = f;
        this.f21550g = f2;
        this.f21551h = impressionMediaType;
        this.f21552i = bool;
    }

    /* renamed from: a */
    public final String m82142a() {
        return this.f21545b;
    }

    /* renamed from: b */
    public final String m82141b() {
        return this.f21547d;
    }

    /* renamed from: c */
    public final String m82140c() {
        return this.f21548e;
    }

    /* renamed from: d */
    public final EnumC10020l6 m82139d() {
        return this.f21551h;
    }

    /* renamed from: e */
    public final String m82138e() {
        return this.f21544a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9669a3)) {
            return false;
        }
        C9669a3 c9669a3 = (C9669a3) obj;
        if (Intrinsics.m17075f(this.f21544a, c9669a3.f21544a) && Intrinsics.m17075f(this.f21545b, c9669a3.f21545b) && Intrinsics.m17075f(this.f21546c, c9669a3.f21546c) && Intrinsics.m17075f(this.f21547d, c9669a3.f21547d) && Intrinsics.m17075f(this.f21548e, c9669a3.f21548e) && Intrinsics.m17075f(this.f21549f, c9669a3.f21549f) && Intrinsics.m17075f(this.f21550g, c9669a3.f21550g) && this.f21551h == c9669a3.f21551h && Intrinsics.m17075f(this.f21552i, c9669a3.f21552i)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m82137f() {
        return this.f21552i;
    }

    /* renamed from: g */
    public final String m82136g() {
        return this.f21546c;
    }

    /* renamed from: h */
    public final Float m82135h() {
        return this.f21550g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((this.f21544a.hashCode() * 31) + this.f21545b.hashCode()) * 31) + this.f21546c.hashCode()) * 31) + this.f21547d.hashCode()) * 31) + this.f21548e.hashCode()) * 31;
        Float f = this.f21549f;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Float f2 = this.f21550g;
        if (f2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f2.hashCode();
        }
        int hashCode4 = (((i2 + hashCode2) * 31) + this.f21551h.hashCode()) * 31;
        Boolean bool = this.f21552i;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final Float m82134i() {
        return this.f21549f;
    }

    public String toString() {
        String str = this.f21544a;
        String str2 = this.f21545b;
        String str3 = this.f21546c;
        String str4 = this.f21547d;
        String str5 = this.f21548e;
        Float f = this.f21549f;
        Float f2 = this.f21550g;
        EnumC10020l6 enumC10020l6 = this.f21551h;
        Boolean bool = this.f21552i;
        return "ClickParams(location=" + str + ", adId=" + str2 + ", to=" + str3 + ", cgn=" + str4 + ", creative=" + str5 + ", videoPosition=" + f + ", videoDuration=" + f2 + ", impressionMediaType=" + enumC10020l6 + ", retargetReinstall=" + bool + ")";
    }
}
