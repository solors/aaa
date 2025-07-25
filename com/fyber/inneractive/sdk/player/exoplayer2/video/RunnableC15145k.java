package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.k */
/* loaded from: classes4.dex */
public final class RunnableC15145k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15014o f29911a;

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f29912b;

    public RunnableC15145k(VideoRendererEventListener.EventDispatcher eventDispatcher, C15014o c15014o) {
        this.f29912b = eventDispatcher;
        this.f29911a = c15014o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.f29912b.listener;
        videoRendererEventListener.onVideoInputFormatChanged(this.f29911a);
    }
}
