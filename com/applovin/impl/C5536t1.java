package com.applovin.impl;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.applovin.impl.t1 */
/* loaded from: classes2.dex */
final class C5536t1 {

    /* renamed from: a */
    private final C5537a f10786a;

    /* renamed from: b */
    private int f10787b;

    /* renamed from: c */
    private long f10788c;

    /* renamed from: d */
    private long f10789d;

    /* renamed from: e */
    private long f10790e;

    /* renamed from: f */
    private long f10791f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.t1$a */
    /* loaded from: classes2.dex */
    public static final class C5537a {

        /* renamed from: a */
        private final AudioTrack f10792a;

        /* renamed from: b */
        private final AudioTimestamp f10793b = new AudioTimestamp();

        /* renamed from: c */
        private long f10794c;

        /* renamed from: d */
        private long f10795d;

        /* renamed from: e */
        private long f10796e;

        public C5537a(AudioTrack audioTrack) {
            this.f10792a = audioTrack;
        }

        /* renamed from: a */
        public long m94559a() {
            return this.f10796e;
        }

        /* renamed from: b */
        public long m94558b() {
            return this.f10793b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean m94557c() {
            boolean timestamp = this.f10792a.getTimestamp(this.f10793b);
            if (timestamp) {
                long j = this.f10793b.framePosition;
                if (this.f10795d > j) {
                    this.f10794c++;
                }
                this.f10795d = j;
                this.f10796e = j + (this.f10794c << 32);
            }
            return timestamp;
        }
    }

    public C5536t1(AudioTrack audioTrack) {
        if (AbstractC5863xp.f12151a >= 19) {
            this.f10786a = new C5537a(audioTrack);
            m94560f();
            return;
        }
        this.f10786a = null;
        m94566a(3);
    }

    /* renamed from: a */
    public void m94567a() {
        if (this.f10787b == 4) {
            m94560f();
        }
    }

    /* renamed from: b */
    public long m94564b() {
        C5537a c5537a = this.f10786a;
        if (c5537a != null) {
            return c5537a.m94559a();
        }
        return -1L;
    }

    /* renamed from: c */
    public long m94563c() {
        C5537a c5537a = this.f10786a;
        if (c5537a != null) {
            return c5537a.m94558b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean m94562d() {
        if (this.f10787b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m94561e() {
        m94566a(4);
    }

    /* renamed from: f */
    public void m94560f() {
        if (this.f10786a != null) {
            m94566a(0);
        }
    }

    /* renamed from: a */
    public boolean m94565a(long j) {
        C5537a c5537a = this.f10786a;
        if (c5537a == null || j - this.f10790e < this.f10789d) {
            return false;
        }
        this.f10790e = j;
        boolean m94557c = c5537a.m94557c();
        int i = this.f10787b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (m94557c) {
                        m94560f();
                    }
                } else if (!m94557c) {
                    m94560f();
                }
            } else if (m94557c) {
                if (this.f10786a.m94559a() > this.f10791f) {
                    m94566a(2);
                }
            } else {
                m94560f();
            }
        } else if (m94557c) {
            if (this.f10786a.m94558b() < this.f10788c) {
                return false;
            }
            this.f10791f = this.f10786a.m94559a();
            m94566a(1);
        } else if (j - this.f10788c > 500000) {
            m94566a(3);
        }
        return m94557c;
    }

    /* renamed from: a */
    private void m94566a(int i) {
        this.f10787b = i;
        if (i == 0) {
            this.f10790e = 0L;
            this.f10791f = -1L;
            this.f10788c = System.nanoTime() / 1000;
            this.f10789d = 10000L;
        } else if (i == 1) {
            this.f10789d = 10000L;
        } else if (i == 2 || i == 3) {
            this.f10789d = 10000000L;
        } else if (i == 4) {
            this.f10789d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }
}
