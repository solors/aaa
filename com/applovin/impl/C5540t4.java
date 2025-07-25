package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.t4 */
/* loaded from: classes2.dex */
public final class C5540t4 implements Iterable {

    /* renamed from: a */
    private final Object f10806a = new Object();

    /* renamed from: b */
    private final Map f10807b = new HashMap();

    /* renamed from: c */
    private Set f10808c = Collections.emptySet();

    /* renamed from: d */
    private List f10809d = Collections.emptyList();

    /* renamed from: a */
    public void m94549a(Object obj) {
        synchronized (this.f10806a) {
            ArrayList arrayList = new ArrayList(this.f10809d);
            arrayList.add(obj);
            this.f10809d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f10807b.get(obj);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f10808c);
                hashSet.add(obj);
                this.f10808c = Collections.unmodifiableSet(hashSet);
            }
            this.f10807b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* renamed from: b */
    public int m94548b(Object obj) {
        int i;
        synchronized (this.f10806a) {
            if (this.f10807b.containsKey(obj)) {
                i = ((Integer) this.f10807b.get(obj)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    /* renamed from: c */
    public void m94547c(Object obj) {
        synchronized (this.f10806a) {
            Integer num = (Integer) this.f10807b.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f10809d);
            arrayList.remove(obj);
            this.f10809d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f10807b.remove(obj);
                HashSet hashSet = new HashSet(this.f10808c);
                hashSet.remove(obj);
                this.f10808c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f10807b.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f10806a) {
            it = this.f10809d.iterator();
        }
        return it;
    }

    /* renamed from: a */
    public Set m94550a() {
        Set set;
        synchronized (this.f10806a) {
            set = this.f10808c;
        }
        return set;
    }
}
