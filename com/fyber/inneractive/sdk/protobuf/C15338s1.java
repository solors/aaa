package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s1 */
/* loaded from: classes4.dex */
public final class C15338s1 extends AbstractList implements InterfaceC15334r0, RandomAccess {

    /* renamed from: a */
    public final InterfaceC15334r0 f30300a;

    public C15338s1(InterfaceC15334r0 interfaceC15334r0) {
        this.f30300a = interfaceC15334r0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15334r0
    /* renamed from: a */
    public final InterfaceC15334r0 mo76821a() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15334r0
    /* renamed from: b */
    public final List mo76818b() {
        return this.f30300a.mo76818b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f30300a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C15335r1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C15332q1(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30300a.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15334r0
    /* renamed from: a */
    public final Object mo76820a(int i) {
        return this.f30300a.mo76820a(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15334r0
    /* renamed from: a */
    public final void mo76819a(AbstractC15336s abstractC15336s) {
        throw new UnsupportedOperationException();
    }
}
