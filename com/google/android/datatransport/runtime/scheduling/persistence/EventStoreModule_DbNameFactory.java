package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* loaded from: classes4.dex */
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {

        /* renamed from: a */
        private static final EventStoreModule_DbNameFactory f31258a = new EventStoreModule_DbNameFactory();

        private InstanceHolder() {
        }
    }

    public static EventStoreModule_DbNameFactory create() {
        return InstanceHolder.f31258a;
    }

    public static String dbName() {
        return (String) Preconditions.checkNotNull(EventStoreModule.m76227a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public String get() {
        return dbName();
    }
}
