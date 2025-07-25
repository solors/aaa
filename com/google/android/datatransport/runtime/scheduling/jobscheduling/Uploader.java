package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class Uploader {

    /* renamed from: a */
    private final Context f31189a;

    /* renamed from: b */
    private final BackendRegistry f31190b;

    /* renamed from: c */
    private final EventStore f31191c;

    /* renamed from: d */
    private final WorkScheduler f31192d;

    /* renamed from: e */
    private final Executor f31193e;

    /* renamed from: f */
    private final SynchronizationGuard f31194f;

    /* renamed from: g */
    private final Clock f31195g;

    /* renamed from: h */
    private final Clock f31196h;

    /* renamed from: i */
    private final ClientHealthMetricsStore f31197i;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f31189a = context;
        this.f31190b = backendRegistry;
        this.f31191c = eventStore;
        this.f31192d = workScheduler;
        this.f31193e = executor;
        this.f31194f = synchronizationGuard;
        this.f31195g = clock;
        this.f31196h = clock2;
        this.f31197i = clientHealthMetricsStore;
    }

    /* renamed from: k */
    public /* synthetic */ Boolean m76252k(TransportContext transportContext) {
        return Boolean.valueOf(this.f31191c.hasPendingEventsFor(transportContext));
    }

    /* renamed from: l */
    public /* synthetic */ Iterable m76251l(TransportContext transportContext) {
        return this.f31191c.loadBatch(transportContext);
    }

    /* renamed from: m */
    public /* synthetic */ Object m76250m(Iterable iterable, TransportContext transportContext, long j) {
        this.f31191c.recordFailure(iterable);
        this.f31191c.recordNextCallTime(transportContext, this.f31195g.getTime() + j);
        return null;
    }

    /* renamed from: n */
    public /* synthetic */ Object m76249n(Iterable iterable) {
        this.f31191c.recordSuccess(iterable);
        return null;
    }

    /* renamed from: o */
    public /* synthetic */ Object m76248o() {
        this.f31197i.resetClientMetrics();
        return null;
    }

    /* renamed from: p */
    public /* synthetic */ Object m76247p(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f31197i.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* renamed from: q */
    public /* synthetic */ Object m76246q(TransportContext transportContext, long j) {
        this.f31191c.recordNextCallTime(transportContext, this.f31195g.getTime() + j);
        return null;
    }

    /* renamed from: r */
    public /* synthetic */ Object m76245r(TransportContext transportContext, int i) {
        this.f31192d.schedule(transportContext, i + 1);
        return null;
    }

    /* renamed from: s */
    public /* synthetic */ void m76244s(final TransportContext transportContext, final int i, Runnable runnable) {
        try {
            try {
                SynchronizationGuard synchronizationGuard = this.f31194f;
                final EventStore eventStore = this.f31191c;
                Objects.requireNonNull(eventStore);
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Integer.valueOf(eventStore.cleanUp());
                    }
                });
                if (!m76253j()) {
                    this.f31194f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
                        {
                            Uploader.this = this;
                        }

                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            Object m76245r;
                            m76245r = Uploader.this.m76245r(transportContext, i);
                            return m76245r;
                        }
                    });
                } else {
                    logAndUpdateState(transportContext, i);
                }
            } catch (SynchronizationException unused) {
                this.f31192d.schedule(transportContext, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.f31194f;
        final ClientHealthMetricsStore clientHealthMetricsStore = this.f31197i;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.f31195g.getTime()).setUptimeMillis(this.f31196h.getTime()).setTransportName("GDT_CLIENT_METRICS").setEncodedPayload(new EncodedPayload(Encoding.m76344of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return clientHealthMetricsStore.loadClientMetrics();
            }
        })).toByteArray())).build());
    }

    /* renamed from: j */
    boolean m76253j() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f31189a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public BackendResponse logAndUpdateState(final TransportContext transportContext, int i) {
        BackendResponse send;
        TransportBackend transportBackend = this.f31190b.get(transportContext.getBackendName());
        long j = 0;
        BackendResponse m76305ok = BackendResponse.m76305ok(0L);
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f31194f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
                {
                    Uploader.this = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    Boolean m76252k;
                    m76252k = Uploader.this.m76252k(transportContext);
                    return m76252k;
                }
            })).booleanValue()) {
                final Iterable<PersistedEvent> iterable = (Iterable) this.f31194f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                    {
                        Uploader.this = this;
                    }

                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        Iterable m76251l;
                        m76251l = Uploader.this.m76251l(transportContext);
                        return m76251l;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m76305ok;
                }
                if (transportBackend == null) {
                    Logging.m76290d("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                    send = BackendResponse.fatalError();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (PersistedEvent persistedEvent : iterable) {
                        arrayList.add(persistedEvent.getEvent());
                    }
                    if (transportContext.shouldUploadClientHealthMetrics()) {
                        arrayList.add(createMetricsEvent(transportBackend));
                    }
                    send = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
                }
                m76305ok = send;
                if (m76305ok.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f31194f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                        {
                            Uploader.this = this;
                        }

                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            Object m76250m;
                            m76250m = Uploader.this.m76250m(iterable, transportContext, j2);
                            return m76250m;
                        }
                    });
                    this.f31192d.schedule(transportContext, i + 1, true);
                    return m76305ok;
                }
                this.f31194f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                    {
                        Uploader.this = this;
                    }

                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        Object m76249n;
                        m76249n = Uploader.this.m76249n(iterable);
                        return m76249n;
                    }
                });
                if (m76305ok.getStatus() == BackendResponse.Status.OK) {
                    j = Math.max(j2, m76305ok.getNextRequestWaitMillis());
                    if (transportContext.shouldUploadClientHealthMetrics()) {
                        this.f31194f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                            {
                                Uploader.this = this;
                            }

                            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                            public final Object execute() {
                                Object m76248o;
                                m76248o = Uploader.this.m76248o();
                                return m76248o;
                            }
                        });
                    }
                } else if (m76305ok.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (PersistedEvent persistedEvent2 : iterable) {
                        String transportName = persistedEvent2.getEvent().getTransportName();
                        if (!hashMap.containsKey(transportName)) {
                            hashMap.put(transportName, 1);
                        } else {
                            hashMap.put(transportName, Integer.valueOf(((Integer) hashMap.get(transportName)).intValue() + 1));
                        }
                    }
                    this.f31194f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                        {
                            Uploader.this = this;
                        }

                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            Object m76247p;
                            m76247p = Uploader.this.m76247p(hashMap);
                            return m76247p;
                        }
                    });
                }
            }
            this.f31194f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
                {
                    Uploader.this = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    Object m76246q;
                    m76246q = Uploader.this.m76246q(transportContext, j2);
                    return m76246q;
                }
            });
            return m76305ok;
        }
    }

    public void upload(final TransportContext transportContext, final int i, final Runnable runnable) {
        this.f31193e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.e
            {
                Uploader.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Uploader.this.m76244s(transportContext, i, runnable);
            }
        });
    }
}
