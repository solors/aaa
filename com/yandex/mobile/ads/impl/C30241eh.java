package com.yandex.mobile.ads.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.lang.reflect.Method;

/* renamed from: com.yandex.mobile.ads.impl.eh */
/* loaded from: classes8.dex */
final class C30241eh {

    /* renamed from: A */
    private long f78569A;

    /* renamed from: B */
    private long f78570B;

    /* renamed from: C */
    private long f78571C;

    /* renamed from: D */
    private boolean f78572D;

    /* renamed from: E */
    private long f78573E;

    /* renamed from: F */
    private long f78574F;

    /* renamed from: a */
    private final InterfaceC30242a f78575a;

    /* renamed from: b */
    private final long[] f78576b;
    @Nullable

    /* renamed from: c */
    private AudioTrack f78577c;

    /* renamed from: d */
    private int f78578d;

    /* renamed from: e */
    private int f78579e;
    @Nullable

    /* renamed from: f */
    private C30166dh f78580f;

    /* renamed from: g */
    private int f78581g;

    /* renamed from: h */
    private boolean f78582h;

    /* renamed from: i */
    private long f78583i;

    /* renamed from: j */
    private float f78584j;

    /* renamed from: k */
    private boolean f78585k;

    /* renamed from: l */
    private long f78586l;

    /* renamed from: m */
    private long f78587m;
    @Nullable

    /* renamed from: n */
    private Method f78588n;

    /* renamed from: o */
    private long f78589o;

    /* renamed from: p */
    private boolean f78590p;

    /* renamed from: q */
    private boolean f78591q;

    /* renamed from: r */
    private long f78592r;

    /* renamed from: s */
    private long f78593s;

    /* renamed from: t */
    private long f78594t;

    /* renamed from: u */
    private long f78595u;

    /* renamed from: v */
    private int f78596v;

    /* renamed from: w */
    private int f78597w;

    /* renamed from: x */
    private long f78598x;

    /* renamed from: y */
    private long f78599y;

    /* renamed from: z */
    private long f78600z;

    /* renamed from: com.yandex.mobile.ads.impl.eh$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30242a {
        /* renamed from: a */
        void mo28135a(int i, long j);

        /* renamed from: a */
        void mo28134a(long j);

        /* renamed from: a */
        void mo28133a(long j, long j2, long j3, long j4);

        /* renamed from: b */
        void mo28132b(long j);

