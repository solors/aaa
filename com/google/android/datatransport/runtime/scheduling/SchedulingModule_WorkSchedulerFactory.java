package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import md.Provider;

/* loaded from: classes4.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* renamed from: a */
    private final Provider<Context> f31166a;

    /* renamed from: b */
    private final Provider<EventStore> f31167b;

    /* renamed from: c */
    private final Provider<SchedulerConfig> f31168c;

    /* renamed from: d */
    private final Provider<Clock> f31169d;

    public SchedulingModule_WorkSchedulerFactory(Provider<Context> provider, Provider<EventStore> provider2, Provider<SchedulerConfig> provider3, Provider<Clock> provider4) {
        this.f31166a = provider;
        this.f31167b = provider2;
        this.f31168c = provider3;
        this.f31169d = provider4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(Provider<Context> provider, Provider<EventStore> provider2, Provider<SchedulerConfig> provider3, Provider<Clock> provider4) {
        return new SchedulingModule_WorkSchedulerFactory(provider, provider2, provider3, provider4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNull(SchedulingModule.m76279a(context, eventStore, schedulerConfig, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public WorkScheduler get() {
        return workScheduler(this.f31166a.get(), this.f31167b.get(), this.f31168c.get(), this.f31169d.get());
    }
}
