package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.m */
/* loaded from: classes4.dex */
public final class RunnableC15147m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f29916a;

    /* renamed from: b */
    public final /* synthetic */ int f29917b;

    /* renamed from: c */
    public final /* synthetic */ int f29918c;

    /* renamed from: d */
    public final /* synthetic */ float f29919d;

    /* renamed from: e */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f29920e;

    public RunnableC15147m(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, int i2, int i3, float f) {
        this.f29920e = eventDispatcher;
        this.f29916a = i;
        this.f29917b = i2;
        this.f29918c = i3;
        this.f29919d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.f29920e.listener;
        videoRendererEventListener.onVideoSizeChanged(this.f29916a, this.f29917b, this.f29918c, this.f29919d);
    }
}
