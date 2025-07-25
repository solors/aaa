package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* loaded from: classes4.dex */
public interface VideoRendererEventListener {

    /* loaded from: classes4.dex */
    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = videoRendererEventListener;
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new RunnableC15144j(this, str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new RunnableC15149o(this, decoderCounters));
            }
        }

        public void droppedFrames(int i, long j) {
            if (this.listener != null) {
                this.handler.post(new RunnableC15146l(this, i, j));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new RunnableC15143i(this, decoderCounters));
            }
        }

        public void inputFormatChanged(C15014o c15014o) {
            if (this.listener != null) {
                this.handler.post(new RunnableC15145k(this, c15014o));
            }
        }

        public void renderedFirstFrame(Surface surface) {
            if (this.listener != null) {
                this.handler.post(new RunnableC15148n(this, surface));
            }
        }

        public void videoSizeChanged(int i, int i2, int i3, float f) {
            if (this.listener != null) {
                this.handler.post(new RunnableC15147m(this, i, i2, i3, f));
            }
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(C15014o c15014o);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
