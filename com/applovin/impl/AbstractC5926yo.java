package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* renamed from: com.applovin.impl.yo */
/* loaded from: classes2.dex */
abstract class AbstractC5926yo implements Iterator {

    /* renamed from: a */
    final Iterator f12372a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5926yo(Iterator it) {
        this.f12372a = (Iterator) Preconditions.checkNotNull(it);
    }

    /* renamed from: a */
    abstract Object mo92716a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12372a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo92716a(this.f12372a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12372a.remove();
    }
}
