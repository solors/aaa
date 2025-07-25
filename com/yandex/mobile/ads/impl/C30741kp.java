package com.yandex.mobile.ads.impl;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.impl.kp */
/* loaded from: classes8.dex */
public class C30741kp<E> extends AbstractCollection<E> {

    /* renamed from: b */
    final Collection<E> f81511b;

    /* renamed from: c */
    final vf1<? super E> f81512c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30741kp(Collection<E> collection, vf1<? super E> vf1Var) {
        this.f81511b = collection;
        this.f81512c = vf1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        if (this.f81512c.apply(e)) {
            return this.f81511b.add(e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        for (E e : collection) {
            if (!this.f81512c.apply(e)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f81511b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ln0.m32223a(this.f81511b, this.f81512c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Collection<E> collection = this.f81511b;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f81512c.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<E> collection = this.f81511b;
        vf1<? super E> vf1Var = this.f81512c;
        Iterator<T> it = collection.iterator();
        if (vf1Var != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (vf1Var.apply((Object) it.next())) {
                    if (i != -1) {
                        z = true;
                    }
                } else {
                    i++;
                }
            }
            return !z;
        }
        throw new NullPointerException("predicate");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f81511b.iterator();
        vf1<? super E> vf1Var = this.f81512c;
        it.getClass();
        vf1Var.getClass();
        return new mn0(it, vf1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f81511b.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f81511b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f81512c.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f81511b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f81512c.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (E e : this.f81511b) {
            if (this.f81512c.apply(e)) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC30686k abstractC30686k = (AbstractC30686k) it;
            if (abstractC30686k.hasNext()) {
                arrayList.add(abstractC30686k.next());
            } else {
                return arrayList.toArray();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC30686k abstractC30686k = (AbstractC30686k) it;
            if (abstractC30686k.hasNext()) {
                arrayList.add(abstractC30686k.next());
            } else {
                return (T[]) arrayList.toArray(tArr);
            }
        }
    }
}
