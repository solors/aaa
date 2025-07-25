package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14821b;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14979m;
import com.fyber.inneractive.sdk.player.exoplayer2.C15018s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.C21114v8;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.r */
/* loaded from: classes4.dex */
public final class C14814r {

    /* renamed from: A */
    public long f28139A;

    /* renamed from: B */
    public boolean f28140B;

    /* renamed from: C */
    public long f28141C;

    /* renamed from: D */
    public Method f28142D;

    /* renamed from: E */
    public int f28143E;

    /* renamed from: F */
    public long f28144F;

    /* renamed from: G */
    public long f28145G;

    /* renamed from: H */
    public int f28146H;

    /* renamed from: I */
    public long f28147I;

    /* renamed from: J */
    public long f28148J;

    /* renamed from: K */
    public int f28149K;

    /* renamed from: L */
    public int f28150L;

    /* renamed from: M */
    public long f28151M;

    /* renamed from: N */
    public long f28152N;

    /* renamed from: O */
    public long f28153O;

    /* renamed from: P */
    public float f28154P;

    /* renamed from: Q */
    public InterfaceC14799c[] f28155Q;

    /* renamed from: R */
    public ByteBuffer[] f28156R;

    /* renamed from: S */
    public ByteBuffer f28157S;

    /* renamed from: T */
    public ByteBuffer f28158T;

    /* renamed from: U */
    public byte[] f28159U;

    /* renamed from: V */
    public int f28160V;

    /* renamed from: W */
    public int f28161W;

    /* renamed from: X */
    public boolean f28162X;

    /* renamed from: Y */
    public boolean f28163Y;

    /* renamed from: Z */
    public int f28164Z;

    /* renamed from: a */
    public final C14815s f28165a;

    /* renamed from: a0 */
    public boolean f28166a0;

    /* renamed from: b */
    public final C14820x f28167b;

    /* renamed from: b0 */
    public boolean f28168b0;

    /* renamed from: c */
    public final InterfaceC14799c[] f28169c;

    /* renamed from: c0 */
    public long f28170c0;

    /* renamed from: d */
    public final InterfaceC14811o f28171d;

    /* renamed from: e */
    public final ConditionVariable f28172e = new ConditionVariable(true);

    /* renamed from: f */
    public final long[] f28173f;

    /* renamed from: g */
    public final C14807k f28174g;

    /* renamed from: h */
    public final LinkedList f28175h;

    /* renamed from: i */
    public AudioTrack f28176i;

    /* renamed from: j */
    public int f28177j;

    /* renamed from: k */
    public int f28178k;

    /* renamed from: l */
    public int f28179l;

    /* renamed from: m */
    public int f28180m;

    /* renamed from: n */
    public int f28181n;

    /* renamed from: o */
    public boolean f28182o;

    /* renamed from: p */
    public int f28183p;

    /* renamed from: q */
    public long f28184q;

    /* renamed from: r */
    public C15018s f28185r;

    /* renamed from: s */
    public C15018s f28186s;

    /* renamed from: t */
    public long f28187t;

    /* renamed from: u */
    public long f28188u;

    /* renamed from: v */
    public ByteBuffer f28189v;

    /* renamed from: w */
    public int f28190w;

    /* renamed from: x */
    public int f28191x;

    /* renamed from: y */
    public int f28192y;

    /* renamed from: z */
    public long f28193z;

