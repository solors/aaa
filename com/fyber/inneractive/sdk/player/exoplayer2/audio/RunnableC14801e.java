package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.e */
/* loaded from: classes4.dex */
public final class RunnableC14801e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f28107a;

    /* renamed from: b */
    public final /* synthetic */ long f28108b;

    /* renamed from: c */
    public final /* synthetic */ long f28109c;

    /* renamed from: d */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f28110d;

    public RunnableC14801e(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.f28110d = eventDispatcher;
        this.f28107a = str;
        this.f28108b = j;
        this.f28109c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        audioRendererEventListener = this.f28110d.listener;
        audioRendererEventListener.onAudioDecoderInitialized(this.f28107a, this.f28108b, this.f28109c);
    }
}
