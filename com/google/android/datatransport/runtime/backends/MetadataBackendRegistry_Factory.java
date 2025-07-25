package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import md.Provider;

/* loaded from: classes4.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {

    /* renamed from: a */
    private final Provider<Context> f31097a;

    /* renamed from: b */
    private final Provider<CreationContextFactory> f31098b;

    public MetadataBackendRegistry_Factory(Provider<Context> provider, Provider<CreationContextFactory> provider2) {
        this.f31097a = provider;
        this.f31098b = provider2;
    }

    public static MetadataBackendRegistry_Factory create(Provider<Context> provider, Provider<CreationContextFactory> provider2) {
        return new MetadataBackendRegistry_Factory(provider, provider2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public MetadataBackendRegistry get() {
        return newInstance(this.f31097a.get(), this.f31098b.get());
    }
}
