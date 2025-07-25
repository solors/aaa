package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* loaded from: classes4.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {

        /* renamed from: a */
        private static final EventStoreModule_StoreConfigFactory f31261a = new EventStoreModule_StoreConfigFactory();

        private InstanceHolder() {
        }
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return InstanceHolder.f31261a;
    }

    public static EventStoreConfig storeConfig() {
        return (EventStoreConfig) Preconditions.checkNotNull(EventStoreModule.m76224d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public EventStoreConfig get() {
        return storeConfig();
    }
}
