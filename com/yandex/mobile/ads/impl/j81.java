package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j81 {
    @NotNull

    /* renamed from: a */
    private final e71 f80797a;

    public j81(@NotNull e71 videoAdPlayer) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        this.f80797a = videoAdPlayer;
    }

    /* renamed from: a */
    public final void m33021a(@NotNull i81 nativeVideoView) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        TextureView m33349c = nativeVideoView.m33349c();
        this.f80797a.mo28047a(m33349c);
        m33349c.setVisibility(0);
        nativeVideoView.m33351a().setVisibility(0);
        nativeVideoView.m33350b().setVisibility(0);
    }

    /* renamed from: b */
    public final void m33020b(@NotNull i81 nativeVideoView) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        TextureView m33349c = nativeVideoView.m33349c();
        this.f80797a.mo28047a((TextureView) null);
        m33349c.setVisibility(8);
        nativeVideoView.m33351a().setVisibility(8);
        nativeVideoView.m33350b().setVisibility(8);
    }
}
