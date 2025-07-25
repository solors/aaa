package com.yandex.mobile.ads.impl;

import androidx.annotation.Dimension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.w8 */
/* loaded from: classes8.dex */
public final class C31727w8 {

    /* renamed from: a */
    private final int f87139a;

    /* renamed from: b */
    private final int f87140b;

    public C31727w8(int i, int i2) {
        this.f87139a = i;
        this.f87140b = i2;
    }

    @Dimension(unit = 0)
    /* renamed from: a */
    public final int m28014a() {
        return this.f87140b;
    }

    @Dimension(unit = 0)
    /* renamed from: b */
    public final int m28013b() {
        return this.f87139a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31727w8)) {
            return false;
        }
        C31727w8 c31727w8 = (C31727w8) obj;
        if (this.f87139a == c31727w8.f87139a && this.f87140b == c31727w8.f87140b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87140b) + (Integer.hashCode(this.f87139a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f87139a;
        int i2 = this.f87140b;
        return "AdSize(width=" + i + ", height=" + i2 + ")";
    }
}
