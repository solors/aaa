package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class xu1 implements View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final hl0 f87849a;

    public xu1(@NotNull hl0 instreamVastAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        this.f87849a = instreamVastAdPlayer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f87849a.m33526e();
    }
}
