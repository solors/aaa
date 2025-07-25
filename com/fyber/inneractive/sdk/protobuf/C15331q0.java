package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q0 */
/* loaded from: classes4.dex */
public final class C15331q0 extends AbstractC15288c implements InterfaceC15334r0, RandomAccess {

    /* renamed from: b */
    public final ArrayList f30293b;

    static {
        new C15331q0(10).f30239a = false;
    }

    public C15331q0(int i) {
        this.f30293b = new ArrayList(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15334r0
    /* renamed from: a */
    public final InterfaceC15334r0 mo76821a() {
        return this.f30239a ? new C15338s1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m76887c();
        this.f30293b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f30293b.size(), collection);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15316l0
    /* renamed from: b */
    public final InterfaceC15316l0 mo76793b(int i) {
        if (i >= this.f30293b.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f30293b);
            return new C15331q0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m76887c();
        this.f30293b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String m76844a;
        Object obj = this.f30293b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC15336s) {
            AbstractC15336s abstractC15336s = (AbstractC15336s) obj;
            m76844a = abstractC15336s.m76823f();
            if (abstractC15336s.mo76829c()) {
                this.f30293b.set(i, m76844a);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            m76844a = AbstractC15319m0.m76844a(bArr);
            if (AbstractC15227E1.f30154a.m77029b(bArr, 0, bArr.length)) {
                this.f30293b.set(i, m76844a);
            }
        }
        return m76844a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m76887c();
        Object remove = this.f30293b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC15336s) {
            return ((AbstractC15336s) remove).m76823f();
        }
        return AbstractC15319m0.m76844a((byte[]) remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m76887c();
        Object obj2 = this.f30293b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC15336s) {
            return ((AbstractC15336s) obj2).m76823f();
        }
        return AbstractC15319m0.m76844a((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30293b.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15334r0
    /* renamed from: a */
    public final void mo76819a(AbstractC15336s abstractC15336s) {
        m76887c();
        this.f30293b.add(abstractC15336s);
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15288c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m76887c();
        if (collection instanceof InterfaceC15334r0) {
            collection = ((InterfaceC15334r0) collection).mo76818b();
        }
        boolean addAll = this.f30293b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public C15331q0(ArrayList arrayList) {
        this.f30293b = arrayList;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15334r0
    /* renamed from: a */
    public final Object mo76820a(int i) {
        return this.f30293b.get(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15334r0
    /* renamed from: b */
    public final List mo76818b() {
        return Collections.unmodifiableList(this.f30293b);
    }
}
