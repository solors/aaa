package com.applovin.impl;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.h */
/* loaded from: classes2.dex */
abstract class AbstractC4496h implements InterfaceC5561tf {

    /* renamed from: a */
    private transient Set f6499a;

    /* renamed from: b */
    private transient Collection f6500b;

    /* renamed from: c */
    private transient Map f6501c;

    /* renamed from: com.applovin.impl.h$a */
    /* loaded from: classes2.dex */
    class C4497a extends AbstractCollection {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C4497a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC4496h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC4496h.this.mo98858a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC4496h.this.mo98855f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC4496h.this.size();
        }
    }

    @Override // com.applovin.impl.InterfaceC5561tf
    /* renamed from: a */
    public Map mo94449a() {
        Map map = this.f6501c;
        if (map == null) {
            Map mo93523b = mo93523b();
            this.f6501c = mo93523b;
            return mo93523b;
        }
        return map;
    }

    /* renamed from: b */
    abstract Map mo93523b();

    /* renamed from: c */
    abstract Set mo93522c();

    /* renamed from: d */
    abstract Collection mo98857d();

    /* renamed from: e */
    public Set m98856e() {
        Set set = this.f6499a;
        if (set == null) {
            Set mo93522c = mo93522c();
            this.f6499a = mo93522c;
            return mo93522c;
        }
        return set;
    }

    public boolean equals(Object obj) {
        return AbstractC5777wf.m93525a(this, obj);
    }

    /* renamed from: f */
    abstract Iterator mo98855f();

    public int hashCode() {
        return mo94449a().hashCode();
    }

    public String toString() {
        return mo94449a().toString();
    }

    @Override // com.applovin.impl.InterfaceC5561tf
    public Collection values() {
        Collection collection = this.f6500b;
        if (collection == null) {
            Collection mo98857d = mo98857d();
            this.f6500b = mo98857d;
            return mo98857d;
        }
        return collection;
    }

    /* renamed from: a */
    public boolean mo98858a(Object obj) {
        for (Collection collection : mo94449a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
