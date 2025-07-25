package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.n4 */
/* loaded from: classes8.dex */
public final class C30909n4 {

    /* renamed from: a */
    private final int f82607a;

    /* renamed from: b */
    private final int f82608b;

    public C30909n4(int i, int i2) {
        this.f82607a = i;
        this.f82608b = i2;
    }

    /* renamed from: a */
    public final int m31666a() {
        return this.f82607a;
    }

    /* renamed from: b */
    public final int m31665b() {
        return this.f82608b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30909n4)) {
            return false;
        }
        C30909n4 c30909n4 = (C30909n4) obj;
        if (this.f82607a == c30909n4.f82607a && this.f82608b == c30909n4.f82608b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f82608b) + (Integer.hashCode(this.f82607a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f82607a;
        int i2 = this.f82608b;
        return "AdInfo(adGroupIndex=" + i + ", adIndexInAdGroup=" + i2 + ")";
    }
}
