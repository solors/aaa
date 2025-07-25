package com.google.common.graph;

import com.google.common.base.Optional;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class AbstractGraphBuilder<N> {

    /* renamed from: a */
    final boolean f40949a;

    /* renamed from: b */
    boolean f40950b = false;

    /* renamed from: c */
    ElementOrder<N> f40951c = ElementOrder.insertion();

    /* renamed from: d */
    ElementOrder<N> f40952d = ElementOrder.unordered();

    /* renamed from: e */
    Optional<Integer> f40953e = Optional.absent();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractGraphBuilder(boolean z) {
        this.f40949a = z;
    }
}
