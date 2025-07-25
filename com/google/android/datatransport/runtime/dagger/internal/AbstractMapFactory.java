package com.google.android.datatransport.runtime.dagger.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import md.Provider;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {

    /* renamed from: a */
    private final Map<K, Provider<V>> f31099a;

    /* loaded from: classes4.dex */
    public static abstract class Builder<K, V, V2> {

        /* renamed from: a */
        final LinkedHashMap<K, Provider<V>> f31100a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(int i) {
            this.f31100a = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public Builder<K, V, V2> put(K k, Provider<V> provider) {
            this.f31100a.put(Preconditions.checkNotNull(k, "key"), Preconditions.checkNotNull(provider, IronSourceConstants.EVENTS_PROVIDER));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder<K, V, V2> putAll(Provider<Map<K, V2>> provider) {
            if (provider instanceof DelegateFactory) {
                return putAll(((DelegateFactory) provider).m76295a());
            }
            this.f31100a.putAll(((AbstractMapFactory) provider).f31099a);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractMapFactory(Map<K, Provider<V>> map) {
        this.f31099a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<K, Provider<V>> m76298b() {
        return this.f31099a;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public abstract /* synthetic */ Object get();
}
