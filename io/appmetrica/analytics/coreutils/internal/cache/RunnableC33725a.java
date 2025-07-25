package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;

/* renamed from: io.appmetrica.analytics.coreutils.internal.cache.a */
/* loaded from: classes9.dex */
public final class RunnableC33725a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f92418a;

    public RunnableC33725a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f92418a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILastKnownUpdater iLastKnownUpdater;
        iLastKnownUpdater = this.f92418a.f92414b;
        iLastKnownUpdater.updateLastKnown();
    }
}
