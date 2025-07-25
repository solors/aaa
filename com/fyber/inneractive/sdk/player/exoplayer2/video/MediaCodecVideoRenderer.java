package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C14830d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14989j;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C14980a;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C14983d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15116i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.ironsource.C21114v8;

@TargetApi(16)
/* loaded from: classes4.dex */
public class MediaCodecVideoRenderer extends AbstractC14982c {

    /* renamed from: q0 */
    public static final int[] f29845q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};

    /* renamed from: P */
    public final C15142h f29846P;

    /* renamed from: Q */
    public final VideoRendererEventListener.EventDispatcher f29847Q;

    /* renamed from: R */
    public final long f29848R;

    /* renamed from: S */
    public final int f29849S;

    /* renamed from: T */
    public final boolean f29850T;

    /* renamed from: U */
    public C15014o[] f29851U;

    /* renamed from: V */
    public C15139e f29852V;

    /* renamed from: W */
    public Surface f29853W;

    /* renamed from: X */
    public int f29854X;

    /* renamed from: Y */
    public boolean f29855Y;

    /* renamed from: Z */
    public long f29856Z;

    /* renamed from: a0 */
    public long f29857a0;

    /* renamed from: b0 */
    public int f29858b0;

    /* renamed from: c0 */
    public int f29859c0;

    /* renamed from: d0 */
    public int f29860d0;

    /* renamed from: e0 */
    public float f29861e0;

    /* renamed from: f0 */
    public int f29862f0;

    /* renamed from: g0 */
    public int f29863g0;

    /* renamed from: h0 */
    public int f29864h0;

    /* renamed from: i0 */
    public float f29865i0;

    /* renamed from: j0 */
    public int f29866j0;

    /* renamed from: k0 */
    public int f29867k0;

    /* renamed from: l0 */
    public int f29868l0;

    /* renamed from: m0 */
    public float f29869m0;

    /* renamed from: n0 */
    public boolean f29870n0;

    /* renamed from: o0 */
    public int f29871o0;

    /* renamed from: p0 */
    public C15140f f29872p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z = false;
        this.f29848R = 5000L;
        this.f29849S = -1;
        this.f29846P = new C15142h();
        this.f29847Q = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (AbstractC15133z.f29832a <= 22 && "foster".equals(AbstractC15133z.f29833b) && "NVIDIA".equals(AbstractC15133z.f29834c)) {
            z = true;
        }
        this.f29850T = z;
        this.f29856Z = -9223372036854775807L;
        this.f29862f0 = -1;
        this.f29863g0 = -1;
        this.f29865i0 = -1.0f;
        this.f29861e0 = -1.0f;
        this.f29854X = 1;
        this.f29866j0 = -1;
        this.f29867k0 = -1;
        this.f29869m0 = -1.0f;
        this.f29868l0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: a */
    public final void mo77144a(C15014o[] c15014oArr) {
        this.f29851U = c15014oArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: b */
    public final int mo77143b(C14983d c14983d, C15014o c15014o) {
        boolean z;
        int i;
        int i2;
        String str = c15014o.f29456f;
        if ("video".equals(AbstractC15116i.m77218b(str))) {
            C14830d c14830d = c15014o.f29459i;
            if (c14830d != null) {
                z = false;
                for (int i3 = 0; i3 < c14830d.f28275c; i3++) {
                    z |= c14830d.f28273a[i3].f28272e;
                }
            } else {
                z = false;
            }
            c14983d.getClass();
            C14980a m77332a = AbstractC14989j.m77332a(z, str);
            if (m77332a == null) {
                return 1;
            }
            boolean m77350a = m77332a.m77350a(c15014o.f29453c);
            if (m77350a && (i = c15014o.f29460j) > 0 && (i2 = c15014o.f29461k) > 0) {
                if (AbstractC15133z.f29832a >= 21) {
                    m77350a = m77332a.m77351a(i, i2, c15014o.f29462l);
                } else {
                    boolean z2 = i * i2 <= AbstractC14989j.m77335a();
                    if (!z2) {
                        Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + c15014o.f29460j + "x" + c15014o.f29461k + "] [" + AbstractC15133z.f29836e + C21114v8.C21123i.f54139e);
                    }
                    m77350a = z2;
                }
            }
            return (m77350a ? 3 : 2) | (m77332a.f29365b ? 8 : 4) | (m77332a.f29366c ? 16 : 0);
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: f */
    public final boolean mo77141f() {
        if ((this.f29855Y || super.mo77135q()) && super.mo77141f()) {
            this.f29856Z = -9223372036854775807L;
            return true;
        } else if (this.f29856Z == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f29856Z) {
                return true;
            }
            this.f29856Z = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: g */
    public final void mo77140g() {
        this.f29862f0 = -1;
        this.f29863g0 = -1;
        this.f29865i0 = -1.0f;
        this.f29861e0 = -1.0f;
        this.f29866j0 = -1;
        this.f29867k0 = -1;
        this.f29869m0 = -1.0f;
        this.f29868l0 = -1;
        m77134r();
        C15142h c15142h = this.f29846P;
        if (c15142h.f29895b) {
            c15142h.f29894a.f29891b.sendEmptyMessage(2);
        }
        this.f29872p0 = null;
        try {
            this.f29390n = null;
            m77341o();
        } finally {
            this.f29383N.ensureUpdated();
            this.f29847Q.disabled(this.f29383N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: h */
    public final void mo77139h() {
        boolean z;
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f29383N = decoderCounters;
        int i = this.f28085b.f29591a;
        this.f29871o0 = i;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f29870n0 = z;
        this.f29847Q.enabled(decoderCounters);
        C15142h c15142h = this.f29846P;
        c15142h.f29901h = false;
        if (c15142h.f29895b) {
            c15142h.f29894a.f29891b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: i */
    public final void mo77138i() {
        this.f29858b0 = 0;
        this.f29857a0 = SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: j */
    public final void mo77137j() {
        this.f29856Z = -9223372036854775807L;
        if (this.f29858b0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f29847Q.droppedFrames(this.f29858b0, elapsedRealtime - this.f29857a0);
            this.f29858b0 = 0;
            this.f29857a0 = elapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: m */
    public final void mo77136m() {
        if (AbstractC15133z.f29832a < 23 && this.f29870n0 && !this.f29855Y) {
            this.f29855Y = true;
            this.f29847Q.renderedFirstFrame(this.f29853W);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: q */
    public final boolean mo77135q() {
        Surface surface;
        if (super.mo77135q() && (surface = this.f29853W) != null && surface.isValid()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final void m77134r() {
        MediaCodec mediaCodec;
        this.f29855Y = false;
        if (AbstractC15133z.f29832a >= 23 && this.f29870n0 && (mediaCodec = this.f29391o) != null) {
            this.f29872p0 = new C15140f(this, mediaCodec);
        }
    }

    /* renamed from: s */
    public final void m77133s() {
        int i = this.f29862f0;
        if (i != -1 || this.f29863g0 != -1) {
            if (this.f29866j0 != i || this.f29867k0 != this.f29863g0 || this.f29868l0 != this.f29864h0 || this.f29869m0 != this.f29865i0) {
                this.f29847Q.videoSizeChanged(i, this.f29863g0, this.f29864h0, this.f29865i0);
                this.f29866j0 = this.f29862f0;
                this.f29867k0 = this.f29863g0;
                this.f29868l0 = this.f29864h0;
                this.f29869m0 = this.f29865i0;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: a */
    public final void mo77146a(boolean z, long j) {
        super.mo77146a(z, j);
        m77134r();
        this.f29859c0 = 0;
        if (z) {
            this.f29856Z = this.f29848R > 0 ? SystemClock.elapsedRealtime() + this.f29848R : -9223372036854775807L;
        } else {
            this.f29856Z = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14796a
    /* renamed from: a */
    public final void mo77153a(int i, Object obj) {
        if (i != 1) {
            if (i == 4) {
                int intValue = ((Integer) obj).intValue();
                this.f29854X = intValue;
                MediaCodec mediaCodec = this.f29391o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(intValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.f29853W == surface) {
            if (surface != null) {
                int i2 = this.f29866j0;
                if (i2 != -1 || this.f29867k0 != -1) {
                    this.f29847Q.videoSizeChanged(i2, this.f29867k0, this.f29868l0, this.f29869m0);
                }
                if (this.f29855Y) {
                    this.f29847Q.renderedFirstFrame(this.f29853W);
                    return;
                }
                return;
            }
            return;
        }
        this.f29853W = surface;
        int i3 = this.f28086c;
        if (i3 == 1 || i3 == 2) {
            MediaCodec mediaCodec2 = this.f29391o;
            if (AbstractC15133z.f29832a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                m77341o();
                m77343l();
            }
        }
        if (surface != null) {
            int i4 = this.f29866j0;
            if (i4 != -1 || this.f29867k0 != -1) {
                this.f29847Q.videoSizeChanged(i4, this.f29867k0, this.f29868l0, this.f29869m0);
            }
            m77134r();
            if (i3 == 2) {
                this.f29856Z = this.f29848R > 0 ? SystemClock.elapsedRealtime() + this.f29848R : -9223372036854775807L;
                return;
            }
            return;
        }
        this.f29866j0 = -1;
        this.f29867k0 = -1;
        this.f29869m0 = -1.0f;
        this.f29868l0 = -1;
        m77134r();
    }

    /* renamed from: b */
    public static boolean m77142b(boolean z, C15014o c15014o, C15014o c15014o2) {
        if (c15014o.f29456f.equals(c15014o2.f29456f)) {
            int i = c15014o.f29463m;
            if (i == -1) {
                i = 0;
            }
            int i2 = c15014o2.f29463m;
            if (i2 == -1) {
                i2 = 0;
            }
            if (i == i2) {
                return z || (c15014o.f29460j == c15014o2.f29460j && c15014o.f29461k == c15014o2.f29461k);
            }
            return false;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final void mo77150a(C14980a c14980a, MediaCodec mediaCodec, C15014o c15014o) {
        C15139e c15139e;
        String str;
        Point point;
        int i;
        C15014o[] c15014oArr = this.f29851U;
        int i2 = c15014o.f29460j;
        int i3 = c15014o.f29461k;
        int i4 = c15014o.f29457g;
        if (i4 == -1) {
            i4 = m77148a(c15014o.f29456f, i2, i3);
        }
        if (c15014oArr.length == 1) {
            c15139e = new C15139e(i2, i3, i4);
        } else {
            boolean z = false;
            for (C15014o c15014o2 : c15014oArr) {
                if (m77142b(c14980a.f29365b, c15014o, c15014o2)) {
                    int i5 = c15014o2.f29460j;
                    z |= i5 == -1 || c15014o2.f29461k == -1;
                    i2 = Math.max(i2, i5);
                    i3 = Math.max(i3, c15014o2.f29461k);
                    int i6 = c15014o2.f29457g;
                    if (i6 == -1) {
                        i6 = m77148a(c15014o2.f29456f, c15014o2.f29460j, c15014o2.f29461k);
                    }
                    i4 = Math.max(i4, i6);
                }
            }
            if (z) {
                StringBuilder sb2 = new StringBuilder("Resolutions unknown. Codec max resolution: ");
                sb2.append(i2);
                String str2 = "x";
                sb2.append("x");
                sb2.append(i3);
                Log.w("MediaCodecVideoRenderer", sb2.toString());
                int i7 = c15014o.f29461k;
                int i8 = c15014o.f29460j;
                boolean z2 = i7 > i8;
                int i9 = z2 ? i7 : i8;
                if (z2) {
                    i7 = i8;
                }
                float f = i7 / i9;
                int[] iArr = f29845q0;
                int i10 = 0;
                while (i10 < 9) {
                    int i11 = iArr[i10];
                    int[] iArr2 = iArr;
                    int i12 = (int) (i11 * f);
                    if (i11 <= i9 || i12 <= i7) {
                        break;
                    }
                    int i13 = i7;
                    float f2 = f;
                    if (AbstractC15133z.f29832a >= 21) {
                        int i14 = z2 ? i12 : i11;
                        if (!z2) {
                            i11 = i12;
                        }
                        point = c14980a.m77352a(i14, i11);
                        str = str2;
                        if (c14980a.m77351a(point.x, point.y, c15014o.f29462l)) {
                            break;
                        }
                        i10++;
                        iArr = iArr2;
                        i7 = i13;
                        f = f2;
                        str2 = str;
                    } else {
                        str = str2;
                        int i15 = ((i11 + 15) / 16) * 16;
                        int i16 = ((i12 + 15) / 16) * 16;
                        if (i15 * i16 <= AbstractC14989j.m77335a()) {
                            int i17 = z2 ? i16 : i15;
                            if (!z2) {
                                i15 = i16;
                            }
                            point = new Point(i17, i15);
                        } else {
                            i10++;
                            iArr = iArr2;
                            i7 = i13;
                            f = f2;
                            str2 = str;
                        }
                    }
                }
                str = str2;
                point = null;
                if (point != null) {
                    i2 = Math.max(i2, point.x);
                    i3 = Math.max(i3, point.y);
                    i4 = Math.max(i4, m77148a(c15014o.f29456f, i2, i3));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i2 + str + i3);
                }
            }
            c15139e = new C15139e(i2, i3, i4);
        }
        this.f29852V = c15139e;
        boolean z3 = this.f29850T;
        int i18 = this.f29871o0;
        MediaFormat m77312a = c15014o.m77312a();
        m77312a.setInteger("max-width", c15139e.f29885a);
        m77312a.setInteger("max-height", c15139e.f29886b);
        int i19 = c15139e.f29887c;
        if (i19 != -1) {
            m77312a.setInteger("max-input-size", i19);
        }
        if (z3) {
            i = 0;
            m77312a.setInteger("auto-frc", 0);
        } else {
            i = 0;
        }
        if (i18 != 0) {
            m77312a.setFeatureEnabled("tunneled-playback", true);
            m77312a.setInteger("audio-session-id", i18);
        }
        mediaCodec.configure(m77312a, this.f29853W, (MediaCrypto) null, i);
        if (AbstractC15133z.f29832a < 23 || !this.f29870n0) {
            return;
        }
        this.f29872p0 = new C15140f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final void mo77147a(String str, long j, long j2) {
        this.f29847Q.decoderInitialized(str, j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final void mo77149a(C15014o c15014o) {
        super.mo77149a(c15014o);
        this.f29847Q.inputFormatChanged(c15014o);
        float f = c15014o.f29464n;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f29861e0 = f;
        int i = c15014o.f29463m;
        if (i == -1) {
            i = 0;
        }
        this.f29860d0 = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final void mo77151a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f29862f0 = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f29863g0 = integer2;
        float f = this.f29861e0;
        this.f29865i0 = f;
        if (AbstractC15133z.f29832a >= 21) {
            int i = this.f29860d0;
            if (i == 90 || i == 270) {
                int i2 = this.f29862f0;
                this.f29862f0 = integer2;
                this.f29863g0 = i2;
                this.f29865i0 = 1.0f / f;
            }
        } else {
            this.f29864h0 = this.f29860d0;
        }
        mediaCodec.setVideoScalingMode(this.f29854X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    public final boolean mo77145a(boolean z, C15014o c15014o, C15014o c15014o2) {
        if (m77142b(z, c15014o, c15014o2)) {
            int i = c15014o2.f29460j;
            C15139e c15139e = this.f29852V;
            if (i <= c15139e.f29885a && c15014o2.f29461k <= c15139e.f29886b && c15014o2.f29457g <= c15139e.f29887c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC14982c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo77152a(long r22, long r24, android.media.MediaCodec r26, java.nio.ByteBuffer r27, int r28, long r29, boolean r31) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo77152a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, long, boolean):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m77148a(String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.getClass();
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 4:
                i3 = i2 * i;
                i4 = 2;
                break;
            case 1:
            case 5:
                i3 = i2 * i;
                break;
            case 3:
                if (!"BRAVIA 4K 2015".equals(AbstractC15133z.f29835d)) {
                    i3 = ((i2 + 15) / 16) * ((i + 15) / 16) * 256;
                    i4 = 2;
                    break;
                } else {
                    return -1;
                }
            default:
                return -1;
        }
        return (i3 * 3) / (i4 * 2);
    }
}
