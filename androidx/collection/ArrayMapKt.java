package androidx.collection;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayMap.kt */
@Metadata
/* loaded from: classes.dex */
public final class ArrayMapKt {
    @NotNull
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    @NotNull
    public static final <K, V> ArrayMap<K, V> arrayMapOf(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        Intrinsics.m17072i(pairs, "pairs");
        ArrayMap<K, V> arrayMap = new ArrayMap<>(pairs.length);
        for (Tuples<? extends K, ? extends V> tuples : pairs) {
            arrayMap.put(tuples.m17630c(), tuples.m17629d());
        }
        return arrayMap;
    }
}
