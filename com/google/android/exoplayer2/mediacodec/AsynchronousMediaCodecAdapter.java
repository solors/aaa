package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.common.base.Supplier;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(23)
/* loaded from: classes4.dex */
public final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* renamed from: a */
    private final MediaCodec f33767a;

    /* renamed from: b */
    private final AsynchronousMediaCodecCallback f33768b;

    /* renamed from: c */
    private final AsynchronousMediaCodecBufferEnqueuer f33769c;

    /* renamed from: d */
    private final boolean f33770d;

    /* renamed from: e */
    private boolean f33771e;

    /* renamed from: f */
    private int f33772f;

    /* loaded from: classes4.dex */
    public static final class Factory implements MediaCodecAdapter.Factory {

        /* renamed from: a */
        private final Supplier<HandlerThread> f33773a;

        /* renamed from: b */
        private final Supplier<HandlerThread> f33774b;

        /* renamed from: c */
        private final boolean f33775c;

        public Factory(final int i, boolean z) {
            this(new Supplier() { // from class: com.google.android.exoplayer2.mediacodec.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    HandlerThread m74249c;
                    m74249c = AsynchronousMediaCodecAdapter.Factory.m74249c(i);
                    return m74249c;
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.mediacodec.c
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    HandlerThread m74248d;
                    m74248d = AsynchronousMediaCodecAdapter.Factory.m74248d(i);
                    return m74248d;
                }
            }, z);
        }

        /* renamed from: c */
        public static /* synthetic */ HandlerThread m74249c(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.m74257e(i));
        }

        /* renamed from: d */
        public static /* synthetic */ HandlerThread m74248d(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.m74256f(i));
        }

        @VisibleForTesting
        Factory(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2, boolean z) {
            this.f33773a = supplier;
            this.f33774b = supplier2;
            this.f33775c = z;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public AsynchronousMediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws IOException {
            MediaCodec mediaCodec;
            String str = configuration.codecInfo.name;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                TraceUtil.beginSection("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodec, this.f33773a.get(), this.f33774b.get(), this.f33775c);
                    try {
                        TraceUtil.endSection();
                        asynchronousMediaCodecAdapter2.m74254h(configuration.mediaFormat, configuration.surface, configuration.crypto, configuration.flags);
                        return asynchronousMediaCodecAdapter2;
                    } catch (Exception e) {
                        e = e;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
        }
    }

    /* renamed from: e */
    public static String m74257e(int i) {
        return m74255g(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: f */
    public static String m74256f(int i) {
        return m74255g(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: g */
    private static String m74255g(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append(Constants.VIDEO);
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public void m74254h(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        this.f33768b.initialize(this.f33767a);
        TraceUtil.beginSection("configureCodec");
        this.f33767a.configure(mediaFormat, surface, mediaCrypto, i);
        TraceUtil.endSection();
        this.f33769c.start();
        TraceUtil.beginSection("startCodec");
        this.f33767a.start();
        TraceUtil.endSection();
        this.f33772f = 1;
    }

    /* renamed from: i */
    public /* synthetic */ void m74253i(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    /* renamed from: j */
    private void m74252j() {
        if (this.f33770d) {
            try {
                this.f33769c.waitUntilQueueingComplete();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        this.f33769c.maybeThrowException();
        return this.f33768b.dequeueInputBufferIndex();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.f33769c.maybeThrowException();
        return this.f33768b.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
        this.f33769c.flush();
        this.f33767a.flush();
        this.f33768b.flush();
        this.f33767a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int i) {
        return this.f33767a.getInputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle getMetrics() {
        PersistableBundle metrics;
        m74252j();
        metrics = this.f33767a.getMetrics();
        return metrics;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int i) {
        return this.f33767a.getOutputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.f33768b.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f33769c.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.f33769c.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
        try {
            if (this.f33772f == 1) {
                this.f33769c.shutdown();
                this.f33768b.shutdown();
            }
            this.f33772f = 2;
        } finally {
            if (!this.f33771e) {
                this.f33767a.release();
                this.f33771e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, boolean z) {
        this.f33767a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        m74252j();
        this.f33767a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            {
                AsynchronousMediaCodecAdapter.this = this;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                AsynchronousMediaCodecAdapter.this.m74253i(onFrameRenderedListener, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        m74252j();
        this.f33767a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        m74252j();
        this.f33767a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        m74252j();
        this.f33767a.setVideoScalingMode(i);
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f33767a = mediaCodec;
        this.f33768b = new AsynchronousMediaCodecCallback(handlerThread);
        this.f33769c = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, handlerThread2);
        this.f33770d = z;
        this.f33772f = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, long j) {
        this.f33767a.releaseOutputBuffer(i, j);
    }
}
