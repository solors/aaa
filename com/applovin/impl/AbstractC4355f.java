package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.AbstractC4496h;
import com.applovin.impl.AbstractC5622uc;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4355f extends AbstractC4496h implements Serializable {

    /* renamed from: d */
    private transient Map f5987d;

    /* renamed from: f */
    private transient int f5988f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.f$b */
    /* loaded from: classes2.dex */
    public class C4357b extends AbstractC5622uc.AbstractC5630f {

        /* renamed from: c */
        final transient Map f5990c;

        /* renamed from: com.applovin.impl.f$b$a */
        /* loaded from: classes2.dex */
        class C4358a extends AbstractC5622uc.AbstractC5627c {
            C4358a() {
            }

            @Override // com.applovin.impl.AbstractC5622uc.AbstractC5627c
            /* renamed from: a */
            Map mo94160a() {
                return C4357b.this;
            }

            @Override // com.applovin.impl.AbstractC5622uc.AbstractC5627c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC5168q3.m96426a(C4357b.this.f5990c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C4359b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    AbstractC4355f.this.m99433c(((Map.Entry) obj).getKey());
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.applovin.impl.f$b$b */
        /* loaded from: classes2.dex */
        class C4359b implements Iterator {

            /* renamed from: a */
            final Iterator f5993a;

            /* renamed from: b */
            Collection f5994b;

            C4359b() {
                this.f5993a = C4357b.this.f5990c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f5993a.next();
                this.f5994b = (Collection) entry.getValue();
                return C4357b.this.m99429a(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f5993a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.f5994b != null) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC5103p3.m96596a(z);
                this.f5993a.remove();
                AbstractC4355f.m99437b(AbstractC4355f.this, this.f5994b.size());
                this.f5994b.clear();
                this.f5994b = null;
            }
        }

        C4357b(Map map) {
            this.f5990c = map;
        }

        /* renamed from: a */
        Map.Entry m99429a(Map.Entry entry) {
            Object key = entry.getKey();
            return AbstractC5622uc.m94171a(key, AbstractC4355f.this.mo99441a(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f5990c == AbstractC4355f.this.f5987d) {
                AbstractC4355f.this.clear();
            } else {
                AbstractC5767wb.m93594a((Iterator) new C4359b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return AbstractC5622uc.m94166b(this.f5990c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            if (this != obj && !this.f5990c.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f5990c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractC4355f.this.m98856e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f5990c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f5990c.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection get(Object obj) {
            Collection collection = (Collection) AbstractC5622uc.m94164c(this.f5990c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC4355f.this.mo99441a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f5990c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection mo93521g = AbstractC4355f.this.mo93521g();
            mo93521g.addAll(collection);
            AbstractC4355f.m99437b(AbstractC4355f.this, collection.size());
            collection.clear();
            return mo93521g;
        }

        @Override // com.applovin.impl.AbstractC5622uc.AbstractC5630f
        /* renamed from: a */
        protected Set mo94157a() {
            return new C4358a();
        }
    }

    /* renamed from: com.applovin.impl.f$c */
    /* loaded from: classes2.dex */
    private abstract class AbstractC4360c implements Iterator {

        /* renamed from: a */
        final Iterator f5996a;

        /* renamed from: b */
        Object f5997b = null;

        /* renamed from: c */
        Collection f5998c = null;

        /* renamed from: d */
        Iterator f5999d = AbstractC5767wb.m93588c();

        AbstractC4360c() {
            this.f5996a = AbstractC4355f.this.f5987d.entrySet().iterator();
        }

        /* renamed from: a */
        abstract Object mo99427a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f5996a.hasNext() && !this.f5999d.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f5999d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f5996a.next();
                this.f5997b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f5998c = collection;
                this.f5999d = collection.iterator();
            }
            return mo99427a(this.f5997b, this.f5999d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f5999d.remove();
            if (this.f5998c.isEmpty()) {
                this.f5996a.remove();
            }
            AbstractC4355f.m99434c(AbstractC4355f.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.f$d */
    /* loaded from: classes2.dex */
    public class C4361d extends AbstractC5622uc.C5628d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.applovin.impl.f$d$a */
        /* loaded from: classes2.dex */
        public class C4362a implements Iterator {

            /* renamed from: a */
            Map.Entry f6002a;

            /* renamed from: b */
            final /* synthetic */ Iterator f6003b;

            C4362a(Iterator it) {
                this.f6003b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f6003b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f6003b.next();
                this.f6002a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.f6002a != null) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC5103p3.m96596a(z);
                Collection collection = (Collection) this.f6002a.getValue();
                this.f6003b.remove();
                AbstractC4355f.m99437b(AbstractC4355f.this, collection.size());
                collection.clear();
                this.f6002a = null;
            }
        }

        C4361d(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC5767wb.m93594a(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return m94159a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (this != obj && !m94159a().keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m94159a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C4362a(m94159a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Collection collection = (Collection) m94159a().remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                AbstractC4355f.m99437b(AbstractC4355f.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.f$e */
    /* loaded from: classes2.dex */
    public class C4363e extends C4366h implements NavigableMap {
        C4363e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.impl.AbstractC4355f.C4366h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.applovin.impl.AbstractC4355f.C4366h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: b */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = mo99415d().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return m99429a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return mo99415d().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return new C4363e(mo99415d().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.AbstractC4355f.C4366h
        /* renamed from: e */
        public NavigableSet mo99416c() {
            return new C4364f(mo99415d());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.AbstractC4355f.C4366h
        /* renamed from: f */
        public NavigableMap mo99415d() {
            return (NavigableMap) super.mo99415d();
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry firstEntry = mo99415d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m99429a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = mo99415d().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return m99429a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return mo99415d().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = mo99415d().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return m99429a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return mo99415d().higherKey(obj);
        }

        @Override // com.applovin.impl.AbstractC4355f.C4366h, com.applovin.impl.AbstractC4355f.C4357b, java.util.AbstractMap, java.util.Map
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry lastEntry = mo99415d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m99429a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = mo99415d().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return m99429a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return mo99415d().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return m99424a(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return m99424a(descendingMap().entrySet().iterator());
        }

        /* renamed from: a */
        Map.Entry m99424a(Iterator it) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Collection mo93521g = AbstractC4355f.this.mo93521g();
                mo93521g.addAll((Collection) entry.getValue());
                it.remove();
                return AbstractC5622uc.m94171a(entry.getKey(), AbstractC4355f.this.mo99432c(mo93521g));
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return new C4363e(mo99415d().headMap(obj, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return new C4363e(mo99415d().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return new C4363e(mo99415d().tailMap(obj, z));
        }

        @Override // com.applovin.impl.AbstractC4355f.C4366h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.f$f */
    /* loaded from: classes2.dex */
    public class C4364f extends C4367i implements NavigableSet {
        C4364f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.impl.AbstractC4355f.C4367i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.AbstractC4355f.C4367i
        /* renamed from: c */
        public NavigableMap mo99414b() {
            return (NavigableMap) super.mo99414b();
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return mo99414b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new C4364f(mo99414b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return mo99414b().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return mo99414b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return mo99414b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return AbstractC5767wb.m93587c(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return AbstractC5767wb.m93587c(descendingIterator());
        }

        @Override // com.applovin.impl.AbstractC4355f.C4367i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.applovin.impl.AbstractC4355f.C4367i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: b */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return new C4364f(mo99414b().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new C4364f(mo99414b().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return new C4364f(mo99414b().tailMap(obj, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.f$g */
    /* loaded from: classes2.dex */
    public class C4365g extends C4370k implements RandomAccess {
        C4365g(Object obj, List list, C4368j c4368j) {
            super(obj, list, c4368j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.f$h */
    /* loaded from: classes2.dex */
    public class C4366h extends C4357b implements SortedMap {

        /* renamed from: f */
        SortedSet f6008f;

        C4366h(SortedMap sortedMap) {
            super(sortedMap);
        }

        /* renamed from: c */
        SortedSet mo99416c() {
            return new C4367i(mo99415d());
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return mo99415d().comparator();
        }

        /* renamed from: d */
        SortedMap mo99415d() {
            return (SortedMap) this.f5990c;
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return mo99415d().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new C4366h(mo99415d().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return mo99415d().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new C4366h(mo99415d().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new C4366h(mo99415d().tailMap(obj));
        }

        @Override // com.applovin.impl.AbstractC4355f.C4357b, java.util.AbstractMap, java.util.Map
        public SortedSet keySet() {
            SortedSet sortedSet = this.f6008f;
            if (sortedSet == null) {
                SortedSet mo99416c = mo99416c();
                this.f6008f = mo99416c;
                return mo99416c;
            }
            return sortedSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.f$i */
    /* loaded from: classes2.dex */
    public class C4367i extends C4361d implements SortedSet {
        C4367i(SortedMap sortedMap) {
            super(sortedMap);
        }

        /* renamed from: b */
        SortedMap mo99414b() {
            return (SortedMap) super.m94159a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return mo99414b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return mo99414b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new C4367i(mo99414b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return mo99414b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new C4367i(mo99414b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new C4367i(mo99414b().tailMap(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4355f(Map map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f5987d = map;
    }

    /* renamed from: b */
    static /* synthetic */ int m99438b(AbstractC4355f abstractC4355f) {
        int i = abstractC4355f.f5988f;
        abstractC4355f.f5988f = i + 1;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m99434c(AbstractC4355f abstractC4355f) {
        int i = abstractC4355f.f5988f;
        abstractC4355f.f5988f = i - 1;
        return i;
    }

    /* renamed from: a */
    abstract Collection mo99441a(Object obj, Collection collection);

    /* renamed from: c */
    abstract Collection mo99432c(Collection collection);

    @Override // com.applovin.impl.InterfaceC5561tf
    public void clear() {
        for (Collection collection : this.f5987d.values()) {
            collection.clear();
        }
        this.f5987d.clear();
        this.f5988f = 0;
    }

    @Override // com.applovin.impl.AbstractC4496h
    /* renamed from: d */
    Collection mo98857d() {
        return new AbstractC4496h.C4497a();
    }

    @Override // com.applovin.impl.AbstractC4496h
    /* renamed from: f */
    Iterator mo98855f() {
        return new C4356a();
    }

    /* renamed from: g */
    abstract Collection mo93521g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final Map m99431h() {
        Map map = this.f5987d;
        if (map instanceof NavigableMap) {
            return new C4363e((NavigableMap) this.f5987d);
        }
        if (map instanceof SortedMap) {
            return new C4366h((SortedMap) this.f5987d);
        }
        return new C4357b(this.f5987d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final Set m99430i() {
        Map map = this.f5987d;
        if (map instanceof NavigableMap) {
            return new C4364f((NavigableMap) this.f5987d);
        }
        if (map instanceof SortedMap) {
            return new C4367i((SortedMap) this.f5987d);
        }
        return new C4361d(this.f5987d);
    }

    @Override // com.applovin.impl.InterfaceC5561tf
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f5987d.get(obj);
        if (collection == null) {
            Collection m99436b = m99436b(obj);
            if (m99436b.add(obj2)) {
                this.f5988f++;
                this.f5987d.put(obj, m99436b);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f5988f++;
            return true;
        } else {
            return false;
        }
    }

    @Override // com.applovin.impl.InterfaceC5561tf
    public int size() {
        return this.f5988f;
    }

    @Override // com.applovin.impl.AbstractC4496h, com.applovin.impl.InterfaceC5561tf
    public Collection values() {
        return super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.f$j */
    /* loaded from: classes2.dex */
    public class C4368j extends AbstractCollection {

        /* renamed from: a */
        final Object f6011a;

        /* renamed from: b */
        Collection f6012b;

        /* renamed from: c */
        final C4368j f6013c;

        /* renamed from: d */
        final Collection f6014d;

        C4368j(Object obj, Collection collection, C4368j c4368j) {
            Collection m99411c;
            this.f6011a = obj;
            this.f6012b = collection;
            this.f6013c = c4368j;
            if (c4368j == null) {
                m99411c = null;
            } else {
                m99411c = c4368j.m99411c();
            }
            this.f6014d = m99411c;
        }

        /* renamed from: a */
        void m99413a() {
            C4368j c4368j = this.f6013c;
            if (c4368j != null) {
                c4368j.m99413a();
            } else {
                AbstractC4355f.this.f5987d.put(this.f6011a, this.f6012b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            m99409e();
            boolean isEmpty = this.f6012b.isEmpty();
            boolean add = this.f6012b.add(obj);
            if (add) {
                AbstractC4355f.m99438b(AbstractC4355f.this);
                if (isEmpty) {
                    m99413a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f6012b.addAll(collection);
            if (addAll) {
                AbstractC4355f.m99443a(AbstractC4355f.this, this.f6012b.size() - size);
                if (size == 0) {
                    m99413a();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        C4368j m99412b() {
            return this.f6013c;
        }

        /* renamed from: c */
        Collection m99411c() {
            return this.f6012b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f6012b.clear();
            AbstractC4355f.m99437b(AbstractC4355f.this, size);
            m99408f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m99409e();
            return this.f6012b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            m99409e();
            return this.f6012b.containsAll(collection);
        }

        /* renamed from: d */
        Object m99410d() {
            return this.f6011a;
        }

        /* renamed from: e */
        void m99409e() {
            Collection collection;
            C4368j c4368j = this.f6013c;
            if (c4368j != null) {
                c4368j.m99409e();
                if (this.f6013c.m99411c() != this.f6014d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f6012b.isEmpty() && (collection = (Collection) AbstractC4355f.this.f5987d.get(this.f6011a)) != null) {
                this.f6012b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m99409e();
            return this.f6012b.equals(obj);
        }

        /* renamed from: f */
        void m99408f() {
            C4368j c4368j = this.f6013c;
            if (c4368j != null) {
                c4368j.m99408f();
            } else if (this.f6012b.isEmpty()) {
                AbstractC4355f.this.f5987d.remove(this.f6011a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m99409e();
            return this.f6012b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            m99409e();
            return new C4369a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m99409e();
            boolean remove = this.f6012b.remove(obj);
            if (remove) {
                AbstractC4355f.m99434c(AbstractC4355f.this);
                m99408f();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f6012b.removeAll(collection);
            if (removeAll) {
                AbstractC4355f.m99443a(AbstractC4355f.this, this.f6012b.size() - size);
                m99408f();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f6012b.retainAll(collection);
            if (retainAll) {
                AbstractC4355f.m99443a(AbstractC4355f.this, this.f6012b.size() - size);
                m99408f();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m99409e();
            return this.f6012b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m99409e();
            return this.f6012b.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.applovin.impl.f$j$a */
        /* loaded from: classes2.dex */
        public class C4369a implements Iterator {

            /* renamed from: a */
            final Iterator f6016a;

            /* renamed from: b */
            final Collection f6017b;

            C4369a() {
                Collection collection = C4368j.this.f6012b;
                this.f6017b = collection;
                this.f6016a = AbstractC4355f.m99435b(collection);
            }

            /* renamed from: a */
            Iterator m99407a() {
                m99406b();
                return this.f6016a;
            }

            /* renamed from: b */
            void m99406b() {
                C4368j.this.m99409e();
                if (C4368j.this.f6012b == this.f6017b) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m99406b();
                return this.f6016a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                m99406b();
                return this.f6016a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f6016a.remove();
                AbstractC4355f.m99434c(AbstractC4355f.this);
                C4368j.this.m99408f();
            }

            C4369a(Iterator it) {
                this.f6017b = C4368j.this.f6012b;
                this.f6016a = it;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.f$k */
    /* loaded from: classes2.dex */
    public class C4370k extends C4368j implements List {

        /* renamed from: com.applovin.impl.f$k$a */
        /* loaded from: classes2.dex */
        private class C4371a extends C4368j.C4369a implements ListIterator {
            C4371a() {
                super();
            }

            /* renamed from: c */
            private ListIterator m99404c() {
                return (ListIterator) m99407a();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = C4370k.this.isEmpty();
                m99404c().add(obj);
                AbstractC4355f.m99438b(AbstractC4355f.this);
                if (isEmpty) {
                    C4370k.this.m99413a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m99404c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m99404c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return m99404c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m99404c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m99404c().set(obj);
            }

            public C4371a(int i) {
                super(C4370k.this.m99405g().listIterator(i));
            }
        }

        C4370k(Object obj, List list, C4368j c4368j) {
            super(obj, list, c4368j);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            m99409e();
            boolean isEmpty = m99411c().isEmpty();
            m99405g().add(i, obj);
            AbstractC4355f.m99438b(AbstractC4355f.this);
            if (isEmpty) {
                m99413a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m99405g().addAll(i, collection);
            if (addAll) {
                AbstractC4355f.m99443a(AbstractC4355f.this, m99411c().size() - size);
                if (size == 0) {
                    m99413a();
                }
            }
            return addAll;
        }

        /* renamed from: g */
        List m99405g() {
            return (List) m99411c();
        }

        @Override // java.util.List
        public Object get(int i) {
            m99409e();
            return m99405g().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m99409e();
            return m99405g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m99409e();
            return m99405g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            m99409e();
            return new C4371a();
        }

        @Override // java.util.List
        public Object remove(int i) {
            m99409e();
            Object remove = m99405g().remove(i);
            AbstractC4355f.m99434c(AbstractC4355f.this);
            m99408f();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            m99409e();
            return m99405g().set(i, obj);
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            C4368j m99412b;
            m99409e();
            AbstractC4355f abstractC4355f = AbstractC4355f.this;
            Object m99410d = m99410d();
            List subList = m99405g().subList(i, i2);
            if (m99412b() == null) {
                m99412b = this;
            } else {
                m99412b = m99412b();
            }
            return abstractC4355f.m99440a(m99410d, subList, m99412b);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            m99409e();
            return new C4371a(i);
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m99437b(AbstractC4355f abstractC4355f, int i) {
        int i2 = abstractC4355f.f5988f - i;
        abstractC4355f.f5988f = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m99433c(Object obj) {
        Collection collection = (Collection) AbstractC5622uc.m94163d(this.f5987d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f5988f -= size;
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m99443a(AbstractC4355f abstractC4355f, int i) {
        int i2 = abstractC4355f.f5988f + i;
        abstractC4355f.f5988f = i2;
        return i2;
    }

    /* renamed from: b */
    Collection m99436b(Object obj) {
        return mo93521g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Iterator m99435b(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final List m99440a(Object obj, List list, C4368j c4368j) {
        if (list instanceof RandomAccess) {
            return new C4365g(obj, list, c4368j);
        }
        return new C4370k(obj, list, c4368j);
    }

    /* renamed from: com.applovin.impl.f$a */
    /* loaded from: classes2.dex */
    class C4356a extends AbstractC4360c {
        C4356a() {
            super();
        }

        @Override // com.applovin.impl.AbstractC4355f.AbstractC4360c
        /* renamed from: a */
        Object mo99427a(Object obj, Object obj2) {
            return obj2;
        }
    }
}
