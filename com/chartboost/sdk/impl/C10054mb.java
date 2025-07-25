package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.mb */
/* loaded from: classes3.dex */
public final class C10054mb {

    /* renamed from: a */
    public long f22629a;

    /* renamed from: b */
    public int f22630b;

    /* renamed from: c */
    public int f22631c;

    /* renamed from: d */
    public long f22632d;

    /* renamed from: e */
    public long f22633e;

    /* renamed from: f */
    public long f22634f;

    /* renamed from: g */
    public int f22635g;

    /* renamed from: h */
    public final C9880h2 f22636h;

    /* renamed from: i */
    public volatile long f22637i;

    /* renamed from: j */
    public volatile int f22638j;

    public C10054mb(long j, int i, int i2, long j2, long j3, long j4, int i3, C9880h2 c9880h2) {
        this.f22629a = j;
        this.f22630b = i;
        this.f22631c = i2;
        this.f22632d = j2;
        this.f22633e = j3;
        this.f22634f = j4;
        this.f22635g = i3;
        this.f22636h = c9880h2;
    }

    /* renamed from: a */
    public final void m81075a() {
        C9763c7.m81922a("addDownloadToTimeWindow() - timeWindowStartTimeStamp " + this.f22637i + ", timeWindowCachedVideosCount " + this.f22638j, (Throwable) null, 2, (Object) null);
        if (this.f22637i == 0) {
            this.f22637i = AbstractC10385y9.m79864a();
        }
        this.f22638j++;
    }

    /* renamed from: b */
    public final long m81071b() {
        return this.f22629a;
    }

    /* renamed from: c */
    public final int m81068c() {
        C9880h2 c9880h2 = this.f22636h;
        if (c9880h2 != null && c9880h2.m81578d()) {
            return this.f22631c;
        }
        return this.f22630b;
    }

    /* renamed from: d */
    public final long m81065d() {
        return m81061f() - m81063e();
    }

    /* renamed from: e */
    public final void m81062e(long j) {
        this.f22633e = j;
    }

    /* renamed from: f */
    public final long m81061f() {
        C9880h2 c9880h2 = this.f22636h;
        return ((c9880h2 == null || !c9880h2.m81578d()) ? this.f22632d : this.f22633e) * 1000;
    }

    /* renamed from: g */
    public final boolean m81059g() {
        boolean z;
        m81058h();
        if (this.f22638j >= m81068c()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long m81065d = m81065d();
            C10023l9.m81173a("Video loading limit reached, will resume in timeToResetWindow: " + m81065d);
        }
        C9763c7.m81922a("isMaxCountForTimeWindowReached() - " + z, (Throwable) null, 2, (Object) null);
        return z;
    }

    /* renamed from: h */
    public final void m81058h() {
        C9763c7.m81922a("resetWindowWhenTimeReached()", (Throwable) null, 2, (Object) null);
        if (m81063e() > m81061f()) {
            C9763c7.m81922a("resetWindowWhenTimeReached() - timer and count reset", (Throwable) null, 2, (Object) null);
            C10023l9.m81173a("Video loading limit reset");
            this.f22638j = 0;
            this.f22637i = 0L;
        }
    }

    /* renamed from: i */
    public final long m81057i() {
        return m81061f() - (AbstractC10385y9.m79864a() - this.f22637i);
    }

    /* renamed from: b */
    public final boolean m81069b(long j) {
        return j >= this.f22629a;
    }

    /* renamed from: d */
    public final void m81064d(long j) {
        this.f22632d = j;
    }

    /* renamed from: e */
    public final long m81063e() {
        return AbstractC10385y9.m79864a() - this.f22637i;
    }

    /* renamed from: f */
    public final void m81060f(long j) {
        this.f22634f = j;
    }

    /* renamed from: b */
    public final void m81070b(int i) {
        this.f22630b = i;
    }

    /* renamed from: c */
    public final void m81066c(long j) {
        this.f22629a = j;
    }

    /* renamed from: c */
    public final void m81067c(int i) {
        this.f22631c = i;
    }

    /* renamed from: a */
    public final boolean m81072a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return m81073a(file.lastModified());
    }

    /* renamed from: a */
    public final void m81074a(int i) {
        this.f22635g = i;
    }

    /* renamed from: a */
    public final boolean m81073a(long j) {
        return AbstractC10385y9.m79864a() - j > this.f22634f * ((long) 1000);
    }
}
