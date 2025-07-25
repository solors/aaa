package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class hv0 implements su0<MediatedBannerAdapter> {
    @NotNull

    /* renamed from: a */
    private final yu0<MediatedBannerAdapter> f80212a;

    public hv0(@NotNull yu0<MediatedBannerAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f80212a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    @Nullable
    /* renamed from: a */
    public final qu0<MediatedBannerAdapter> mo25981a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f80212a.m26572a(context, MediatedBannerAdapter.class);
    }
}
