package com.applovin.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.lang.reflect.Method;

/* renamed from: com.applovin.impl.u1 */
/* loaded from: classes2.dex */
final class C5594u1 {

    /* renamed from: A */
    private long f10990A;

    /* renamed from: B */
    private long f10991B;

    /* renamed from: C */
    private long f10992C;

    /* renamed from: D */
    private boolean f10993D;

    /* renamed from: E */
    private long f10994E;

    /* renamed from: F */
    private long f10995F;

    /* renamed from: a */
    private final InterfaceC5595a f10996a;

    /* renamed from: b */
    private final long[] f10997b;

    /* renamed from: c */
    private AudioTrack f10998c;

    /* renamed from: d */
    private int f10999d;

    /* renamed from: e */
    private int f11000e;

    /* renamed from: f */
    private C5536t1 f11001f;

    /* renamed from: g */
    private int f11002g;

    /* renamed from: h */
    private boolean f11003h;

    /* renamed from: i */
    private long f11004i;

    /* renamed from: j */
    private float f11005j;

    /* renamed from: k */
    private boolean f11006k;

    /* renamed from: l */
    private long f11007l;

    /* renamed from: m */
    private long f11008m;

    /* renamed from: n */
    private Method f11009n;

    /* renamed from: o */
    private long f11010o;

    /* renamed from: p */
    private boolean f11011p;

    /* renamed from: q */
    private boolean f11012q;

    /* renamed from: r */
    private long f11013r;

    /* renamed from: s */
    private long f11014s;

    /* renamed from: t */
    private long f11015t;

    /* renamed from: u */
    private long f11016u;

    /* renamed from: v */
    private int f11017v;

    /* renamed from: w */
    private int f11018w;

    /* renamed from: x */
    private long f11019x;

    /* renamed from: y */
    private long f11020y;

    /* renamed from: z */
    private long f11021z;

    /* renamed from: com.applovin.impl.u1$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5595a {
        /* renamed from: a */
        void mo94302a(int i, long j);

        /* renamed from: a */
        void mo94301a(long j);

        /* renamed from: a */
        void mo94300a(long j, long j2, long j3, long j4);

        /* renamed from: b */
        void mo94299b(long j);