    public C14814r(InterfaceC14799c[] interfaceC14799cArr, C14817u c14817u) {
        this.f28171d = c14817u;
        if (AbstractC15133z.f29832a >= 18) {
            try {
                this.f28142D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (AbstractC15133z.f29832a >= 19) {
            this.f28174g = new C14808l();
        } else {
            this.f28174g = new C14807k();
        }
        C14815s c14815s = new C14815s();
        this.f28165a = c14815s;
        C14820x c14820x = new C14820x();
        this.f28167b = c14820x;
        InterfaceC14799c[] interfaceC14799cArr2 = new InterfaceC14799c[interfaceC14799cArr.length + 3];
        this.f28169c = interfaceC14799cArr2;
        interfaceC14799cArr2[0] = new C14818v();
        interfaceC14799cArr2[1] = c14815s;
        System.arraycopy(interfaceC14799cArr, 0, interfaceC14799cArr2, 2, interfaceC14799cArr.length);
        interfaceC14799cArr2[interfaceC14799cArr.length + 2] = c14820x;
        this.f28173f = new long[10];
        this.f28154P = 1.0f;
        this.f28150L = 0;
        this.f28181n = 3;
        this.f28164Z = 0;
        this.f28186s = C15018s.f29478d;
        this.f28161W = -1;
        this.f28155Q = new InterfaceC14799c[0];
        this.f28156R = new ByteBuffer[0];
        this.f28175h = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m77559a(int r9, int r10, int r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C14814r.m77559a(int, int, int, int[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        if (r10 < r9) goto L17;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m77553b(java.nio.ByteBuffer r8, long r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C14814r.m77553b(java.nio.ByteBuffer, long):void");
    }

    /* renamed from: c */
    public final boolean m77552c() {
        if (m77551d() && (m77554b() > this.f28174g.m77567a() || (m77550e() && this.f28176i.getPlayState() == 2 && this.f28176i.getPlaybackHeadPosition() == 0))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m77551d() {
        if (this.f28176i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m77550e() {
        int i;
        if (AbstractC15133z.f29832a < 23 && ((i = this.f28180m) == 5 || i == 6)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m77549f() {
        this.f28163Y = true;
        if (m77551d()) {
            this.f28152N = System.nanoTime() / 1000;
            this.f28176i.play();
        }
    }

    /* renamed from: g */
    public final void m77548g() {
        if (m77551d()) {
            this.f28144F = 0L;
            this.f28145G = 0L;
            this.f28147I = 0L;
            this.f28148J = 0L;
            this.f28149K = 0;
            C15018s c15018s = this.f28185r;
            if (c15018s != null) {
                this.f28186s = c15018s;
                this.f28185r = null;
            } else if (!this.f28175h.isEmpty()) {
                this.f28186s = ((C14812p) this.f28175h.getLast()).f28136a;
            }
            this.f28175h.clear();
            this.f28187t = 0L;
            this.f28188u = 0L;
            this.f28157S = null;
            this.f28158T = null;
            int i = 0;
            while (true) {
                InterfaceC14799c[] interfaceC14799cArr = this.f28155Q;
                if (i >= interfaceC14799cArr.length) {
                    break;
                }
                InterfaceC14799c interfaceC14799c = interfaceC14799cArr[i];
                interfaceC14799c.flush();
                this.f28156R[i] = interfaceC14799c.mo77539a();
                i++;
            }
            this.f28162X = false;
            this.f28161W = -1;
            this.f28189v = null;
            this.f28190w = 0;
            this.f28150L = 0;
            this.f28153O = 0L;
            this.f28193z = 0L;
            this.f28192y = 0;
            this.f28191x = 0;
            this.f28139A = 0L;
            this.f28140B = false;
            this.f28141C = 0L;
            if (this.f28176i.getPlayState() == 3) {
                this.f28176i.pause();
            }
            AudioTrack audioTrack = this.f28176i;
            this.f28176i = null;
            this.f28174g.mo77564a(null, false);
            this.f28172e.close();
            new C14806j(this, audioTrack).start();
        }
    }

    /* renamed from: h */
    public final void m77547h() {
        InterfaceC14799c[] interfaceC14799cArr;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC14799c interfaceC14799c : this.f28169c) {
            if (interfaceC14799c.mo77534d()) {
                arrayList.add(interfaceC14799c);
            } else {
                interfaceC14799c.flush();
            }
        }
        int size = arrayList.size();
        this.f28155Q = (InterfaceC14799c[]) arrayList.toArray(new InterfaceC14799c[size]);
        this.f28156R = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            InterfaceC14799c interfaceC14799c2 = this.f28155Q[i];
            interfaceC14799c2.flush();
            this.f28156R[i] = interfaceC14799c2.mo77539a();
        }
    }

    /* renamed from: i */
    public final void m77546i() {
        if (m77551d()) {
            if (AbstractC15133z.f29832a >= 21) {
                this.f28176i.setVolume(this.f28154P);
                return;
            }
            AudioTrack audioTrack = this.f28176i;
            float f = this.f28154P;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: a */
    public final boolean m77556a(ByteBuffer byteBuffer, long j) {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = this.f28157S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (!m77551d()) {
            this.f28172e.block();
            if (this.f28166a0) {
                this.f28176i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f28178k).setEncoding(this.f28180m).setSampleRate(this.f28177j).build(), this.f28183p, 1, this.f28164Z);
            } else if (this.f28164Z == 0) {
                this.f28176i = new AudioTrack(this.f28181n, this.f28177j, this.f28178k, this.f28180m, this.f28183p, 1);
            } else {
                this.f28176i = new AudioTrack(this.f28181n, this.f28177j, this.f28178k, this.f28180m, this.f28183p, 1, this.f28164Z);
            }
            int state = this.f28176i.getState();
            if (state == 1) {
                int audioSessionId = this.f28176i.getAudioSessionId();
                if (this.f28164Z != audioSessionId) {
                    this.f28164Z = audioSessionId;
                    C14817u c14817u = (C14817u) this.f28171d;
                    c14817u.f28205a.f28091P.audioSessionId(audioSessionId);
                    c14817u.f28205a.getClass();
                }
                this.f28174g.mo77564a(this.f28176i, m77550e());
                m77546i();
                this.f28168b0 = false;
                if (this.f28163Y) {
                    m77549f();
                }
            } else {
                try {
                    this.f28176i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f28176i = null;
                    throw th;
                }
                this.f28176i = null;
                throw new C14810n(state, this.f28177j, this.f28178k, this.f28183p);
            }
        }
        if (m77550e()) {
            if (this.f28176i.getPlayState() == 2) {
                this.f28168b0 = false;
                return false;
            } else if (this.f28176i.getPlayState() == 1 && this.f28174g.m77567a() != 0) {
                return false;
            }
        }
        boolean z = this.f28168b0;
        boolean m77552c = m77552c();
        this.f28168b0 = m77552c;
        if (z && !m77552c && this.f28176i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f28170c0;
            C14817u c14817u2 = (C14817u) this.f28171d;
            c14817u2.f28205a.f28091P.audioTrackUnderrun(this.f28183p, AbstractC14821b.m77531a(this.f28184q), elapsedRealtime);
            c14817u2.f28205a.getClass();
        }
        if (this.f28157S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f28182o && this.f28149K == 0) {
                int i3 = this.f28180m;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    i2 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? AbstractC14797a.f28098a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                } else {
                    throw new IllegalStateException(AbstractC14979m.m77354a("Unexpected audio encoding: ", i3));
                }
                this.f28149K = i2;
            }
            if (this.f28185r != null) {
                if (!m77560a()) {
                    return false;
                }
                this.f28175h.add(new C14812p(this.f28185r, Math.max(0L, j), (m77554b() * 1000000) / this.f28177j));
                this.f28185r = null;
                m77547h();
            }
            int i4 = this.f28150L;
            if (i4 == 0) {
                this.f28151M = Math.max(0L, j);
                this.f28150L = 1;
            } else {
                long j2 = (((this.f28182o ? this.f28145G : this.f28144F / this.f28143E) * 1000000) / this.f28177j) + this.f28151M;
                if (i4 != 1 || Math.abs(j2 - j) <= 200000) {
                    i = 2;
                } else {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + j2 + ", got " + j + C21114v8.C21123i.f54139e);
                    i = 2;
                    this.f28150L = 2;
                }
                if (this.f28150L == i) {
                    this.f28151M = (j - j2) + this.f28151M;
                    this.f28150L = 1;
                    C14817u c14817u3 = (C14817u) this.f28171d;
                    c14817u3.f28205a.getClass();
                    c14817u3.f28205a.f28097V = true;
                }
            }
            if (this.f28182o) {
                this.f28145G += this.f28149K;
            } else {
                this.f28144F += byteBuffer.remaining();
            }
            this.f28157S = byteBuffer;
        }
        if (this.f28182o) {
            m77553b(this.f28157S, j);
        } else {
            m77558a(j);
        }
        if (this.f28157S.hasRemaining()) {
            return false;
        }
        this.f28157S = null;
        return true;
    }

    /* renamed from: b */
    public final long m77554b() {
        return this.f28182o ? this.f28148J : this.f28147I / this.f28146H;
    }

    /* renamed from: a */
    public final void m77558a(long j) {
        ByteBuffer byteBuffer;
        int length = this.f28155Q.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f28156R[i - 1];
            } else {
                byteBuffer = this.f28157S;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC14799c.f28104a;
                }
            }
            if (i == length) {
                m77553b(byteBuffer, j);
            } else {
                InterfaceC14799c interfaceC14799c = this.f28155Q[i];
                interfaceC14799c.mo77537a(byteBuffer);
                ByteBuffer mo77539a = interfaceC14799c.mo77539a();
                this.f28156R[i] = mo77539a;
                if (mo77539a.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m77560a() {
        /*
            r9 = this;
            int r0 = r9.f28161W
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.f28182o
            if (r0 == 0) goto Lf
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r0 = r9.f28155Q
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r2
        L10:
            r9.f28161W = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.f28161W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r5 = r9.f28155Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.mo77536b()
        L28:
            r9.m77558a(r7)
            boolean r0 = r4.mo77535c()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.f28161W
            int r0 = r0 + r1
            r9.f28161W = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.f28158T
            if (r0 == 0) goto L44
            r9.m77553b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f28158T
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.f28161W = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C14814r.m77560a():boolean");
    }

    /* renamed from: a */
    public final C15018s m77557a(C15018s c15018s) {
        if (this.f28182o) {
            C15018s c15018s2 = C15018s.f29478d;
            this.f28186s = c15018s2;
            return c15018s2;
        }
        C14820x c14820x = this.f28167b;
        float f = c15018s.f29479a;
        c14820x.getClass();
        int i = AbstractC15133z.f29832a;
        float max = Math.max(0.1f, Math.min(f, 8.0f));
        c14820x.f28239e = max;
        C14820x c14820x2 = this.f28167b;
        float f2 = c15018s.f29480b;
        c14820x2.getClass();
        c14820x2.f28240f = Math.max(0.1f, Math.min(f2, 8.0f));
        C15018s c15018s3 = new C15018s(max, f2);
        C15018s c15018s4 = this.f28185r;
        if (c15018s4 == null) {
            if (!this.f28175h.isEmpty()) {
                c15018s4 = ((C14812p) this.f28175h.getLast()).f28136a;
            } else {
                c15018s4 = this.f28186s;
            }
        }
        if (!c15018s3.equals(c15018s4)) {
            if (m77551d()) {
                this.f28185r = c15018s3;
            } else {
                this.f28186s = c15018s3;
            }
        }
        return this.f28186s;
    }

    /* renamed from: a */
    public final long m77555a(boolean z) {
        long j;
        C14807k c14807k;
        long j2;
        C14807k c14807k2;
        Method method;
        if (!m77551d() || this.f28150L == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f28176i.getPlayState() == 3) {
            long m77567a = (this.f28174g.m77567a() * 1000000) / c14807k2.f28125c;
            if (m77567a != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f28139A >= 30000) {
                    long[] jArr = this.f28173f;
                    int i = this.f28191x;
                    jArr[i] = m77567a - nanoTime;
                    this.f28191x = (i + 1) % 10;
                    int i2 = this.f28192y;
                    if (i2 < 10) {
                        this.f28192y = i2 + 1;
                    }
                    this.f28139A = nanoTime;
                    this.f28193z = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f28192y;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f28193z = (this.f28173f[i3] / i4) + this.f28193z;
                        i3++;
                    }
                }
                if (!m77550e() && nanoTime - this.f28141C >= 500000) {
                    boolean mo77561e = this.f28174g.mo77561e();
                    this.f28140B = mo77561e;
                    if (mo77561e) {
                        long mo77562c = this.f28174g.mo77562c() / 1000;
                        long mo77563b = this.f28174g.mo77563b();
                        if (mo77562c < this.f28152N) {
                            this.f28140B = false;
                        } else if (Math.abs(mo77562c - nanoTime) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb2.append(mo77563b);
                            sb2.append(", ");
                            sb2.append(mo77562c);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(m77567a);
                            sb2.append(", ");
                            sb2.append(this.f28182o ? this.f28145G : this.f28144F / this.f28143E);
                            sb2.append(", ");
                            sb2.append(m77554b());
                            Log.w("AudioTrack", sb2.toString());
                            this.f28140B = false;
                        } else if (Math.abs(((mo77563b * 1000000) / this.f28177j) - m77567a) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb3.append(mo77563b);
                            sb3.append(", ");
                            sb3.append(mo77562c);
                            sb3.append(", ");
                            sb3.append(nanoTime);
                            sb3.append(", ");
                            sb3.append(m77567a);
                            sb3.append(", ");
                            sb3.append(this.f28182o ? this.f28145G : this.f28144F / this.f28143E);
                            sb3.append(", ");
                            sb3.append(m77554b());
                            Log.w("AudioTrack", sb3.toString());
                            this.f28140B = false;
                        }
                    }
                    if (this.f28142D != null && !this.f28182o) {
                        try {
                            long intValue = (((Integer) method.invoke(this.f28176i, null)).intValue() * 1000) - this.f28184q;
                            this.f28153O = intValue;
                            long max = Math.max(intValue, 0L);
                            this.f28153O = max;
                            if (max > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.f28153O);
                                this.f28153O = 0L;
                            }
                        } catch (Exception unused) {
                            this.f28142D = null;
                        }
                    }
                    this.f28141C = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f28140B) {
            j = ((this.f28174g.mo77563b() + (((nanoTime2 - (this.f28174g.mo77562c() / 1000)) * this.f28177j) / 1000000)) * 1000000) / this.f28177j;
        } else {
            if (this.f28192y == 0) {
                j = (this.f28174g.m77567a() * 1000000) / c14807k.f28125c;
            } else {
                j = nanoTime2 + this.f28193z;
            }
            if (!z) {
                j -= this.f28153O;
            }
        }
        long j3 = this.f28151M;
        while (!this.f28175h.isEmpty() && j >= ((C14812p) this.f28175h.getFirst()).f28138c) {
            C14812p c14812p = (C14812p) this.f28175h.remove();
            this.f28186s = c14812p.f28136a;
            this.f28188u = c14812p.f28138c;
            this.f28187t = c14812p.f28137b - this.f28151M;
        }
        if (this.f28186s.f29479a == 1.0f) {
            j2 = (j + this.f28187t) - this.f28188u;
        } else {
            if (this.f28175h.isEmpty()) {
                C14820x c14820x = this.f28167b;
                long j4 = c14820x.f28245k;
                if (j4 >= 1024) {
                    j2 = this.f28187t + AbstractC15133z.m77162a(j - this.f28188u, c14820x.f28244j, j4);
                }
            }
            j2 = ((long) (this.f28186s.f29479a * (j - this.f28188u))) + this.f28187t;
        }
        return j3 + j2;
    }
}
