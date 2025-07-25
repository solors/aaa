package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* renamed from: io.appmetrica.analytics.location.impl.j */
/* loaded from: classes9.dex */
public final class RunnableC35090j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C35089i f95730a;

    /* renamed from: b */
    public final /* synthetic */ C35091k f95731b;

    public RunnableC35090j(C35091k c35091k, C35089i c35089i) {
        this.f95731b = c35091k;
        this.f95730a = c35089i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35096p c35096p = this.f95731b.f95734c;
        C35089i c35089i = this.f95730a;
        c35096p.f95750a = c35089i;
        CacheArguments cacheArguments = c35089i.f95729b;
        c35096p.f95751b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
