package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;

/* renamed from: com.chartboost.sdk.impl.ea */
/* loaded from: classes3.dex */
public final class C9833ea {

    /* renamed from: a */
    public final String f21959a;

    /* renamed from: b */
    public final String f21960b;

    /* renamed from: c */
    public final String f21961c;

    /* renamed from: d */
    public final String f21962d;

    /* renamed from: e */
    public final String f21963e;

    /* renamed from: f */
    public final String f21964f;

    /* renamed from: g */
    public final String f21965g;

    /* renamed from: h */
    public final C9834a f21966h;

    /* renamed from: com.chartboost.sdk.impl.ea$a */
    /* loaded from: classes3.dex */
    public static final class C9834a {

        /* renamed from: a */
        public final int f21967a;

        /* renamed from: b */
        public final int f21968b;

        public C9834a(int i, int i2) {
            this.f21967a = i;
            this.f21968b = i2;
        }

        /* renamed from: a */
        public final int m81726a() {
            return this.f21967a;
        }

        /* renamed from: b */
        public final int m81725b() {
            return this.f21968b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9834a)) {
                return false;
            }
            C9834a c9834a = (C9834a) obj;
            if (this.f21967a == c9834a.f21967a && this.f21968b == c9834a.f21968b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f21967a) * 31) + Integer.hashCode(this.f21968b);
        }

        public String toString() {
            int i = this.f21967a;
            int i2 = this.f21968b;
            return "AdSize(height=" + i + ", width=" + i2 + ")";
        }
    }

    public C9833ea(String location, String adType, String str, String adCreativeId, String adCreativeType, String adMarkup, String templateUrl, C9834a c9834a) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adCreativeId, "adCreativeId");
        Intrinsics.checkNotNullParameter(adCreativeType, "adCreativeType");
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter(templateUrl, "templateUrl");
        this.f21959a = location;
        this.f21960b = adType;
        this.f21961c = str;
        this.f21962d = adCreativeId;
        this.f21963e = adCreativeType;
        this.f21964f = adMarkup;
        this.f21965g = templateUrl;
        this.f21966h = c9834a;
    }

    /* renamed from: a */
    public final String m81733a() {
        return this.f21962d;
    }

    /* renamed from: b */
    public final String m81732b() {
        return this.f21961c;
    }

    /* renamed from: c */
    public final C9834a m81731c() {
        return this.f21966h;
    }

    /* renamed from: d */
    public final String m81730d() {
        return this.f21960b;
    }

    /* renamed from: e */
    public final String m81729e() {
        return this.f21959a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9833ea)) {
            return false;
        }
        C9833ea c9833ea = (C9833ea) obj;
        if (Intrinsics.m17075f(this.f21959a, c9833ea.f21959a) && Intrinsics.m17075f(this.f21960b, c9833ea.f21960b) && Intrinsics.m17075f(this.f21961c, c9833ea.f21961c) && Intrinsics.m17075f(this.f21962d, c9833ea.f21962d) && Intrinsics.m17075f(this.f21963e, c9833ea.f21963e) && Intrinsics.m17075f(this.f21964f, c9833ea.f21964f) && Intrinsics.m17075f(this.f21965g, c9833ea.f21965g) && Intrinsics.m17075f(this.f21966h, c9833ea.f21966h)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m81728f() {
        int m16912j;
        String str = this.f21961c;
        if (str != null) {
            m16912j = _Ranges.m16912j(str.length(), 20);
            String substring = str.substring(0, m16912j);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return null;
    }

    /* renamed from: g */
    public final String m81727g() {
        return this.f21965g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f21959a.hashCode() * 31) + this.f21960b.hashCode()) * 31;
        String str = this.f21961c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((((hashCode2 + hashCode) * 31) + this.f21962d.hashCode()) * 31) + this.f21963e.hashCode()) * 31) + this.f21964f.hashCode()) * 31) + this.f21965g.hashCode()) * 31;
        C9834a c9834a = this.f21966h;
        if (c9834a != null) {
            i = c9834a.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f21959a;
        String str2 = this.f21960b;
        String m81728f = m81728f();
        String str3 = this.f21962d;
        String str4 = this.f21963e;
        String str5 = this.f21964f;
        String str6 = this.f21965g;
        return "TrackAd: location: " + str + " adType: " + str2 + " adImpressionId: " + m81728f + " adCreativeId: " + str3 + " adCreativeType: " + str4 + " adMarkup: " + str5 + " templateUrl: " + str6;
    }

    public /* synthetic */ C9833ea(String str, String str2, String str3, String str4, String str5, String str6, String str7, C9834a c9834a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : c9834a);
    }
}
