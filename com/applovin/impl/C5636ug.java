package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.applovin.impl.ug */
/* loaded from: classes2.dex */
public class C5636ug implements Set, RandomAccess {

    /* renamed from: a */
    private final ArrayList f11269a = new ArrayList();

    /* renamed from: b */
    private final HashSet f11270b = new HashSet();

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (!isEmpty() && comparable.compareTo(m94086a()) <= 0) {
            this.f11269a.add(m94081b(comparable), comparable);
        } else {
            this.f11269a.add(comparable);
        }
        return this.f11270b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* renamed from: b */
    public int m94081b(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.f11269a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable m94085a = m94085a(binarySearch);
        while (binarySearch >= 0 && m94085a == m94085a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    /* renamed from: c */
    public int m94080c(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.f11269a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable m94085a = m94085a(binarySearch);
        while (binarySearch < size() && m94085a == m94085a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f11269a.clear();
        this.f11270b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f11270b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f11270b.containsAll(collection);
    }

    /* renamed from: d */
    public int m94079d(Comparable comparable) {
        if (comparable != null && contains(comparable)) {
            return m94081b(comparable);
        }
        return -1;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f11269a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f11269a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int m94079d = m94079d((Comparable) obj);
        if (m94079d == -1) {
            return false;
        }
        this.f11269a.remove(m94079d);
        return this.f11270b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                if (z || remove(obj)) {
                    z = true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f11269a.get(size);
            if (!collection.contains(comparable)) {
                this.f11269a.remove(size);
                this.f11270b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f11269a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f11269a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f11269a.toArray(objArr);
    }

    /* renamed from: b */
    public Comparable m94082b(int i) {
        Comparable comparable = (Comparable) this.f11269a.remove(i);
        this.f11270b.remove(comparable);
        return comparable;
    }

    /* renamed from: a */
    public Comparable m94085a(int i) {
        return (Comparable) this.f11269a.get(i);
    }

    /* renamed from: a */
    public Comparable m94086a() {
        return (Comparable) this.f11269a.get(size() - 1);
    }

    /* renamed from: a */
    public void m94084a(int i, Comparable comparable) {
        this.f11270b.remove((Comparable) this.f11269a.get(i));
        this.f11269a.set(i, comparable);
        this.f11270b.add(comparable);
    }
}
