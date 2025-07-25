package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import md.Provider;

/* loaded from: classes4.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* renamed from: a */
    private final Provider<Executor> f31160a;

    /* renamed from: b */
    private final Provider<BackendRegistry> f31161b;

    /* renamed from: c */
    private final Provider<WorkScheduler> f31162c;

    /* renamed from: d */
    private final Provider<EventStore> f31163d;

    /* renamed from: e */
    private final Provider<SynchronizationGuard> f31164e;

    public DefaultScheduler_Factory(Provider<Executor> provider, Provider<BackendRegistry> provider2, Provider<WorkScheduler> provider3, Provider<EventStore> provider4, Provider<SynchronizationGuard> provider5) {
        this.f31160a = provider;
        this.f31161b = provider2;
        this.f31162c = provider3;
        this.f31163d = provider4;
        this.f31164e = provider5;
    }

    public static DefaultScheduler_Factory create(Provider<Executor> provider, Provider<BackendRegistry> provider2, Provider<WorkScheduler> provider3, Provider<EventStore> provider4, Provider<SynchronizationGuard> provider5) {
        return new DefaultScheduler_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public DefaultScheduler get() {
        return newInstance(this.f31160a.get(), this.f31161b.get(), this.f31162c.get(), this.f31163d.get(), this.f31164e.get());
    }
}
