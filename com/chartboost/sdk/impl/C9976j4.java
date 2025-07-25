package com.chartboost.sdk.impl;

import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.j4 */
/* loaded from: classes3.dex */
public final class C9976j4 {

    /* renamed from: A */
    public final long f22392A;

    /* renamed from: B */
    public final int f22393B;

    /* renamed from: C */
    public final int f22394C;

    /* renamed from: D */
    public final int f22395D;

    /* renamed from: E */
    public final long f22396E;

    /* renamed from: F */
    public final long f22397F;

    /* renamed from: a */
    public final String f22398a;

    /* renamed from: b */
    public final int f22399b;

    /* renamed from: c */
    public final String f22400c;

    /* renamed from: d */
    public final String f22401d;

    /* renamed from: e */
    public final String f22402e;

    /* renamed from: f */
    public final boolean f22403f;

    /* renamed from: g */
    public final String f22404g;

    /* renamed from: h */
    public final String f22405h;

    /* renamed from: i */
    public final String f22406i;

    /* renamed from: j */
    public final String f22407j;

    /* renamed from: k */
    public final String f22408k;

    /* renamed from: l */
    public final String f22409l;

    /* renamed from: m */
    public final String f22410m;

    /* renamed from: n */
    public final String f22411n;

    /* renamed from: o */
    public final String f22412o;

    /* renamed from: p */
    public final String f22413p;

    /* renamed from: q */
    public final String f22414q;

    /* renamed from: r */
    public final String f22415r;

    /* renamed from: s */
    public final String f22416s;

    /* renamed from: t */
    public final String f22417t;

    /* renamed from: u */
    public final int f22418u;

    /* renamed from: v */
    public final boolean f22419v;

    /* renamed from: w */
    public final int f22420w;

    /* renamed from: x */
    public final boolean f22421x;

    /* renamed from: y */
    public final int f22422y;

    /* renamed from: z */
    public final long f22423z;

