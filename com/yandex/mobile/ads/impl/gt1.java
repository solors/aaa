package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes8.dex */
public final class gt1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.gt1$a */
    /* loaded from: classes8.dex */
    public static class C30413a<E> extends C30741kp<E> implements Set<E> {
        C30413a(Set<E> set, vf1<? super E> vf1Var) {
            super(set, vf1Var);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return gt1.m33774a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return gt1.m33776a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt1$b */
    /* loaded from: classes8.dex */
    private static class C30414b<E> extends C30413a<E> implements SortedSet<E> {
        C30414b(SortedSet<E> sortedSet, vf1<? super E> vf1Var) {
            super(sortedSet, vf1Var);
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f81511b).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f81511b.iterator();
            vf1<? super E> vf1Var = this.f81512c;
            it.getClass();
            vf1Var.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (vf1Var.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e) {
            return new C30414b(((SortedSet) this.f81511b).headSet(e), this.f81512c);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSet = (SortedSet) this.f81511b;
            while (true) {
                ?? r1 = (Object) sortedSet.last();
                if (this.f81512c.apply(r1)) {
                    return r1;
                }
                sortedSet = sortedSet.headSet(r1);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e, E e2) {
            return new C30414b(((SortedSet) this.f81511b).subSet(e, e2), this.f81512c);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e) {
            return new C30414b(((SortedSet) this.f81511b).tailSet(e), this.f81512c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt1$c */
    /* loaded from: classes8.dex */
    static abstract class AbstractC30415c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof r01) {
                collection = ((r01) collection).m30175a();
            }
            boolean z = false;
            if ((collection instanceof Set) && collection.size() > size()) {
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            } else {
                Iterator<?> it2 = collection.iterator();
                while (it2.hasNext()) {
                    z |= remove(it2.next());
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt1$d */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC30416d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private AbstractC30416d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m33774a(Set<?> set, Object obj) {
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
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static <E> Set<E> m33775a(Set<E> set, vf1<? super E> vf1Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof C30413a) {
                C30413a c30413a = (C30413a) sortedSet;
                return new C30414b((SortedSet) c30413a.f81511b, wf1.m27918a(c30413a.f81512c, vf1Var));
            }
            sortedSet.getClass();
            vf1Var.getClass();
            return new C30414b(sortedSet, vf1Var);
        } else if (set instanceof C30413a) {
            C30413a c30413a2 = (C30413a) set;
            return new C30413a((Set) c30413a2.f81511b, wf1.m27918a(c30413a2.f81512c, vf1Var));
        } else {
            set.getClass();
            vf1Var.getClass();
            return new C30413a(set, vf1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m33776a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: a */
    public static AbstractC30416d m33777a(qh0 qh0Var, qh0 qh0Var2) {
        if (qh0Var != null) {
            if (qh0Var2 != null) {
                return new ft1(qh0Var, qh0Var2);
            }
            throw new NullPointerException("set2");
        }
        throw new NullPointerException("set1");
    }

    /* renamed from: a */
    public static <E> Set<E> m33778a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }
}
