package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ft0 {

    /* renamed from: a */
    private final int f79309a;

    /* renamed from: b */
    private final int f79310b;

    /* renamed from: c */
    private final int f79311c;

    public ft0(int i, int i2, int i3) {
        this.f79309a = i;
        this.f79310b = i2;
        this.f79311c = i3;
    }

    /* renamed from: a */
    public final int m34083a() {
        return this.f79311c;
    }

    /* renamed from: b */
    public final int m34082b() {
        return this.f79310b;
    }

    /* renamed from: c */
    public final int m34081c() {
        return this.f79309a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft0)) {
            return false;
        }
        ft0 ft0Var = (ft0) obj;
        if (this.f79309a == ft0Var.f79309a && this.f79310b == ft0Var.f79310b && this.f79311c == ft0Var.f79311c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79311c) + nt1.m31295a(this.f79310b, Integer.hashCode(this.f79309a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f79309a;
        int i2 = this.f79310b;
        int i3 = this.f79311c;
        return "MediaFileInfo(width=" + i + ", height=" + i2 + ", bitrate=" + i3 + ")";
    }
}
