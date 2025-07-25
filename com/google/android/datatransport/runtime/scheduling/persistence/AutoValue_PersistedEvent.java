package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoValue_PersistedEvent extends PersistedEvent {

    /* renamed from: a */
    private final long f31254a;

    /* renamed from: b */
    private final TransportContext f31255b;

    /* renamed from: c */
    private final EventInternal f31256c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PersistedEvent(long j, TransportContext transportContext, EventInternal eventInternal) {
        this.f31254a = j;
        if (transportContext != null) {
            this.f31255b = transportContext;
            if (eventInternal != null) {
                this.f31256c = eventInternal;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        if (this.f31254a == persistedEvent.getId() && this.f31255b.equals(persistedEvent.getTransportContext()) && this.f31256c.equals(persistedEvent.getEvent())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public EventInternal getEvent() {
        return this.f31256c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.f31254a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public TransportContext getTransportContext() {
        return this.f31255b;
    }

    public int hashCode() {
        long j = this.f31254a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f31255b.hashCode()) * 1000003) ^ this.f31256c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f31254a + ", transportContext=" + this.f31255b + ", event=" + this.f31256c + "}";
    }
}
