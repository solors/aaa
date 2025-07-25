package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;

@RequiresApi(23)
/* renamed from: com.yandex.mobile.ads.impl.og */
/* loaded from: classes8.dex */
public final class C31035og extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f83481b;

    /* renamed from: c */
    private Handler f83482c;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: h */
    private MediaFormat f83487h;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: i */
    private MediaFormat f83488i;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: j */
    private MediaCodec.CodecException f83489j;
    @GuardedBy("lock")

    /* renamed from: k */
    private long f83490k;
    @GuardedBy("lock")

    /* renamed from: l */
    private boolean f83491l;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: m */
    private IllegalStateException f83492m;

    /* renamed from: a */
    private final Object f83480a = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private final dm0 f83483d = new dm0();
    @GuardedBy("lock")

    /* renamed from: e */
    private final dm0 f83484e = new dm0();
    @GuardedBy("lock")

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f83485f = new ArrayDeque<>();
    @GuardedBy("lock")

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f83486g = new ArrayDeque<>();

    public C31035og(HandlerThread handlerThread) {
        this.f83481b = handlerThread;
    }

    /* renamed from: a */
    public static /* synthetic */ void m31032a(C31035og c31035og) {
        c31035og.m31028d();
    }

    /* renamed from: d */
    public void m31028d() {
        synchronized (this.f83480a) {
            if (this.f83491l) {
                return;
            }
            long j = this.f83490k - 1;
            this.f83490k = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i < 0) {
                m31031a(new IllegalStateException());
                return;
            }
            if (!this.f83486g.isEmpty()) {
                this.f83488i = this.f83486g.getLast();
            }
            this.f83483d.m34885a();
            this.f83484e.m34885a();
            this.f83485f.clear();
            this.f83486g.clear();
            this.f83489j = null;
        }
    }

    /* renamed from: b */
    public final void m31030b() {
        synchronized (this.f83480a) {
            this.f83490k++;
            Handler handler = this.f83482c;
            int i = y32.f88010a;
            handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.tt2
                @Override // java.lang.Runnable
                public final void run() {
                    C31035og.m31032a(C31035og.this);
                }
            });
        }
    }

    /* renamed from: c */
    public final MediaFormat m31029c() {
        MediaFormat mediaFormat;
        synchronized (this.f83480a) {
            mediaFormat = this.f83487h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: e */
    public final void m31027e() {
        synchronized (this.f83480a) {
            this.f83491l = true;
            this.f83481b.quit();
            if (!this.f83486g.isEmpty()) {
                this.f83488i = this.f83486g.getLast();
            }
            this.f83483d.m34885a();
            this.f83484e.m34885a();
            this.f83485f.clear();
            this.f83486g.clear();
            this.f83489j = null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f83480a) {
            this.f83489j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f83480a) {
            this.f83483d.m34884a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f83480a) {
            MediaFormat mediaFormat = this.f83488i;
            if (mediaFormat != null) {
                this.f83484e.m34884a(-2);
                this.f83486g.add(mediaFormat);
                this.f83488i = null;
            }
            this.f83484e.m34884a(i);
            this.f83485f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f83480a) {
            this.f83484e.m34884a(-2);
            this.f83486g.add(mediaFormat);
            this.f83488i = null;
        }
    }

    /* renamed from: a */
    public final int m31035a() {
        synchronized (this.f83480a) {
            int i = -1;
            if (this.f83490k <= 0 && !this.f83491l) {
                IllegalStateException illegalStateException = this.f83492m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = this.f83489j;
                    if (codecException == null) {
                        if (!this.f83483d.m34883b()) {
                            i = this.f83483d.m34882c();
                        }
                        return i;
                    }
                    this.f83489j = null;
                    throw codecException;
                }
                this.f83492m = null;
                throw illegalStateException;
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final int m31034a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f83480a) {
            if (this.f83490k <= 0 && !this.f83491l) {
                IllegalStateException illegalStateException = this.f83492m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = this.f83489j;
                    if (codecException == null) {
                        if (this.f83484e.m34883b()) {
                            return -1;
                        }
                        int m34882c = this.f83484e.m34882c();
                        if (m34882c >= 0) {
                            if (this.f83487h != null) {
                                MediaCodec.BufferInfo remove = this.f83485f.remove();
                                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (m34882c == -2) {
                            this.f83487h = this.f83486g.remove();
                        }
                        return m34882c;
                    }
                    this.f83489j = null;
                    throw codecException;
                }
                this.f83492m = null;
                throw illegalStateException;
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final void m31033a(MediaCodec mediaCodec) {
        if (this.f83482c == null) {
            this.f83481b.start();
            Handler handler = new Handler(this.f83481b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.f83482c = handler;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private void m31031a(IllegalStateException illegalStateException) {
        synchronized (this.f83480a) {
            this.f83492m = illegalStateException;
        }
    }
}
