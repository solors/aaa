package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import md.Provider;

/* loaded from: classes4.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {

    /* renamed from: a */
    private final Provider<Clock> f31165a;

    public SchedulingConfigModule_ConfigFactory(Provider<Clock> provider) {
        this.f31165a = provider;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulingConfigModule.m76280a(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(Provider<Clock> provider) {
        return new SchedulingConfigModule_ConfigFactory(provider);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public SchedulerConfig get() {
        return config(this.f31165a.get());
    }
}
