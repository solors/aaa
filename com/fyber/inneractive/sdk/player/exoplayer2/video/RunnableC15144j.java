package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.j */
/* loaded from: classes4.dex */
public final class RunnableC15144j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f29907a;

    /* renamed from: b */
    public final /* synthetic */ long f29908b;

    /* renamed from: c */
    public final /* synthetic */ long f29909c;

    /* renamed from: d */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f29910d;

    public RunnableC15144j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.f29910d = eventDispatcher;
        this.f29907a = str;
        this.f29908b = j;
        this.f29909c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.f29910d.listener;
        videoRendererEventListener.onVideoDecoderInitialized(this.f29907a, this.f29908b, this.f29909c);
    }
}
