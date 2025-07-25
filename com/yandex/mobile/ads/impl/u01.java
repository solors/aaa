package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u01 {
    @NotNull

    /* renamed from: a */
    private final hl0 f86053a;
    @NotNull

    /* renamed from: b */
    private final C31870y5 f86054b;

    public /* synthetic */ u01(hl0 hl0Var) {
        this(hl0Var, new C31870y5(hl0Var));
    }

    /* renamed from: a */
    public final void m28907a(@NotNull b62 uiElements, @NotNull rk0 controlsState) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        float m30000a = controlsState.m30000a();
        boolean m29997d = controlsState.m29997d();
        s01 m35625i = uiElements.m35625i();
        t01 t01Var = new t01(this.f86053a, this.f86054b, controlsState, m35625i);
        if (m35625i != null) {
            m35625i.setOnClickListener(t01Var);
        }
        if (m35625i != null) {
            m35625i.setMuted(m29997d);
        }
        this.f86054b.m27031a(m30000a, m29997d);
    }

    public u01(@NotNull hl0 instreamVastAdPlayer, @NotNull C31870y5 adPlayerVolumeConfigurator) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        this.f86053a = instreamVastAdPlayer;
        this.f86054b = adPlayerVolumeConfigurator;
    }
}
