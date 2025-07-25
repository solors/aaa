package androidx.compose.runtime.external.kotlinx.collections.immutable;

import ae.KMarkers;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImmutableMap.kt */
@Metadata
/* loaded from: classes.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, KMarkers {
    @NotNull
    ImmutableSet<Map.Entry<K, V>> getEntries();

    @NotNull
    ImmutableSet<K> getKeys();

    @NotNull
    ImmutableCollection<V> getValues();
}
