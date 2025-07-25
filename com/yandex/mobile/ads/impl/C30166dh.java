package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: com.yandex.mobile.ads.impl.dh */
/* loaded from: classes8.dex */
final class C30166dh {
    @Nullable

    /* renamed from: a */
    private final C30167a f78130a;

    /* renamed from: b */
    private int f78131b;

    /* renamed from: c */
    private long f78132c;

    /* renamed from: d */
    private long f78133d;

    /* renamed from: e */
    private long f78134e;

    /* renamed from: f */
    private long f78135f;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(19)
    /* renamed from: com.yandex.mobile.ads.impl.dh$a */
    /* loaded from: classes8.dex */
    public static final class C30167a {

        /* renamed from: a */
        private final AudioTrack f78136a;

        /* renamed from: b */
        private final AudioTimestamp f78137b = new AudioTimestamp();

        /* renamed from: c */
        private long f78138c;

        /* renamed from: d */
        private long f78139d;

        /* renamed from: e */
        private long f78140e;

        public C30167a(AudioTrack audioTrack) {
            this.f78136a = audioTrack;
        }

        /* renamed from: b */
        public final boolean m34935b() {
            boolean timestamp = this.f78136a.getTimestamp(this.f78137b);
            if (timestamp) {
                long j = this.f78137b.framePosition;
                if (this.f78139d > j) {
                    this.f78138c++;
                }
                this.f78139d = j;
                this.f78140e = j + (this.f78138c << 32);
            }
            return timestamp;
        }

        /* renamed from: a */
        public final long m34937a() {
            return this.f78137b.nanoTime / 1000;
        }
    }

    public C30166dh(AudioTrack audioTrack) {
        if (y32.f88010a >= 19) {
            this.f78130a = new C30167a(audioTrack);
            m34938f();
            return;
        }
        this.f78130a = null;
        m34944a(3);
    }

    /* renamed from: a */
    public final void m34945a() {
        if (this.f78131b == 4) {
            m34938f();
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public final long m34942b() {
        C30167a c30167a = this.f78130a;
        if (c30167a != null) {
            return c30167a.f78140e;
        }
        return -1L;
    }

    @TargetApi(19)
    /* renamed from: c */
    public final long m34941c() {
        C30167a c30167a = this.f78130a;
        if (c30167a != null) {
            return c30167a.m34937a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public final boolean m34940d() {
        if (this.f78131b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m34939e() {
        m34944a(4);
    }

    /* renamed from: f */
    public final void m34938f() {
        if (this.f78130a != null) {
            m34944a(0);
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean m34943a(long j) {
        C30167a c30167a = this.f78130a;
        if (c30167a == null || j - this.f78134e < this.f78133d) {
            return false;
        }
        this.f78134e = j;
        boolean m34935b = c30167a.m34935b();
        int i = this.f78131b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (m34935b) {
                        m34938f();
                    }
                } else if (!m34935b) {
                    m34938f();
                }
            } else if (m34935b) {
                if (this.f78130a.f78140e > this.f78135f) {
                    m34944a(2);
                }
            } else {
                m34938f();
            }
        } else if (m34935b) {
            if (this.f78130a.m34937a() < this.f78132c) {
                return false;
            }
            this.f78135f = this.f78130a.f78140e;
            m34944a(1);
        } else if (j - this.f78132c > 500000) {
            m34944a(3);
        }
        return m34935b;
    }

    /* renamed from: a */
    private void m34944a(int i) {
        this.f78131b = i;
        if (i == 0) {
            this.f78134e = 0L;
            this.f78135f = -1L;
            this.f78132c = System.nanoTime() / 1000;
            this.f78133d = 10000L;
        } else if (i == 1) {
            this.f78133d = 10000L;
        } else if (i == 2 || i == 3) {
            this.f78133d = 10000000L;
        } else if (i == 4) {
            this.f78133d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }
}
