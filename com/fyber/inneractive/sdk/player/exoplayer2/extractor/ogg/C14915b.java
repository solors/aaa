package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14934q;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b */
/* loaded from: classes4.dex */
public final class C14915b implements InterfaceC14921h {

    /* renamed from: a */
    public final C14920g f28956a = new C14920g();

    /* renamed from: b */
    public final long f28957b;

    /* renamed from: c */
    public final long f28958c;

    /* renamed from: d */
    public final AbstractC14925l f28959d;

    /* renamed from: e */
    public int f28960e;

    /* renamed from: f */
    public long f28961f;

    /* renamed from: g */
    public long f28962g;

    /* renamed from: h */
    public long f28963h;

    /* renamed from: i */
    public long f28964i;

    /* renamed from: j */
    public long f28965j;

    /* renamed from: k */
    public long f28966k;

    /* renamed from: l */
    public long f28967l;

    public C14915b(long j, long j2, AbstractC14925l abstractC14925l, int i, long j3) {
        if (j >= 0 && j2 > j) {
            this.f28959d = abstractC14925l;
            this.f28957b = j;
            this.f28958c = j2;
            if (i == j2 - j) {
                this.f28961f = j3;
                this.f28960e = 3;
                return;
            }
            this.f28960e = 0;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC14921h
    /* renamed from: a */
    public final long mo77434a(C14833b c14833b) {
        C14920g c14920g;
        long j;
        int i;
        int i2 = this.f28960e;
        long j2 = 0;
        if (i2 == 0) {
            long j3 = c14833b.f28285c;
            this.f28962g = j3;
            this.f28960e = 1;
            long j4 = this.f28958c - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j5 = this.f28963h;
            if (j5 == 0) {
                i = 3;
            } else {
                long j6 = this.f28964i;
                long j7 = this.f28965j;
                if (j6 == j7) {
                    j = -(this.f28966k + 2);
                } else {
                    long j8 = c14833b.f28285c;
                    if (!m77438a(c14833b, j7)) {
                        j = this.f28964i;
                        if (j == j8) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        this.f28956a.m77435a(c14833b, false);
                        c14833b.f28287e = 0;
                        C14920g c14920g2 = this.f28956a;
                        long j9 = c14920g2.f28983b;
                        long j10 = j5 - j9;
                        int i3 = c14920g2.f28985d + c14920g2.f28986e;
                        int i4 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i4 >= 0 && j10 <= 72000) {
                            c14833b.m77524a(i3);
                            j = -(this.f28956a.f28983b + 2);
                        } else {
                            if (i4 < 0) {
                                this.f28965j = j8;
                                this.f28967l = j9;
                            } else {
                                long j11 = i3;
                                long j12 = c14833b.f28285c + j11;
                                this.f28964i = j12;
                                this.f28966k = j9;
                                if ((this.f28965j - j12) + j11 < 100000) {
                                    c14833b.m77524a(i3);
                                    j = -(this.f28966k + 2);
                                    j2 = 0;
                                }
                            }
                            long j13 = this.f28965j;
                            long j14 = this.f28964i;
                            long j15 = j13 - j14;
                            if (j15 < 100000) {
                                this.f28965j = j14;
                                j = j14;
                            } else {
                                j = Math.min(Math.max(((j15 * j10) / (this.f28967l - this.f28966k)) + (c14833b.f28285c - (i3 * (i4 <= 0 ? 2 : 1))), j14), this.f28965j - 1);
                            }
                            j2 = 0;
                        }
                    }
                }
                if (j >= j2) {
                    return j;
                }
                long j16 = this.f28963h;
                long j17 = -(j + 2);
                this.f28956a.m77435a(c14833b, false);
                while (true) {
                    C14920g c14920g3 = this.f28956a;
                    if (c14920g3.f28983b >= j16) {
                        break;
                    }
                    c14833b.m77524a(c14920g3.f28985d + c14920g3.f28986e);
                    C14920g c14920g4 = this.f28956a;
                    long j18 = c14920g4.f28983b;
                    c14920g4.m77435a(c14833b, false);
                    j17 = j18;
                }
                c14833b.f28287e = 0;
                j2 = j17;
                i = 3;
            }
            this.f28960e = i;
            return -(j2 + 2);
        }
        if (m77438a(c14833b, this.f28958c)) {
            C14920g c14920g5 = this.f28956a;
            c14920g5.f28982a = 0;
            c14920g5.f28983b = 0L;
            c14920g5.f28984c = 0;
            c14920g5.f28985d = 0;
            c14920g5.f28986e = 0;
            while (true) {
                c14920g = this.f28956a;
                if ((c14920g.f28982a & 4) == 4 || c14833b.f28285c >= this.f28958c) {
                    break;
                }
                c14920g.m77435a(c14833b, false);
                C14920g c14920g6 = this.f28956a;
                c14833b.m77524a(c14920g6.f28985d + c14920g6.f28986e);
            }
            this.f28961f = c14920g.f28983b;
            this.f28960e = 3;
            return this.f28962g;
        }
        throw new EOFException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC14921h
    /* renamed from: b */
    public final InterfaceC14934q mo77433b() {
        if (this.f28961f != 0) {
            return new C14914a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC14921h
    /* renamed from: c */
    public final long mo77432c(long j) {
        long j2;
        int i = this.f28960e;
        if (i != 3 && i != 2) {
            throw new IllegalArgumentException();
        }
        if (j == 0) {
            j2 = 0;
        } else {
            j2 = (this.f28959d.f29002i * j) / 1000000;
        }
        this.f28963h = j2;
        this.f28960e = 2;
        this.f28964i = this.f28957b;
        this.f28965j = this.f28958c;
        this.f28966k = 0L;
        this.f28967l = this.f28961f;
        return j2;
    }

    /* renamed from: a */
    public final boolean m77438a(C14833b c14833b, long j) {
        int i;
        long min = Math.min(j + 3, this.f28958c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j2 = c14833b.f28285c;
            int i3 = 0;
            if (i2 + j2 > min && (i2 = (int) (min - j2)) < 4) {
                return false;
            }
            c14833b.m77521a(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        c14833b.m77524a(i3);
                        return true;
                    }
                    i3++;
                }
            }
            c14833b.m77524a(i);
        }
    }
}
