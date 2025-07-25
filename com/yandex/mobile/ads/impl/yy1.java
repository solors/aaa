package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.hs0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class yy1 implements hs0 {

    /* renamed from: a */
    private final MediaCodec f88625a;
    @Nullable

    /* renamed from: b */
    private ByteBuffer[] f88626b;
    @Nullable

    /* renamed from: c */
    private ByteBuffer[] f88627c;

    /* renamed from: com.yandex.mobile.ads.impl.yy1$a */
    /* loaded from: classes8.dex */
    public static class C31939a implements hs0.InterfaceC30497b {
        /* renamed from: b */
        protected static MediaCodec m26514b(hs0.C30496a c30496a) throws IOException {
            c30496a.f80170a.getClass();
            String str = c30496a.f80170a.f81919a;
            r02.m30173a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            r02.m30174a();
            return createByCodecName;
        }

        @Override // com.yandex.mobile.ads.impl.hs0.InterfaceC30497b
        /* renamed from: a */
        public final hs0 mo26515a(hs0.C30496a c30496a) throws IOException {
            MediaCodec m26514b;
            MediaCodec mediaCodec = null;
            try {
                m26514b = m26514b(c30496a);
            } catch (IOException e) {
                e = e;
            } catch (RuntimeException e2) {
                e = e2;
            }
            try {
                r02.m30173a("configureCodec");
                m26514b.configure(c30496a.f80171b, c30496a.f80173d, c30496a.f80174e, 0);
                r02.m30174a();
                r02.m30173a("startCodec");
                m26514b.start();
                r02.m30174a();
                return new yy1(m26514b);
            } catch (IOException | RuntimeException e3) {
                e = e3;
                mediaCodec = m26514b;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: b */
    public final int mo26518b() {
        return this.f88625a.dequeueInputBuffer(0L);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    @Nullable
    /* renamed from: c */
    public final ByteBuffer mo26516c(int i) {
        if (y32.f88010a >= 21) {
            return this.f88625a.getOutputBuffer(i);
        }
        return this.f88627c[i];
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    public final void flush() {
        this.f88625a.flush();
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    public final void release() {
        this.f88626b = null;
        this.f88627c = null;
        this.f88625a.release();
    }

    private yy1(MediaCodec mediaCodec) {
        this.f88625a = mediaCodec;
        if (y32.f88010a < 21) {
            this.f88626b = mediaCodec.getInputBuffers();
            this.f88627c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final int mo26525a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f88625a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && y32.f88010a < 21) {
                this.f88627c = this.f88625a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    @Nullable
    /* renamed from: b */
    public final ByteBuffer mo26517b(int i) {
        if (y32.f88010a >= 21) {
            return this.f88625a.getInputBuffer(i);
        }
        return this.f88626b[i];
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final MediaFormat mo26530a() {
        return this.f88625a.getOutputFormat();
    }

    /* renamed from: a */
    public /* synthetic */ void m26522a(hs0.InterfaceC30498c interfaceC30498c, MediaCodec mediaCodec, long j, long j2) {
        interfaceC30498c.mo27798a(j);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26528a(int i, int i2, long j, int i3) {
        this.f88625a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26526a(int i, C31767wt c31767wt, long j) {
        this.f88625a.queueSecureInputBuffer(i, 0, c31767wt.m27796a(), j, 0);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    @RequiresApi(21)
    /* renamed from: a */
    public final void mo26527a(int i, long j) {
        this.f88625a.releaseOutputBuffer(i, j);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26519a(boolean z, int i) {
        this.f88625a.releaseOutputBuffer(i, z);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    @RequiresApi(23)
    /* renamed from: a */
    public final void mo26521a(final hs0.InterfaceC30498c interfaceC30498c, Handler handler) {
        this.f88625a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.yandex.mobile.ads.impl.l13
            {
                yy1.this = this;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                yy1.this.m26522a(interfaceC30498c, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    @RequiresApi(23)
    /* renamed from: a */
    public final void mo26523a(Surface surface) {
        this.f88625a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    @RequiresApi(19)
    /* renamed from: a */
    public final void mo26524a(Bundle bundle) {
        this.f88625a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26529a(int i) {
        this.f88625a.setVideoScalingMode(i);
    }
}
