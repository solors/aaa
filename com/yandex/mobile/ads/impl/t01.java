package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class t01 implements View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final hl0 f85476a;
    @NotNull

    /* renamed from: b */
    private final C31870y5 f85477b;
    @NotNull

    /* renamed from: c */
    private final rk0 f85478c;
    @Nullable

    /* renamed from: d */
    private final s01 f85479d;

    public t01(@NotNull hl0 instreamVastAdPlayer, @NotNull C31870y5 adPlayerVolumeConfigurator, @NotNull rk0 instreamControlsState, @Nullable s01 s01Var) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        Intrinsics.checkNotNullParameter(instreamControlsState, "instreamControlsState");
        this.f85476a = instreamVastAdPlayer;
        this.f85477b = adPlayerVolumeConfigurator;
        this.f85478c = instreamControlsState;
        this.f85479d = s01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View volumeControl) {
        boolean z;
        Intrinsics.checkNotNullParameter(volumeControl, "volumeControl");
        if (this.f85476a.getVolume() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        this.f85477b.m27031a(this.f85478c.m30000a(), z2);
        s01 s01Var = this.f85479d;
        if (s01Var != null) {
            s01Var.setMuted(z2);
        }
    }
}
