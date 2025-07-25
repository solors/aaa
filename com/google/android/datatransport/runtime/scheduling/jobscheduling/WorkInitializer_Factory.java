package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import md.Provider;

/* loaded from: classes4.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* renamed from: a */
    private final Provider<Executor> f31211a;

    /* renamed from: b */
    private final Provider<EventStore> f31212b;

    /* renamed from: c */
    private final Provider<WorkScheduler> f31213c;

    /* renamed from: d */
    private final Provider<SynchronizationGuard> f31214d;

    public WorkInitializer_Factory(Provider<Executor> provider, Provider<EventStore> provider2, Provider<WorkScheduler> provider3, Provider<SynchronizationGuard> provider4) {
        this.f31211a = provider;
        this.f31212b = provider2;
        this.f31213c = provider3;
        this.f31214d = provider4;
    }

    public static WorkInitializer_Factory create(Provider<Executor> provider, Provider<EventStore> provider2, Provider<WorkScheduler> provider3, Provider<SynchronizationGuard> provider4) {
        return new WorkInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public WorkInitializer get() {
        return newInstance(this.f31211a.get(), this.f31212b.get(), this.f31213c.get(), this.f31214d.get());
    }
}
