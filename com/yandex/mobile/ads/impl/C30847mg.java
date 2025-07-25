package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.C30847mg;
import com.yandex.mobile.ads.impl.hs0;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(23)
/* renamed from: com.yandex.mobile.ads.impl.mg */
/* loaded from: classes8.dex */
public final class C30847mg implements hs0 {

    /* renamed from: a */
    private final MediaCodec f82173a;

    /* renamed from: b */
    private final C31035og f82174b;

    /* renamed from: c */
    private final C30941ng f82175c;

    /* renamed from: d */
    private final boolean f82176d;

    /* renamed from: e */
    private boolean f82177e;

    /* renamed from: f */
    private int f82178f;

    /* renamed from: com.yandex.mobile.ads.impl.mg$a */
    /* loaded from: classes8.dex */
    public static final class C30848a implements hs0.InterfaceC30497b {

        /* renamed from: a */
        private final uy1<HandlerThread> f82179a;

        /* renamed from: b */
        private final uy1<HandlerThread> f82180b;

        public C30848a(final int i) {
            this(new uy1() { // from class: com.yandex.mobile.ads.impl.os2
                @Override // com.yandex.mobile.ads.impl.uy1
                public final Object get() {
                    HandlerThread m32018a;
                    m32018a = C30847mg.C30848a.m32018a(i);
                    return m32018a;
                }
            }, new uy1() { // from class: com.yandex.mobile.ads.impl.ps2
                @Override // com.yandex.mobile.ads.impl.uy1
                public final Object get() {
                    HandlerThread m32017b;
                    m32017b = C30847mg.C30848a.m32017b(i);
                    return m32017b;
                }
            });
        }

        @Override // com.yandex.mobile.ads.impl.hs0.InterfaceC30497b
        /* renamed from: b */
        public final C30847mg mo26515a(hs0.C30496a c30496a) throws IOException {
            MediaCodec mediaCodec;
            String str = c30496a.f80170a.f81919a;
            C30847mg c30847mg = null;
            try {
                r02.m30173a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C30847mg c30847mg2 = new C30847mg(mediaCodec, this.f82179a.get(), this.f82180b.get(), false);
                    try {
                        r02.m30174a();
                        c30847mg2.m32023a(c30496a.f80171b, c30496a.f80173d, c30496a.f80174e);
                        return c30847mg2;
                    } catch (Exception e) {
                        e = e;
                        c30847mg = c30847mg2;
                        if (c30847mg != null) {
                            c30847mg.release();
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

        @VisibleForTesting
        C30848a(uy1 uy1Var, uy1 uy1Var2) {
            this.f82179a = uy1Var;
            this.f82180b = uy1Var2;
        }

        /* renamed from: a */
        public static HandlerThread m32018a(int i) {
            StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
            if (i == 1) {
                sb2.append("Audio");
            } else if (i == 2) {
                sb2.append(Constants.VIDEO);
            } else {
                sb2.append("Unknown(");
                sb2.append(i);
                sb2.append(")");
            }
            return new HandlerThread(sb2.toString());
        }

        /* renamed from: b */
        public static HandlerThread m32017b(int i) {
            StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
            if (i == 1) {
                sb2.append("Audio");
            } else if (i == 2) {
                sb2.append(Constants.VIDEO);
            } else {
                sb2.append("Unknown(");
                sb2.append(i);
                sb2.append(")");
            }
            return new HandlerThread(sb2.toString());
        }
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    @Nullable
    /* renamed from: c */
    public final ByteBuffer mo26516c(int i) {
        return this.f82173a.getOutputBuffer(i);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    public final void flush() {
        this.f82175c.m31527a();
        this.f82173a.flush();
        this.f82174b.m31030b();
        this.f82173a.start();
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    public final void release() {
        try {
            if (this.f82178f == 1) {
                this.f82175c.m31520c();
                this.f82174b.m31027e();
            }
            this.f82178f = 2;
        } finally {
            if (!this.f82177e) {
                this.f82173a.release();
                this.f82177e = true;
            }
        }
    }

    private C30847mg(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f82173a = mediaCodec;
        this.f82174b = new C31035og(handlerThread);
        this.f82175c = new C30941ng(mediaCodec, handlerThread2);
        this.f82176d = z;
        this.f82178f = 0;
    }

    /* renamed from: c */
    private void m32019c() {
        if (this.f82176d) {
            try {
                this.f82175c.m31518e();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final int mo26525a(MediaCodec.BufferInfo bufferInfo) {
        return this.f82174b.m31034a(bufferInfo);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: b */
    public final int mo26518b() {
        return this.f82174b.m31035a();
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final MediaFormat mo26530a() {
        return this.f82174b.m31029c();
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    @Nullable
    /* renamed from: b */
    public final ByteBuffer mo26517b(int i) {
        return this.f82173a.getInputBuffer(i);
    }

    /* renamed from: a */
    public void m32023a(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        this.f82174b.m31033a(this.f82173a);
        r02.m30173a("configureCodec");
        this.f82173a.configure(mediaFormat, surface, mediaCrypto, 0);
        r02.m30174a();
        this.f82175c.m31519d();
        r02.m30173a("startCodec");
        this.f82173a.start();
        r02.m30174a();
        this.f82178f = 1;
    }

    /* renamed from: a */
    public /* synthetic */ void m32022a(hs0.InterfaceC30498c interfaceC30498c, MediaCodec mediaCodec, long j, long j2) {
        interfaceC30498c.mo27798a(j);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26528a(int i, int i2, long j, int i3) {
        this.f82175c.m31526a(i, i2, j, i3);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26526a(int i, C31767wt c31767wt, long j) {
        this.f82175c.m31525a(i, c31767wt, j);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26527a(int i, long j) {
        this.f82173a.releaseOutputBuffer(i, j);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26519a(boolean z, int i) {
        this.f82173a.releaseOutputBuffer(i, z);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26521a(final hs0.InterfaceC30498c interfaceC30498c, Handler handler) {
        m32019c();
        this.f82173a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.yandex.mobile.ads.impl.ns2
            {
                C30847mg.this = this;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C30847mg.this.m32022a(interfaceC30498c, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26523a(Surface surface) {
        m32019c();
        this.f82173a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26524a(Bundle bundle) {
        m32019c();
        this.f82173a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.hs0
    /* renamed from: a */
    public final void mo26529a(int i) {
        m32019c();
        this.f82173a.setVideoScalingMode(i);
    }
}
