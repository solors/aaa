package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rv0 implements su0<MediatedNativeAdapter> {
    @NotNull

    /* renamed from: a */
    private final yu0<MediatedNativeAdapter> f84906a;

    public rv0(@NotNull yu0<MediatedNativeAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f84906a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    @Nullable
    /* renamed from: a */
    public final qu0<MediatedNativeAdapter> mo25981a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f84906a.m26572a(context, MediatedNativeAdapter.class);
    }
}
