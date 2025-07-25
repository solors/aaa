package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.yandex.mobile.ads.impl.AbstractC30990o;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.q */
/* loaded from: classes8.dex */
public abstract class AbstractC31164q<K, V> implements m01<K, V> {
    @LazyInit

    /* renamed from: b */
    private transient Set<K> f84134b;
    @LazyInit

    /* renamed from: c */
    private transient Collection<V> f84135c;
    @LazyInit

    /* renamed from: d */
    private transient Map<K, Collection<V>> f84136d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.q$a */
    /* loaded from: classes8.dex */
    public class C31165a extends AbstractCollection<V> {

        /* renamed from: b */
        final /* synthetic */ AbstractC31164q f84137b;

        C31165a(AbstractC30990o abstractC30990o) {
            this.f84137b = abstractC30990o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((AbstractC30990o) this.f84137b).m31225d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            for (V v : ((jr0) this.f84137b.mo30546a()).values()) {
                if (v.contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            AbstractC30990o abstractC30990o = (AbstractC30990o) this.f84137b;
            abstractC30990o.getClass();
            return new C30895n(abstractC30990o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((AbstractC30990o) this.f84137b).m31219g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.m01
    /* renamed from: a */
    public Map<K, Collection<V>> mo30546a() {
        Map<K, Collection<V>> map = this.f84136d;
        if (map == null) {
            Map<K, Collection<V>> m31223e = ((q01) this).m31223e();
            this.f84136d = m31223e;
            return m31223e;
        }
        return map;
    }

    /* renamed from: b */
    public final Set<K> m30545b() {
        Set<K> set = this.f84134b;
        if (set == null) {
            Set<K> m31221f = ((q01) this).m31221f();
            this.f84134b = m31221f;
            return m31221f;
        }
        return set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m01) {
            return ((AbstractC30990o.C30991a) ((AbstractC30817m) this).mo30546a()).equals(((m01) obj).mo30546a());
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC30990o.C30991a) mo30546a()).f83204d.hashCode();
    }

    public final String toString() {
        return ((AbstractC30990o.C30991a) mo30546a()).f83204d.toString();
    }

    @Override // com.yandex.mobile.ads.impl.m01
    public Collection<V> values() {
        Collection<V> collection = this.f84135c;
        if (collection == null) {
            C31165a c31165a = new C31165a((AbstractC30990o) this);
            this.f84135c = c31165a;
            return c31165a;
        }
        return collection;
    }
}
