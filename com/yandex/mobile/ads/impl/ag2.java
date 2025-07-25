package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ag2 implements ImpressionData {
    @NotNull

    /* renamed from: a */
    private final AdImpressionData f76786a;

    public ag2(@NotNull AdImpressionData impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.f76786a = impressionData;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof ag2) && Intrinsics.m17075f(((ag2) obj).f76786a, this.f76786a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    @NotNull
    public final String getRawData() {
        return this.f76786a.m44526c();
    }

    public final int hashCode() {
        return this.f76786a.hashCode();
    }
}
