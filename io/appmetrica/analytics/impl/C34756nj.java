package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nj */
/* loaded from: classes9.dex */
public final class C34756nj {

    /* renamed from: a */
    public volatile long f95034a;

    /* renamed from: b */
    public C34858re f95035b;

    /* renamed from: c */
    public TimeProvider f95036c;

    /* renamed from: c */
    public static C34756nj m21248c() {
        return AbstractC34729mj.f94929a;
    }

    /* renamed from: a */
    public final synchronized long m21252a() {
        return (System.currentTimeMillis() / 1000) + this.f95034a;
    }

    /* renamed from: b */
    public final synchronized void m21249b() {
        this.f95035b.m21016c(false);
        this.f95035b.m21149b();
    }

    /* renamed from: d */
    public final synchronized long m21247d() {
        return this.f95034a;
    }

    /* renamed from: e */
    public final synchronized void m21246e() {
        m21250a(C34693la.f94825C.m21429w(), new SystemTimeProvider());
    }

    /* renamed from: f */
    public final synchronized boolean m21245f() {
        return this.f95035b.m21023a(true);
    }

    /* renamed from: a */
    public final synchronized void m21251a(long j, @Nullable Long l) {
        this.f95034a = (j - this.f95036c.currentTimeMillis()) / 1000;
        boolean z = true;
        if (this.f95035b.m21023a(true)) {
            if (l != null) {
                long abs = Math.abs(j - this.f95036c.currentTimeMillis());
                C34858re c34858re = this.f95035b;
                if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                    z = false;
                }
                c34858re.m21016c(z);
            } else {
                this.f95035b.m21016c(false);
            }
        }
        this.f95035b.m21014d(this.f95034a);
        this.f95035b.m21149b();
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m21250a(C34858re c34858re, TimeProvider timeProvider) {
        this.f95035b = c34858re;
        this.f95034a = c34858re.m21028a(0);
        this.f95036c = timeProvider;
    }
}
