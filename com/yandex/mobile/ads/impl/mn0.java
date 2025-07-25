package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes8.dex */
final class mn0 extends AbstractC30686k<Object> {

    /* renamed from: d */
    final /* synthetic */ Iterator f82318d;

    /* renamed from: e */
    final /* synthetic */ vf1 f82319e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mn0(Iterator it, vf1 vf1Var) {
        this.f82318d = it;
        this.f82319e = vf1Var;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30686k
    /* renamed from: a */
    protected final Object mo31891a() {
        while (this.f82318d.hasNext()) {
            Object next = this.f82318d.next();
            if (this.f82319e.apply(next)) {
                return next;
            }
        }
        m32692b();
        return null;
    }
}
