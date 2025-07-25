package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a */
    private final ICommonExecutor f92413a;

    /* renamed from: b */
    private final ILastKnownUpdater f92414b;

    /* renamed from: c */
    private final UpdateConditionsChecker f92415c;

    /* renamed from: d */
    private final RunnableC33725a f92416d = new RunnableC33725a(this);

    /* renamed from: e */
    private final RunnableC33726b f92417e = new RunnableC33726b(this);

    public LocationDataCacheUpdateScheduler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ILastKnownUpdater iLastKnownUpdater, @NonNull UpdateConditionsChecker updateConditionsChecker, @NonNull String str) {
        this.f92413a = iCommonExecutor;
        this.f92414b = iLastKnownUpdater;
        this.f92415c = updateConditionsChecker;
        String.format("[LocationDataCacheUpdateScheduler-%s]", str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f92413a.remove(this.f92416d);
        this.f92413a.executeDelayed(this.f92416d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f92413a.execute(this.f92417e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f92413a.remove(this.f92416d);
        this.f92413a.remove(this.f92417e);
    }
}
