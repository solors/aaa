package com.applovin.impl;

/* renamed from: com.applovin.impl.hi */
/* loaded from: classes2.dex */
final class C4528hi {

    /* renamed from: c */
    private boolean f6647c;

    /* renamed from: d */
    private boolean f6648d;

    /* renamed from: e */
    private boolean f6649e;

    /* renamed from: a */
    private final C4537ho f6645a = new C4537ho(0);

    /* renamed from: f */
    private long f6650f = -9223372036854775807L;

    /* renamed from: g */
    private long f6651g = -9223372036854775807L;

    /* renamed from: h */
    private long f6652h = -9223372036854775807L;

    /* renamed from: b */
    private final C4066ah f6646b = new C4066ah();

    /* renamed from: a */
    private static boolean m98678a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* renamed from: b */
    public C4537ho m98676b() {
        return this.f6645a;
    }

    /* renamed from: c */
    public boolean m98672c() {
        return this.f6647c;
    }

    /* renamed from: b */
    private int m98674b(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        int min = (int) Math.min(20000L, interfaceC4703k8.mo98011a());
        long j = 0;
        if (interfaceC4703k8.mo97999f() != j) {
            c5563th.f10897a = j;
            return 1;
        }
        this.f6646b.m100784d(min);
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98002c(this.f6646b.m100787c(), 0, min);
        this.f6650f = m98681a(this.f6646b);
        this.f6648d = true;
        return 0;
    }

    /* renamed from: c */
    private int m98670c(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        long mo98011a = interfaceC4703k8.mo98011a();
        int min = (int) Math.min(20000L, mo98011a);
        long j = mo98011a - min;
        if (interfaceC4703k8.mo97999f() != j) {
            c5563th.f10897a = j;
            return 1;
        }
        this.f6646b.m100784d(min);
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98002c(this.f6646b.m100787c(), 0, min);
        this.f6651g = m98675b(this.f6646b);
        this.f6649e = true;
        return 0;
    }

    /* renamed from: a */
    private int m98680a(InterfaceC4703k8 interfaceC4703k8) {
        this.f6646b.m100792a(AbstractC5863xp.f12156f);
        this.f6647c = true;
        interfaceC4703k8.mo98007b();
        return 0;
    }

    /* renamed from: a */
    public long m98682a() {
        return this.f6652h;
    }

    /* renamed from: a */
    private int m98677a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: b */
    private long m98675b(C4066ah c4066ah) {
        int m100785d = c4066ah.m100785d();
        for (int m100783e = c4066ah.m100783e() - 4; m100783e >= m100785d; m100783e--) {
            if (m98677a(c4066ah.m100787c(), m100783e) == 442) {
                c4066ah.m100780f(m100783e + 4);
                long m98671c = m98671c(c4066ah);
                if (m98671c != -9223372036854775807L) {
                    return m98671c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public static long m98671c(C4066ah c4066ah) {
        int m100785d = c4066ah.m100785d();
        if (c4066ah.m100797a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c4066ah.m100790a(bArr, 0, 9);
        c4066ah.m100780f(m100785d);
        if (m98678a(bArr)) {
            return m98673b(bArr);
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public int m98679a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        if (!this.f6649e) {
            return m98670c(interfaceC4703k8, c5563th);
        }
        if (this.f6651g == -9223372036854775807L) {
            return m98680a(interfaceC4703k8);
        }
        if (!this.f6648d) {
            return m98674b(interfaceC4703k8, c5563th);
        }
        long j = this.f6650f;
        if (j == -9223372036854775807L) {
            return m98680a(interfaceC4703k8);
        }
        long m98645b = this.f6645a.m98645b(this.f6651g) - this.f6645a.m98645b(j);
        this.f6652h = m98645b;
        if (m98645b < 0) {
            AbstractC5063oc.m96800d("PsDurationReader", "Invalid duration: " + this.f6652h + ". Using TIME_UNSET instead.");
            this.f6652h = -9223372036854775807L;
        }
        return m98680a(interfaceC4703k8);
    }

    /* renamed from: b */
    private static long m98673b(byte[] bArr) {
        long j = bArr[0];
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: a */
    private long m98681a(C4066ah c4066ah) {
        int m100783e = c4066ah.m100783e();
        for (int m100785d = c4066ah.m100785d(); m100785d < m100783e - 3; m100785d++) {
            if (m98677a(c4066ah.m100787c(), m100785d) == 442) {
                c4066ah.m100780f(m100785d + 4);
                long m98671c = m98671c(c4066ah);
                if (m98671c != -9223372036854775807L) {
                    return m98671c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
