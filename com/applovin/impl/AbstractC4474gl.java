package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.gl */
/* loaded from: classes2.dex */
public abstract class AbstractC4474gl {

    /* renamed from: b */
    private InterfaceC5209qo f6429b;

    /* renamed from: c */
    private InterfaceC4760l8 f6430c;

    /* renamed from: d */
    private InterfaceC4652jg f6431d;

    /* renamed from: e */
    private long f6432e;

    /* renamed from: f */
    private long f6433f;

    /* renamed from: g */
    private long f6434g;

    /* renamed from: h */
    private int f6435h;

    /* renamed from: i */
    private int f6436i;

    /* renamed from: k */
    private long f6438k;

    /* renamed from: l */
    private boolean f6439l;

    /* renamed from: m */
    private boolean f6440m;

    /* renamed from: a */
    private final C4526hg f6428a = new C4526hg();

    /* renamed from: j */
    private C4476b f6437j = new C4476b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.gl$b */
    /* loaded from: classes2.dex */
    public static class C4476b {

        /* renamed from: a */
        C4310e9 f6441a;

        /* renamed from: b */
        InterfaceC4652jg f6442b;

        C4476b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.gl$c */
    /* loaded from: classes2.dex */
    public static final class C4477c implements InterfaceC4652jg {
        private C4477c() {
        }

        @Override // com.applovin.impl.InterfaceC4652jg
        /* renamed from: a */
        public long mo93206a(InterfaceC4703k8 interfaceC4703k8) {
            return -1L;
        }

        @Override // com.applovin.impl.InterfaceC4652jg
        /* renamed from: a */
        public void mo93207a(long j) {
        }

        @Override // com.applovin.impl.InterfaceC4652jg
        /* renamed from: a */
        public InterfaceC4591ij mo93208a() {
            return new InterfaceC4591ij.C4593b(-9223372036854775807L);
        }
    }

    /* renamed from: a */
    private void m98927a() {
        AbstractC4100b1.m100578b(this.f6429b);
        AbstractC5863xp.m93017a(this.f6430c);
    }

    /* renamed from: a */
    protected abstract long mo93214a(C4066ah c4066ah);

    /* renamed from: a */
    protected abstract boolean mo93213a(C4066ah c4066ah, long j, C4476b c4476b);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public long m98921b(long j) {
        return (this.f6436i * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo98918c(long j) {
        this.f6434g = j;
    }

    /* renamed from: b */
    private int m98920b(InterfaceC4703k8 interfaceC4703k8) {
        if (m98924a(interfaceC4703k8)) {
            C4310e9 c4310e9 = this.f6437j.f6441a;
            this.f6436i = c4310e9.f5795A;
            if (!this.f6440m) {
                this.f6429b.mo96251a(c4310e9);
                this.f6440m = true;
            }
            InterfaceC4652jg interfaceC4652jg = this.f6437j.f6442b;
            if (interfaceC4652jg != null) {
                this.f6431d = interfaceC4652jg;
            } else if (interfaceC4703k8.mo98011a() == -1) {
                this.f6431d = new C4477c();
            } else {
                C4587ig m98688a = this.f6428a.m98688a();
                this.f6431d = new C4568i6(this, this.f6433f, interfaceC4703k8.mo98011a(), m98688a.f6900h + m98688a.f6901i, m98688a.f6895c, (m98688a.f6894b & 4) != 0);
            }
            this.f6435h = 2;
            this.f6428a.m98683d();
            return 0;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public long m98926a(long j) {
        return (j * 1000000) / this.f6436i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m98922a(InterfaceC4760l8 interfaceC4760l8, InterfaceC5209qo interfaceC5209qo) {
        this.f6430c = interfaceC4760l8;
        this.f6429b = interfaceC5209qo;
        mo93212a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m98923a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        m98927a();
        int i = this.f6435h;
        if (i != 0) {
            if (i == 1) {
                interfaceC4703k8.mo98010a((int) this.f6433f);
                this.f6435h = 2;
                return 0;
            } else if (i == 2) {
                AbstractC5863xp.m93017a(this.f6431d);
                return m98919b(interfaceC4703k8, c5563th);
            } else if (i == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        return m98920b(interfaceC4703k8);
    }

    /* renamed from: a */
    private boolean m98924a(InterfaceC4703k8 interfaceC4703k8) {
        while (this.f6428a.m98686a(interfaceC4703k8)) {
            this.f6438k = interfaceC4703k8.mo97999f() - this.f6433f;
            if (!mo93213a(this.f6428a.m98685b(), this.f6433f, this.f6437j)) {
                return true;
            }
            this.f6433f = interfaceC4703k8.mo97999f();
        }
        this.f6435h = 3;
        return false;
    }

    /* renamed from: b */
    private int m98919b(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        long mo93206a = this.f6431d.mo93206a(interfaceC4703k8);
        if (mo93206a >= 0) {
            c5563th.f10897a = mo93206a;
            return 1;
        }
        if (mo93206a < -1) {
            mo98918c(-(mo93206a + 2));
        }
        if (!this.f6439l) {
            this.f6430c.mo97781a((InterfaceC4591ij) AbstractC4100b1.m100578b(this.f6431d.mo93208a()));
            this.f6439l = true;
        }
        if (this.f6438k <= 0 && !this.f6428a.m98686a(interfaceC4703k8)) {
            this.f6435h = 3;
            return -1;
        }
        this.f6438k = 0L;
        C4066ah m98685b = this.f6428a.m98685b();
        long mo93214a = mo93214a(m98685b);
        if (mo93214a >= 0) {
            long j = this.f6434g;
            if (j + mo93214a >= this.f6432e) {
                long m98926a = m98926a(j);
                this.f6429b.m96253a(m98685b, m98685b.m100783e());
                this.f6429b.mo96254a(m98926a, 1, m98685b.m100783e(), 0, null);
                this.f6432e = -1L;
            }
        }
        this.f6434g += mo93214a;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo93212a(boolean z) {
        if (z) {
            this.f6437j = new C4476b();
            this.f6433f = 0L;
            this.f6435h = 0;
        } else {
            this.f6435h = 1;
        }
        this.f6432e = -1L;
        this.f6434g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m98925a(long j, long j2) {
        this.f6428a.m98684c();
        if (j == 0) {
            mo93212a(!this.f6439l);
        } else if (this.f6435h != 0) {
            this.f6432e = m98921b(j2);
            ((InterfaceC4652jg) AbstractC5863xp.m93017a(this.f6431d)).mo93207a(this.f6432e);
            this.f6435h = 2;
        }
    }
}
