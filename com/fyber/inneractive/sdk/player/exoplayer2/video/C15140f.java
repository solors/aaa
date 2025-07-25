package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.f */
/* loaded from: classes4.dex */
public final class C15140f implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ MediaCodecVideoRenderer f29888a;

    public C15140f(MediaCodecVideoRenderer mediaCodecVideoRenderer, MediaCodec mediaCodec) {
        this.f29888a = mediaCodecVideoRenderer;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer = this.f29888a;
        if (this == mediaCodecVideoRenderer.f29872p0 && !mediaCodecVideoRenderer.f29855Y) {
            mediaCodecVideoRenderer.f29855Y = true;
            mediaCodecVideoRenderer.f29847Q.renderedFirstFrame(mediaCodecVideoRenderer.f29853W);
        }
    }
}
