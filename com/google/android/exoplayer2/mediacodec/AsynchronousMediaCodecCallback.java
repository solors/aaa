package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;

@RequiresApi(23)
/* loaded from: classes4.dex */
public final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f33786b;

    /* renamed from: c */
    private Handler f33787c;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: h */
    private MediaFormat f33792h;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: i */
    private MediaFormat f33793i;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: j */
    private MediaCodec.CodecException f33794j;
    @GuardedBy("lock")

    /* renamed from: k */
    private long f33795k;
    @GuardedBy("lock")

    /* renamed from: l */
    private boolean f33796l;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: m */
    private IllegalStateException f33797m;

    /* renamed from: a */
    private final Object f33785a = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private final IntArrayQueue f33788d = new IntArrayQueue();
    @GuardedBy("lock")

    /* renamed from: e */
    private final IntArrayQueue f33789e = new IntArrayQueue();
    @GuardedBy("lock")

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f33790f = new ArrayDeque<>();
    @GuardedBy("lock")

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f33791g = new ArrayDeque<>();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.f33786b = handlerThread;
    }

    @GuardedBy("lock")
    /* renamed from: b */
    private void m74235b(MediaFormat mediaFormat) {
        this.f33789e.add(-2);
        this.f33791g.add(mediaFormat);
    }

    @GuardedBy("lock")
    /* renamed from: c */
    private void m74234c() {
        if (!this.f33791g.isEmpty()) {
            this.f33793i = this.f33791g.getLast();
        }
        this.f33788d.clear();
        this.f33789e.clear();
        this.f33790f.clear();
        this.f33791g.clear();
    }

    @GuardedBy("lock")
    /* renamed from: d */
    private boolean m74233d() {
        if (this.f33795k <= 0 && !this.f33796l) {
            return false;
        }
        return true;
    }

    @GuardedBy("lock")
    /* renamed from: e */
    private void m74232e() {
        m74231f();
        m74230g();
    }

    @GuardedBy("lock")
    /* renamed from: f */
    private void m74231f() {
        IllegalStateException illegalStateException = this.f33797m;
        if (illegalStateException == null) {
            return;
        }
        this.f33797m = null;
        throw illegalStateException;
    }

    @GuardedBy("lock")
    /* renamed from: g */
    private void m74230g() {
        MediaCodec.CodecException codecException = this.f33794j;
        if (codecException == null) {
            return;
        }
        this.f33794j = null;
        throw codecException;
    }

    /* renamed from: h */
    public void m74229h() {
        synchronized (this.f33785a) {
            if (this.f33796l) {
                return;
            }
            long j = this.f33795k - 1;
            this.f33795k = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                m74228i(new IllegalStateException());
            } else {
                m74234c();
            }
        }
    }

    /* renamed from: i */
    private void m74228i(IllegalStateException illegalStateException) {
        synchronized (this.f33785a) {
            this.f33797m = illegalStateException;
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.f33785a) {
            int i = -1;
            if (m74233d()) {
                return -1;
            }
            m74232e();
            if (!this.f33788d.isEmpty()) {
                i = this.f33788d.remove();
            }
            return i;
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f33785a) {
            if (m74233d()) {
                return -1;
            }
            m74232e();
            if (this.f33789e.isEmpty()) {
                return -1;
            }
            int remove = this.f33789e.remove();
            if (remove >= 0) {
                Assertions.checkStateNotNull(this.f33792h);
                MediaCodec.BufferInfo remove2 = this.f33790f.remove();
                bufferInfo.set(remove2.offset, remove2.size, remove2.presentationTimeUs, remove2.flags);
            } else if (remove == -2) {
                this.f33792h = this.f33791g.remove();
            }
            return remove;
        }
    }

    public void flush() {
        synchronized (this.f33785a) {
            this.f33795k++;
            ((Handler) Util.castNonNull(this.f33787c)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.d
                {
                    AsynchronousMediaCodecCallback.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AsynchronousMediaCodecCallback.this.m74229h();
                }
            });
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.f33785a) {
            mediaFormat = this.f33792h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void initialize(MediaCodec mediaCodec) {
        boolean z;
        if (this.f33787c == null) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        this.f33786b.start();
        Handler handler = new Handler(this.f33786b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f33787c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f33785a) {
            this.f33794j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f33785a) {
            this.f33788d.add(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f33785a) {
            MediaFormat mediaFormat = this.f33793i;
            if (mediaFormat != null) {
                m74235b(mediaFormat);
                this.f33793i = null;
            }
            this.f33789e.add(i);
            this.f33790f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f33785a) {
            m74235b(mediaFormat);
            this.f33793i = null;
        }
    }

    public void shutdown() {
        synchronized (this.f33785a) {
            this.f33796l = true;
            this.f33786b.quit();
            m74234c();
        }
    }
}
