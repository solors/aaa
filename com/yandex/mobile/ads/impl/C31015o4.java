package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.o4 */
/* loaded from: classes8.dex */
public final class C31015o4 {

    /* renamed from: a */
    private final int f83293a;

    /* renamed from: b */
    private final int f83294b;

    public C31015o4(int i, int i2) {
        this.f83293a = i;
        this.f83294b = i2;
    }

    /* renamed from: a */
    public final int m31186a() {
        return this.f83293a;
    }

    /* renamed from: b */
    public final int m31185b() {
        return this.f83294b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31015o4)) {
            return false;
        }
        C31015o4 c31015o4 = (C31015o4) obj;
        if (this.f83293a == c31015o4.f83293a && this.f83294b == c31015o4.f83294b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83294b) + (Integer.hashCode(this.f83293a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f83293a;
        int i2 = this.f83294b;
        return "AdInfo(adGroupIndex=" + i + ", adIndexInAdGroup=" + i2 + ")";
    }
}
