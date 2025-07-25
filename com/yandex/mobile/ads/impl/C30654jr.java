package com.yandex.mobile.ads.impl;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.jr */
/* loaded from: classes8.dex */
public final class C30654jr<E> implements Iterable<E> {

    /* renamed from: b */
    private final Object f81064b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    private final HashMap f81065c = new HashMap();
    @GuardedBy("lock")

    /* renamed from: d */
    private Set<E> f81066d = Collections.emptySet();
    @GuardedBy("lock")

    /* renamed from: e */
    private List<E> f81067e = Collections.emptyList();

    /* renamed from: a */
    public final void m32793a(E e) {
        synchronized (this.f81064b) {
            ArrayList arrayList = new ArrayList(this.f81067e);
            arrayList.add(e);
            this.f81067e = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f81065c.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f81066d);
                hashSet.add(e);
                this.f81066d = Collections.unmodifiableSet(hashSet);
            }
            this.f81065c.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* renamed from: b */
    public final int m32792b(E e) {
        int i;
        synchronized (this.f81064b) {
            if (this.f81065c.containsKey(e)) {
                i = ((Integer) this.f81065c.get(e)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void m32791c(E e) {
        synchronized (this.f81064b) {
            Integer num = (Integer) this.f81065c.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f81067e);
            arrayList.remove(e);
            this.f81067e = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f81065c.remove(e);
                HashSet hashSet = new HashSet(this.f81066d);
                hashSet.remove(e);
                this.f81066d = Collections.unmodifiableSet(hashSet);
            } else {
                this.f81065c.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f81064b) {
            it = this.f81067e.iterator();
        }
        return it;
    }

    /* renamed from: a */
    public final Set<E> m32794a() {
        Set<E> set;
        synchronized (this.f81064b) {
            set = this.f81066d;
        }
        return set;
    }
}
