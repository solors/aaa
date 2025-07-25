package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.e1 */
/* loaded from: classes4.dex */
public class C15296e1 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ AbstractC15299f1 f30250a;

    public C15296e1(AbstractC15299f1 abstractC15299f1) {
        this.f30250a = abstractC15299f1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            this.f30250a.m76881a((Comparable) entry.getKey(), entry.getValue());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f30250a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f30250a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C15293d1(this.f30250a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.f30250a.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30250a.size();
    }
}
