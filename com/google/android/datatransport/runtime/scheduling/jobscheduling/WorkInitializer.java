package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class WorkInitializer {

    /* renamed from: a */
    private final Executor f31207a;

    /* renamed from: b */
    private final EventStore f31208b;

    /* renamed from: c */
    private final WorkScheduler f31209c;

    /* renamed from: d */
    private final SynchronizationGuard f31210d;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f31207a = executor;
        this.f31208b = eventStore;
        this.f31209c = workScheduler;
        this.f31210d = synchronizationGuard;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m76243a(WorkInitializer workInitializer) {
        return workInitializer.m76241c();
    }

    /* renamed from: b */
    public static /* synthetic */ void m76242b(WorkInitializer workInitializer) {
        workInitializer.m76240d();
    }

    /* renamed from: c */
    public /* synthetic */ Object m76241c() {
        for (TransportContext transportContext : this.f31208b.loadActiveContexts()) {
            this.f31209c.schedule(transportContext, 1);
        }
        return null;
    }

    /* renamed from: d */
    public /* synthetic */ void m76240d() {
        this.f31210d.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return WorkInitializer.m76243a(WorkInitializer.this);
            }
        });
    }

    public void ensureContextsScheduled() {
        this.f31207a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
            @Override // java.lang.Runnable
            public final void run() {
                WorkInitializer.m76242b(WorkInitializer.this);
            }
        });
    }
}
