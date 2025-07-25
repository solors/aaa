package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ov0 implements su0<MediatedInterstitialAdapter> {
    @NotNull

    /* renamed from: a */
    private final yu0<MediatedInterstitialAdapter> f83624a;

    public ov0(@NotNull yu0<MediatedInterstitialAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f83624a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    @Nullable
    /* renamed from: a */
    public final qu0<MediatedInterstitialAdapter> mo25981a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f83624a.m26572a(context, MediatedInterstitialAdapter.class);
    }
}
