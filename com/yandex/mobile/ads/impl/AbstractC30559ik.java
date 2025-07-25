package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ps1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.ik */
/* loaded from: classes8.dex */
public abstract class AbstractC30559ik {

    /* renamed from: a */
    protected final C30560a f80490a;

    /* renamed from: b */
    protected final InterfaceC30565f f80491b;
    @Nullable

    /* renamed from: c */
    protected C30562c f80492c;

    /* renamed from: d */
    private final int f80493d;

    /* renamed from: com.yandex.mobile.ads.impl.ik$a */
    /* loaded from: classes8.dex */
    public static class C30560a implements ps1 {

        /* renamed from: a */
        private final InterfaceC30563d f80494a;

        /* renamed from: b */
        private final long f80495b;

        /* renamed from: c */
        private final long f80496c = 0;

        /* renamed from: d */
        private final long f80497d;

        /* renamed from: e */
        private final long f80498e;

        /* renamed from: f */
        private final long f80499f;

        /* renamed from: g */
        private final long f80500g;

        public C30560a(InterfaceC30563d interfaceC30563d, long j, long j2, long j3, long j4, long j5) {
            this.f80494a = interfaceC30563d;
            this.f80495b = j;
            this.f80497d = j2;
            this.f80498e = j3;
            this.f80499f = j4;
            this.f80500g = j5;
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: b */
        public final boolean mo28595b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: c */
        public final long mo28592c() {
            return this.f80495b;
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: b */
        public final ps1.C31150a mo28594b(long j) {
            rs1 rs1Var = new rs1(j, C30562c.m33240a(this.f80494a.mo33226a(j), this.f80496c, this.f80497d, this.f80498e, this.f80499f, this.f80500g));
            return new ps1.C31150a(rs1Var, rs1Var);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ik$c */
    /* loaded from: classes8.dex */
    protected static class C30562c {

        /* renamed from: a */
        private final long f80501a;

        /* renamed from: b */
        private final long f80502b;

        /* renamed from: c */
        private final long f80503c;

        /* renamed from: d */
        private long f80504d;

        /* renamed from: e */
        private long f80505e;

        /* renamed from: f */
        private long f80506f;

        /* renamed from: g */
        private long f80507g;

        /* renamed from: h */
        private long f80508h;

        protected C30562c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f80501a = j;
            this.f80502b = j2;
            this.f80504d = j3;
            this.f80505e = j4;
            this.f80506f = j5;
            this.f80507g = j6;
            this.f80503c = j7;
            this.f80508h = m33240a(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: a */
        protected static long m33240a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            long j8 = j7 / 20;
            int i = y32.f88010a;
            return Math.max(j4, Math.min(((j7 + j4) - j6) - j8, j5 - 1));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ik$d */
    /* loaded from: classes8.dex */
    protected interface InterfaceC30563d {
        /* renamed from: a */
        long mo33226a(long j);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ik$e */
    /* loaded from: classes8.dex */
    public static final class C30564e {

        /* renamed from: d */
        public static final C30564e f80509d = new C30564e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        private final int f80510a;

        /* renamed from: b */
        private final long f80511b;

        /* renamed from: c */
        private final long f80512c;

        private C30564e(int i, long j, long j2) {
            this.f80510a = i;
            this.f80511b = j;
            this.f80512c = j2;
        }

        /* renamed from: a */
        public static C30564e m33224a(long j, long j2) {
            return new C30564e(-1, j, j2);
        }

        /* renamed from: b */
        public static C30564e m33222b(long j, long j2) {
            return new C30564e(-2, j, j2);
        }

        /* renamed from: a */
        public static C30564e m33225a(long j) {
            return new C30564e(0, -9223372036854775807L, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC30559ik(InterfaceC30563d interfaceC30563d, InterfaceC30565f interfaceC30565f, long j, long j2, long j3, long j4, long j5, int i) {
        this.f80491b = interfaceC30565f;
        this.f80493d = i;
        this.f80490a = new C30560a(interfaceC30563d, j, j2, j3, j4, j5);
    }

    /* renamed from: a */
    public final C30560a m33250a() {
        return this.f80490a;
    }

    /* renamed from: b */
    public final boolean m33247b() {
        if (this.f80492c != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0105, code lost:
        if (r8 != r19.mo27622a()) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        r20.f83478a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m33248a(com.yandex.mobile.ads.impl.C30513hy r19, com.yandex.mobile.ads.impl.of1 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC30559ik.m33248a(com.yandex.mobile.ads.impl.hy, com.yandex.mobile.ads.impl.of1):int");
    }

    /* renamed from: com.yandex.mobile.ads.impl.ik$f */
    /* loaded from: classes8.dex */
    protected interface InterfaceC30565f {
        /* renamed from: a */
        C30564e mo30043a(C30513hy c30513hy, long j) throws IOException;

        /* renamed from: a */
        default void mo30044a() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ik$b */
    /* loaded from: classes8.dex */
    public static final class C30561b implements InterfaceC30563d {
        @Override // com.yandex.mobile.ads.impl.AbstractC30559ik.InterfaceC30563d
        /* renamed from: a */
        public final long mo33226a(long j) {
            return j;
        }
    }

    /* renamed from: a */
    public final void m33249a(long j) {
        C30562c c30562c = this.f80492c;
        if (c30562c == null || c30562c.f80501a != j) {
            long mo33226a = this.f80490a.f80494a.mo33226a(j);
            C30560a c30560a = this.f80490a;
            this.f80492c = new C30562c(j, mo33226a, c30560a.f80496c, c30560a.f80497d, c30560a.f80498e, c30560a.f80499f, c30560a.f80500g);
        }
    }
}
