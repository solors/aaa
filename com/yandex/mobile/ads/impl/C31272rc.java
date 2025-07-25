package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.rc */
/* loaded from: classes8.dex */
public final class C31272rc implements n50 {

    /* renamed from: p */
    private static final int[] f84698p;

    /* renamed from: q */
    private static final int[] f84699q;

    /* renamed from: r */
    private static final byte[] f84700r;

    /* renamed from: s */
    private static final byte[] f84701s;

    /* renamed from: t */
    private static final int f84702t;

    /* renamed from: c */
    private boolean f84705c;

    /* renamed from: d */
    private long f84706d;

    /* renamed from: e */
    private int f84707e;

    /* renamed from: f */
    private int f84708f;

    /* renamed from: g */
    private boolean f84709g;

    /* renamed from: h */
    private long f84710h;

    /* renamed from: j */
    private int f84712j;

    /* renamed from: k */
    private long f84713k;

    /* renamed from: l */
    private p50 f84714l;

    /* renamed from: m */
    private x02 f84715m;

    /* renamed from: n */
    private ps1 f84716n;

    /* renamed from: o */
    private boolean f84717o;

    /* renamed from: b */
    private final int f84704b = 0;

    /* renamed from: a */
    private final byte[] f84703a = new byte[1];

    /* renamed from: i */
    private int f84711i = -1;

    static {
        new r50() { // from class: com.yandex.mobile.ads.impl.fv2
            @Override // com.yandex.mobile.ads.impl.r50
            /* renamed from: a */
            public final n50[] mo25982a() {
                n50[] m30084a;
                m30084a = C31272rc.m30084a();
                return m30084a;
            }
        };
        f84698p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f84699q = iArr;
        f84700r = y32.m27052c("#!AMR\n");
        f84701s = y32.m27052c("#!AMR-WB\n");
        f84702t = iArr[8];
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final void mo28384a(p50 p50Var) {
        this.f84714l = p50Var;
        this.f84715m = p50Var.mo26223a(0, 1);
        p50Var.mo26225a();
    }

    /* renamed from: a */
    private int m30083a(C30513hy c30513hy) throws IOException {
        boolean z;
        c30513hy.mo27614c();
        c30513hy.mo27615b(this.f84703a, 0, 1, false);
        byte b = this.f84703a[0];
        if ((b & 131) > 0) {
            throw gc1.m33885a("Invalid padding bits for frame header " + ((int) b), (Exception) null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f84705c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f84699q[i] : f84698p[i];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f84705c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i);
        throw gc1.m33885a(sb2.toString(), (Exception) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00e8  */
    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo28385a(com.yandex.mobile.ads.impl.o50 r20, com.yandex.mobile.ads.impl.of1 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31272rc.mo28385a(com.yandex.mobile.ads.impl.o50, com.yandex.mobile.ads.impl.of1):int");
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final void mo28388a(long j, long j2) {
        this.f84706d = 0L;
        this.f84707e = 0;
        this.f84708f = 0;
        if (j != 0) {
            ps1 ps1Var = this.f84716n;
            if (ps1Var instanceof C31059oq) {
                this.f84713k = ((C31059oq) ps1Var).m30949c(j);
                return;
            }
        }
        this.f84713k = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    /* renamed from: a */
    public final boolean mo28386a(o50 o50Var) throws IOException {
        C30513hy c30513hy = (C30513hy) o50Var;
        byte[] bArr = f84700r;
        c30513hy.mo27614c();
        byte[] bArr2 = new byte[bArr.length];
        c30513hy.mo27615b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f84705c = false;
            c30513hy.mo27621a(bArr.length);
        } else {
            byte[] bArr3 = f84701s;
            c30513hy.mo27614c();
            byte[] bArr4 = new byte[bArr3.length];
            c30513hy.mo27615b(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f84705c = true;
            c30513hy.mo27621a(bArr3.length);
        }
        return true;
    }

    /* renamed from: a */
    public static n50[] m30084a() {
        return new n50[]{new C31272rc()};
    }
}
