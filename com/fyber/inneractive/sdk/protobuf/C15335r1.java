package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.protobuf.r1 */
/* loaded from: classes4.dex */
public final class C15335r1 implements Iterator {

    /* renamed from: a */
    public final Iterator f30295a;

    public C15335r1(C15338s1 c15338s1) {
        this.f30295a = c15338s1.f30300a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30295a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f30295a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
