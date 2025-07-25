package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.p0 */
/* loaded from: classes4.dex */
public final class C15328p0 implements Iterator {

    /* renamed from: a */
    public final Iterator f30291a;

    public C15328p0(Iterator it) {
        this.f30291a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30291a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f30291a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30291a.remove();
    }
}
