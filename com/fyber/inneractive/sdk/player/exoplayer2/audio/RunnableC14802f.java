package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.f */
/* loaded from: classes4.dex */
public final class RunnableC14802f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15014o f28111a;

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f28112b;

    public RunnableC14802f(AudioRendererEventListener.EventDispatcher eventDispatcher, C15014o c15014o) {
        this.f28112b = eventDispatcher;
        this.f28111a = c15014o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        audioRendererEventListener = this.f28112b.listener;
        audioRendererEventListener.onAudioInputFormatChanged(this.f28111a);
    }
}
