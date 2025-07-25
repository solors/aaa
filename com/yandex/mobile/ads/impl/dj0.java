package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.rk0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dj0 {
    @NotNull

    /* renamed from: a */
    private final hl0 f78173a;

    public dj0(@NotNull hl0 instreamVastAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        this.f78173a = instreamVastAdPlayer;
    }

    @NotNull
    /* renamed from: a */
    public final rk0 m34898a(@NotNull b62 uiElements, @NotNull rk0 initialControlsState) {
        boolean z;
        Boolean bool;
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Intrinsics.checkNotNullParameter(initialControlsState, "initialControlsState");
        if (this.f78173a.getVolume() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        View m35622l = uiElements.m35622l();
        Float f = null;
        if (m35622l != null) {
            bool = Boolean.valueOf(m35622l.isEnabled());
        } else {
            bool = null;
        }
        ProgressBar m35624j = uiElements.m35624j();
        if (m35624j != null) {
            int progress = m35624j.getProgress();
            int max = m35624j.getMax();
            if (max != 0) {
                f = Float.valueOf(progress / max);
            }
        }
        rk0.C31295a c31295a = new rk0.C31295a();
        c31295a.m29991b(z);
        if (bool != null) {
            c31295a.m29994a(bool.booleanValue());
        }
        if (f != null) {
            c31295a.m29992b(f.floatValue());
        }
        c31295a.m29995a(initialControlsState.m30000a());
        return new rk0(c31295a);
    }
}
