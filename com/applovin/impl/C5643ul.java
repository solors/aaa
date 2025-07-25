package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.InterfaceC4461gd;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.ul */
/* loaded from: classes2.dex */
public class C5643ul implements InterfaceC4461gd {

    /* renamed from: a */
    private final MediaCodec f11329a;

    /* renamed from: b */
    private final Surface f11330b;

    /* renamed from: c */
    private ByteBuffer[] f11331c;

    /* renamed from: d */
    private ByteBuffer[] f11332d;

    /* renamed from: com.applovin.impl.ul$b */
    /* loaded from: classes2.dex */
    private static final class C5645b {
        /* renamed from: a */
        public static Surface m94051a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    /* renamed from: com.applovin.impl.ul$c */
    /* loaded from: classes2.dex */
    public static class C5646c implements InterfaceC4461gd.InterfaceC4463b {
        @Override // com.applovin.impl.InterfaceC4461gd.InterfaceC4463b
        /* renamed from: a */
        public InterfaceC4461gd mo94050a(InterfaceC4461gd.C4462a c4462a) {
            MediaCodec mediaCodec;
            Surface surface;
            Surface surface2 = null;
            try {
                mediaCodec = m94049b(c4462a);
                try {
                    AbstractC4727ko.m97907a("configureCodec");
                    mediaCodec.configure(c4462a.f6396b, c4462a.f6398d, c4462a.f6399e, c4462a.f6400f);
                    AbstractC4727ko.m97908a();
                    if (c4462a.f6401g) {
                        if (AbstractC5863xp.f12151a >= 18) {
                            surface = C5645b.m94051a(mediaCodec);
                        } else {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                    } else {
                        surface = null;
                    }
                } catch (IOException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = e2;
                }
            } catch (IOException | RuntimeException e3) {
                e = e3;
                mediaCodec = null;
            }
            try {
                AbstractC4727ko.m97907a("startCodec");
                mediaCodec.start();
                AbstractC4727ko.m97908a();
                return new C5643ul(mediaCodec, surface);
            } catch (IOException | RuntimeException e4) {
                surface2 = surface;
                e = e4;
                if (surface2 != null) {
                    surface2.release();
                }
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        /* renamed from: b */
        protected MediaCodec m94049b(InterfaceC4461gd.C4462a c4462a) {
            AbstractC4100b1.m100583a(c4462a.f6395a);
            String str = c4462a.f6395a.f7138a;
            AbstractC4727ko.m97907a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            AbstractC4727ko.m97908a();
            return createByCodecName;
        }
    }

    private C5643ul(MediaCodec mediaCodec, Surface surface) {
        this.f11329a = mediaCodec;
        this.f11330b = surface;
        if (AbstractC5863xp.f12151a < 21) {
            this.f11331c = mediaCodec.getInputBuffers();
            this.f11332d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: b */
    public void mo94057b() {
        this.f11329a.flush();
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: c */
    public boolean mo94055c() {
        return false;
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: d */
    public int mo94053d() {
        return this.f11329a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: e */
    public MediaFormat mo94052e() {
        return this.f11329a.getOutputFormat();
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public int mo94063a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f11329a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && AbstractC5863xp.f12151a < 21) {
                this.f11332d = this.f11329a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: b */
    public ByteBuffer mo94056b(int i) {
        if (AbstractC5863xp.f12151a >= 21) {
            return this.f11329a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) AbstractC5863xp.m93017a((Object) this.f11332d))[i];
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: c */
    public void mo94054c(int i) {
        this.f11329a.setVideoScalingMode(i);
    }

    /* renamed from: a */
    public /* synthetic */ void m94060a(InterfaceC4461gd.InterfaceC4464c interfaceC4464c, MediaCodec mediaCodec, long j, long j2) {
        interfaceC4464c.mo96735a(this, j, j2);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94067a(int i, int i2, int i3, long j, int i4) {
        this.f11329a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94066a(int i, int i2, C5950z4 c5950z4, long j, int i3) {
        this.f11329a.queueSecureInputBuffer(i, i2, c5950z4.m92518a(), j, i3);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94069a() {
        this.f11331c = null;
        this.f11332d = null;
        Surface surface = this.f11330b;
        if (surface != null) {
            surface.release();
        }
        this.f11329a.release();
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94065a(int i, long j) {
        this.f11329a.releaseOutputBuffer(i, j);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94064a(int i, boolean z) {
        this.f11329a.releaseOutputBuffer(i, z);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94059a(final InterfaceC4461gd.InterfaceC4464c interfaceC4464c, Handler handler) {
        this.f11329a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.impl.s60
            {
                C5643ul.this = this;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C5643ul.this.m94060a(interfaceC4464c, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94061a(Surface surface) {
        this.f11329a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public void mo94062a(Bundle bundle) {
        this.f11329a.setParameters(bundle);
    }

    @Override // com.applovin.impl.InterfaceC4461gd
    /* renamed from: a */
    public ByteBuffer mo94068a(int i) {
        if (AbstractC5863xp.f12151a >= 21) {
            return this.f11329a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) AbstractC5863xp.m93017a((Object) this.f11331c))[i];
    }
}
