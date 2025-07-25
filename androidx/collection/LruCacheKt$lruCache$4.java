package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: LruCache.kt */
@Metadata
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ Function1 $create;
    final /* synthetic */ int $maxSize;
    final /* synthetic */ InterfaceC45269o $onEntryRemoved;
    final /* synthetic */ Function2 $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(Function2 function2, Function1 function1, InterfaceC45269o interfaceC45269o, int i, int i2) {
        super(i2);
        this.$sizeOf = function2;
        this.$create = function1;
        this.$onEntryRemoved = interfaceC45269o;
        this.$maxSize = i;
    }

    @Override // androidx.collection.LruCache
    @Nullable
    protected V create(@NotNull K key) {
        Intrinsics.m17072i(key, "key");
        return (V) this.$create.invoke(key);
    }

    @Override // androidx.collection.LruCache
    protected void entryRemoved(boolean z, @NotNull K key, @NotNull V oldValue, @Nullable V v) {
        Intrinsics.m17072i(key, "key");
        Intrinsics.m17072i(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), key, oldValue, v);
    }

    @Override // androidx.collection.LruCache
    protected int sizeOf(@NotNull K key, @NotNull V value) {
        Intrinsics.m17072i(key, "key");
        Intrinsics.m17072i(value, "value");
        return ((Number) this.$sizeOf.mo105910invoke(key, value)).intValue();
    }
}
