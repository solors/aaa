package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;

/* renamed from: io.appmetrica.analytics.coreutils.internal.cache.b */
/* loaded from: classes9.dex */
public final class RunnableC33726b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f92419a;

    public RunnableC33726b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f92419a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UpdateConditionsChecker updateConditionsChecker;
        RunnableC33725a runnableC33725a;
        ILastKnownUpdater iLastKnownUpdater;
        updateConditionsChecker = this.f92419a.f92415c;
        if (updateConditionsChecker.shouldUpdate()) {
            runnableC33725a = this.f92419a.f92416d;
            iLastKnownUpdater = runnableC33725a.f92418a.f92414b;
            iLastKnownUpdater.updateLastKnown();
        }
    }
}
