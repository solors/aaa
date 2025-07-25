package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* loaded from: classes4.dex */
public interface AudioRendererEventListener {

    /* loaded from: classes4.dex */
    public static final class EventDispatcher {
        private final Handler handler;
        private final AudioRendererEventListener listener;

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            if (audioRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = audioRendererEventListener;
        }

        public void audioSessionId(int i) {
            if (this.listener != null) {
                this.handler.post(new RunnableC14805i(this, i));
            }
        }

        public void audioTrackUnderrun(int i, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new RunnableC14803g(this, i, j, j2));
            }
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new RunnableC14801e(this, str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new RunnableC14804h(this, decoderCounters));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new RunnableC14800d(this, decoderCounters));
            }
        }

        public void inputFormatChanged(C15014o c15014o) {
            if (this.listener != null) {
                this.handler.post(new RunnableC14802f(this, c15014o));
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(C15014o c15014o);

    void onAudioSessionId(int i);

    void onAudioTrackUnderrun(int i, long j, long j2);
}
