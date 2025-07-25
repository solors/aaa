package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C14823d;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.C15018s;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14989j;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C14980a;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C14983d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15116i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC15115h;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes4.dex */
public class MediaCodecAudioRenderer extends AbstractC14982c implements InterfaceC15115h {

    /* renamed from: P */
    public final AudioRendererEventListener.EventDispatcher f28091P;

    /* renamed from: Q */
    public final C14814r f28092Q;

    /* renamed from: R */
    public boolean f28093R;

    /* renamed from: S */
    public int f28094S;

    /* renamed from: T */
    public int f28095T;

    /* renamed from: U */
    public long f28096U;

    /* renamed from: V */
    public boolean f28097V;

    public MediaCodecAudioRenderer() {
        super(1, true);
        this.f28092Q = new C14814r(new InterfaceC14799c[0], new C14817u(this));
        this.f28091P = new AudioRendererEventListener.EventDispatcher(null, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final C14980a mo77346a(C14983d c14983d, C15014o c15014o) {
        String str = c15014o.f29456f;
        this.f28092Q.getClass();
        String str2 = c15014o.f29456f;
        c14983d.getClass();
        return AbstractC14989j.m77332a(false, str2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: b */
    public final int mo77143b(C14983d c14983d, C15014o c15014o) {
        int i;
        int i2;
        String str = c15014o.f29456f;
        if ("audio".equals(AbstractC15116i.m77218b(str))) {
            int i3 = AbstractC15133z.f29832a;
            int i4 = i3 >= 21 ? 16 : 0;
            this.f28092Q.getClass();
            c14983d.getClass();
            C14980a m77332a = AbstractC14989j.m77332a(false, str);
            if (m77332a == null) {
                return 1;
            }
            return ((i3 < 21 || (((i = c15014o.f29469s) == -1 || m77332a.m77349b(i)) && ((i2 = c15014o.f29468r) == -1 || m77332a.m77353a(i2)))) ? 3 : 2) | i4 | 4;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: e */
    public final boolean mo77345e() {
        if (this.f29381L) {
            C14814r c14814r = this.f28092Q;
            if (!c14814r.m77551d() || (c14814r.f28162X && !c14814r.m77552c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: f */
    public final boolean mo77141f() {
        if (!this.f28092Q.m77552c() && !super.mo77141f()) {
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: g */
    public final void mo77140g() {
        try {
            C14814r c14814r = this.f28092Q;
            c14814r.m77548g();
            for (InterfaceC14799c interfaceC14799c : c14814r.f28169c) {
                interfaceC14799c.mo77532f();
            }
            c14814r.f28164Z = 0;
            c14814r.f28163Y = false;
            try {
                this.f29390n = null;
                m77341o();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.f29390n = null;
                m77341o();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: h */
    public final void mo77139h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f29383N = decoderCounters;
        this.f28091P.enabled(decoderCounters);
        int i = this.f28085b.f29591a;
        if (i != 0) {
            C14814r c14814r = this.f28092Q;
            c14814r.getClass();
            if (AbstractC15133z.f29832a >= 21) {
                if (!c14814r.f28166a0 || c14814r.f28164Z != i) {
                    c14814r.f28166a0 = true;
                    c14814r.f28164Z = i;
                    c14814r.m77548g();
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
        C14814r c14814r2 = this.f28092Q;
        if (c14814r2.f28166a0) {
            c14814r2.f28166a0 = false;
            c14814r2.f28164Z = 0;
            c14814r2.m77548g();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: i */
    public final void mo77138i() {
        this.f28092Q.m77549f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: j */
    public final void mo77137j() {
        C14814r c14814r = this.f28092Q;
        c14814r.f28163Y = false;
        if (c14814r.m77551d()) {
            c14814r.f28193z = 0L;
            c14814r.f28192y = 0;
            c14814r.f28191x = 0;
            c14814r.f28139A = 0L;
            c14814r.f28140B = false;
            c14814r.f28141C = 0L;
            c14814r.f28174g.m77565d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: p */
    public final void mo77340p() {
        try {
            C14814r c14814r = this.f28092Q;
            if (!c14814r.f28162X && c14814r.m77551d() && c14814r.m77560a()) {
                c14814r.f28174g.m77566a(c14814r.m77554b());
                c14814r.f28190w = 0;
                c14814r.f28162X = true;
            }
        } catch (C14813q e) {
            throw new C14823d(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final void mo77150a(C14980a c14980a, MediaCodec mediaCodec, C15014o c15014o) {
        boolean z;
        String str = c14980a.f29364a;
        if (AbstractC15133z.f29832a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(AbstractC15133z.f29834c)) {
            String str2 = AbstractC15133z.f29833b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.f28093R = z;
                mediaCodec.configure(c15014o.m77312a(), (Surface) null, (MediaCrypto) null, 0);
            }
        }
        z = false;
        this.f28093R = z;
        mediaCodec.configure(c15014o.m77312a(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC15115h
    /* renamed from: b */
    public final long mo77172b() {
        long m77555a = this.f28092Q.m77555a(mo77345e());
        if (m77555a != Long.MIN_VALUE) {
            if (!this.f28097V) {
                m77555a = Math.max(this.f28096U, m77555a);
            }
            this.f28096U = m77555a;
            this.f28097V = false;
        }
        return this.f28096U;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final void mo77147a(String str, long j, long j2) {
        this.f28091P.decoderInitialized(str, j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final void mo77149a(C15014o c15014o) {
        super.mo77149a(c15014o);
        this.f28091P.inputFormatChanged(c15014o);
        this.f28094S = "audio/raw".equals(c15014o.f29456f) ? c15014o.f29470t : 2;
        this.f28095T = c15014o.f29468r;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final void mo77151a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f28093R && integer == 6 && (i = this.f28095T) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.f28095T; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.f28092Q.m77559a(integer, integer2, this.f28094S, iArr);
        } catch (C14809m e) {
            throw new C14823d(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: d */
    public final InterfaceC15115h mo77569d() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: a */
    public final void mo77146a(boolean z, long j) {
        super.mo77146a(z, j);
        this.f28092Q.m77548g();
        this.f28096U = j;
        this.f28097V = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC15115h
    /* renamed from: a */
    public final C15018s mo77173a(C15018s c15018s) {
        return this.f28092Q.m77557a(c15018s);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC15115h
    /* renamed from: a */
    public final C15018s mo77175a() {
        return this.f28092Q.f28186s;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final boolean mo77152a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, long j3, boolean z) {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f29383N.skippedOutputBufferCount++;
            C14814r c14814r = this.f28092Q;
            if (c14814r.f28150L == 1) {
                c14814r.f28150L = 2;
            }
            return true;
        }
        try {
            if (this.f28092Q.m77556a(byteBuffer, j3)) {
                mediaCodec.releaseOutputBuffer(i, false);
                this.f29383N.renderedOutputBufferCount++;
                return true;
            }
            return false;
        } catch (C14810n | C14813q e) {
            throw new C14823d(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: a */
    public final void mo77153a(int i, Object obj) {
        if (i == 2) {
            C14814r c14814r = this.f28092Q;
            float floatValue = ((Float) obj).floatValue();
            if (c14814r.f28154P != floatValue) {
                c14814r.f28154P = floatValue;
                c14814r.m77546i();
            }
        } else if (i != 3) {
        } else {
            int intValue = ((Integer) obj).intValue();
            C14814r c14814r2 = this.f28092Q;
            if (c14814r2.f28181n == intValue) {
                return;
            }
            c14814r2.f28181n = intValue;
            if (c14814r2.f28166a0) {
                return;
            }
            c14814r2.m77548g();
            c14814r2.f28164Z = 0;
        }
    }
}
