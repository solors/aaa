package androidx.compose.runtime.external.kotlinx.collections.immutable;

import ae.InterfaceC0039e;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImmutableMap.kt */
@Metadata
/* loaded from: classes.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* compiled from: ImmutableMap.kt */
    @Metadata
    /* loaded from: classes.dex */
    public interface Builder<K, V> extends Map<K, V>, InterfaceC0039e {
        @NotNull
        PersistentMap<K, V> build();
    }

    @NotNull
    Builder<K, V> builder();

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> put(K k, V v);

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> putAll(@NotNull Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> remove(K k);

    @Override // java.util.Map
    @NotNull
    PersistentMap<K, V> remove(K k, V v);
}
