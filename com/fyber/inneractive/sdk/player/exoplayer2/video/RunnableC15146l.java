package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.l */
/* loaded from: classes4.dex */
public final class RunnableC15146l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f29913a;

    /* renamed from: b */
    public final /* synthetic */ long f29914b;

    /* renamed from: c */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f29915c;

    public RunnableC15146l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.f29915c = eventDispatcher;
        this.f29913a = i;
        this.f29914b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.f29915c.listener;
        videoRendererEventListener.onDroppedFrames(this.f29913a, this.f29914b);
    }
}
