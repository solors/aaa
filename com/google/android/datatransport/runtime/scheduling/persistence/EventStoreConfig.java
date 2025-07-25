package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.auto.value.AutoValue;
import com.p552ot.pubsub.util.C26601v;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* loaded from: classes4.dex */
public abstract class EventStoreConfig {

    /* renamed from: a */
    static final EventStoreConfig f31257a = m76239a().mo76228f(10485760).mo76230d(200).mo76232b(10000).mo76231c(C26601v.f69834a).mo76229e(81920).mo76233a();

    /* JADX INFO: Access modifiers changed from: package-private */
    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class Builder {
        /* renamed from: a */
        abstract EventStoreConfig mo76233a();

        /* renamed from: b */
        abstract Builder mo76232b(int i);

        /* renamed from: c */
        abstract Builder mo76231c(long j);

        /* renamed from: d */
        abstract Builder mo76230d(int i);

        /* renamed from: e */
        abstract Builder mo76229e(int i);

        /* renamed from: f */
        abstract Builder mo76228f(long j);
    }

    /* renamed from: a */
    static Builder m76239a() {
        return new AutoValue_EventStoreConfig.Builder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo76238b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract long mo76237c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo76236d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo76235e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract long mo76234f();
}
