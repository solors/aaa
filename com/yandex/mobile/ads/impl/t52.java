package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class t52 {

    /* renamed from: a */
    private final int f85521a;

    /* renamed from: b */
    private final int f85522b;

    /* renamed from: c */
    private final int f85523c;

    public t52(int i, int i2, int i3) {
        this.f85521a = i;
        this.f85522b = i2;
        this.f85523c = i3;
    }

    /* renamed from: a */
    public final int m29283a() {
        return this.f85521a;
    }

    /* renamed from: b */
    public final int m29282b() {
        return this.f85522b;
    }

    /* renamed from: c */
    public final int m29281c() {
        return this.f85523c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t52)) {
            return false;
        }
        t52 t52Var = (t52) obj;
        if (this.f85521a == t52Var.f85521a && this.f85522b == t52Var.f85522b && this.f85523c == t52Var.f85523c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85523c) + nt1.m31295a(this.f85522b, Integer.hashCode(this.f85521a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f85521a;
        int i2 = this.f85522b;
        int i3 = this.f85523c;
        return "VersionInfo(majorVersion=" + i + ", minorVersion=" + i2 + ", patchVersion=" + i3 + ")";
    }
}
