package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.movie.partialcache.C14045w1;
import java.nio.ByteBuffer;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.o */
/* loaded from: classes4.dex */
public final class C14008o implements InterfaceC13996c {

    /* renamed from: b */
    public final MediaCodec f26117b;

    /* renamed from: c */
    public final InterfaceC13995b f26118c;

    /* renamed from: d */
    public final Handler f26119d;

    /* renamed from: e */
    public HandlerThread f26120e;

    /* renamed from: f */
    public Handler f26121f;

    /* renamed from: a */
    public final String f26116a = C14008o.class.getName() + System.identityHashCode(this);

    /* renamed from: g */
    public int f26122g = 1;

    public C14008o(MediaCodec mediaCodec, InterfaceC13995b interfaceC13995b, Looper looper) {
        this.f26117b = mediaCodec;
        this.f26118c = interfaceC13995b;
        this.f26119d = new Handler(looper);
    }

    /* renamed from: a */
    public static void m78182a(C14008o c14008o) {
        c14008o.getClass();
        ByteBuffer byteBuffer = null;
        try {
            int dequeueInputBuffer = c14008o.f26117b.dequeueInputBuffer(0L);
            if (dequeueInputBuffer < 0) {
                return;
            }
            if (c14008o.f26122g == 2) {
                try {
                    byteBuffer = c14008o.f26117b.getInputBuffers()[dequeueInputBuffer];
                } catch (Exception e) {
                    c14008o.m78180a(new C14068s(EnumC14106t.f26420M4, null, e, null));
                }
            }
            if (byteBuffer == null) {
                return;
            }
            c14008o.f26119d.post(new RunnableC14005l(c14008o, dequeueInputBuffer, byteBuffer));
        } catch (Exception e2) {
            c14008o.m78180a(new C14068s(EnumC14106t.f26412L4, null, e2, null));
        }
    }

    /* renamed from: b */
    public static void m78179b(C14008o c14008o) {
        C14068s c14068s;
        c14008o.getClass();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            int dequeueOutputBuffer = c14008o.f26117b.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer >= 0) {
                c14008o.f26119d.post(new RunnableC14006m(c14008o, dequeueOutputBuffer, bufferInfo));
            } else if (dequeueOutputBuffer == -2) {
                try {
                    c14008o.f26119d.post(new RunnableC14007n(c14008o, c14008o.f26117b.getOutputFormat()));
                } catch (Exception e) {
                    c14068s = new C14068s(EnumC14106t.f26466S4, null, e, null);
                    c14008o.m78180a(c14068s);
                }
            }
        } catch (Exception e2) {
            c14068s = new C14068s(EnumC14106t.f26436O4, null, e2, null);
        }
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    public final void release() {
        if (this.f26122g == 3) {
            return;
        }
        this.f26122g = 3;
        this.f26119d.removeCallbacksAndMessages(null);
        Handler handler = this.f26121f;
        if (handler == null) {
            return;
        }
        handler.postAtFrontOfQueue(new RunnableC14003j(this));
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    /* renamed from: a */
    public final ByteBuffer mo78185a(int i) {
        if (this.f26122g != 2) {
            return null;
        }
        try {
            return this.f26117b.getOutputBuffers()[i];
        } catch (Exception e) {
            m78180a(new C14068s(EnumC14106t.f26444P4, null, e, null));
            return null;
        }
    }

    /* renamed from: a */
    public final void m78180a(C14068s c14068s) {
        if (this.f26122g == 4) {
            return;
        }
        this.f26122g = 4;
        this.f26118c.mo78157a(c14068s);
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    /* renamed from: a */
    public final void mo78183a(C13994a c13994a, C14045w1 c14045w1, int i) {
        if (this.f26122g != 2) {
            return;
        }
        try {
            this.f26117b.queueInputBuffer(c13994a.f26088a, 0, i, c14045w1.f26195d, c14045w1.f26196e);
        } catch (Exception e) {
            m78180a(new C14068s(EnumC14106t.f26428N4, null, e, null));
        }
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    /* renamed from: a */
    public final void mo78181a(C14009p c14009p, boolean z) {
        if (this.f26122g != 2) {
            return;
        }
        try {
            this.f26117b.releaseOutputBuffer(c14009p.f26123a, z);
        } catch (Exception e) {
            m78180a(new C14068s(EnumC14106t.f26452Q4, null, e, null));
        }
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    /* renamed from: a */
    public final void mo78184a(MediaFormat mediaFormat, Surface surface) {
        if (this.f26122g != 1) {
            return;
        }
        try {
            this.f26117b.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            try {
                this.f26117b.start();
                this.f26122g = 2;
                HandlerThread handlerThread = new HandlerThread(this.f26116a);
                this.f26120e = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(this.f26120e.getLooper());
                this.f26121f = handler;
                handler.postDelayed(new RunnableC14002i(this), 10L);
            } catch (Exception e) {
                m78180a(new C14068s(EnumC14106t.f26404K4, null, e, null));
            }
        } catch (Exception e2) {
            m78180a(new C14068s(EnumC14106t.f26396J4, null, e2, null));
        }
    }
}
