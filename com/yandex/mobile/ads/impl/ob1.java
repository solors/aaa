package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ob1 {
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f83397a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30355g1 f83398b;

    /* renamed from: c */
    private final Context f83399c;

    public ob1(@NotNull Context context, @NotNull C30149d8 adResponse, @NotNull C31012o1 adActivityListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f83397a = adResponse;
        this.f83398b = adActivityListener;
        this.f83399c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m31117a() {
        if (!this.f83397a.m35071Q()) {
            qu1 m35077K = this.f83397a.m35077K();
            Context context = this.f83399c;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            new z80(context, m35077K, this.f83398b).m26317a();
        }
    }
}
