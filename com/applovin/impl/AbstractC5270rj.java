package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.applovin.impl.rj */
/* loaded from: classes2.dex */
public abstract class AbstractC5270rj {

    /* renamed from: com.applovin.impl.rj$a */
    /* loaded from: classes2.dex */
    class C5271a extends AbstractC5274c {

        /* renamed from: a */
        final /* synthetic */ Set f9454a;

        /* renamed from: b */
        final /* synthetic */ Set f9455b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.applovin.impl.rj$a$a */
        /* loaded from: classes2.dex */
        public class C5272a extends AbstractC4218d {

            /* renamed from: c */
            final Iterator f9456c;

            C5272a() {
                this.f9456c = C5271a.this.f9454a.iterator();
            }

            @Override // com.applovin.impl.AbstractC4218d
            /* renamed from: a */
            protected Object mo95829a() {
                while (this.f9456c.hasNext()) {
                    Object next = this.f9456c.next();
                    if (C5271a.this.f9455b.contains(next)) {
                        return next;
                    }
                }
                return m100048b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5271a(Set set, Set set2) {
            super(null);
            this.f9454a = set;
            this.f9455b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.f9454a.contains(obj) && this.f9455b.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            if (this.f9454a.containsAll(collection) && this.f9455b.containsAll(collection)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f9455b, this.f9454a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (Object obj : this.f9454a) {
                if (this.f9455b.contains(obj)) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public AbstractC5139pp iterator() {
            return new C5272a();
        }
    }

    /* renamed from: com.applovin.impl.rj$b */
    /* loaded from: classes2.dex */
    static abstract class AbstractC5273b extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return AbstractC5270rj.m95833a((Set) this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    /* renamed from: com.applovin.impl.rj$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5274c extends AbstractSet {
        private AbstractC5274c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ AbstractC5274c(AbstractC5203qj abstractC5203qj) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m95834a(Set set, Object obj) {
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

    /* renamed from: b */
    public static Set m95830b() {
        return Collections.newSetFromMap(AbstractC5622uc.m94167b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m95835a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: a */
    public static AbstractC5274c m95831a(Set set, Set set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C5271a(set, set2);
    }

    /* renamed from: a */
    static boolean m95833a(Set set, Collection collection) {
        Preconditions.checkNotNull(collection);
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return AbstractC5767wb.m93592a(set.iterator(), collection);
        }
        return m95832a(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m95832a(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public static HashSet m95837a() {
        return new HashSet();
    }

    /* renamed from: a */
    public static HashSet m95836a(int i) {
        return new HashSet(AbstractC5622uc.m94172a(i));
    }
}
