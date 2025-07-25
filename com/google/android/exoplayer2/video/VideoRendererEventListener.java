package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* loaded from: classes4.dex */
public interface VideoRendererEventListener {

    /* loaded from: classes4.dex */
    public static final class EventDispatcher {
        @Nullable

        /* renamed from: a */
        private final Handler f36356a;
        @Nullable

        /* renamed from: b */
        private final VideoRendererEventListener f36357b;

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener) {
            Handler handler2;
            if (videoRendererEventListener != null) {
                handler2 = (Handler) Assertions.checkNotNull(handler);
            } else {
                handler2 = null;
            }
            this.f36356a = handler2;
            this.f36357b = videoRendererEventListener;
        }

        /* renamed from: k */
        public /* synthetic */ void m72379k(String str, long j, long j2) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoDecoderInitialized(str, j, j2);
        }

        /* renamed from: l */
        public /* synthetic */ void m72378l(String str) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoDecoderReleased(str);
        }

        /* renamed from: m */
        public /* synthetic */ void m72377m(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoDisabled(decoderCounters);
        }

        /* renamed from: n */
        public /* synthetic */ void m72376n(int i, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onDroppedFrames(i, j);
        }

        /* renamed from: o */
        public /* synthetic */ void m72375o(DecoderCounters decoderCounters) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoEnabled(decoderCounters);
        }

        /* renamed from: p */
        public /* synthetic */ void m72374p(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoInputFormatChanged(format);
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        /* renamed from: q */
        public /* synthetic */ void m72373q(Object obj, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onRenderedFirstFrame(obj, j);
        }

        /* renamed from: r */
        public /* synthetic */ void m72372r(long j, int i) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoFrameProcessingOffset(j, i);
        }

        /* renamed from: s */
        public /* synthetic */ void m72371s(Exception exc) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoCodecError(exc);
        }

        /* renamed from: t */
        public /* synthetic */ void m72370t(VideoSize videoSize) {
            ((VideoRendererEventListener) Util.castNonNull(this.f36357b)).onVideoSizeChanged(videoSize);
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.l
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72379k(str, j, j2);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.e
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72378l(str);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.c
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72377m(decoderCounters);
                    }
                });
            }
        }

        public void droppedFrames(final int i, final long j) {
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.k
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72376n(i, j);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.d
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72375o(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.h
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72374p(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.f36356a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f36356a.post(new Runnable() { // from class: com.google.android.exoplayer2.video.j
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72373q(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(final long j, final int i) {
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.g
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72372r(j, i);
                    }
                });
            }
        }

        public void videoCodecError(final Exception exc) {
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.i
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72371s(exc);
                    }
                });
            }
        }

        public void videoSizeChanged(final VideoSize videoSize) {
            Handler handler = this.f36356a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.f
                    {
                        VideoRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.m72370t(videoSize);
                    }
                });
            }
        }
    }

    @Deprecated
    default void onVideoInputFormatChanged(Format format) {
    }

    default void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }

    default void onDroppedFrames(int i, long j) {
    }

    default void onRenderedFirstFrame(Object obj, long j) {
    }

    default void onVideoFrameProcessingOffset(long j, int i) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j2) {
    }
}
