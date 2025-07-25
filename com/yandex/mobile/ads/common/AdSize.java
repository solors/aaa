package com.yandex.mobile.ads.common;

import androidx.annotation.Dimension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class AdSize {

    /* renamed from: a */
    private final int f76558a;

    /* renamed from: b */
    private final int f76559b;

    public AdSize(int i, int i2) {
        this.f76558a = i;
        this.f76559b = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(AdSize.class, obj.getClass())) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        if (this.f76558a == adSize.f76558a && this.f76559b == adSize.f76559b) {
            return true;
        }
        return false;
    }

    @Dimension(unit = 0)
    public final int getHeight() {
        return this.f76559b;
    }

    @Dimension(unit = 0)
    public final int getWidth() {
        return this.f76558a;
    }

    public int hashCode() {
        return (this.f76558a * 31) + this.f76559b;
    }

    @NotNull
    public String toString() {
        int i = this.f76558a;
        int i2 = this.f76559b;
        return "AdSize (width=" + i + ", height=" + i2 + ")";
    }
}
