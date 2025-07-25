package com.google.protobuf.kotlin;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnmodifiableCollections.kt */
@Metadata
/* loaded from: classes5.dex */
public final class UnmodifiableMapEntries<K, V> extends UnmodifiableCollections<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>> {
    @NotNull
    private final Set<Map.Entry<K, V>> delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries(@NotNull Set<? extends Map.Entry<? extends K, ? extends V>> delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollections, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollections, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new UnmodifiableMapEntries$iterator$1(this.delegate.iterator());
    }

    public /* bridge */ boolean contains(Map.Entry<? extends Object, ? extends Object> entry) {
        return super.contains((UnmodifiableMapEntries<K, V>) entry);
    }
}