    public C9976j4(String sessionId, int i, String appId, String appVersion, String chartboostSdkVersion, boolean z, String chartboostSdkGdpr, String chartboostSdkCcpa, String chartboostSdkCoppa, String chartboostSdkLgpd, String deviceId, String deviceMake, String deviceModel, String deviceOsVersion, String devicePlatform, String deviceCountry, String deviceLanguage, String deviceTimezone, String deviceConnectionType, String deviceOrientation, int i2, boolean z2, int i3, boolean z3, int i4, long j, long j2, int i5, int i6, int i7, long j3, long j4) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(chartboostSdkVersion, "chartboostSdkVersion");
        Intrinsics.checkNotNullParameter(chartboostSdkGdpr, "chartboostSdkGdpr");
        Intrinsics.checkNotNullParameter(chartboostSdkCcpa, "chartboostSdkCcpa");
        Intrinsics.checkNotNullParameter(chartboostSdkCoppa, "chartboostSdkCoppa");
        Intrinsics.checkNotNullParameter(chartboostSdkLgpd, "chartboostSdkLgpd");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceMake, "deviceMake");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOsVersion, "deviceOsVersion");
        Intrinsics.checkNotNullParameter(devicePlatform, "devicePlatform");
        Intrinsics.checkNotNullParameter(deviceCountry, "deviceCountry");
        Intrinsics.checkNotNullParameter(deviceLanguage, "deviceLanguage");
        Intrinsics.checkNotNullParameter(deviceTimezone, "deviceTimezone");
        Intrinsics.checkNotNullParameter(deviceConnectionType, "deviceConnectionType");
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        this.f22398a = sessionId;
        this.f22399b = i;
        this.f22400c = appId;
        this.f22401d = appVersion;
        this.f22402e = chartboostSdkVersion;
        this.f22403f = z;
        this.f22404g = chartboostSdkGdpr;
        this.f22405h = chartboostSdkCcpa;
        this.f22406i = chartboostSdkCoppa;
        this.f22407j = chartboostSdkLgpd;
        this.f22408k = deviceId;
        this.f22409l = deviceMake;
        this.f22410m = deviceModel;
        this.f22411n = deviceOsVersion;
        this.f22412o = devicePlatform;
        this.f22413p = deviceCountry;
        this.f22414q = deviceLanguage;
        this.f22415r = deviceTimezone;
        this.f22416s = deviceConnectionType;
        this.f22417t = deviceOrientation;
        this.f22418u = i2;
        this.f22419v = z2;
        this.f22420w = i3;
        this.f22421x = z3;
        this.f22422y = i4;
        this.f22423z = j;
        this.f22392A = j2;
        this.f22393B = i5;
        this.f22394C = i6;
        this.f22395D = i7;
        this.f22396E = j3;
        this.f22397F = j4;
    }

    /* renamed from: A */
    public final long m81336A() {
        return this.f22396E;
    }

    /* renamed from: B */
    public final String m81335B() {
        return this.f22398a;
    }

    /* renamed from: C */
    public final int m81334C() {
        return this.f22395D;
    }

    /* renamed from: D */
    public final int m81333D() {
        return this.f22393B;
    }

    /* renamed from: E */
    public final int m81332E() {
        return this.f22394C;
    }

    /* renamed from: a */
    public final String m81331a() {
        return this.f22400c;
    }

    /* renamed from: b */
    public final boolean m81330b() {
        return this.f22403f;
    }

    /* renamed from: c */
    public final String m81329c() {
        return this.f22405h;
    }

    /* renamed from: d */
    public final String m81328d() {
        return this.f22406i;
    }

    /* renamed from: e */
    public final String m81327e() {
        return this.f22404g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9976j4)) {
            return false;
        }
        C9976j4 c9976j4 = (C9976j4) obj;
        if (Intrinsics.m17075f(this.f22398a, c9976j4.f22398a) && this.f22399b == c9976j4.f22399b && Intrinsics.m17075f(this.f22400c, c9976j4.f22400c) && Intrinsics.m17075f(this.f22401d, c9976j4.f22401d) && Intrinsics.m17075f(this.f22402e, c9976j4.f22402e) && this.f22403f == c9976j4.f22403f && Intrinsics.m17075f(this.f22404g, c9976j4.f22404g) && Intrinsics.m17075f(this.f22405h, c9976j4.f22405h) && Intrinsics.m17075f(this.f22406i, c9976j4.f22406i) && Intrinsics.m17075f(this.f22407j, c9976j4.f22407j) && Intrinsics.m17075f(this.f22408k, c9976j4.f22408k) && Intrinsics.m17075f(this.f22409l, c9976j4.f22409l) && Intrinsics.m17075f(this.f22410m, c9976j4.f22410m) && Intrinsics.m17075f(this.f22411n, c9976j4.f22411n) && Intrinsics.m17075f(this.f22412o, c9976j4.f22412o) && Intrinsics.m17075f(this.f22413p, c9976j4.f22413p) && Intrinsics.m17075f(this.f22414q, c9976j4.f22414q) && Intrinsics.m17075f(this.f22415r, c9976j4.f22415r) && Intrinsics.m17075f(this.f22416s, c9976j4.f22416s) && Intrinsics.m17075f(this.f22417t, c9976j4.f22417t) && this.f22418u == c9976j4.f22418u && this.f22419v == c9976j4.f22419v && this.f22420w == c9976j4.f22420w && this.f22421x == c9976j4.f22421x && this.f22422y == c9976j4.f22422y && this.f22423z == c9976j4.f22423z && this.f22392A == c9976j4.f22392A && this.f22393B == c9976j4.f22393B && this.f22394C == c9976j4.f22394C && this.f22395D == c9976j4.f22395D && this.f22396E == c9976j4.f22396E && this.f22397F == c9976j4.f22397F) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m81326f() {
        return this.f22407j;
    }

    /* renamed from: g */
    public final String m81325g() {
        return this.f22402e;
    }

    /* renamed from: h */
    public final int m81324h() {
        return this.f22422y;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f22398a.hashCode() * 31) + Integer.hashCode(this.f22399b)) * 31) + this.f22400c.hashCode()) * 31) + this.f22401d.hashCode()) * 31) + this.f22402e.hashCode()) * 31) + Boolean.hashCode(this.f22403f)) * 31) + this.f22404g.hashCode()) * 31) + this.f22405h.hashCode()) * 31) + this.f22406i.hashCode()) * 31) + this.f22407j.hashCode()) * 31) + this.f22408k.hashCode()) * 31) + this.f22409l.hashCode()) * 31) + this.f22410m.hashCode()) * 31) + this.f22411n.hashCode()) * 31) + this.f22412o.hashCode()) * 31) + this.f22413p.hashCode()) * 31) + this.f22414q.hashCode()) * 31) + this.f22415r.hashCode()) * 31) + this.f22416s.hashCode()) * 31) + this.f22417t.hashCode()) * 31) + Integer.hashCode(this.f22418u)) * 31) + Boolean.hashCode(this.f22419v)) * 31) + Integer.hashCode(this.f22420w)) * 31) + Boolean.hashCode(this.f22421x)) * 31) + Integer.hashCode(this.f22422y)) * 31) + Long.hashCode(this.f22423z)) * 31) + Long.hashCode(this.f22392A)) * 31) + Integer.hashCode(this.f22393B)) * 31) + Integer.hashCode(this.f22394C)) * 31) + Integer.hashCode(this.f22395D)) * 31) + Long.hashCode(this.f22396E)) * 31) + Long.hashCode(this.f22397F);
    }

    /* renamed from: i */
    public final int m81323i() {
        return this.f22418u;
    }

    /* renamed from: j */
    public final boolean m81322j() {
        return this.f22419v;
    }

    /* renamed from: k */
    public final String m81321k() {
        return this.f22416s;
    }

    /* renamed from: l */
    public final String m81320l() {
        return this.f22413p;
    }

    /* renamed from: m */
    public final String m81319m() {
        return this.f22408k;
    }

    /* renamed from: n */
    public final String m81318n() {
        return this.f22414q;
    }

    /* renamed from: o */
    public final long m81317o() {
        return this.f22392A;
    }

    /* renamed from: p */
    public final String m81316p() {
        return this.f22409l;
    }

    /* renamed from: q */
    public final String m81315q() {
        return this.f22410m;
    }

    /* renamed from: r */
    public final boolean m81314r() {
        return this.f22421x;
    }

    /* renamed from: s */
    public final String m81313s() {
        return this.f22417t;
    }

    /* renamed from: t */
    public final String m81312t() {
        return this.f22411n;
    }

    public String toString() {
        String str = this.f22398a;
        int i = this.f22399b;
        String str2 = this.f22400c;
        String str3 = this.f22401d;
        String str4 = this.f22402e;
        boolean z = this.f22403f;
        String str5 = this.f22404g;
        String str6 = this.f22405h;
        String str7 = this.f22406i;
        String str8 = this.f22407j;
        String str9 = this.f22408k;
        String str10 = this.f22409l;
        String str11 = this.f22410m;
        String str12 = this.f22411n;
        String str13 = this.f22412o;
        String str14 = this.f22413p;
        String str15 = this.f22414q;
        String str16 = this.f22415r;
        String str17 = this.f22416s;
        String str18 = this.f22417t;
        int i2 = this.f22418u;
        boolean z2 = this.f22419v;
        int i3 = this.f22420w;
        boolean z3 = this.f22421x;
        int i4 = this.f22422y;
        long j = this.f22423z;
        long j2 = this.f22392A;
        int i5 = this.f22393B;
        int i6 = this.f22394C;
        int i7 = this.f22395D;
        long j3 = this.f22396E;
        long j4 = this.f22397F;
        return "EnvironmentData(sessionId=" + str + ", sessionCount=" + i + ", appId=" + str2 + ", appVersion=" + str3 + ", chartboostSdkVersion=" + str4 + ", chartboostSdkAutocacheEnabled=" + z + ", chartboostSdkGdpr=" + str5 + ", chartboostSdkCcpa=" + str6 + ", chartboostSdkCoppa=" + str7 + ", chartboostSdkLgpd=" + str8 + ", deviceId=" + str9 + ", deviceMake=" + str10 + ", deviceModel=" + str11 + ", deviceOsVersion=" + str12 + ", devicePlatform=" + str13 + ", deviceCountry=" + str14 + ", deviceLanguage=" + str15 + ", deviceTimezone=" + str16 + ", deviceConnectionType=" + str17 + ", deviceOrientation=" + str18 + ", deviceBatteryLevel=" + i2 + ", deviceChargingStatus=" + z2 + ", deviceVolume=" + i3 + ", deviceMute=" + z3 + ", deviceAudioOutput=" + i4 + ", deviceStorage=" + j + ", deviceLowMemoryWarning=" + j2 + ", sessionImpressionInterstitialCount=" + i5 + ", sessionImpressionRewardedCount=" + i6 + ", sessionImpressionBannerCount=" + i7 + ", sessionDuration=" + j3 + ", deviceUpTime=" + j4 + ")";
    }

    /* renamed from: u */
    public final String m81311u() {
        return this.f22412o;
    }

    /* renamed from: v */
    public final long m81310v() {
        return this.f22423z;
    }

    /* renamed from: w */
    public final String m81309w() {
        return this.f22415r;
    }

    /* renamed from: x */
    public final long m81308x() {
        return this.f22397F;
    }

    /* renamed from: y */
    public final int m81307y() {
        return this.f22420w;
    }

    /* renamed from: z */
    public final int m81306z() {
        return this.f22399b;
    }

    public /* synthetic */ C9976j4(String str, int i, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i2, boolean z2, int i3, boolean z3, int i4, long j, long j2, int i5, int i6, int i7, long j3, long j4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "not available" : str, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? "not available" : str2, (i8 & 8) != 0 ? "not available" : str3, (i8 & 16) != 0 ? "not available" : str4, (i8 & 32) != 0 ? false : z, (i8 & 64) != 0 ? "not available" : str5, (i8 & 128) != 0 ? "not available" : str6, (i8 & 256) != 0 ? "not available" : str7, (i8 & 512) != 0 ? "not available" : str8, (i8 & 1024) != 0 ? "not available" : str9, (i8 & 2048) != 0 ? "not available" : str10, (i8 & 4096) != 0 ? "not available" : str11, (i8 & 8192) != 0 ? "not available" : str12, (i8 & 16384) != 0 ? "not available" : str13, (i8 & 32768) != 0 ? "not available" : str14, (i8 & 65536) != 0 ? "not available" : str15, (i8 & 131072) != 0 ? "not available" : str16, (i8 & 262144) != 0 ? "not available" : str17, (i8 & 524288) != 0 ? "not available" : str18, (i8 & 1048576) != 0 ? 0 : i2, (i8 & 2097152) != 0 ? false : z2, (i8 & 4194304) != 0 ? 0 : i3, (i8 & 8388608) != 0 ? false : z3, (i8 & 16777216) != 0 ? 0 : i4, (i8 & 33554432) != 0 ? 0L : j, (i8 & 67108864) != 0 ? 0L : j2, (i8 & 134217728) != 0 ? 0 : i5, (i8 & 268435456) != 0 ? 0 : i6, (i8 & 536870912) != 0 ? 0 : i7, (i8 & 1073741824) == 0 ? j3 : 0L, (i8 & Integer.MIN_VALUE) != 0 ? SystemClock.uptimeMillis() : j4);
    }
}
