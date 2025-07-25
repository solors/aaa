package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class kh1 {
    @NotNull

    /* renamed from: a */
    private final C30376gd f81422a;

    public /* synthetic */ kh1() {
        this(new C30376gd());
    }

    /* renamed from: a */
    public final void m32559a(@NotNull ProgressBar progressBar, long j, long j2) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f81422a.getClass();
        C30376gd.m33882a(progressBar, j2, j);
    }

    public kh1(@NotNull C30376gd animatedProgressBarController) {
        Intrinsics.checkNotNullParameter(animatedProgressBarController, "animatedProgressBarController");
        this.f81422a = animatedProgressBarController;
    }
}
