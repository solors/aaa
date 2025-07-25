package com.google.android.datatransport.runtime.dagger.internal;

import md.Provider;

/* loaded from: classes4.dex */
public final class DelegateFactory<T> implements Factory<T> {

    /* renamed from: a */
    private Provider<T> f31101a;

    public static <T> void setDelegate(Provider<T> provider, Provider<T> provider2) {
        Preconditions.checkNotNull(provider2);
        DelegateFactory delegateFactory = (DelegateFactory) provider;
        if (delegateFactory.f31101a == null) {
            delegateFactory.f31101a = provider2;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Provider<T> m76295a() {
        return (Provider) Preconditions.checkNotNull(this.f31101a);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public T get() {
        Provider<T> provider = this.f31101a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }

    @Deprecated
    public void setDelegatedProvider(Provider<T> provider) {
        setDelegate(this, provider);
    }
}
