package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import md.Provider;

/* loaded from: classes4.dex */
public final class Uploader_Factory implements Factory<Uploader> {

    /* renamed from: a */
    private final Provider<Context> f31198a;

    /* renamed from: b */
    private final Provider<BackendRegistry> f31199b;

    /* renamed from: c */
    private final Provider<EventStore> f31200c;

    /* renamed from: d */
    private final Provider<WorkScheduler> f31201d;

    /* renamed from: e */
    private final Provider<Executor> f31202e;

    /* renamed from: f */
    private final Provider<SynchronizationGuard> f31203f;

    /* renamed from: g */
    private final Provider<Clock> f31204g;

    /* renamed from: h */
    private final Provider<Clock> f31205h;

    /* renamed from: i */
    private final Provider<ClientHealthMetricsStore> f31206i;

    public Uploader_Factory(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        this.f31198a = provider;
        this.f31199b = provider2;
        this.f31200c = provider3;
        this.f31201d = provider4;
        this.f31202e = provider5;
        this.f31203f = provider6;
        this.f31204g = provider7;
        this.f31205h = provider8;
        this.f31206i = provider9;
    }

    public static Uploader_Factory create(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        return new Uploader_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public Uploader get() {
        return newInstance(this.f31198a.get(), this.f31199b.get(), this.f31200c.get(), this.f31201d.get(), this.f31202e.get(), this.f31203f.get(), this.f31204g.get(), this.f31205h.get(), this.f31206i.get());
    }
}