        /* renamed from: b */
        void mo94298b(long j, long j2, long j3, long j4);
    }

    public C5594u1(InterfaceC5595a interfaceC5595a) {
        this.f10996a = (InterfaceC5595a) AbstractC4100b1.m100583a(interfaceC5595a);
        if (AbstractC5863xp.f12151a >= 18) {
            try {
                this.f11009n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f10997b = new long[10];
    }

    /* renamed from: a */
    private boolean m94324a() {
        return this.f11003h && ((AudioTrack) AbstractC4100b1.m100583a(this.f10998c)).getPlayState() == 2 && m94317b() == 0;
    }

    /* renamed from: h */
    private void m94304h(long j) {
        Method method;
        if (!this.f11012q || (method = this.f11009n) == null || j - this.f11013r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) AbstractC5863xp.m93017a((Integer) method.invoke(AbstractC4100b1.m100583a(this.f10998c), new Object[0]))).intValue() * 1000) - this.f11004i;
            this.f11010o = intValue;
            long max = Math.max(intValue, 0L);
            this.f11010o = max;
            if (max > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f10996a.mo94299b(max);
                this.f11010o = 0L;
            }
        } catch (Exception unused) {
            this.f11009n = null;
        }
        this.f11013r = j;
    }

    /* renamed from: b */
    public int m94316b(long j) {
        return this.f11000e - ((int) (j - (m94317b() * this.f10999d)));
    }

    /* renamed from: c */
    public long m94314c(long j) {
        return AbstractC5538t2.m94552b(m94321a(j - m94317b()));
    }

    /* renamed from: d */
    public void m94312d(long j) {
        this.f11021z = m94317b();
        this.f11019x = SystemClock.elapsedRealtime() * 1000;
        this.f10990A = j;
    }

    /* renamed from: e */
    public boolean m94310e(long j) {
        return j > m94317b() || m94324a();
    }

    /* renamed from: f */
    public boolean m94308f(long j) {
        return this.f11020y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f11020y >= 200;
    }

    /* renamed from: g */
    public boolean m94306g(long j) {
        int playState = ((AudioTrack) AbstractC4100b1.m100583a(this.f10998c)).getPlayState();
        if (this.f11003h) {
            if (playState == 2) {
                this.f11011p = false;
                return false;
            } else if (playState == 1 && m94317b() == 0) {
                return false;
            }
        }
        boolean z = this.f11011p;
        boolean m94310e = m94310e(j);
        this.f11011p = m94310e;
        if (z && !m94310e && playState != 1) {
            this.f10996a.mo94302a(this.f11000e, AbstractC5538t2.m94552b(this.f11004i));
        }
        return true;
    }

    /* renamed from: i */
    public void m94303i() {
        ((C5536t1) AbstractC4100b1.m100583a(this.f11001f)).m94560f();
    }

    /* renamed from: c */
    private long m94315c() {
        return m94321a(m94317b());
    }

    /* renamed from: e */
    private void m94311e() {
        long m94315c = m94315c();
        if (m94315c == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f11008m >= 30000) {
            long[] jArr = this.f10997b;
            int i = this.f11017v;
            jArr[i] = m94315c - nanoTime;
            this.f11017v = (i + 1) % 10;
            int i2 = this.f11018w;
            if (i2 < 10) {
                this.f11018w = i2 + 1;
            }
            this.f11008m = nanoTime;
            this.f11007l = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.f11018w;
                if (i3 >= i4) {
                    break;
                }
                this.f11007l += this.f10997b[i3] / i4;
                i3++;
            }
        }
        if (this.f11003h) {
            return;
        }
        m94320a(nanoTime, m94315c);
        m94304h(nanoTime);
    }

    /* renamed from: b */
    private long m94317b() {
        AudioTrack audioTrack = (AudioTrack) AbstractC4100b1.m100583a(this.f10998c);
        if (this.f11019x != -9223372036854775807L) {
            return Math.min(this.f10990A, this.f11021z + ((((SystemClock.elapsedRealtime() * 1000) - this.f11019x) * this.f11002g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f11003h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f11016u = this.f11014s;
            }
            playbackHeadPosition += this.f11016u;
        }
        if (AbstractC5863xp.f12151a <= 29) {
            if (playbackHeadPosition == 0 && this.f11014s > 0 && playState == 3) {
                if (this.f11020y == -9223372036854775807L) {
                    this.f11020y = SystemClock.elapsedRealtime();
                }
                return this.f11014s;
            }
            this.f11020y = -9223372036854775807L;
        }
        if (this.f11014s > playbackHeadPosition) {
            this.f11015t++;
        }
        this.f11014s = playbackHeadPosition;
        return playbackHeadPosition + (this.f11015t << 32);
    }

    /* renamed from: f */
    public boolean m94309f() {
        m94305h();
        if (this.f11019x == -9223372036854775807L) {
            ((C5536t1) AbstractC4100b1.m100583a(this.f11001f)).m94560f();
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private long m94321a(long j) {
        return (j * 1000000) / this.f11002g;
    }

    /* renamed from: d */
    public boolean m94313d() {
        return ((AudioTrack) AbstractC4100b1.m100583a(this.f10998c)).getPlayState() == 3;
    }

    /* renamed from: a */
    public long m94318a(boolean z) {
        long j;
        if (((AudioTrack) AbstractC4100b1.m100583a(this.f10998c)).getPlayState() == 3) {
            m94311e();
        }
        long nanoTime = System.nanoTime() / 1000;
        C5536t1 c5536t1 = (C5536t1) AbstractC4100b1.m100583a(this.f11001f);
        boolean m94562d = c5536t1.m94562d();
        if (m94562d) {
            j = m94321a(c5536t1.m94564b()) + AbstractC5863xp.m93037a(nanoTime - c5536t1.m94563c(), this.f11005j);
        } else {
            if (this.f11018w == 0) {
                j = m94315c();
            } else {
                j = this.f11007l + nanoTime;
            }
            if (!z) {
                j = Math.max(0L, j - this.f11010o);
            }
        }
        if (this.f10993D != m94562d) {
            this.f10995F = this.f10992C;
            this.f10994E = this.f10991B;
        }
        long j2 = nanoTime - this.f10995F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f10994E + AbstractC5863xp.m93037a(j2, this.f11005j)))) / 1000;
        }
        if (!this.f11006k) {
            long j4 = this.f10991B;
            if (j > j4) {
                this.f11006k = true;
                this.f10996a.mo94301a(System.currentTimeMillis() - AbstractC5538t2.m94552b(AbstractC5863xp.m92991b(AbstractC5538t2.m94552b(j - j4), this.f11005j)));
            }
        }
        this.f10992C = nanoTime;
        this.f10991B = j;
        this.f10993D = m94562d;
        return j;
    }

    /* renamed from: g */
    public void m94307g() {
        m94305h();
        this.f10998c = null;
        this.f11001f = null;
    }

    /* renamed from: h */
    private void m94305h() {
        this.f11007l = 0L;
        this.f11018w = 0;
        this.f11017v = 0;
        this.f11008m = 0L;
        this.f10992C = 0L;
        this.f10995F = 0L;
        this.f11006k = false;
    }

    /* renamed from: a */
    private void m94320a(long j, long j2) {
        C5536t1 c5536t1 = (C5536t1) AbstractC4100b1.m100583a(this.f11001f);
        if (c5536t1.m94565a(j)) {
            long m94563c = c5536t1.m94563c();
            long m94564b = c5536t1.m94564b();
            if (Math.abs(m94563c - j) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f10996a.mo94298b(m94564b, m94563c, j, j2);
                c5536t1.m94561e();
            } else if (Math.abs(m94321a(m94564b) - j2) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f10996a.mo94300a(m94564b, m94563c, j, j2);
                c5536t1.m94561e();
            } else {
                c5536t1.m94567a();
            }
        }
    }

    /* renamed from: a */
    public void m94319a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f10998c = audioTrack;
        this.f10999d = i2;
        this.f11000e = i3;
        this.f11001f = new C5536t1(audioTrack);
        this.f11002g = audioTrack.getSampleRate();
        this.f11003h = z && m94322a(i);
        boolean m92959g = AbstractC5863xp.m92959g(i);
        this.f11012q = m92959g;
        this.f11004i = m92959g ? m94321a(i3 / i2) : -9223372036854775807L;
        this.f11014s = 0L;
        this.f11015t = 0L;
        this.f11016u = 0L;
        this.f11011p = false;
        this.f11019x = -9223372036854775807L;
        this.f11020y = -9223372036854775807L;
        this.f11013r = 0L;
        this.f11010o = 0L;
        this.f11005j = 1.0f;
    }

    /* renamed from: a */
    public void m94323a(float f) {
        this.f11005j = f;
        C5536t1 c5536t1 = this.f11001f;
        if (c5536t1 != null) {
            c5536t1.m94560f();
        }
    }

    /* renamed from: a */
    private static boolean m94322a(int i) {
        return AbstractC5863xp.f12151a < 23 && (i == 5 || i == 6);
    }
}
