package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.t4 */
/* loaded from: classes9.dex */
public final class C34900t4 {

    /* renamed from: a */
    public final SystemTimeProvider f95370a;

    public C34900t4() {
        this(new SystemTimeProvider());
    }

    /* renamed from: a */
    public final void m20955a() {
        this.f95370a.elapsedRealtime();
    }

    public C34900t4(SystemTimeProvider systemTimeProvider) {
        this.f95370a = systemTimeProvider;
    }
}
