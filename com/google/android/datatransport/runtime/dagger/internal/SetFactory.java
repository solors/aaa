package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import md.Provider;

/* loaded from: classes4.dex */
public final class SetFactory<T> implements Factory<Set<T>> {

    /* renamed from: c */
    private static final Factory<Set<Object>> f31112c = InstanceFactory.create(Collections.emptySet());

    /* renamed from: a */
    private final List<Provider<T>> f31113a;

    /* renamed from: b */
    private final List<Provider<Collection<T>>> f31114b;

    /* loaded from: classes4.dex */
    public static final class Builder<T> {

        /* renamed from: a */
        private final List<Provider<T>> f31115a;

        /* renamed from: b */
        private final List<Provider<Collection<T>>> f31116b;

        public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> provider) {
            this.f31116b.add(provider);
            return this;
        }

        public Builder<T> addProvider(Provider<? extends T> provider) {
            this.f31115a.add(provider);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.f31115a, this.f31116b);
        }

        private Builder(int i, int i2) {
            this.f31115a = DaggerCollections.presizedList(i);
            this.f31116b = DaggerCollections.presizedList(i2);
        }
    }

    public static <T> Builder<T> builder(int i, int i2) {
        return new Builder<>(i, i2);
    }

    public static <T> Factory<Set<T>> empty() {
        return (Factory<Set<T>>) f31112c;
    }

    private SetFactory(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.f31113a = list;
        this.f31114b = list2;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public Set<T> get() {
        int size = this.f31113a.size();
        ArrayList arrayList = new ArrayList(this.f31114b.size());
        int size2 = this.f31114b.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.f31114b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet m76296b = DaggerCollections.m76296b(size);
        int size3 = this.f31113a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            m76296b.add(Preconditions.checkNotNull(this.f31113a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                m76296b.add(Preconditions.checkNotNull(obj));
            }
        }
        return Collections.unmodifiableSet(m76296b);
    }
}
