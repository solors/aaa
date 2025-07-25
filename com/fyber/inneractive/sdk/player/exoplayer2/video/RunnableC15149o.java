package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.o */
/* loaded from: classes4.dex */
public final class RunnableC15149o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DecoderCounters f29923a;

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f29924b;

    public RunnableC15149o(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f29924b = eventDispatcher;
        this.f29923a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        this.f29923a.ensureUpdated();
        videoRendererEventListener = this.f29924b.listener;
        videoRendererEventListener.onVideoDisabled(this.f29923a);
    }
}
