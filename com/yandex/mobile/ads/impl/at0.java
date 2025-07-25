package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.LayoutRes;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class at0 {
    @NotNull

    /* renamed from: a */
    private final zs0 f76908a;
    @NotNull

    /* renamed from: b */
    private final vo1<CorePlaybackControlsContainer> f76909b;

    public /* synthetic */ at0() {
        this(new zs0(), new vo1());
    }

    @Nullable
    /* renamed from: a */
    public final bt0 m35772a(@NotNull Context context, @LayoutRes int i, @NotNull bt0 controls) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controls, "customControls");
        this.f76908a.getClass();
        Intrinsics.checkNotNullParameter(controls, "controls");
        if (controls.getMuteControl() == null && controls.getVideoProgress() == null && controls.getCountDownProgress() == null) {
            this.f76909b.getClass();
            return (bt0) vo1.m28247a(context, CorePlaybackControlsContainer.class, i, null);
        }
        return new C30193du(controls.getMuteControl(), controls.getVideoProgress(), controls.getCountDownProgress());
    }

    public at0(@NotNull zs0 controlsAvailabilityChecker, @NotNull vo1<CorePlaybackControlsContainer> safeLayoutInflater) {
        Intrinsics.checkNotNullParameter(controlsAvailabilityChecker, "controlsAvailabilityChecker");
        Intrinsics.checkNotNullParameter(safeLayoutInflater, "safeLayoutInflater");
        this.f76908a = controlsAvailabilityChecker;
        this.f76909b = safeLayoutInflater;
    }
}
