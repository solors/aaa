package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class kf2 implements AdError {
    @NotNull

    /* renamed from: a */
    private final String f81413a;

    public kf2(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f81413a = description;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kf2) && Intrinsics.m17075f(this.f81413a, ((kf2) obj).f81413a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.common.AdError
    @NotNull
    public final String getDescription() {
        return this.f81413a;
    }

    public final int hashCode() {
        return this.f81413a.hashCode();
    }

    @NotNull
    public final String toString() {
        String str = this.f81413a;
        return "YandexAdError(description=" + str + ")";
    }
}
