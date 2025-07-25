package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.g */
/* loaded from: classes4.dex */
public final class RunnableC14803g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28113a;

    /* renamed from: b */
    public final /* synthetic */ long f28114b;

    /* renamed from: c */
    public final /* synthetic */ long f28115c;

    /* renamed from: d */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f28116d;

    public RunnableC14803g(AudioRendererEventListener.EventDispatcher eventDispatcher, int i, long j, long j2) {
        this.f28116d = eventDispatcher;
        this.f28113a = i;
        this.f28114b = j;
        this.f28115c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        audioRendererEventListener = this.f28116d.listener;
        audioRendererEventListener.onAudioTrackUnderrun(this.f28113a, this.f28114b, this.f28115c);
    }
}
