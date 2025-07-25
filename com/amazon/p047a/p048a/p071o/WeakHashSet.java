package com.amazon.p047a.p048a.p071o;

import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.amazon.a.a.o.g */
/* loaded from: classes2.dex */
public class WeakHashSet<T> implements Iterable<T> {

    /* renamed from: a */
    private WeakHashMap<T, Object> f2780a = new WeakHashMap<>();

    /* renamed from: a */
    public void m102802a(T t) {
        this.f2780a.put(t, null);
    }

    /* renamed from: b */
    public void m102800b(T t) {
        this.f2780a.remove(t);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f2780a.keySet().iterator();
    }

    public String toString() {
        return this.f2780a.keySet().toString();
    }

    /* renamed from: a */
    public boolean m102803a() {
        return this.f2780a.isEmpty();
    }

    /* renamed from: b */
    public int m102801b() {
        return this.f2780a.size();
    }
}
