package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.C4433g1;
import com.applovin.impl.InterfaceC4461gd;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: com.applovin.impl.g1 */
/* loaded from: classes2.dex */
public final class C4433g1 implements InterfaceC4461gd {

    /* renamed from: a */
    private final MediaCodec f6267a;

    /* renamed from: b */
    private final C4555i1 f6268b;

    /* renamed from: c */
    private final C4499h1 f6269c;

    /* renamed from: d */
    private final boolean f6270d;

    /* renamed from: e */
    private boolean f6271e;

    /* renamed from: f */
    private int f6272f;

    /* renamed from: g */
    private Surface f6273g;

    /* renamed from: com.applovin.impl.g1$b */
    /* loaded from: classes2.dex */
    public static final class C4435b implements InterfaceC4461gd.InterfaceC4463b {

        /* renamed from: b */
        private final Supplier f6274b;

        /* renamed from: c */
        private final Supplier f6275c;

        /* renamed from: d */
        private final boolean f6276d;

        /* renamed from: e */
        private final boolean f6277e;

        public C4435b(final int i, boolean z, boolean z2) {
            this(new Supplier() { // from class: com.applovin.impl.hx
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    HandlerThread m99038a;
                    m99038a = C4433g1.C4435b.m99038a(i);
                    return m99038a;
                }
            }, new Supplier() { // from class: com.applovin.impl.ix
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    HandlerThread m99037b;
                    m99037b = C4433g1.C4435b.m99037b(i);
                    return m99037b;
                }
            }, z, z2);
        }

        @Override // com.applovin.impl.InterfaceC4461gd.InterfaceC4463b
        /* renamed from: b */
        public C4433g1 mo94050a(InterfaceC4461gd.C4462a c4462a) {
            MediaCodec mediaCodec;
            String str = c4462a.f6395a.f7138a;
            C4433g1 c4433g1 = null;
            try {
                AbstractC4727ko.m97907a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C4433g1 c4433g12 = new C4433g1(mediaCodec, (HandlerThread) this.f6274b.get(), (HandlerThread) this.f6275c.get(), this.f6276d, this.f6277e);
                    try {
                        AbstractC4727ko.m97908a();
                        c4433g12.m99047a(c4462a.f6396b, c4462a.f6398d, c4462a.f6399e, c4462a.f6400f, c4462a.f6401g);
                        return c4433g12;
                    } catch (Exception e) {
                        e = e;
                        c4433g1 = c4433g12;
                        if (c4433g1 != null) {
                            c4433g1.mo94069a();
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

        C4435b(Supplier supplier, Supplier supplier2, boolean z, boolean z2) {
            this.f6274b = supplier;
            this.f6275c = supplier2;
            this.f6276d = z;
            this.f6277e = z2;
        }

        /* renamed from: a */
        public static /* synthetic */ HandlerThread m99038a(int i) {
            return new HandlerThread(C4433g1.m99040f(i));
        }

        /* renamed from: b */
        public static /* synthetic */ HandlerThread m99037b(int i) {
            return new HandlerThread(C4433g1.m99039g(i));
        }
    }

    private C4433g1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f6267a = mediaCodec;
        this.f6268b = new C4555i1(handlerThread);
        this.f6269c = new C4499h1(mediaCodec, handlerThread2, z);
        this.f6270d = z2;
        this.f6272f = 0;
    }

    /* renamed from: f */
    public static String m99040f(int i) {
        return m99048a(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: g */
    public static String m99039g(int i) {
        return m99048a(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: b */
    public void mo94057b() {
        this.f6269c.m98824b();
        this.f6267a.flush();
        C4555i1 c4555i1 = this.f6268b;
        final MediaCodec mediaCodec = this.f6267a;
        Objects.requireNonNull(mediaCodec);
        c4555i1.m98604a(new Runnable() { // from class: com.applovin.impl.gx
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: c */
    public boolean mo94055c() {
        return false;
    }

    /* renamed from: f */
    private void m99041f() {
        if (this.f6270d) {
            try {
                this.f6269c.m98816i();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: c */
    public void mo94054c(int i) {
        m99041f();
        this.f6267a.setVideoScalingMode(i);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: d */
    public int mo94053d() {
        return this.f6268b.m98610a();
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: e */
    public MediaFormat mo94052e() {
        return this.f6268b.m98601c();
    }

    /* renamed from: a */
    private static String m99048a(int i, String str) {
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

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: b */
    public ByteBuffer mo94056b(int i) {
        return this.f6267a.getOutputBuffer(i);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public int mo94063a(MediaCodec.BufferInfo bufferInfo) {
        return this.f6268b.m98609a(bufferInfo);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public ByteBuffer mo94068a(int i) {
        return this.f6267a.getInputBuffer(i);
    }

    /* renamed from: a */
    public void m99047a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.f6268b.m98608a(this.f6267a);
        AbstractC4727ko.m97907a("configureCodec");
        this.f6267a.configure(mediaFormat, surface, mediaCrypto, i);
        AbstractC4727ko.m97908a();
        if (z) {
            this.f6273g = this.f6267a.createInputSurface();
        }
        this.f6269c.m98817h();
        AbstractC4727ko.m97907a("startCodec");
        this.f6267a.start();
        AbstractC4727ko.m97908a();
        this.f6272f = 1;
    }

    /* renamed from: a */
    public /* synthetic */ void m99044a(InterfaceC4461gd.InterfaceC4464c interfaceC4464c, MediaCodec mediaCodec, long j, long j2) {
        interfaceC4464c.mo96735a(this, j, j2);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94067a(int i, int i2, int i3, long j, int i4) {
        this.f6269c.m98823b(i, i2, i3, j, i4);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94066a(int i, int i2, C5950z4 c5950z4, long j, int i3) {
        this.f6269c.m98832a(i, i2, c5950z4, j, i3);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94069a() {
        try {
            if (this.f6272f == 1) {
                this.f6269c.m98818g();
                this.f6268b.m98594h();
            }
            this.f6272f = 2;
        } finally {
            Surface surface = this.f6273g;
            if (surface != null) {
                surface.release();
            }
            if (!this.f6271e) {
                this.f6267a.release();
                this.f6271e = true;
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94065a(int i, long j) {
        this.f6267a.releaseOutputBuffer(i, j);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94064a(int i, boolean z) {
        this.f6267a.releaseOutputBuffer(i, z);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94059a(final InterfaceC4461gd.InterfaceC4464c interfaceC4464c, Handler handler) {
        m99041f();
        this.f6267a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.impl.fx
            {
                C4433g1.this = this;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C4433g1.this.m99044a(interfaceC4464c, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94061a(Surface surface) {
        m99041f();
        this.f6267a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94062a(Bundle bundle) {
        m99041f();
        this.f6267a.setParameters(bundle);
    }
}
