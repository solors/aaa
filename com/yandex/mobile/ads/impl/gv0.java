package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class gv0 implements su0<MediatedAppOpenAdAdapter> {
    @NotNull

    /* renamed from: a */
    private final yu0<MediatedAppOpenAdAdapter> f79775a;

    public gv0(@NotNull yu0<MediatedAppOpenAdAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f79775a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    @Nullable
    /* renamed from: a */
    public final qu0<MediatedAppOpenAdAdapter> mo25981a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f79775a.m26572a(context, MediatedAppOpenAdAdapter.class);
    }
}
