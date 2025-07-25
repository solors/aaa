package com.fyber.inneractive.sdk.protobuf;

import java.util.ListIterator;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q1 */
/* loaded from: classes4.dex */
public final class C15332q1 implements ListIterator {

    /* renamed from: a */
    public final ListIterator f30294a;

    public C15332q1(C15338s1 c15338s1, int i) {
        this.f30294a = c15338s1.f30300a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f30294a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30294a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f30294a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30294a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f30294a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30294a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
