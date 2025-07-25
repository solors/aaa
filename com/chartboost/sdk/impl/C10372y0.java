package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.y0 */
/* loaded from: classes3.dex */
public final class C10372y0 {

    /* renamed from: a */
    public final int f23582a;

    /* renamed from: b */
    public final String f23583b;

    /* renamed from: c */
    public String f23584c;

    /* renamed from: d */
    public C10301w f23585d;

    /* renamed from: e */
    public C10273v f23586e;

    /* renamed from: f */
    public boolean f23587f;

    /* renamed from: g */
    public boolean f23588g;

    public C10372y0(int i, String location, String str, C10301w c10301w, C10273v c10273v, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f23582a = i;
        this.f23583b = location;
        this.f23584c = str;
        this.f23585d = c10301w;
        this.f23586e = c10273v;
        this.f23587f = z;
        this.f23588g = z2;
    }

    /* renamed from: a */
    public final C10273v m79996a() {
        return this.f23586e;
    }

    /* renamed from: b */
    public final C10301w m79991b() {
        return this.f23585d;
    }

    /* renamed from: c */
    public final String m79989c() {
        return this.f23584c;
    }

    /* renamed from: d */
    public final String m79988d() {
        return this.f23583b;
    }

    /* renamed from: e */
    public final boolean m79987e() {
        return this.f23588g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10372y0)) {
            return false;
        }
        C10372y0 c10372y0 = (C10372y0) obj;
        if (this.f23582a == c10372y0.f23582a && Intrinsics.m17075f(this.f23583b, c10372y0.f23583b) && Intrinsics.m17075f(this.f23584c, c10372y0.f23584c) && Intrinsics.m17075f(this.f23585d, c10372y0.f23585d) && Intrinsics.m17075f(this.f23586e, c10372y0.f23586e) && this.f23587f == c10372y0.f23587f && this.f23588g == c10372y0.f23588g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((Integer.hashCode(this.f23582a) * 31) + this.f23583b.hashCode()) * 31;
        String str = this.f23584c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        C10301w c10301w = this.f23585d;
        if (c10301w == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c10301w.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C10273v c10273v = this.f23586e;
        if (c10273v != null) {
            i = c10273v.hashCode();
        }
        return ((((i3 + i) * 31) + Boolean.hashCode(this.f23587f)) * 31) + Boolean.hashCode(this.f23588g);
    }

    public String toString() {
        int i = this.f23582a;
        String str = this.f23583b;
        String str2 = this.f23584c;
        C10301w c10301w = this.f23585d;
        C10273v c10273v = this.f23586e;
        boolean z = this.f23587f;
        boolean z2 = this.f23588g;
        return "AppRequest(id=" + i + ", location=" + str + ", bidResponse=" + str2 + ", bannerData=" + c10301w + ", adUnit=" + c10273v + ", isTrackedCache=" + z + ", isTrackedShow=" + z2 + ")";
    }

    /* renamed from: a */
    public final void m79995a(C10273v c10273v) {
        this.f23586e = c10273v;
    }

    /* renamed from: b */
    public final void m79990b(boolean z) {
        this.f23588g = z;
    }

    /* renamed from: a */
    public final void m79994a(C10301w c10301w) {
        this.f23585d = c10301w;
    }

    /* renamed from: a */
    public final void m79993a(String str) {
        this.f23584c = str;
    }

    /* renamed from: a */
    public final void m79992a(boolean z) {
        this.f23587f = z;
    }

    public /* synthetic */ C10372y0(int i, String str, String str2, C10301w c10301w, C10273v c10273v, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : c10301w, (i2 & 16) != 0 ? null : c10273v, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2);
    }
}
