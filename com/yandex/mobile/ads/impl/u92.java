package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u92 {
    @NotNull

    /* renamed from: a */
    private final k81 f86164a;
    @NotNull

    /* renamed from: b */
    private final jh1 f86165b;

    public u92(@NotNull k81 controlsConfigurator, @NotNull jh1 progressBarConfigurator) {
        Intrinsics.checkNotNullParameter(controlsConfigurator, "controlsConfigurator");
        Intrinsics.checkNotNullParameter(progressBarConfigurator, "progressBarConfigurator");
        this.f86164a = controlsConfigurator;
        this.f86165b = progressBarConfigurator;
    }

    /* renamed from: a */
    public final void m28847a(@NotNull i81 videoView) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.m33349c().setVisibility(0);
        g92 placeholderView = videoView.m33350b();
        this.f86165b.getClass();
        Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
        placeholderView.m33901b().setVisibility(8);
        ImageView m33902a = placeholderView.m33902a();
        if (m33902a != null) {
            m33902a.setVisibility(8);
        }
        this.f86164a.m32628a(videoView.m33351a().m35347a());
    }
}
