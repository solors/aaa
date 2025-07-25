package com.applovin.impl;

import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.i2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4556i2 {

    /* renamed from: a */
    protected final C4557a f6750a;

    /* renamed from: b */
    protected final InterfaceC4562f f6751b;

    /* renamed from: c */
    protected C4559c f6752c;

    /* renamed from: d */
    private final int f6753d;

    /* renamed from: com.applovin.impl.i2$a */
    /* loaded from: classes2.dex */
    public static class C4557a implements InterfaceC4591ij {

        /* renamed from: a */
        private final InterfaceC4560d f6754a;

        /* renamed from: b */
        private final long f6755b;

        /* renamed from: c */
        private final long f6756c;

        /* renamed from: d */
        private final long f6757d;

        /* renamed from: e */
        private final long f6758e;

        /* renamed from: f */
        private final long f6759f;

        /* renamed from: g */
        private final long f6760g;

        public C4557a(InterfaceC4560d interfaceC4560d, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f6754a = interfaceC4560d;
            this.f6755b = j;
            this.f6756c = j2;
            this.f6757d = j3;
            this.f6758e = j4;
            this.f6759f = j5;
            this.f6760g = j6;
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: b */
        public boolean mo92788b() {
            return true;
        }

        /* renamed from: c */
        public long m98582c(long j) {
            return this.f6754a.mo98562a(j);
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: d */
        public long mo92786d() {
            return this.f6755b;
        }

        @Override // com.applovin.impl.InterfaceC4591ij
        /* renamed from: b */
        public InterfaceC4591ij.C4592a mo92787b(long j) {
            return new InterfaceC4591ij.C4592a(new C4719kj(j, C4559c.m98576a(this.f6754a.mo98562a(j), this.f6756c, this.f6757d, this.f6758e, this.f6759f, this.f6760g)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.applovin.impl.i2$c */
    /* loaded from: classes2.dex */
    public static class C4559c {

        /* renamed from: a */
        private final long f6761a;

        /* renamed from: b */
        private final long f6762b;

        /* renamed from: c */
        private final long f6763c;

        /* renamed from: d */
        private long f6764d;

        /* renamed from: e */
        private long f6765e;

        /* renamed from: f */
        private long f6766f;

        /* renamed from: g */
        private long f6767g;

        /* renamed from: h */
        private long f6768h;

        protected C4559c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f6761a = j;
            this.f6762b = j2;
            this.f6764d = j3;
            this.f6765e = j4;
            this.f6766f = j5;
            this.f6767g = j6;
            this.f6763c = j7;
            this.f6768h = m98576a(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: f */
        private void m98563f() {
            this.f6768h = m98576a(this.f6762b, this.f6764d, this.f6765e, this.f6766f, this.f6767g, this.f6763c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public long m98569c() {
            return this.f6768h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public long m98567d() {
            return this.f6761a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public long m98565e() {
            return this.f6762b;
        }

        /* renamed from: a */
        protected static long m98576a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            return AbstractC5863xp.m92990b(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public long m98573b() {
            return this.f6766f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m98572b(long j, long j2) {
            this.f6764d = j;
            this.f6766f = j2;
            m98563f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public long m98578a() {
            return this.f6767g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m98577a(long j, long j2) {
            this.f6765e = j;
            this.f6767g = j2;
            m98563f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.applovin.impl.i2$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4560d {
        /* renamed from: a */
        long mo98562a(long j);
    }

    /* renamed from: com.applovin.impl.i2$e */
    /* loaded from: classes2.dex */
    public static final class C4561e {

        /* renamed from: d */
        public static final C4561e f6769d = new C4561e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        private final int f6770a;

        /* renamed from: b */
        private final long f6771b;

        /* renamed from: c */
        private final long f6772c;

        private C4561e(int i, long j, long j2) {
            this.f6770a = i;
            this.f6771b = j;
            this.f6772c = j2;
        }

        /* renamed from: a */
        public static C4561e m98560a(long j, long j2) {
            return new C4561e(-1, j, j2);
        }

        /* renamed from: b */
        public static C4561e m98558b(long j, long j2) {
            return new C4561e(-2, j, j2);
        }

        /* renamed from: a */
        public static C4561e m98561a(long j) {
            return new C4561e(0, -9223372036854775807L, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4556i2(InterfaceC4560d interfaceC4560d, InterfaceC4562f interfaceC4562f, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f6751b = interfaceC4562f;
        this.f6753d = i;
        this.f6750a = new C4557a(interfaceC4560d, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    public final InterfaceC4591ij m98593a() {
        return this.f6750a;
    }

    /* renamed from: b */
    protected void m98585b(boolean z, long j) {
    }

    /* renamed from: a */
    public int m98589a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        while (true) {
            C4559c c4559c = (C4559c) AbstractC4100b1.m100578b(this.f6752c);
            long m98573b = c4559c.m98573b();
            long m98578a = c4559c.m98578a();
            long m98569c = c4559c.m98569c();
            if (m98578a - m98573b <= this.f6753d) {
                m98588a(false, m98573b);
                return m98590a(interfaceC4703k8, m98573b, c5563th);
            } else if (!m98591a(interfaceC4703k8, m98569c)) {
                return m98590a(interfaceC4703k8, m98569c, c5563th);
            } else {
                interfaceC4703k8.mo98007b();
                C4561e mo94528a = this.f6751b.mo94528a(interfaceC4703k8, c4559c.m98565e());
                int i = mo94528a.f6770a;
                if (i == -3) {
                    m98588a(false, m98569c);
                    return m98590a(interfaceC4703k8, m98569c, c5563th);
                } else if (i == -2) {
                    c4559c.m98572b(mo94528a.f6771b, mo94528a.f6772c);
                } else if (i != -1) {
                    if (i == 0) {
                        m98591a(interfaceC4703k8, mo94528a.f6772c);
                        m98588a(true, mo94528a.f6772c);
                        return m98590a(interfaceC4703k8, mo94528a.f6772c, c5563th);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    c4559c.m98577a(mo94528a.f6771b, mo94528a.f6772c);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m98587b() {
        return this.f6752c != null;
    }

    /* renamed from: b */
    public final void m98586b(long j) {
        C4559c c4559c = this.f6752c;
        if (c4559c == null || c4559c.m98567d() != j) {
            this.f6752c = m98592a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.applovin.impl.i2$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC4562f {
        /* renamed from: a */
        C4561e mo94528a(InterfaceC4703k8 interfaceC4703k8, long j);

        /* renamed from: a */
        default void mo98555a() {
        }
    }

    /* renamed from: com.applovin.impl.i2$b */
    /* loaded from: classes2.dex */
    public static final class C4558b implements InterfaceC4560d {
        @Override // com.applovin.impl.AbstractC4556i2.InterfaceC4560d
        /* renamed from: a */
        public long mo98562a(long j) {
            return j;
        }
    }

    /* renamed from: a */
    protected final void m98588a(boolean z, long j) {
        this.f6752c = null;
        this.f6751b.mo98555a();
        m98585b(z, j);
    }

    /* renamed from: a */
    protected final int m98590a(InterfaceC4703k8 interfaceC4703k8, long j, C5563th c5563th) {
        if (j == interfaceC4703k8.mo97999f()) {
            return 0;
        }
        c5563th.f10897a = j;
        return 1;
    }

    /* renamed from: a */
    protected final boolean m98591a(InterfaceC4703k8 interfaceC4703k8, long j) {
        long mo97999f = j - interfaceC4703k8.mo97999f();
        if (mo97999f < 0 || mo97999f > 262144) {
            return false;
        }
        interfaceC4703k8.mo98010a((int) mo97999f);
        return true;
    }

    /* renamed from: a */
    protected C4559c m98592a(long j) {
        return new C4559c(j, this.f6750a.m98582c(j), this.f6750a.f6756c, this.f6750a.f6757d, this.f6750a.f6758e, this.f6750a.f6759f, this.f6750a.f6760g);
    }
}
