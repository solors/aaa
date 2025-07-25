package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import java.util.ArrayDeque;

@RequiresApi(23)
/* renamed from: io.bidmachine.media3.exoplayer.mediacodec.f */
/* loaded from: classes9.dex */
public final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {
    private final HandlerThread callbackThread;
    @Nullable
    @GuardedBy("lock")
    private MediaFormat currentFormat;
    private Handler handler;
    @Nullable
    @GuardedBy("lock")
    private IllegalStateException internalException;
    @Nullable
    @GuardedBy("lock")
    private MediaCodec.CodecException mediaCodecException;
    @GuardedBy("lock")
    private long pendingFlushCount;
    @Nullable
    @GuardedBy("lock")
    private MediaFormat pendingOutputFormat;
    @GuardedBy("lock")
    private boolean shutDown;
    private final Object lock = new Object();
    @GuardedBy("lock")
    private final IntArrayQueue availableInputBuffers = new IntArrayQueue();
    @GuardedBy("lock")
    private final IntArrayQueue availableOutputBuffers = new IntArrayQueue();
    @GuardedBy("lock")
    private final ArrayDeque<MediaCodec.BufferInfo> bufferInfos = new ArrayDeque<>();
    @GuardedBy("lock")
    private final ArrayDeque<MediaFormat> formats = new ArrayDeque<>();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.callbackThread = handlerThread;
    }

    @GuardedBy("lock")
    private void addOutputFormat(MediaFormat mediaFormat) {
        this.availableOutputBuffers.add(-2);
        this.formats.add(mediaFormat);
    }

    @GuardedBy("lock")
    private void flushInternal() {
        if (!this.formats.isEmpty()) {
            this.pendingOutputFormat = this.formats.getLast();
        }
        this.availableInputBuffers.clear();
        this.availableOutputBuffers.clear();
        this.bufferInfos.clear();
        this.formats.clear();
    }

    @GuardedBy("lock")
    private boolean isFlushingOrShutdown() {
        if (this.pendingFlushCount <= 0 && !this.shutDown) {
            return false;
        }
        return true;
    }

    @GuardedBy("lock")
    private void maybeThrowException() {
        maybeThrowInternalException();
        maybeThrowMediaCodecException();
    }

    @GuardedBy("lock")
    private void maybeThrowInternalException() {
        IllegalStateException illegalStateException = this.internalException;
        if (illegalStateException == null) {
            return;
        }
        this.internalException = null;
        throw illegalStateException;
    }

    @GuardedBy("lock")
    private void maybeThrowMediaCodecException() {
        MediaCodec.CodecException codecException = this.mediaCodecException;
        if (codecException == null) {
            return;
        }
        this.mediaCodecException = null;
        throw codecException;
    }

    public void onFlushCompleted() {
        synchronized (this.lock) {
            if (this.shutDown) {
                return;
            }
            long j = this.pendingFlushCount - 1;
            this.pendingFlushCount = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                setInternalException(new IllegalStateException());
            } else {
                flushInternal();
            }
        }
    }

    private void setInternalException(IllegalStateException illegalStateException) {
        synchronized (this.lock) {
            this.internalException = illegalStateException;
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.lock) {
            int i = -1;
            if (isFlushingOrShutdown()) {
                return -1;
            }
            maybeThrowException();
            if (!this.availableInputBuffers.isEmpty()) {
                i = this.availableInputBuffers.remove();
            }
            return i;
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            if (isFlushingOrShutdown()) {
                return -1;
            }
            maybeThrowException();
            if (this.availableOutputBuffers.isEmpty()) {
                return -1;
            }
            int remove = this.availableOutputBuffers.remove();
            if (remove >= 0) {
                Assertions.checkStateNotNull(this.currentFormat);
                MediaCodec.BufferInfo remove2 = this.bufferInfos.remove();
                bufferInfo.set(remove2.offset, remove2.size, remove2.presentationTimeUs, remove2.flags);
            } else if (remove == -2) {
                this.currentFormat = this.formats.remove();
            }
            return remove;
        }
    }

    public void flush() {
        synchronized (this.lock) {
            this.pendingFlushCount++;
            ((Handler) Util.castNonNull(this.handler)).post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.mediacodec.e
                {
                    AsynchronousMediaCodecCallback.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AsynchronousMediaCodecCallback.this.onFlushCompleted();
                }
            });
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.lock) {
            mediaFormat = this.currentFormat;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void initialize(MediaCodec mediaCodec) {
        boolean z;
        if (this.handler == null) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        this.callbackThread.start();
        Handler handler = new Handler(this.callbackThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.handler = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.lock) {
            this.mediaCodecException = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.lock) {
            this.availableInputBuffers.add(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            MediaFormat mediaFormat = this.pendingOutputFormat;
            if (mediaFormat != null) {
                addOutputFormat(mediaFormat);
                this.pendingOutputFormat = null;
            }
            this.availableOutputBuffers.add(i);
            this.bufferInfos.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.lock) {
            addOutputFormat(mediaFormat);
            this.pendingOutputFormat = null;
        }
    }

    public void shutdown() {
        synchronized (this.lock) {
            this.shutDown = true;
            this.callbackThread.quit();
            flushInternal();
        }
    }
}
