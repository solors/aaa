package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: com.applovin.impl.i1 */
/* loaded from: classes2.dex */
public final class C4555i1 extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f6738b;

    /* renamed from: c */
    private Handler f6739c;

    /* renamed from: h */
    private MediaFormat f6744h;

    /* renamed from: i */
    private MediaFormat f6745i;

    /* renamed from: j */
    private MediaCodec.CodecException f6746j;

    /* renamed from: k */
    private long f6747k;

    /* renamed from: l */
    private boolean f6748l;

    /* renamed from: m */
    private IllegalStateException f6749m;

    /* renamed from: a */
    private final Object f6737a = new Object();

    /* renamed from: d */
    private final C4997nb f6740d = new C4997nb();

    /* renamed from: e */
    private final C4997nb f6741e = new C4997nb();

    /* renamed from: f */
    private final ArrayDeque f6742f = new ArrayDeque();

    /* renamed from: g */
    private final ArrayDeque f6743g = new ArrayDeque();

    public C4555i1(HandlerThread handlerThread) {
        this.f6738b = handlerThread;
    }

    /* renamed from: a */
    public static /* synthetic */ void m98606a(C4555i1 c4555i1, Runnable runnable) {
        c4555i1.m98602b(runnable);
    }

    /* renamed from: b */
    private void m98603b() {
        if (!this.f6743g.isEmpty()) {
            this.f6745i = (MediaFormat) this.f6743g.getLast();
        }
        this.f6740d.m97025a();
        this.f6741e.m97025a();
        this.f6742f.clear();
        this.f6743g.clear();
        this.f6746j = null;
    }

    /* renamed from: d */
    private boolean m98599d() {
        return this.f6747k > 0 || this.f6748l;
    }

    /* renamed from: e */
    private void m98597e() {
        m98596f();
        m98595g();
    }

    /* renamed from: f */
    private void m98596f() {
        IllegalStateException illegalStateException = this.f6749m;
        if (illegalStateException == null) {
            return;
        }
        this.f6749m = null;
        throw illegalStateException;
    }

    /* renamed from: g */
    private void m98595g() {
        MediaCodec.CodecException codecException = this.f6746j;
        if (codecException == null) {
            return;
        }
        this.f6746j = null;
        throw codecException;
    }

    /* renamed from: c */
    public MediaFormat m98601c() {
        MediaFormat mediaFormat;
        synchronized (this.f6737a) {
            mediaFormat = this.f6744h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void m98594h() {
        synchronized (this.f6737a) {
            this.f6748l = true;
            this.f6738b.quit();
            m98603b();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6737a) {
            this.f6746j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f6737a) {
            this.f6740d.m97024a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6737a) {
            MediaFormat mediaFormat = this.f6745i;
            if (mediaFormat != null) {
                m98607a(mediaFormat);
                this.f6745i = null;
            }
            this.f6741e.m97024a(i);
            this.f6742f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6737a) {
            m98607a(mediaFormat);
            this.f6745i = null;
        }
    }

    /* renamed from: a */
    private void m98607a(MediaFormat mediaFormat) {
        this.f6741e.m97024a(-2);
        this.f6743g.add(mediaFormat);
    }

    /* renamed from: d */
    private void m98598d(Runnable runnable) {
        if (this.f6748l) {
            return;
        }
        long j = this.f6747k - 1;
        this.f6747k = j;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            return;
        }
        if (i < 0) {
            m98605a(new IllegalStateException());
            return;
        }
        m98603b();
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            m98605a(e);
        } catch (Exception e2) {
            m98605a(new IllegalStateException(e2));
        }
    }

    /* renamed from: a */
    public int m98610a() {
        synchronized (this.f6737a) {
            int i = -1;
            if (m98599d()) {
                return -1;
            }
            m98597e();
            if (!this.f6740d.m97022c()) {
                i = this.f6740d.m97021d();
            }
            return i;
        }
    }

    /* renamed from: c */
    public void m98602b(Runnable runnable) {
        synchronized (this.f6737a) {
            m98598d(runnable);
        }
    }

    /* renamed from: a */
    public int m98609a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6737a) {
            if (m98599d()) {
                return -1;
            }
            m98597e();
            if (this.f6741e.m97022c()) {
                return -1;
            }
            int m97021d = this.f6741e.m97021d();
            if (m97021d >= 0) {
                AbstractC4100b1.m100578b(this.f6744h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f6742f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (m97021d == -2) {
                this.f6744h = (MediaFormat) this.f6743g.remove();
            }
            return m97021d;
        }
    }

    /* renamed from: a */
    public void m98604a(final Runnable runnable) {
        synchronized (this.f6737a) {
            this.f6747k++;
            ((Handler) AbstractC5863xp.m93017a(this.f6739c)).post(new Runnable() { // from class: com.applovin.impl.wx
                @Override // java.lang.Runnable
                public final void run() {
                    C4555i1.m98606a(C4555i1.this, runnable);
                }
            });
        }
    }

    /* renamed from: a */
    public void m98608a(MediaCodec mediaCodec) {
        AbstractC4100b1.m100577b(this.f6739c == null);
        this.f6738b.start();
        Handler handler = new Handler(this.f6738b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f6739c = handler;
    }

    /* renamed from: a */
    private void m98605a(IllegalStateException illegalStateException) {
        synchronized (this.f6737a) {
            this.f6749m = illegalStateException;
        }
    }
}
