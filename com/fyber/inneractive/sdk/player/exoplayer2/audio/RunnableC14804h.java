package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.h */
/* loaded from: classes4.dex */
public final class RunnableC14804h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DecoderCounters f28117a;

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f28118b;

    public RunnableC14804h(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f28118b = eventDispatcher;
        this.f28117a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        this.f28117a.ensureUpdated();
        audioRendererEventListener = this.f28118b.listener;
        audioRendererEventListener.onAudioDisabled(this.f28117a);
    }
}
