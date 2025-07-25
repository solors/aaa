package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.n */
/* loaded from: classes4.dex */
public final class RunnableC15148n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Surface f29921a;

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f29922b;

    public RunnableC15148n(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.f29922b = eventDispatcher;
        this.f29921a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.f29922b.listener;
        videoRendererEventListener.onRenderedFirstFrame(this.f29921a);
    }
}
