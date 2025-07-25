package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.Unit;
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
    final /* synthetic */ Function1<K, V> $create;
    final /* synthetic */ InterfaceC45269o<Boolean, K, V, V, Unit> $onEntryRemoved;
    final /* synthetic */ Function2<K, V, Integer> $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(int i, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, InterfaceC45269o<? super Boolean, ? super K, ? super V, ? super V, Unit> interfaceC45269o) {
        super(i);
        this.$sizeOf = function2;
        this.$create = function1;
        this.$onEntryRemoved = interfaceC45269o;
    }

    @Override // android.util.LruCache
    @Nullable
    protected V create(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.$create.invoke(key);
    }

    @Override // android.util.LruCache
    protected void entryRemoved(boolean z, @NotNull K key, @NotNull V oldValue, @Nullable V v) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), key, oldValue, v);
    }

    @Override // android.util.LruCache
    protected int sizeOf(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.$sizeOf.mo105910invoke(key, value).intValue();
    }
}
