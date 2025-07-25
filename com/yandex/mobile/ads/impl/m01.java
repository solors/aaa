package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;

@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
/* loaded from: classes8.dex */
public interface m01<K, V> {
    /* renamed from: a */
    Map<K, Collection<V>> mo30546a();

    @CanIgnoreReturnValue
    boolean put(K k, V v);

    Collection<V> values();
}
