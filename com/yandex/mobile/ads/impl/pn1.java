package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class pn1 {
    @NotNull

    /* renamed from: a */
    private final l02 f84025a;
    @NotNull

    /* renamed from: b */
    private final rz1 f84026b;

    public /* synthetic */ pn1(m02 m02Var) {
        this(m02Var, new rz1());
    }

    /* renamed from: a */
    public final void m30612a(@NotNull View timerView, long j, long j2) {
        Intrinsics.checkNotNullParameter(timerView, "timerView");
        timerView.setVisibility(0);
        TextView mo32163a = this.f84025a.mo32163a(timerView);
        if (mo32163a != null) {
            this.f84026b.getClass();
            rz1.m29891a(mo32163a, j, j2);
        }
    }

    public pn1(@NotNull m02 timerViewProvider, @NotNull rz1 textDelayViewController) {
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(textDelayViewController, "textDelayViewController");
        this.f84025a = timerViewProvider;
        this.f84026b = textDelayViewController;
    }
}
