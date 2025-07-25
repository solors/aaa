package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.w3 */
/* loaded from: classes3.dex */
public final class C10310w3 {

    /* renamed from: a */
    public final int f23417a;

    /* renamed from: b */
    public final int f23418b;

    /* renamed from: c */
    public final int f23419c;

    /* renamed from: d */
    public final int f23420d;

    /* renamed from: e */
    public final float f23421e;

    /* renamed from: f */
    public final String f23422f;

    /* renamed from: g */
    public final int f23423g;

    /* renamed from: h */
    public final String f23424h;

    /* renamed from: i */
    public final String f23425i;

    /* renamed from: j */
    public final String f23426j;

    /* renamed from: k */
    public final boolean f23427k;

    public C10310w3(int i, int i2, int i3, int i4, float f, String str, int i5, String deviceType, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.f23417a = i;
        this.f23418b = i2;
        this.f23419c = i3;
        this.f23420d = i4;
        this.f23421e = f;
        this.f23422f = str;
        this.f23423g = i5;
        this.f23424h = deviceType;
        this.f23425i = str2;
        this.f23426j = str3;
        this.f23427k = z;
    }

    /* renamed from: a */
    public final int m80201a() {
        return this.f23418b;
    }

    /* renamed from: b */
    public final String m80200b() {
        return this.f23424h;
    }

    /* renamed from: c */
    public final int m80199c() {
        return this.f23417a;
    }

    /* renamed from: d */
    public final String m80198d() {
        return this.f23422f;
    }

    /* renamed from: e */
    public final int m80197e() {
        return this.f23420d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10310w3)) {
            return false;
        }
        C10310w3 c10310w3 = (C10310w3) obj;
        if (this.f23417a == c10310w3.f23417a && this.f23418b == c10310w3.f23418b && this.f23419c == c10310w3.f23419c && this.f23420d == c10310w3.f23420d && Float.compare(this.f23421e, c10310w3.f23421e) == 0 && Intrinsics.m17075f(this.f23422f, c10310w3.f23422f) && this.f23423g == c10310w3.f23423g && Intrinsics.m17075f(this.f23424h, c10310w3.f23424h) && Intrinsics.m17075f(this.f23425i, c10310w3.f23425i) && Intrinsics.m17075f(this.f23426j, c10310w3.f23426j) && this.f23427k == c10310w3.f23427k) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m80196f() {
        return this.f23423g;
    }

    /* renamed from: g */
    public final String m80195g() {
        return this.f23425i;
    }

    /* renamed from: h */
    public final float m80194h() {
        return this.f23421e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((Integer.hashCode(this.f23417a) * 31) + Integer.hashCode(this.f23418b)) * 31) + Integer.hashCode(this.f23419c)) * 31) + Integer.hashCode(this.f23420d)) * 31) + Float.hashCode(this.f23421e)) * 31;
        String str = this.f23422f;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((((hashCode3 + hashCode) * 31) + Integer.hashCode(this.f23423g)) * 31) + this.f23424h.hashCode()) * 31;
        String str2 = this.f23425i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        String str3 = this.f23426j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i2 + i) * 31) + Boolean.hashCode(this.f23427k);
    }

    /* renamed from: i */
    public final String m80193i() {
        return this.f23426j;
    }

    /* renamed from: j */
    public final int m80192j() {
        return this.f23419c;
    }

    /* renamed from: k */
    public final boolean m80191k() {
        return this.f23427k;
    }

    public String toString() {
        int i = this.f23417a;
        int i2 = this.f23418b;
        int i3 = this.f23419c;
        int i4 = this.f23420d;
        float f = this.f23421e;
        String str = this.f23422f;
        int i5 = this.f23423g;
        String str2 = this.f23424h;
        String str3 = this.f23425i;
        String str4 = this.f23426j;
        boolean z = this.f23427k;
        return "DeviceBodyFields(deviceWidth=" + i + ", deviceHeight=" + i2 + ", width=" + i3 + ", height=" + i4 + ", scale=" + f + ", dpi=" + str + ", ortbDeviceType=" + i5 + ", deviceType=" + str2 + ", packageName=" + str3 + ", versionName=" + str4 + ", isPortrait=" + z + ")";
    }

    public /* synthetic */ C10310w3(int i, int i2, int i3, int i4, float f, String str, int i5, String str2, String str3, String str4, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) == 0 ? i4 : 0, (i6 & 16) != 0 ? 0.0f : f, (i6 & 32) != 0 ? "" : str, (i6 & 64) != 0 ? AbstractC9670a4.f21553a : i5, (i6 & 128) != 0 ? "phone" : str2, (i6 & 256) != 0 ? null : str3, (i6 & 512) == 0 ? str4 : null, (i6 & 1024) != 0 ? true : z);
    }
}
