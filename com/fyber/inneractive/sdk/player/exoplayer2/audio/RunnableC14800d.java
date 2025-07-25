package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.d */
/* loaded from: classes4.dex */
public final class RunnableC14800d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DecoderCounters f28105a;

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f28106b;

    public RunnableC14800d(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f28106b = eventDispatcher;
        this.f28105a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        audioRendererEventListener = this.f28106b.listener;
        audioRendererEventListener.onAudioEnabled(this.f28105a);
    }
}
