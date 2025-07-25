package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.g02;
import com.yandex.mobile.ads.impl.jt0;

/* loaded from: classes8.dex */
public final class mu1 extends g02 {

    /* renamed from: p */
    private static final Object f82419p = new Object();

    /* renamed from: c */
    private final long f82420c;

    /* renamed from: d */
    private final long f82421d;

    /* renamed from: e */
    private final long f82422e;

    /* renamed from: f */
    private final long f82423f;

    /* renamed from: g */
    private final long f82424g;

    /* renamed from: h */
    private final long f82425h;

    /* renamed from: i */
    private final long f82426i;

    /* renamed from: j */
    private final boolean f82427j;

    /* renamed from: k */
    private final boolean f82428k;

    /* renamed from: l */
    private final boolean f82429l;
    @Nullable

    /* renamed from: m */
    private final Object f82430m;
    @Nullable

    /* renamed from: n */
    private final jt0 f82431n;
    @Nullable

    /* renamed from: o */
    private final jt0.C30663e f82432o;

    static {
        new jt0.C30657a().m32772b("SinglePeriodTimeline").m32775a(Uri.EMPTY).m32776a();
    }

    public mu1(long j, long j2, boolean z, jt0 jt0Var, @Nullable jt0.C30663e c30663e) {
        this.f82420c = -9223372036854775807L;
        this.f82421d = -9223372036854775807L;
        this.f82422e = -9223372036854775807L;
        this.f82423f = j;
        this.f82424g = j2;
        this.f82425h = 0L;
        this.f82426i = 0L;
        this.f82427j = z;
        this.f82428k = false;
        this.f82429l = false;
        this.f82430m = null;
        this.f82431n = (jt0) C30937nf.m31570a(jt0Var);
        this.f82432o = c30663e;
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final int mo31769a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: b */
    public final int mo31764b() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final g02.C30352b mo31767a(int i, g02.C30352b c30352b, boolean z) {
        C30937nf.m31572a(i, 1);
        Object obj = z ? f82419p : null;
        c30352b.getClass();
        return c30352b.m34022a(null, obj, 0, this.f82423f, -this.f82425h, C30363g5.f79498h, false);
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final Object mo31768a(int i) {
        C30937nf.m31572a(i, 1);
        return f82419p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r1 > r3) goto L11;
     */
    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.g02.C30354d mo31766a(int r25, com.yandex.mobile.ads.impl.g02.C30354d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            com.yandex.mobile.ads.impl.C30937nf.m31572a(r2, r1)
            long r1 = r0.f82426i
            boolean r14 = r0.f82428k
            if (r14 == 0) goto L2d
            boolean r3 = r0.f82429l
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.f82424g
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
        L2a:
            r16 = r5
            goto L2f
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = com.yandex.mobile.ads.impl.g02.C30354d.f79395s
            com.yandex.mobile.ads.impl.jt0 r5 = r0.f82431n
            java.lang.Object r6 = r0.f82430m
            long r7 = r0.f82420c
            long r9 = r0.f82421d
            long r11 = r0.f82422e
            boolean r13 = r0.f82427j
            com.yandex.mobile.ads.impl.jt0$e r15 = r0.f82432o
            long r1 = r0.f82424g
            r18 = r1
            long r1 = r0.f82425h
            r22 = r1
            r20 = 0
            r21 = 0
            r3 = r26
            com.yandex.mobile.ads.impl.g02$d r1 = r3.m34006a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mu1.mo31766a(int, com.yandex.mobile.ads.impl.g02$d, long):com.yandex.mobile.ads.impl.g02$d");
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final int mo31765a(Object obj) {
        return f82419p.equals(obj) ? 0 : -1;
    }

    public mu1(long j, long j2, boolean z, boolean z2, jt0 jt0Var) {
        this(j, j2, z, jt0Var, z2 ? jt0Var.f81083d : null);
    }
}
