package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.c0 */
/* loaded from: classes7.dex */
public final class C24320c0 {
    @NotNull

    /* renamed from: a */
    public final String f62975a;
    @NotNull

    /* renamed from: b */
    public final String f62976b;
    @NotNull

    /* renamed from: c */
    public final String f62977c;

    /* renamed from: d */
    public final boolean f62978d;
    @NotNull

    /* renamed from: e */
    public final String f62979e;
    @NotNull

    /* renamed from: f */
    public final String f62980f;

    /* renamed from: g */
    public final int f62981g;
    @NotNull

    /* renamed from: h */
    public final String f62982h;
    @NotNull

    /* renamed from: i */
    public final String f62983i;

    /* renamed from: j */
    public final float f62984j;

    /* renamed from: k */
    public final long f62985k;

    public C24320c0(@NotNull String manufacturer, @NotNull String model, @NotNull String hwVersion, boolean z, @NotNull String os, @NotNull String osVersion, int i, @NotNull String language, @NotNull String mobileCarrier, float f, long j) {
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hwVersion, "hwVersion");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(mobileCarrier, "mobileCarrier");
        this.f62975a = manufacturer;
        this.f62976b = model;
        this.f62977c = hwVersion;
        this.f62978d = z;
        this.f62979e = os;
        this.f62980f = osVersion;
        this.f62981g = i;
        this.f62982h = language;
        this.f62983i = mobileCarrier;
        this.f62984j = f;
        this.f62985k = j;
    }

    /* renamed from: a */
    public final long m46615a() {
        return this.f62985k;
    }

    @NotNull
    /* renamed from: b */
    public final String m46614b() {
        return this.f62977c;
    }

    @NotNull
    /* renamed from: c */
    public final String m46613c() {
        return this.f62982h;
    }

    @NotNull
    /* renamed from: d */
    public final String m46612d() {
        return this.f62975a;
    }

    @NotNull
    /* renamed from: e */
    public final String m46611e() {
        return this.f62983i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24320c0)) {
            return false;
        }
        C24320c0 c24320c0 = (C24320c0) obj;
        if (Intrinsics.m17075f(this.f62975a, c24320c0.f62975a) && Intrinsics.m17075f(this.f62976b, c24320c0.f62976b) && Intrinsics.m17075f(this.f62977c, c24320c0.f62977c) && this.f62978d == c24320c0.f62978d && Intrinsics.m17075f(this.f62979e, c24320c0.f62979e) && Intrinsics.m17075f(this.f62980f, c24320c0.f62980f) && this.f62981g == c24320c0.f62981g && Intrinsics.m17075f(this.f62982h, c24320c0.f62982h) && Intrinsics.m17075f(this.f62983i, c24320c0.f62983i) && Float.compare(this.f62984j, c24320c0.f62984j) == 0 && this.f62985k == c24320c0.f62985k) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m46610f() {
        return this.f62976b;
    }

    @NotNull
    /* renamed from: g */
    public final String m46609g() {
        return this.f62979e;
    }

    @NotNull
    /* renamed from: h */
    public final String m46608h() {
        return this.f62980f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f62975a.hashCode() * 31) + this.f62976b.hashCode()) * 31) + this.f62977c.hashCode()) * 31;
        boolean z = this.f62978d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((((hashCode + i) * 31) + this.f62979e.hashCode()) * 31) + this.f62980f.hashCode()) * 31) + Integer.hashCode(this.f62981g)) * 31) + this.f62982h.hashCode()) * 31) + this.f62983i.hashCode()) * 31) + Float.hashCode(this.f62984j)) * 31) + Long.hashCode(this.f62985k);
    }

    /* renamed from: i */
    public final float m46607i() {
        return this.f62984j;
    }

    /* renamed from: j */
    public final boolean m46606j() {
        return this.f62978d;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(manufacturer=" + this.f62975a + ", model=" + this.f62976b + ", hwVersion=" + this.f62977c + ", isTablet=" + this.f62978d + ", os=" + this.f62979e + ", osVersion=" + this.f62980f + ", apiLevel=" + this.f62981g + ", language=" + this.f62982h + ", mobileCarrier=" + this.f62983i + ", screenDensity=" + this.f62984j + ", dbtMs=" + this.f62985k + ')';
    }
}
