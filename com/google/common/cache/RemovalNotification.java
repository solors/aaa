package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {

    /* renamed from: b */
    private final RemovalCause f39688b;

    private RemovalNotification(K k, V v, RemovalCause removalCause) {
        super(k, v);
        this.f39688b = (RemovalCause) Preconditions.checkNotNull(removalCause);
    }

    public static <K, V> RemovalNotification<K, V> create(K k, V v, RemovalCause removalCause) {
        return new RemovalNotification<>(k, v, removalCause);
    }

    public RemovalCause getCause() {
        return this.f39688b;
    }

    public boolean wasEvicted() {
        return this.f39688b.mo69832c();
    }
}
