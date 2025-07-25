package com.applovin.impl;

/* renamed from: com.applovin.impl.bp */
/* loaded from: classes2.dex */
final class C4143bp {

    /* renamed from: a */
    private final int f5118a;

    /* renamed from: d */
    private boolean f5121d;

    /* renamed from: e */
    private boolean f5122e;

    /* renamed from: f */
    private boolean f5123f;

    /* renamed from: b */
    private final C4537ho f5119b = new C4537ho(0);

    /* renamed from: g */
    private long f5124g = -9223372036854775807L;

    /* renamed from: h */
    private long f5125h = -9223372036854775807L;

    /* renamed from: i */
    private long f5126i = -9223372036854775807L;

    /* renamed from: c */
    private final C4066ah f5120c = new C4066ah();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4143bp(int i) {
        this.f5118a = i;
    }

    /* renamed from: a */
    private int m100327a(InterfaceC4703k8 interfaceC4703k8) {
        this.f5120c.m100792a(AbstractC5863xp.f12156f);
        this.f5121d = true;
        interfaceC4703k8.mo98007b();
        return 0;
    }

    /* renamed from: b */
    public C4537ho m100325b() {
        return this.f5119b;
    }

    /* renamed from: c */
    public boolean m100322c() {
        return this.f5121d;
    }

    /* renamed from: b */
    private int m100323b(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th, int i) {
        int min = (int) Math.min(this.f5118a, interfaceC4703k8.mo98011a());
        long j = 0;
        if (interfaceC4703k8.mo97999f() != j) {
            c5563th.f10897a = j;
            return 1;
        }
        this.f5120c.m100784d(min);
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98002c(this.f5120c.m100787c(), 0, min);
        this.f5124g = m100328a(this.f5120c, i);
        this.f5122e = true;
        return 0;
    }

    /* renamed from: c */
    private int m100321c(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th, int i) {
        long mo98011a = interfaceC4703k8.mo98011a();
        int min = (int) Math.min(this.f5118a, mo98011a);
        long j = mo98011a - min;
        if (interfaceC4703k8.mo97999f() != j) {
            c5563th.f10897a = j;
            return 1;
        }
        this.f5120c.m100784d(min);
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98002c(this.f5120c.m100787c(), 0, min);
        this.f5125h = m100324b(this.f5120c, i);
        this.f5123f = true;
        return 0;
    }

    /* renamed from: a */
    public long m100329a() {
        return this.f5126i;
    }

    /* renamed from: a */
    public int m100326a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th, int i) {
        if (i <= 0) {
            return m100327a(interfaceC4703k8);
        }
        if (!this.f5123f) {
            return m100321c(interfaceC4703k8, c5563th, i);
        }
        if (this.f5125h == -9223372036854775807L) {
            return m100327a(interfaceC4703k8);
        }
        if (!this.f5122e) {
            return m100323b(interfaceC4703k8, c5563th, i);
        }
        long j = this.f5124g;
        if (j == -9223372036854775807L) {
            return m100327a(interfaceC4703k8);
        }
        long m98645b = this.f5119b.m98645b(this.f5125h) - this.f5119b.m98645b(j);
        this.f5126i = m98645b;
        if (m98645b < 0) {
            AbstractC5063oc.m96800d("TsDurationReader", "Invalid duration: " + this.f5126i + ". Using TIME_UNSET instead.");
            this.f5126i = -9223372036854775807L;
        }
        return m100327a(interfaceC4703k8);
    }

    /* renamed from: b */
    private long m100324b(C4066ah c4066ah, int i) {
        int m100785d = c4066ah.m100785d();
        int m100783e = c4066ah.m100783e();
        for (int i2 = m100783e - 188; i2 >= m100785d; i2--) {
            if (AbstractC4343ep.m99464a(c4066ah.m100787c(), m100785d, m100783e, i2)) {
                long m99467a = AbstractC4343ep.m99467a(c4066ah, i2, i);
                if (m99467a != -9223372036854775807L) {
                    return m99467a;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private long m100328a(C4066ah c4066ah, int i) {
        int m100783e = c4066ah.m100783e();
        for (int m100785d = c4066ah.m100785d(); m100785d < m100783e; m100785d++) {
            if (c4066ah.m100787c()[m100785d] == 71) {
                long m99467a = AbstractC4343ep.m99467a(c4066ah, m100785d, i);
                if (m99467a != -9223372036854775807L) {
                    return m99467a;
                }
            }
        }
        return -9223372036854775807L;
    }
}
