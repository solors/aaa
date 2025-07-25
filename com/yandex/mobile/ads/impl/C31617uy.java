package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ps1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.impl.uy */
/* loaded from: classes8.dex */
public final class C31617uy implements ha1 {

    /* renamed from: a */
    private final ga1 f86457a;

    /* renamed from: b */
    private final long f86458b;

    /* renamed from: c */
    private final long f86459c;

    /* renamed from: d */
    private final zx1 f86460d;

    /* renamed from: e */
    private int f86461e;

    /* renamed from: f */
    private long f86462f;

    /* renamed from: g */
    private long f86463g;

    /* renamed from: h */
    private long f86464h;

    /* renamed from: i */
    private long f86465i;

    /* renamed from: j */
    private long f86466j;

    /* renamed from: k */
    private long f86467k;

    /* renamed from: l */
    private long f86468l;

    /* renamed from: com.yandex.mobile.ads.impl.uy$a */
    /* loaded from: classes8.dex */
    private final class C31618a implements ps1 {
        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: b */
        public final boolean mo28595b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: c */
        public final long mo28592c() {
            C31617uy c31617uy = C31617uy.this;
            return c31617uy.f86460d.m25970a(c31617uy.f86462f);
        }

        private C31618a() {
        }

        @Override // com.yandex.mobile.ads.impl.ps1
        /* renamed from: b */
        public final ps1.C31150a mo28594b(long j) {
            long m25963b = C31617uy.this.f86460d.m25963b(j);
            C31617uy c31617uy = C31617uy.this;
            long j2 = c31617uy.f86458b;
            long j3 = c31617uy.f86459c;
            int i = y32.f88010a;
            rs1 rs1Var = new rs1(j, Math.max(j2, Math.min(((((j3 - j2) * m25963b) / c31617uy.f86462f) + j2) - 30000, j3 - 1)));
            return new ps1.C31150a(rs1Var, rs1Var);
        }
    }

    public C31617uy(zx1 zx1Var, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        C30937nf.m31567a(z2);
        this.f86460d = zx1Var;
        this.f86458b = j;
        this.f86459c = j2;
        if (j3 != j2 - j && !z) {
            this.f86461e = 0;
        } else {
            this.f86462f = j4;
            this.f86461e = 4;
        }
        this.f86457a = new ga1();
    }

    @Override // com.yandex.mobile.ads.impl.ha1
    @Nullable
    /* renamed from: a */
    public final ps1 mo25961a() {
        if (this.f86462f != 0) {
            return new C31618a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    @Override // com.yandex.mobile.ads.impl.ha1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo25959a(com.yandex.mobile.ads.impl.C30513hy r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31617uy.mo25959a(com.yandex.mobile.ads.impl.hy):long");
    }

    @Override // com.yandex.mobile.ads.impl.ha1
    /* renamed from: a */
    public final void mo25960a(long j) {
        int i = y32.f88010a;
        this.f86464h = Math.max(0L, Math.min(j, this.f86462f - 1));
        this.f86461e = 2;
        this.f86465i = this.f86458b;
        this.f86466j = this.f86459c;
        this.f86467k = 0L;
        this.f86468l = this.f86462f;
    }
}
