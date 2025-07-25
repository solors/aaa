package com.bytedance.adsdk.p183IL;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.bytedance.adsdk.IL.Lq */
/* loaded from: classes3.dex */
abstract class AbstractC6678Lq<K, V> {

    /* renamed from: IL */
    AbstractC6678Lq<K, V>.C6679IL f14168IL;

    /* renamed from: com.bytedance.adsdk.IL.Lq$IL */
    /* loaded from: classes3.dex */
    final class C6679IL implements Set<K> {
        C6679IL() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC6678Lq.this.mo90866bX();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC6678Lq.this.mo90862bg(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC6678Lq.m91160bg(AbstractC6678Lq.this.mo90867IL(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC6678Lq.m91159bg(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i = 0;
            for (int mo90865bg = AbstractC6678Lq.this.mo90865bg() - 1; mo90865bg >= 0; mo90865bg--) {
                Object mo90863bg = AbstractC6678Lq.this.mo90863bg(mo90865bg, 0);
                if (mo90863bg == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo90863bg.hashCode();
                }
                i += hashCode;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (AbstractC6678Lq.this.mo90865bg() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C6680bg(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo90862bg = AbstractC6678Lq.this.mo90862bg(obj);
            if (mo90862bg >= 0) {
                AbstractC6678Lq.this.mo90864bg(mo90862bg);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC6678Lq.m91162IL(AbstractC6678Lq.this.mo90867IL(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC6678Lq.m91161bX(AbstractC6678Lq.this.mo90867IL(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC6678Lq.this.mo90865bg();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC6678Lq.this.m91163IL(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC6678Lq.this.m91158bg(tArr, 0);
        }
    }

    /* renamed from: com.bytedance.adsdk.IL.Lq$bg */
    /* loaded from: classes3.dex */
    final class C6680bg<T> implements Iterator<T> {

        /* renamed from: IL */
        int f14170IL;

        /* renamed from: bX */
        int f14171bX;

        /* renamed from: bg */
        final int f14172bg;
        boolean eqN = false;

        C6680bg(int i) {
            this.f14172bg = i;
            this.f14170IL = AbstractC6678Lq.this.mo90865bg();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14171bX < this.f14170IL) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC6678Lq.this.mo90863bg(this.f14171bX, this.f14172bg);
                this.f14171bX++;
                this.eqN = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.eqN) {
                int i = this.f14171bX - 1;
                this.f14171bX = i;
                this.f14170IL--;
                this.eqN = false;
                AbstractC6678Lq.this.mo90864bg(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: IL */
    public static <K, V> boolean m91162IL(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: bX */
    public static <K, V> boolean m91161bX(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static <K, V> boolean m91160bg(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: IL */
    protected abstract Map<K, V> mo90867IL();

    /* renamed from: bX */
    protected abstract void mo90866bX();

    /* renamed from: bg */
    protected abstract int mo90865bg();

    /* renamed from: bg */
    protected abstract int mo90862bg(Object obj);

    /* renamed from: bg */
    protected abstract Object mo90863bg(int i, int i2);

    /* renamed from: bg */
    protected abstract void mo90864bg(int i);

    public Set<K> eqN() {
        if (this.f14168IL == null) {
            this.f14168IL = new C6679IL();
        }
        return this.f14168IL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: bg */
    public <T> T[] m91158bg(T[] tArr, int i) {
        int mo90865bg = mo90865bg();
        if (tArr.length < mo90865bg) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo90865bg));
        }
        for (int i2 = 0; i2 < mo90865bg; i2++) {
            tArr[i2] = mo90863bg(i2, i);
        }
        if (tArr.length > mo90865bg) {
            tArr[mo90865bg] = null;
        }
        return tArr;
    }

    /* renamed from: IL */
    public Object[] m91163IL(int i) {
        int mo90865bg = mo90865bg();
        Object[] objArr = new Object[mo90865bg];
        for (int i2 = 0; i2 < mo90865bg; i2++) {
            objArr[i2] = mo90863bg(i2, i);
        }
        return objArr;
    }

    /* renamed from: bg */
    public static <T> boolean m91159bg(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
