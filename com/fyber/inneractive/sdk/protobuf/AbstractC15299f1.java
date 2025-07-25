package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.fyber.inneractive.sdk.protobuf.f1 */
/* loaded from: classes4.dex */
public abstract class AbstractC15299f1 extends AbstractMap {

    /* renamed from: h */
    public static final /* synthetic */ int f30255h = 0;

    /* renamed from: a */
    public final int f30256a;

    /* renamed from: d */
    public boolean f30259d;

    /* renamed from: e */
    public volatile C15296e1 f30260e;

    /* renamed from: g */
    public volatile C15279Y0 f30262g;

    /* renamed from: b */
    public List f30257b = Collections.emptyList();

    /* renamed from: c */
    public Map f30258c = Collections.emptyMap();

    /* renamed from: f */
    public Map f30261f = Collections.emptyMap();

    public AbstractC15299f1(int i) {
        this.f30256a = i;
    }

    /* renamed from: a */
    public final Object m76881a(Comparable comparable, Object obj) {
        m76883a();
        int m76882a = m76882a(comparable);
        if (m76882a >= 0) {
            return ((C15290c1) this.f30257b.get(m76882a)).setValue(obj);
        }
        m76883a();
        if (this.f30257b.isEmpty() && !(this.f30257b instanceof ArrayList)) {
            this.f30257b = new ArrayList(this.f30256a);
        }
        int i = -(m76882a + 1);
        if (i >= this.f30256a) {
            return m76879c().put(comparable, obj);
        }
        int size = this.f30257b.size();
        int i2 = this.f30256a;
        if (size == i2) {
            C15290c1 c15290c1 = (C15290c1) this.f30257b.remove(i2 - 1);
            m76879c().put(c15290c1.f30240a, c15290c1.f30241b);
        }
        this.f30257b.add(i, new C15290c1(this, comparable, obj));
        return null;
    }

    /* renamed from: b */
    public final Iterable m76880b() {
        if (this.f30258c.isEmpty()) {
            return AbstractC15287b1.f30238b;
        }
        return this.f30258c.entrySet();
    }

    /* renamed from: c */
    public final SortedMap m76879c() {
        m76883a();
        if (this.f30258c.isEmpty() && !(this.f30258c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f30258c = treeMap;
            this.f30261f = treeMap.descendingMap();
        }
        return (SortedMap) this.f30258c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m76883a();
        if (!this.f30257b.isEmpty()) {
            this.f30257b.clear();
        }
        if (!this.f30258c.isEmpty()) {
            this.f30258c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m76882a(comparable) < 0 && !this.f30258c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f30260e == null) {
            this.f30260e = new C15296e1(this);
        }
        return this.f30260e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC15299f1)) {
            return super.equals(obj);
        }
        AbstractC15299f1 abstractC15299f1 = (AbstractC15299f1) obj;
        int size = size();
        if (size != abstractC15299f1.size()) {
            return false;
        }
        int size2 = this.f30257b.size();
        if (size2 != abstractC15299f1.f30257b.size()) {
            return entrySet().equals(abstractC15299f1.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!((Map.Entry) this.f30257b.get(i)).equals((Map.Entry) abstractC15299f1.f30257b.get(i))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f30258c.equals(abstractC15299f1.f30258c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m76882a = m76882a(comparable);
        if (m76882a >= 0) {
            return ((C15290c1) this.f30257b.get(m76882a)).f30241b;
        }
        return this.f30258c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f30257b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C15290c1) this.f30257b.get(i2)).hashCode();
        }
        if (this.f30258c.size() > 0) {
            return i + this.f30258c.hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m76883a();
        Comparable comparable = (Comparable) obj;
        int m76882a = m76882a(comparable);
        if (m76882a >= 0) {
            m76883a();
            Object obj2 = ((C15290c1) this.f30257b.remove(m76882a)).f30241b;
            if (!this.f30258c.isEmpty()) {
                Iterator it = m76879c().entrySet().iterator();
                this.f30257b.add(new C15290c1(this, (Map.Entry) it.next()));
                it.remove();
            }
            return obj2;
        } else if (this.f30258c.isEmpty()) {
            return null;
        } else {
            return this.f30258c.remove(comparable);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30258c.size() + this.f30257b.size();
    }

    /* renamed from: a */
    public final int m76882a(Comparable comparable) {
        int i;
        int size = this.f30257b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C15290c1) this.f30257b.get(i2)).f30240a);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((C15290c1) this.f30257b.get(i4)).f30240a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 <= 0) {
                return i4;
            } else {
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    /* renamed from: a */
    public final void m76883a() {
        if (this.f30259d) {
            throw new UnsupportedOperationException();
        }
    }
}