        /* renamed from: b */
        void mo28131b(long j, long j2, long j3, long j4);
    }

    public C30241eh(InterfaceC30242a interfaceC30242a) {
        this.f78575a = (InterfaceC30242a) C30937nf.m31570a(interfaceC30242a);
        if (y32.f88010a >= 18) {
            try {
                this.f78588n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f78576b = new long[10];
    }

    /* renamed from: a */
    private long m34586a(long j) {
        return (j * 1000000) / this.f78581g;
    }

    /* renamed from: b */
    public final int m34582b(long j) {
        return this.f78579e - ((int) (j - (m34588a() * this.f78578d)));
    }

    /* renamed from: c */
    public final void m34580c(long j) {
        this.f78600z = m34588a();
        this.f78598x = SystemClock.elapsedRealtime() * 1000;
        this.f78569A = j;
    }

    /* renamed from: d */
    public final boolean m34578d(long j) {
        if (j <= m34588a()) {
            if (this.f78582h) {
                AudioTrack audioTrack = this.f78577c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || m34588a() != 0) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m34576e(long j) {
        return this.f78599y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f78599y >= 200;
    }

    /* renamed from: f */
    public final boolean m34575f(long j) {
        AudioTrack audioTrack = this.f78577c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f78582h) {
            if (playState == 2) {
                this.f78590p = false;
                return false;
            } else if (playState == 1 && m34588a() == 0) {
                return false;
            }
        }
        boolean z = this.f78590p;
        boolean m34578d = m34578d(j);
        this.f78590p = m34578d;
        if (z && !m34578d && playState != 1) {
            this.f78575a.mo28135a(this.f78579e, y32.m27061b(this.f78583i));
        }
        return true;
    }

    /* renamed from: a */
    public final long m34584a(boolean z) {
        long j;
        int i;
        Method method;
        AudioTrack audioTrack = this.f78577c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long m34586a = m34586a(m34588a());
            if (m34586a != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f78587m >= 30000) {
                    long[] jArr = this.f78576b;
                    int i2 = this.f78596v;
                    jArr[i2] = m34586a - nanoTime;
                    this.f78596v = (i2 + 1) % 10;
                    int i3 = this.f78597w;
                    if (i3 < 10) {
                        this.f78597w = i3 + 1;
                    }
                    this.f78587m = nanoTime;
                    this.f78586l = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.f78597w;
                        if (i4 >= i5) {
                            break;
                        }
                        this.f78586l = (this.f78576b[i4] / i5) + this.f78586l;
                        i4++;
                    }
                }
                if (!this.f78582h) {
                    C30166dh c30166dh = this.f78580f;
                    c30166dh.getClass();
                    if (c30166dh.m34943a(nanoTime)) {
                        long m34941c = c30166dh.m34941c();
                        long m34942b = c30166dh.m34942b();
                        if (Math.abs(m34941c - nanoTime) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            i = 0;
                            this.f78575a.mo28131b(m34942b, m34941c, nanoTime, m34586a);
                            c30166dh.m34939e();
                        } else {
                            i = 0;
                            if (Math.abs(m34586a(m34942b) - m34586a) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                this.f78575a.mo28133a(m34942b, m34941c, nanoTime, m34586a);
                                c30166dh.m34939e();
                            } else {
                                c30166dh.m34945a();
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (this.f78591q && (method = this.f78588n) != null && nanoTime - this.f78592r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f78577c;
                            audioTrack2.getClass();
                            int i6 = y32.f88010a;
                            long intValue = (((Integer) method.invoke(audioTrack2, new Object[i])).intValue() * 1000) - this.f78583i;
                            this.f78589o = intValue;
                            long max = Math.max(intValue, 0L);
                            this.f78589o = max;
                            if (max > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                this.f78575a.mo28132b(max);
                                this.f78589o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f78588n = null;
                        }
                        this.f78592r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        C30166dh c30166dh2 = this.f78580f;
        c30166dh2.getClass();
        boolean m34940d = c30166dh2.m34940d();
        if (m34940d) {
            long m34586a2 = m34586a(c30166dh2.m34942b());
            long m34941c2 = nanoTime2 - c30166dh2.m34941c();
            float f = this.f78584j;
            int i7 = y32.f88010a;
            if (f != 1.0f) {
                m34941c2 = Math.round(m34941c2 * f);
            }
            j = m34941c2 + m34586a2;
        } else {
            if (this.f78597w == 0) {
                j = m34586a(m34588a());
            } else {
                j = this.f78586l + nanoTime2;
            }
            if (!z) {
                j = Math.max(0L, j - this.f78589o);
            }
        }
        if (this.f78572D != m34940d) {
            this.f78574F = this.f78571C;
            this.f78573E = this.f78570B;
        }
        long j2 = nanoTime2 - this.f78574F;
        if (j2 < 1000000) {
            long j3 = this.f78573E;
            float f2 = this.f78584j;
            int i8 = y32.f88010a;
            long j4 = j;
            long round = f2 == 1.0f ? j2 : Math.round(j2 * f2);
            long j5 = (j2 * 1000) / 1000000;
            j = (((1000 - j5) * (round + j3)) + (j4 * j5)) / 1000;
        }
        if (!this.f78585k) {
            long j6 = this.f78570B;
            if (j > j6) {
                this.f78585k = true;
                long m27061b = y32.m27061b(j - j6);
                float f3 = this.f78584j;
                if (f3 != 1.0f) {
                    m27061b = Math.round(m27061b / f3);
                }
                this.f78575a.mo28134a(System.currentTimeMillis() - y32.m27061b(m27061b));
            }
        }
        this.f78571C = nanoTime2;
        this.f78570B = j;
        this.f78572D = m34940d;
        return j;
    }

    /* renamed from: b */
    public final boolean m34583b() {
        AudioTrack audioTrack = this.f78577c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: e */
    public final void m34577e() {
        C30166dh c30166dh = this.f78580f;
        c30166dh.getClass();
        c30166dh.m34938f();
    }

    /* renamed from: c */
    public final boolean m34581c() {
        this.f78586l = 0L;
        this.f78597w = 0;
        this.f78596v = 0;
        this.f78587m = 0L;
        this.f78571C = 0L;
        this.f78574F = 0L;
        this.f78585k = false;
        if (this.f78598x == -9223372036854775807L) {
            C30166dh c30166dh = this.f78580f;
            c30166dh.getClass();
            c30166dh.m34938f();
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m34579d() {
        this.f78586l = 0L;
        this.f78597w = 0;
        this.f78596v = 0;
        this.f78587m = 0L;
        this.f78571C = 0L;
        this.f78574F = 0L;
        this.f78585k = false;
        this.f78577c = null;
        this.f78580f = null;
    }

    /* renamed from: a */
    private long m34588a() {
        AudioTrack audioTrack = this.f78577c;
        audioTrack.getClass();
        if (this.f78598x != -9223372036854775807L) {
            return Math.min(this.f78569A, this.f78600z + ((((SystemClock.elapsedRealtime() * 1000) - this.f78598x) * this.f78581g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f78582h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f78595u = this.f78593s;
            }
            playbackHeadPosition += this.f78595u;
        }
        if (y32.f88010a <= 29) {
            if (playbackHeadPosition == 0 && this.f78593s > 0 && playState == 3) {
                if (this.f78599y == -9223372036854775807L) {
                    this.f78599y = SystemClock.elapsedRealtime();
                }
                return this.f78593s;
            }
            this.f78599y = -9223372036854775807L;
        }
        if (this.f78593s > playbackHeadPosition) {
            this.f78594t++;
        }
        this.f78593s = playbackHeadPosition;
        return playbackHeadPosition + (this.f78594t << 32);
    }

    /* renamed from: a */
    public final void m34585a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f78577c = audioTrack;
        this.f78578d = i2;
        this.f78579e = i3;
        this.f78580f = new C30166dh(audioTrack);
        this.f78581g = audioTrack.getSampleRate();
        this.f78582h = z && y32.f88010a < 23 && (i == 5 || i == 6);
        boolean m27047e = y32.m27047e(i);
        this.f78591q = m27047e;
        this.f78583i = m27047e ? m34586a(i3 / i2) : -9223372036854775807L;
        this.f78593s = 0L;
        this.f78594t = 0L;
        this.f78595u = 0L;
        this.f78590p = false;
        this.f78598x = -9223372036854775807L;
        this.f78599y = -9223372036854775807L;
        this.f78592r = 0L;
        this.f78589o = 0L;
        this.f78584j = 1.0f;
    }

    /* renamed from: a */
    public final void m34587a(float f) {
        this.f78584j = f;
        C30166dh c30166dh = this.f78580f;
        if (c30166dh != null) {
            c30166dh.m34938f();
        }
    }
}
