package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    /* renamed from: r */
    private List<Present<V>> f41780r;

    /* loaded from: classes4.dex */
    static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ListFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
            super(immutableCollection, z);
            m67704R();
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public List<V> combine(List<Present<V>> list) {
            ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            Iterator<Present<V>> it = list.iterator();
            while (it.hasNext()) {
                Present<V> next = it.next();
                newArrayListWithCapacity.add(next != null ? next.f41781a : null);
            }
            return Collections.unmodifiableList(newArrayListWithCapacity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Present<V> {

        /* renamed from: a */
        V f41781a;

        Present(V v) {
            this.f41781a = v;
        }
    }

    CollectionFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
        super(immutableCollection, z, true);
        List<Present<V>> newArrayListWithCapacity;
        if (immutableCollection.isEmpty()) {
            newArrayListWithCapacity = Collections.emptyList();
        } else {
            newArrayListWithCapacity = Lists.newArrayListWithCapacity(immutableCollection.size());
        }
        for (int i = 0; i < immutableCollection.size(); i++) {
            newArrayListWithCapacity.add(null);
        }
        this.f41780r = newArrayListWithCapacity;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: M */
    final void mo67633M(int i, @ParametricNullness V v) {
        List<Present<V>> list = this.f41780r;
        if (list != null) {
            list.set(i, new Present<>(v));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: P */
    final void mo67632P() {
        List<Present<V>> list = this.f41780r;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: W */
    void mo67631W(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo67631W(releaseResourcesReason);
        this.f41780r = null;
    }

    abstract C combine(List<Present<V>> list);
}
