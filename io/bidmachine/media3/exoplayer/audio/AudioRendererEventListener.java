package io.bidmachine.media3.exoplayer.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.DecoderCounters;
import io.bidmachine.media3.exoplayer.DecoderReuseEvaluation;
import io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener;

@UnstableApi
/* loaded from: classes9.dex */
public interface AudioRendererEventListener {

    /* loaded from: classes9.dex */
    public static final class EventDispatcher {
        @Nullable
        private final Handler handler;
        @Nullable
        private final AudioRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
            Handler handler2;
            if (audioRendererEventListener != null) {
                handler2 = (Handler) Assertions.checkNotNull(handler);
            } else {
                handler2 = null;
            }
            this.handler = handler2;
            this.listener = audioRendererEventListener;
        }

        public /* synthetic */ void lambda$audioCodecError$9(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioCodecError(exc);
        }

        public /* synthetic */ void lambda$audioSinkError$8(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioSinkError(exc);
        }

        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDecoderInitialized(str, j, j2);
        }

        public /* synthetic */ void lambda$decoderReleased$5(String str) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDecoderReleased(str);
        }

        public /* synthetic */ void lambda$disabled$6(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDisabled(decoderCounters);
        }

        public /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioEnabled(decoderCounters);
        }

        public /* synthetic */ void lambda$inputFormatChanged$2(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioInputFormatChanged(format);
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        public /* synthetic */ void lambda$positionAdvancing$3(long j) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioPositionAdvancing(j);
        }

        public /* synthetic */ void lambda$skipSilenceEnabledChanged$7(boolean z) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onSkipSilenceEnabledChanged(z);
        }

        public /* synthetic */ void lambda$underrun$4(int i, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioUnderrun(i, j, j2);
        }

        public void audioCodecError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.j
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$audioCodecError$9(exc);
                    }
                });
            }
        }

        public void audioSinkError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.i
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$audioSinkError$8(exc);
                    }
                });
            }
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.b
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$decoderInitialized$1(str, j, j2);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.h
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$decoderReleased$5(str);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.c
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$disabled$6(decoderCounters);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.d
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$enabled$0(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.a
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$inputFormatChanged$2(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void positionAdvancing(final long j) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.e
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$positionAdvancing$3(j);
                    }
                });
            }
        }

        public void skipSilenceEnabledChanged(final boolean z) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.f
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$skipSilenceEnabledChanged$7(z);
                    }
                });
            }
        }

        public void underrun(final int i, final long j, final long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.audio.g
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$underrun$4(i, j, j2);
                    }
                });
            }
        }
    }

    @Deprecated
    default void onAudioInputFormatChanged(Format format) {
    }

    default void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onAudioCodecError(Exception exc) {
    }

    default void onAudioDecoderReleased(String str) {
    }

    default void onAudioDisabled(DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(DecoderCounters decoderCounters) {
    }

    default void onAudioPositionAdvancing(long j) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }

    default void onAudioDecoderInitialized(String str, long j, long j2) {
    }

    default void onAudioUnderrun(int i, long j, long j2) {
    }
}
