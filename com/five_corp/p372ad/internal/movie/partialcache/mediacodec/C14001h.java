package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.movie.partialcache.C14045w1;
import java.nio.ByteBuffer;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.h */
/* loaded from: classes4.dex */
public final class C14001h extends MediaCodec.Callback implements InterfaceC13996c {

    /* renamed from: a */
    public final InterfaceC13995b f26100a;

    /* renamed from: b */
    public final Handler f26101b;

    /* renamed from: c */
    public final MediaCodec f26102c;

    /* renamed from: d */
    public int f26103d;

    public C14001h(MediaCodec mediaCodec, InterfaceC13995b interfaceC13995b, Looper looper) {
        System.identityHashCode(this);
        this.f26102c = mediaCodec;
        this.f26100a = interfaceC13995b;
        this.f26101b = new Handler(looper);
        this.f26103d = 1;
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    /* renamed from: a */
    public final ByteBuffer mo78185a(int i) {
        try {
            return this.f26102c.getOutputBuffer(i);
        } catch (Exception e) {
            m78186a(new C14068s(EnumC14106t.f26508Y4, null, e, null));
            return null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        EnumC14106t enumC14106t = EnumC14106t.f26487V4;
        m78186a(new C14068s(enumC14106t, "DiagnosticInfo: " + codecException.getDiagnosticInfo() + ", error code: " + codecException.getErrorCode() + ", isRecoverable: " + codecException.isRecoverable() + ", isTransient: " + codecException.isTransient(), codecException, null));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.f26101b.post(new RunnableC13998e(this, mediaCodec, i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f26101b.post(new RunnableC13999f(this, i, bufferInfo));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f26101b.post(new RunnableC14000g(this, mediaFormat));
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    public final void release() {
        if (this.f26103d == 3) {
            return;
        }
        this.f26103d = 3;
        this.f26102c.release();
        this.f26101b.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void m78186a(C14068s c14068s) {
        if (this.f26103d == 4) {
            return;
        }
        this.f26103d = 4;
        this.f26100a.mo78157a(c14068s);
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    /* renamed from: a */
    public final void mo78183a(C13994a c13994a, C14045w1 c14045w1, int i) {
        if (this.f26103d != 2) {
            return;
        }
        try {
            this.f26102c.queueInputBuffer(c13994a.f26088a, 0, i, c14045w1.f26195d, c14045w1.f26196e);
        } catch (Exception e) {
            m78186a(new C14068s(EnumC14106t.f26501X4, null, e, null));
        }
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    /* renamed from: a */
    public final void mo78181a(C14009p c14009p, boolean z) {
        if (this.f26103d != 2) {
            return;
        }
        try {
            this.f26102c.releaseOutputBuffer(c14009p.f26123a, z);
        } catch (Exception e) {
            m78186a(new C14068s(EnumC14106t.f26515Z4, null, e, null));
        }
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c
    /* renamed from: a */
    public final void mo78184a(MediaFormat mediaFormat, Surface surface) {
        if (this.f26103d != 1) {
            return;
        }
        this.f26102c.setCallback(this);
        try {
            this.f26102c.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            try {
                this.f26102c.start();
                this.f26103d = 2;
            } catch (Exception e) {
                m78186a(new C14068s(EnumC14106t.f26480U4, null, e, null));
            }
        } catch (Exception e2) {
            m78186a(new C14068s(EnumC14106t.f26473T4, null, e2, null));
        }
    }
}
