package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.i */
/* loaded from: classes4.dex */
public final class RunnableC15143i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DecoderCounters f29905a;

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f29906b;

    public RunnableC15143i(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f29906b = eventDispatcher;
        this.f29905a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.f29906b.listener;
        videoRendererEventListener.onVideoEnabled(this.f29905a);
    }
}
