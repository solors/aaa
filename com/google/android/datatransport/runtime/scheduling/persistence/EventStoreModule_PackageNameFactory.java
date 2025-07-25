package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import md.Provider;

/* loaded from: classes4.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {

    /* renamed from: a */
    private final Provider<Context> f31259a;

    public EventStoreModule_PackageNameFactory(Provider<Context> provider) {
        this.f31259a = provider;
    }

    public static EventStoreModule_PackageNameFactory create(Provider<Context> provider) {
        return new EventStoreModule_PackageNameFactory(provider);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNull(EventStoreModule.m76226b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public String get() {
        return packageName(this.f31259a.get());
    }
}
