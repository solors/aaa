package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {

    /* renamed from: b */
    private final Object f36054b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    private final Map<E, Integer> f36055c = new HashMap();
    @GuardedBy("lock")

    /* renamed from: d */
    private Set<E> f36056d = Collections.emptySet();
    @GuardedBy("lock")

    /* renamed from: f */
    private List<E> f36057f = Collections.emptyList();

    public void add(E e) {
        synchronized (this.f36054b) {
            ArrayList arrayList = new ArrayList(this.f36057f);
            arrayList.add(e);
            this.f36057f = Collections.unmodifiableList(arrayList);
            Integer num = this.f36055c.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f36056d);
                hashSet.add(e);
                this.f36056d = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f36055c;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e, Integer.valueOf(i));
        }
    }

    public int count(E e) {
        int i;
        synchronized (this.f36054b) {
            if (this.f36055c.containsKey(e)) {
                i = this.f36055c.get(e).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f36054b) {
            set = this.f36056d;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f36054b) {
            it = this.f36057f.iterator();
        }
        return it;
    }

    public void remove(E e) {
        synchronized (this.f36054b) {
            Integer num = this.f36055c.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f36057f);
            arrayList.remove(e);
            this.f36057f = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f36055c.remove(e);
                HashSet hashSet = new HashSet(this.f36056d);
                hashSet.remove(e);
                this.f36056d = Collections.unmodifiableSet(hashSet);
            } else {
                this.f36055c.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
