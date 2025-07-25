package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yu1 {
    @NotNull

    /* renamed from: a */
    private final hl0 f88556a;
    @Nullable

    /* renamed from: b */
    private final x72 f88557b;

    public /* synthetic */ yu1(hl0 hl0Var, kl0 kl0Var) {
        this(hl0Var, kl0Var, kl0Var.m32499g());
    }

    /* renamed from: a */
    public final void m26571a(@NotNull View skipControl, @NotNull rk0 controlsState) {
        Intrinsics.checkNotNullParameter(skipControl, "skipControl");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        if (this.f88557b != null) {
            skipControl.setOnClickListener(new xu1(this.f88556a));
            if (controlsState.m29998c()) {
                skipControl.setVisibility(0);
            }
            skipControl.setEnabled(controlsState.m29998c());
            return;
        }
        skipControl.setVisibility(8);
    }

    public yu1(@NotNull hl0 instreamVastAdPlayer, @NotNull kl0 instreamVideoAd, @Nullable x72 x72Var) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        this.f88556a = instreamVastAdPlayer;
        this.f88557b = x72Var;
    }
}
