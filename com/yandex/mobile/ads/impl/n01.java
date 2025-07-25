package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o01;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes8.dex */
final class n01 extends o01.AbstractC31010c<Object> {

    /* renamed from: a */
    final /* synthetic */ Comparator f82505a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n01(Comparator comparator) {
        this.f82505a = comparator;
    }

    @Override // com.yandex.mobile.ads.impl.o01.AbstractC31010c
    /* renamed from: b */
    final <K, V> Map<K, Collection<V>> mo31198b() {
        return new TreeMap(this.f82505a);
    }
}
