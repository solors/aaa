package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.x4 */
/* loaded from: classes8.dex */
public final class C31792x4 {
    @NotNull

    /* renamed from: a */
    private final EnumC31868y4 f87539a;
    @NotNull

    /* renamed from: b */
    private final Map<String, Object> f87540b;

    public C31792x4(@NotNull EnumC31868y4 adLoadingPhaseType, @NotNull Map<String, ? extends Object> reportParameters) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(reportParameters, "reportParameters");
        this.f87539a = adLoadingPhaseType;
        this.f87540b = reportParameters;
    }

    @NotNull
    /* renamed from: a */
    public final EnumC31868y4 m27670a() {
        return this.f87539a;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, Object> m27669b() {
        return this.f87540b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31792x4)) {
            return false;
        }
        C31792x4 c31792x4 = (C31792x4) obj;
        if (this.f87539a == c31792x4.f87539a && Intrinsics.m17075f(this.f87540b, c31792x4.f87540b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f87540b.hashCode() + (this.f87539a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        EnumC31868y4 enumC31868y4 = this.f87539a;
        Map<String, Object> map = this.f87540b;
        return "AdLoadingPhase(adLoadingPhaseType=" + enumC31868y4 + ", reportParameters=" + map + ")";
    }
}
