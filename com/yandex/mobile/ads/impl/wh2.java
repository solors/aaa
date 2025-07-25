package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wh2 implements VideoPlayerListener {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30269et f87275a;

    public wh2(@NotNull r92 videoPlayerListener) {
        Intrinsics.checkNotNullParameter(videoPlayerListener, "videoPlayerListener");
        this.f87275a = videoPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        this.f87275a.onVideoCompleted();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        this.f87275a.onVideoError();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        this.f87275a.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        this.f87275a.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        this.f87275a.onVideoResumed();
    }
}
