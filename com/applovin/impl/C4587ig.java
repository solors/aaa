package com.applovin.impl;

/* renamed from: com.applovin.impl.ig */
/* loaded from: classes2.dex */
final class C4587ig {

    /* renamed from: a */
    public int f6893a;

    /* renamed from: b */
    public int f6894b;

    /* renamed from: c */
    public long f6895c;

    /* renamed from: d */
    public long f6896d;

    /* renamed from: e */
    public long f6897e;

    /* renamed from: f */
    public long f6898f;

    /* renamed from: g */
    public int f6899g;

    /* renamed from: h */
    public int f6900h;

    /* renamed from: i */
    public int f6901i;

    /* renamed from: j */
    public final int[] f6902j = new int[255];

    /* renamed from: k */
    private final C4066ah f6903k = new C4066ah(255);

    /* renamed from: a */
    public boolean m98427a(InterfaceC4703k8 interfaceC4703k8, boolean z) {
        m98430a();
        this.f6903k.m100784d(27);
        if (AbstractC4823m8.m97561a(interfaceC4703k8, this.f6903k.m100787c(), 0, 27, z) && this.f6903k.m100760y() == 1332176723) {
            int m100762w = this.f6903k.m100762w();
            this.f6893a = m100762w;
            if (m100762w != 0) {
                if (z) {
                    return false;
                }
                throw C4187ch.m100189a("unsupported bit stream revision");
            }
            this.f6894b = this.f6903k.m100762w();
            this.f6895c = this.f6903k.m100771n();
            this.f6896d = this.f6903k.m100769p();
            this.f6897e = this.f6903k.m100769p();
            this.f6898f = this.f6903k.m100769p();
            int m100762w2 = this.f6903k.m100762w();
            this.f6899g = m100762w2;
            this.f6900h = m100762w2 + 27;
            this.f6903k.m100784d(m100762w2);
            if (AbstractC4823m8.m97561a(interfaceC4703k8, this.f6903k.m100787c(), 0, this.f6899g, z)) {
                for (int i = 0; i < this.f6899g; i++) {
                    this.f6902j[i] = this.f6903k.m100762w();
                    this.f6901i += this.f6902j[i];
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m98430a() {
        this.f6893a = 0;
        this.f6894b = 0;
        this.f6895c = 0L;
        this.f6896d = 0L;
        this.f6897e = 0L;
        this.f6898f = 0L;
        this.f6899g = 0;
        this.f6900h = 0;
        this.f6901i = 0;
    }

    /* renamed from: a */
    public boolean m98429a(InterfaceC4703k8 interfaceC4703k8) {
        return m98428a(interfaceC4703k8, -1L);
    }

    /* renamed from: a */
    public boolean m98428a(InterfaceC4703k8 interfaceC4703k8, long j) {
        int i;
        AbstractC4100b1.m100580a(interfaceC4703k8.mo97999f() == interfaceC4703k8.mo98001d());
        this.f6903k.m100784d(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || interfaceC4703k8.mo97999f() + 4 < j) && AbstractC4823m8.m97561a(interfaceC4703k8, this.f6903k.m100787c(), 0, 4, true)) {
                this.f6903k.m100780f(0);
                if (this.f6903k.m100760y() == 1332176723) {
                    interfaceC4703k8.mo98007b();
                    return true;
                }
                interfaceC4703k8.mo98010a(1);
            }
        }
        do {
            if (i != 0 && interfaceC4703k8.mo97999f() >= j) {
                break;
            }
        } while (interfaceC4703k8.mo98006b(1) != -1);
        return false;
    }
}
