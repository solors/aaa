package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30990o;
import com.yandex.mobile.ads.impl.gt1;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
abstract class gr0<K, V> extends gt1.AbstractC30415c<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC30990o.C30991a.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return AbstractC30990o.C30991a.this.isEmpty();
    }

    @Override // com.yandex.mobile.ads.impl.gt1.AbstractC30415c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator<?> it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= ((AbstractC30990o.C30991a.C30992a) this).remove(it.next());
            }
            return z;
        }
    }

    @Override // com.yandex.mobile.ads.impl.gt1.AbstractC30415c, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        int i;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C30644jp.m32828a(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                i = (int) ((size / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                Set<Map.Entry<K, Collection<V>>> entrySet = AbstractC30990o.C30991a.this.f83204d.entrySet();
                entrySet.getClass();
                try {
                    if (entrySet.contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return AbstractC30990o.C30991a.this.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return AbstractC30990o.C30991a.this.f83204d.size();
    }
}
