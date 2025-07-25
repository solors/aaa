package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.i */
/* loaded from: classes4.dex */
public final class RunnableC14805i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28119a;

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f28120b;

    public RunnableC14805i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i) {
        this.f28120b = eventDispatcher;
        this.f28119a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        audioRendererEventListener = this.f28120b.listener;
        audioRendererEventListener.onAudioSessionId(this.f28119a);
    }
}
