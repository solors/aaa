package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gt1;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class ft1 extends gt1.AbstractC30416d<Object> {

    /* renamed from: b */
    final /* synthetic */ Set f79312b;

    /* renamed from: c */
    final /* synthetic */ Set f79313c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft1(qh0 qh0Var, qh0 qh0Var2) {
        super();
        this.f79312b = qh0Var;
        this.f79313c = qh0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f79312b.contains(obj) && this.f79313c.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (this.f79312b.containsAll(collection) && this.f79313c.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f79313c, this.f79312b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new et1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (Object obj : this.f79312b) {
            if (this.f79313c.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
