package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l71 implements q71 {
    @NotNull

    /* renamed from: a */
    private final e71 f81730a;
    @NotNull

    /* renamed from: b */
    private final i81 f81731b;

    public l71(@NotNull e71 player, @NotNull i81 videoView) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.f81730a = player;
        this.f81731b = videoView;
    }

    @Override // com.yandex.mobile.ads.impl.q71
    /* renamed from: a */
    public final void mo30451a() {
        this.f81731b.m33350b().m33901b().clearAnimation();
        this.f81730a.mo28047a((TextureView) null);
    }

    @Override // com.yandex.mobile.ads.impl.q71
    /* renamed from: b */
    public final void mo30450b() {
        this.f81730a.mo28047a(this.f81731b.m33349c());
    }
}
