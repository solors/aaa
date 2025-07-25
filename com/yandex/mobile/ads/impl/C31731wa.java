package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.v90;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.wa */
/* loaded from: classes8.dex */
public final class C31731wa implements t20 {

    /* renamed from: v */
    private static final byte[] f87165v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f87166a;

    /* renamed from: b */
    private final bc1 f87167b;

    /* renamed from: c */
    private final cc1 f87168c;
    @Nullable

    /* renamed from: d */
    private final String f87169d;

    /* renamed from: e */
    private String f87170e;

    /* renamed from: f */
    private x02 f87171f;

    /* renamed from: g */
    private x02 f87172g;

    /* renamed from: h */
    private int f87173h;

    /* renamed from: i */
    private int f87174i;

    /* renamed from: j */
    private int f87175j;

    /* renamed from: k */
    private boolean f87176k;

    /* renamed from: l */
    private boolean f87177l;

    /* renamed from: m */
    private int f87178m;

    /* renamed from: n */
    private int f87179n;

    /* renamed from: o */
    private int f87180o;

    /* renamed from: p */
    private boolean f87181p;

    /* renamed from: q */
    private long f87182q;

    /* renamed from: r */
    private int f87183r;

    /* renamed from: s */
    private long f87184s;

    /* renamed from: t */
    private x02 f87185t;

    /* renamed from: u */
    private long f87186u;

    public C31731wa() {
        this(null, true);
    }

    /* renamed from: d */
    private void m28001d() {
        this.f87173h = 0;
        this.f87174i = 0;
        this.f87175j = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031f A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo26245a(com.yandex.mobile.ads.impl.cc1 r20) throws com.yandex.mobile.ads.impl.gc1 {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31731wa.mo26245a(com.yandex.mobile.ads.impl.cc1):void");
    }

    /* renamed from: c */
    public final long m28002c() {
        return this.f87182q;
    }

    public C31731wa(@Nullable String str, boolean z) {
        this.f87167b = new bc1(new byte[7]);
        this.f87168c = new cc1(Arrays.copyOf(f87165v, 10));
        m28001d();
        this.f87178m = -1;
        this.f87179n = -1;
        this.f87182q = -9223372036854775807L;
        this.f87184s = -9223372036854775807L;
        this.f87166a = z;
        this.f87169d = str;
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: b */
    public final void mo26243b() {
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26244a(p50 p50Var, k22.C30694d c30694d) {
        c30694d.m32682a();
        this.f87170e = c30694d.m32681b();
        x02 mo26223a = p50Var.mo26223a(c30694d.m32680c(), 1);
        this.f87171f = mo26223a;
        this.f87185t = mo26223a;
        if (this.f87166a) {
            c30694d.m32682a();
            x02 mo26223a2 = p50Var.mo26223a(c30694d.m32680c(), 5);
            this.f87172g = mo26223a2;
            mo26223a2.mo26064a(new v90.C31640a().m28438b(c30694d.m32681b()).m28426e("application/id3").m28454a());
            return;
        }
        this.f87172g = new j20();
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26246a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f87184s = j;
        }
    }

    @Override // com.yandex.mobile.ads.impl.t20
    /* renamed from: a */
    public final void mo26247a() {
        this.f87184s = -9223372036854775807L;
        this.f87177l = false;
        m28001d();
    }
}
