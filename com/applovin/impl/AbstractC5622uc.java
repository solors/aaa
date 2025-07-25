package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.AbstractC5270rj;
import com.ironsource.C20517nb;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.uc */
/* loaded from: classes2.dex */
public abstract class AbstractC5622uc {

    /* renamed from: com.applovin.impl.uc$a */
    /* loaded from: classes2.dex */
    public class C5623a extends AbstractC5926yo {
        C5623a(Iterator it) {
            super(it);
        }

        @Override // com.applovin.impl.AbstractC5926yo
        /* renamed from: a */
        public Object mo92716a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.uc$b */
    /* loaded from: classes2.dex */
    public static abstract class EnumC5624b implements Function {

        /* renamed from: a */
        public static final EnumC5624b f11133a = new C5625a("KEY", 0);

        /* renamed from: b */
        public static final EnumC5624b f11134b = new C5626b("VALUE", 1);

        /* renamed from: c */
        private static final /* synthetic */ EnumC5624b[] f11135c = m94161a();

        /* renamed from: com.applovin.impl.uc$b$a */
        /* loaded from: classes2.dex */
        enum C5625a extends EnumC5624b {
            C5625a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* renamed from: com.applovin.impl.uc$b$b */
        /* loaded from: classes2.dex */
        enum C5626b extends EnumC5624b {
            C5626b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private EnumC5624b(String str, int i) {
            super(str, i);
        }

        /* renamed from: a */
        private static /* synthetic */ EnumC5624b[] m94161a() {
            return new EnumC5624b[]{f11133a, f11134b};
        }

        public static EnumC5624b valueOf(String str) {
            return (EnumC5624b) Enum.valueOf(EnumC5624b.class, str);
        }

        public static EnumC5624b[] values() {
            return (EnumC5624b[]) f11135c.clone();
        }

        /* synthetic */ EnumC5624b(String str, int i, AbstractC5557tc abstractC5557tc) {
            this(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.uc$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5627c extends AbstractC5270rj.AbstractC5273b {
        /* renamed from: a */
        abstract Map mo94160a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo94160a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo94160a().isEmpty();
        }

        @Override // com.applovin.impl.AbstractC5270rj.AbstractC5273b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return AbstractC5270rj.m95832a((Set) this, collection.iterator());
            }
        }

        @Override // com.applovin.impl.AbstractC5270rj.AbstractC5273b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m95836a = AbstractC5270rj.m95836a(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        m95836a.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo94160a().keySet().retainAll(m95836a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo94160a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.uc$d */
    /* loaded from: classes2.dex */
    public static class C5628d extends AbstractC5270rj.AbstractC5273b {

        /* renamed from: a */
        final Map f11136a;

        public C5628d(Map map) {
            this.f11136a = (Map) Preconditions.checkNotNull(map);
        }

        /* renamed from: a */
        public Map m94159a() {
            return this.f11136a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m94159a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m94159a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m94159a().size();
        }
    }

    /* renamed from: com.applovin.impl.uc$e */
    /* loaded from: classes2.dex */
    public static class C5629e extends AbstractCollection {

        /* renamed from: a */
        final Map f11137a;

        C5629e(Map map) {
            this.f11137a = (Map) Preconditions.checkNotNull(map);
        }

        /* renamed from: a */
        final Map m94158a() {
            return this.f11137a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m94158a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m94158a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m94158a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC5622uc.m94170a(m94158a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : m94158a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        m94158a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m95837a = AbstractC5270rj.m95837a();
                for (Map.Entry entry : m94158a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m95837a.add(entry.getKey());
                    }
                }
                return m94158a().keySet().removeAll(m95837a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m95837a = AbstractC5270rj.m95837a();
                for (Map.Entry entry : m94158a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m95837a.add(entry.getKey());
                    }
                }
                return m94158a().keySet().retainAll(m95837a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m94158a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.uc$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5630f extends AbstractMap {

        /* renamed from: a */
        private transient Set f11138a;

        /* renamed from: b */
        private transient Collection f11139b;

        /* renamed from: a */
        abstract Set mo94157a();

        /* renamed from: b */
        Collection m94156b() {
            return new C5629e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f11138a;
            if (set == null) {
                Set mo94157a = mo94157a();
                this.f11138a = mo94157a;
                return mo94157a;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f11139b;
            if (collection == null) {
                Collection m94156b = m94156b();
                this.f11139b = m94156b;
                return m94156b;
            }
            return collection;
        }
    }

    /* renamed from: a */
    public static int m94172a(int i) {
        if (i < 3) {
            AbstractC5103p3.m96598a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: b */
    public static boolean m94166b(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Object m94164c(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Object m94163d(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m94168a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: b */
    public static IdentityHashMap m94167b() {
        return new IdentityHashMap();
    }

    /* renamed from: c */
    public static Function m94165c() {
        return EnumC5624b.f11134b;
    }

    /* renamed from: a */
    public static String m94169a(Map map) {
        StringBuilder m96427a = AbstractC5168q3.m96427a(map.size());
        m96427a.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                m96427a.append(", ");
            }
            m96427a.append(entry.getKey());
            m96427a.append(C20517nb.f52173T);
            m96427a.append(entry.getValue());
            z = false;
        }
        m96427a.append('}');
        return m96427a.toString();
    }

    /* renamed from: a */
    public static Function m94173a() {
        return EnumC5624b.f11133a;
    }

    /* renamed from: a */
    static Iterator m94170a(Iterator it) {
        return new C5623a(it);
    }

    /* renamed from: a */
    public static Map.Entry m94171a(Object obj, Object obj2) {
        return new C4175cb(obj, obj2);
    }
}
