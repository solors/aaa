package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z80 {
    @NotNull

    /* renamed from: a */
    private final qu1 f88764a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30355g1 f88765b;

    /* renamed from: c */
    private final Context f88766c;

    public z80(@NotNull Context context, @NotNull qu1 sizeInfo, @NotNull InterfaceC30355g1 adActivityListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f88764a = sizeInfo;
        this.f88765b = adActivityListener;
        this.f88766c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m26317a() {
        int i;
        int i2 = this.f88766c.getResources().getConfiguration().orientation;
        Context context = this.f88766c;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        qu1 qu1Var = this.f88764a;
        boolean m34644b = C30226ea.m34644b(context, qu1Var);
        boolean m34646a = C30226ea.m34646a(context, qu1Var);
        if (m34644b == m34646a) {
            i = -1;
        } else if (!m34646a ? 1 == i2 : 1 != i2) {
            i = 7;
        } else {
            i = 6;
        }
        if (-1 != i) {
            this.f88765b.mo31194a(i);
        }
    }
}
