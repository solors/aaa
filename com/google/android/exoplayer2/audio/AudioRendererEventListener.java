package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public interface AudioRendererEventListener {

    /* loaded from: classes4.dex */
    public static final class EventDispatcher {
        @Nullable

        /* renamed from: a */
        private final Handler f32367a;
        @Nullable

        /* renamed from: b */
        private final AudioRendererEventListener f32368b;

        public EventDispatcher(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
            Handler handler2;
            if (audioRendererEventListener != null) {
                handler2 = (Handler) Assertions.checkNotNull(handler);
            } else {
                handler2 = null;
            }
            this.f32367a = handler2;
            this.f32368b = audioRendererEventListener;
        }

        /* renamed from: k */
        public /* synthetic */ void m75067k(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioCodecError(exc);
        }

        /* renamed from: l */
        public /* synthetic */ void m75066l(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioSinkError(exc);
        }

        /* renamed from: m */
        public /* synthetic */ void m75065m(String str, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioDecoderInitialized(str, j, j2);
        }

        /* renamed from: n */
        public /* synthetic */ void m75064n(String str) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioDecoderReleased(str);
        }

        /* renamed from: o */
        public /* synthetic */ void m75063o(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioDisabled(decoderCounters);
        }

        /* renamed from: p */
        public /* synthetic */ void m75062p(DecoderCounters decoderCounters) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioEnabled(decoderCounters);
        }

        /* renamed from: q */
        public /* synthetic */ void m75061q(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioInputFormatChanged(format);
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        /* renamed from: r */
        public /* synthetic */ void m75060r(long j) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioPositionAdvancing(j);
        }

        /* renamed from: s */
        public /* synthetic */ void m75059s(boolean z) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onSkipSilenceEnabledChanged(z);
        }

        /* renamed from: t */
        public /* synthetic */ void m75058t(int i, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.f32368b)).onAudioUnderrun(i, j, j2);
        }

        public void audioCodecError(final Exception exc) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.j
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75067k(exc);
                    }
                });
            }
        }

        public void audioSinkError(final Exception exc) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.i
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75066l(exc);
                    }
                });
            }
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.k
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75065m(str, j, j2);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.b
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75064n(str);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.f
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75063o(decoderCounters);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.g
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75062p(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.c
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75061q(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void positionAdvancing(final long j) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.e
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75060r(j);
                    }
                });
            }
        }

        public void skipSilenceEnabledChanged(final boolean z) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.d
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75059s(z);
                    }
                });
            }
        }

        public void underrun(final int i, final long j, final long j2) {
            Handler handler = this.f32367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.h
                    {
                        AudioRendererEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.m75058t(i, j, j2);
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
