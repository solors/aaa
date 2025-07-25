package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import md.Provider;

/* loaded from: classes4.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {

    /* renamed from: a */
    private final Provider<Context> f31089a;

    /* renamed from: b */
    private final Provider<Clock> f31090b;

    /* renamed from: c */
    private final Provider<Clock> f31091c;

    public CreationContextFactory_Factory(Provider<Context> provider, Provider<Clock> provider2, Provider<Clock> provider3) {
        this.f31089a = provider;
        this.f31090b = provider2;
        this.f31091c = provider3;
    }

    public static CreationContextFactory_Factory create(Provider<Context> provider, Provider<Clock> provider2, Provider<Clock> provider3) {
        return new CreationContextFactory_Factory(provider, provider2, provider3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public CreationContextFactory get() {
        return newInstance(this.f31089a.get(), this.f31090b.get(), this.f31091c.get());
    }
}
