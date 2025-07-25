package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes8.dex */
final class et1 extends AbstractC30686k<Object> {

    /* renamed from: d */
    final Iterator<Object> f78794d;

    /* renamed from: e */
    final /* synthetic */ ft1 f78795e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public et1(ft1 ft1Var) {
        this.f78795e = ft1Var;
        this.f78794d = ft1Var.f79312b.iterator();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30686k
    /* renamed from: a */
    protected final Object mo31891a() {
        while (this.f78794d.hasNext()) {
            Object next = this.f78794d.next();
            if (this.f78795e.f79313c.contains(next)) {
                return next;
            }
        }
        m32692b();
        return null;
    }
}
