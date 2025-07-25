package com.applovin.impl;

import com.applovin.impl.AbstractC4113bb;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: com.applovin.impl.fb */
/* loaded from: classes2.dex */
public abstract class AbstractC4387fb implements Map, Serializable {

    /* renamed from: d */
    static final Map.Entry[] f6092d = new Map.Entry[0];

    /* renamed from: a */
    private transient AbstractC4518hb f6093a;

    /* renamed from: b */
    private transient AbstractC4518hb f6094b;

    /* renamed from: c */
    private transient AbstractC4113bb f6095c;

    /* renamed from: com.applovin.impl.fb$a */
    /* loaded from: classes2.dex */
    public static class C4388a {

        /* renamed from: a */
        Comparator f6096a;

        /* renamed from: b */
        Object[] f6097b;

        /* renamed from: c */
        int f6098c;

        /* renamed from: d */
        boolean f6099d;

        public C4388a() {
            this(4);
        }

        /* renamed from: a */
        public AbstractC4387fb m99377a() {
            m99372b();
            this.f6099d = true;
            return C5012ni.m96966a(this.f6098c, this.f6097b);
        }

        /* renamed from: b */
        void m99372b() {
            int i;
            if (this.f6096a != null) {
                if (this.f6099d) {
                    this.f6097b = Arrays.copyOf(this.f6097b, this.f6098c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f6098c];
                int i2 = 0;
                while (true) {
                    i = this.f6098c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f6097b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, AbstractC5699vg.m93895a(this.f6096a).m93897a(AbstractC5622uc.m94165c()));
                for (int i4 = 0; i4 < this.f6098c; i4++) {
                    int i5 = i4 * 2;
                    this.f6097b[i5] = entryArr[i4].getKey();
                    this.f6097b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C4388a(int i) {
            this.f6097b = new Object[i * 2];
            this.f6098c = 0;
            this.f6099d = false;
        }

        /* renamed from: a */
        private void m99376a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f6097b;
            if (i2 > objArr.length) {
                this.f6097b = Arrays.copyOf(objArr, AbstractC4113bb.AbstractC4115b.m100479a(objArr.length, i2));
                this.f6099d = false;
            }
        }

        /* renamed from: a */
        public C4388a m99374a(Object obj, Object obj2) {
            m99376a(this.f6098c + 1);
            AbstractC5103p3.m96597a(obj, obj2);
            Object[] objArr = this.f6097b;
            int i = this.f6098c;
            int i2 = i * 2;
            objArr[i2] = obj;
            objArr[i2 + 1] = obj2;
            this.f6098c = i + 1;
            return this;
        }

        /* renamed from: a */
        public C4388a m99373a(Map.Entry entry) {
            return m99374a(entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public C4388a m99375a(Iterable iterable) {
            if (iterable instanceof Collection) {
                m99376a(this.f6098c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m99373a((Map.Entry) it.next());
            }
            return this;
        }
    }

    /* renamed from: a */
    public static AbstractC4387fb m99383a(Iterable iterable) {
        C4388a c4388a = new C4388a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        c4388a.m99375a(iterable);
        return c4388a.m99377a();
    }

    /* renamed from: h */
    public static AbstractC4387fb m99379h() {
        return C5012ni.f8588i;
    }

    /* renamed from: b */
    abstract AbstractC4518hb mo96963b();

    /* renamed from: c */
    abstract AbstractC4518hb mo96962c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    abstract AbstractC4113bb mo96961d();

    @Override // java.util.Map
    /* renamed from: e */
    public AbstractC4518hb entrySet() {
        AbstractC4518hb abstractC4518hb = this.f6093a;
        if (abstractC4518hb == null) {
            AbstractC4518hb mo96963b = mo96963b();
            this.f6093a = mo96963b;
            return mo96963b;
        }
        return abstractC4518hb;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC5622uc.m94168a((Map) this, obj);
    }

    /* renamed from: f */
    abstract boolean mo96960f();

    @Override // java.util.Map
    /* renamed from: g */
    public AbstractC4518hb keySet() {
        AbstractC4518hb abstractC4518hb = this.f6094b;
        if (abstractC4518hb == null) {
            AbstractC4518hb mo96962c = mo96962c();
            this.f6094b = mo96962c;
            return mo96962c;
        }
        return abstractC4518hb;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return AbstractC5270rj.m95835a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public AbstractC4113bb values() {
        AbstractC4113bb abstractC4113bb = this.f6095c;
        if (abstractC4113bb == null) {
            AbstractC4113bb mo96961d = mo96961d();
            this.f6095c = mo96961d;
            return mo96961d;
        }
        return abstractC4113bb;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return AbstractC5622uc.m94169a(this);
    }

    /* renamed from: a */
    public static AbstractC4387fb m99382a(Map map) {
        if ((map instanceof AbstractC4387fb) && !(map instanceof SortedMap)) {
            AbstractC4387fb abstractC4387fb = (AbstractC4387fb) map;
            if (!abstractC4387fb.mo96960f()) {
                return abstractC4387fb;
            }
        }
        return m99383a(map.entrySet());
    }

    /* renamed from: a */
    public static C4388a m99384a() {
        return new C4388a();
    }
}
