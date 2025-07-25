package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zv0 implements su0<MediatedRewardedAdapter> {
    @NotNull

    /* renamed from: a */
    private final yu0<MediatedRewardedAdapter> f89128a;

    public zv0(@NotNull yu0<MediatedRewardedAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f89128a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    @Nullable
    /* renamed from: a */
    public final qu0<MediatedRewardedAdapter> mo25981a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f89128a.m26572a(context, MediatedRewardedAdapter.class);
    }
}
