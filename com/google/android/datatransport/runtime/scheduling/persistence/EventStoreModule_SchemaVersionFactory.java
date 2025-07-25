package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* loaded from: classes4.dex */
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {

        /* renamed from: a */
        private static final EventStoreModule_SchemaVersionFactory f31260a = new EventStoreModule_SchemaVersionFactory();

        private InstanceHolder() {
        }
    }

    public static EventStoreModule_SchemaVersionFactory create() {
        return InstanceHolder.f31260a;
    }

    public static int schemaVersion() {
        return EventStoreModule.m76225c();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}
