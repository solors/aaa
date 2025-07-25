package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class DefaultScheduler implements Scheduler {

    /* renamed from: f */
    private static final Logger f31154f = Logger.getLogger(TransportRuntime.class.getName());

    /* renamed from: a */
    private final WorkScheduler f31155a;

    /* renamed from: b */
    private final Executor f31156b;

    /* renamed from: c */
    private final BackendRegistry f31157c;

    /* renamed from: d */
    private final EventStore f31158d;

    /* renamed from: e */
    private final SynchronizationGuard f31159e;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f31156b = executor;
        this.f31157c = backendRegistry;
        this.f31155a = workScheduler;
        this.f31158d = eventStore;
        this.f31159e = synchronizationGuard;
    }

    /* renamed from: c */
    public /* synthetic */ Object m76282c(TransportContext transportContext, EventInternal eventInternal) {
        this.f31158d.persist(transportContext, eventInternal);
        this.f31155a.schedule(transportContext, 1);
        return null;
    }

    /* renamed from: d */
    public /* synthetic */ void m76281d(final TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = this.f31157c.get(transportContext.getBackendName());
            if (transportBackend == null) {
                String format = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                f31154f.warning(format);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(format));
                return;
            }
            final EventInternal decorate = transportBackend.decorate(eventInternal);
            this.f31159e.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: i2.b
                {
                    DefaultScheduler.this = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    Object m76282c;
                    m76282c = DefaultScheduler.this.m76282c(transportContext, decorate);
                    return m76282c;
                }
            });
            transportScheduleCallback.onSchedule(null);
        } catch (Exception e) {
            Logger logger = f31154f;
            logger.warning("Error scheduling event " + e.getMessage());
            transportScheduleCallback.onSchedule(e);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.f31156b.execute(new Runnable() { // from class: i2.a
            {
                DefaultScheduler.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DefaultScheduler.this.m76281d(transportContext, transportScheduleCallback, eventInternal);
            }
        });
    }
}
