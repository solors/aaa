package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.collections.C37559r0;
import kotlin.collections.MutableCollections;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text._Strings;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt */
/* loaded from: classes.dex */
public final class extensions {
    @NotNull
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return persistentHashMapOf((Tuples[]) Arrays.copyOf(pairs, pairs.length));
    }

    @NotNull
    public static final <E> PersistentSet<E> immutableHashSetOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return persistentHashSetOf(Arrays.copyOf(elements, elements.length));
    }

    @NotNull
    public static final <E> PersistentList<E> immutableListOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return persistentListOf(Arrays.copyOf(elements, elements.length));
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> immutableMapOf(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return persistentMapOf((Tuples[]) Arrays.copyOf(pairs, pairs.length));
    }

    @NotNull
    public static final <E> PersistentSet<E> immutableSetOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return persistentSetOf(Arrays.copyOf(elements, elements.length));
    }

    @NotNull
    public static final <E> PersistentSet<E> intersect(@NotNull PersistentSet<? extends E> persistentSet, @NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return (PersistentSet<? extends E>) persistentSet.retainAll((Collection) elements);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        MutableCollections.m17608T(builder, elements);
        return (PersistentSet<? extends E>) builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<? extends E> persistentCollection, E e) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        return (PersistentCollection<? extends E>) persistentCollection.remove((PersistentCollection<? extends E>) e);
    }

    @NotNull
    public static final <T> PersistentSet<T> mutate(@NotNull PersistentSet<? extends T> persistentSet, @NotNull Function1<? super Set<T>, Unit> mutator) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        mutator.invoke(builder);
        return (PersistentSet<? extends T>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        PersistentMap.Builder<K, V> builder = PersistentHashMap.Companion.emptyOf$runtime_release().builder();
        C37559r0.m17272v(builder, pairs);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> persistentHashSetOf(@NotNull E... elements) {
        List m17399f;
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet<E> emptyOf$runtime_release = PersistentHashSet.Companion.emptyOf$runtime_release();
        m17399f = _ArraysJvm.m17399f(elements);
        return emptyOf$runtime_release.addAll((Collection) m17399f);
    }

    @NotNull
    public static final <E> PersistentList<E> persistentListOf(@NotNull E... elements) {
        List m17399f;
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentList persistentVectorOf = UtilsKt.persistentVectorOf();
        m17399f = _ArraysJvm.m17399f(elements);
        return persistentVectorOf.addAll((Collection) m17399f);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> persistentMapOf(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        PersistentMap.Builder<K, V> builder = PersistentOrderedMap.Companion.emptyOf$runtime_release().builder();
        C37559r0.m17272v(builder, pairs);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> persistentSetOf(@NotNull E... elements) {
        List m17399f;
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet<E> emptyOf$runtime_release = PersistentOrderedSet.Companion.emptyOf$runtime_release();
        m17399f = _ArraysJvm.m17399f(elements);
        return emptyOf$runtime_release.addAll((Collection) m17399f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<? extends E> persistentCollection, E e) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        return (PersistentCollection<? extends E>) persistentCollection.add((PersistentCollection<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        return (PersistentMap<? extends K, ? extends V>) persistentMap.putAll((Map<? extends Object, ? extends Object>) map);
    }

    @NotNull
    public static final <T> ImmutableList<T> toImmutableList(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    @NotNull
    public static final <K, V> ImmutableMap<K, V> toImmutableMap(@NotNull Map<K, ? extends V> map) {
        ImmutableMap<K, V> immutableMap;
        PersistentMap.Builder builder;
        Intrinsics.checkNotNullParameter(map, "<this>");
        PersistentMap<K, V> persistentMap = null;
        if (map instanceof ImmutableMap) {
            immutableMap = (ImmutableMap) map;
        } else {
            immutableMap = null;
        }
        if (immutableMap == null) {
            if (map instanceof PersistentMap.Builder) {
                builder = (PersistentMap.Builder) map;
            } else {
                builder = null;
            }
            if (builder != null) {
                persistentMap = builder.build();
            }
            if (persistentMap != null) {
                return persistentMap;
            }
            return persistentMapOf().putAll((Map) map);
        }
        return immutableMap;
    }

    @NotNull
    public static final <T> ImmutableSet<T> toImmutableSet(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet == null) {
            PersistentSet.Builder builder = iterable instanceof PersistentSet.Builder ? (PersistentSet.Builder) iterable : null;
            PersistentSet build = builder != null ? builder.build() : null;
            return build != null ? build : plus(persistentSetOf(), (Iterable) iterable);
        }
        return immutableSet;
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(@NotNull Map<K, ? extends V> map) {
        PersistentHashMap persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        Intrinsics.checkNotNullParameter(map, "<this>");
        PersistentHashMap<K, V> persistentHashMap2 = null;
        if (map instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) map;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap == null) {
            if (map instanceof PersistentHashMapBuilder) {
                persistentHashMapBuilder = (PersistentHashMapBuilder) map;
            } else {
                persistentHashMapBuilder = null;
            }
            if (persistentHashMapBuilder != null) {
                persistentHashMap2 = persistentHashMapBuilder.build();
            }
            if (persistentHashMap2 != null) {
                return persistentHashMap2;
            }
            return PersistentHashMap.Companion.emptyOf$runtime_release().putAll((Map) map);
        }
        return persistentHashMap;
    }

    @NotNull
    public static final <T> PersistentSet<T> toPersistentHashSet(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        PersistentHashSet persistentHashSet = iterable instanceof PersistentHashSet ? (PersistentHashSet) iterable : null;
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) iterable : null;
        PersistentHashSet build = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        return build != null ? build : plus(PersistentHashSet.Companion.emptyOf$runtime_release(), (Iterable) iterable);
    }

    @NotNull
    public static final <T> PersistentList<T> toPersistentList(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        PersistentList<T> persistentList = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList == null) {
            PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
            PersistentList<T> build = builder != null ? builder.build() : null;
            return build == null ? plus(persistentListOf(), (Iterable) iterable) : build;
        }
        return persistentList;
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> toPersistentMap(@NotNull Map<K, ? extends V> map) {
        PersistentOrderedMap persistentOrderedMap;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder;
        Intrinsics.checkNotNullParameter(map, "<this>");
        PersistentMap<K, V> persistentMap = null;
        if (map instanceof PersistentOrderedMap) {
            persistentOrderedMap = (PersistentOrderedMap) map;
        } else {
            persistentOrderedMap = null;
        }
        if (persistentOrderedMap == null) {
            if (map instanceof PersistentOrderedMapBuilder) {
                persistentOrderedMapBuilder = (PersistentOrderedMapBuilder) map;
            } else {
                persistentOrderedMapBuilder = null;
            }
            if (persistentOrderedMapBuilder != null) {
                persistentMap = persistentOrderedMapBuilder.build();
            }
            if (persistentMap == null) {
                return PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll((Map) map);
            }
            return persistentMap;
        }
        return persistentOrderedMap;
    }

    @NotNull
    public static final <T> PersistentSet<T> toPersistentSet(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        PersistentSet<T> build = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return build == null ? plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), (Iterable) iterable) : build;
    }

    @NotNull
    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    @NotNull
    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    @NotNull
    public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return (PersistentCollection<? extends E>) persistentCollection.removeAll((Collection) elements);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        MutableCollections.m17617K(builder, elements);
        return (PersistentCollection<? extends E>) builder.build();
    }

    @NotNull
    public static final <T> PersistentList<T> mutate(@NotNull PersistentList<? extends T> persistentList, @NotNull Function1<? super List<T>, Unit> mutator) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        PersistentList.Builder<? extends T> builder = persistentList.builder();
        mutator.invoke(builder);
        return (PersistentList<? extends T>) builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    @NotNull
    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    @NotNull
    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    @NotNull
    public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return (PersistentCollection<? extends E>) persistentCollection.addAll((Collection) elements);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        MutableCollections.m17624D(builder, elements);
        return (PersistentCollection<? extends E>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Iterable<? extends Tuples<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        C37559r0.m17274t(builder, pairs);
        return (PersistentMap<? extends K, ? extends V>) builder.build();
    }

    @NotNull
    public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        MutableCollections.m17615M(builder, elements);
        return (PersistentCollection<? extends E>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> mutate(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Function1<? super Map<K, V>, Unit> mutator) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        mutator.invoke(builder);
        return (PersistentMap<? extends K, ? extends V>) builder.build();
    }

    @NotNull
    public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        MutableCollections.m17622F(builder, elements);
        return (PersistentCollection<? extends E>) builder.build();
    }

    @NotNull
    public static final <T> ImmutableList<T> toImmutableList(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return toPersistentList(sequence);
    }

    @NotNull
    public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        MutableCollections.m17616L(builder, elements);
        return (PersistentCollection<? extends E>) builder.build();
    }

    @NotNull
    public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        MutableCollections.m17623E(builder, elements);
        return (PersistentCollection<? extends E>) builder.build();
    }

    @NotNull
    public static final ImmutableList<Character> toImmutableList(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return toPersistentList(charSequence);
    }

    @NotNull
    public static final <T> ImmutableSet<T> toImmutableSet(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return toPersistentSet(sequence);
    }

    @NotNull
    public static final <T> PersistentSet<T> toPersistentHashSet(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return plus(persistentHashSetOf(), (Sequence) sequence);
    }

    @NotNull
    public static final <T> PersistentList<T> toPersistentList(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return plus(persistentListOf(), (Sequence) sequence);
    }

    @NotNull
    public static final <T> PersistentSet<T> toPersistentSet(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return plus(persistentSetOf(), (Sequence) sequence);
    }

    @NotNull
    public static final <E> PersistentSet<E> intersect(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentCollection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return intersect(toPersistentSet(persistentCollection), (Iterable) elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentList<E> minus(@NotNull PersistentList<? extends E> persistentList, E e) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        return (PersistentList<? extends E>) persistentList.remove((PersistentList<? extends E>) e);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentList<E> plus(@NotNull PersistentList<? extends E> persistentList, E e) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        return (PersistentList<? extends E>) persistentList.add((PersistentList<? extends E>) e);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Tuples<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        C37559r0.m17272v(builder, pairs);
        return (PersistentMap<? extends K, ? extends V>) builder.build();
    }

    @NotNull
    public static final PersistentSet<Character> toImmutableSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return toPersistentSet(charSequence);
    }

    @NotNull
    public static final PersistentSet<Character> toPersistentHashSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        PersistentSet.Builder builder = persistentHashSetOf().builder();
        _Strings.m16530p1(charSequence, builder);
        return builder.build();
    }

    @NotNull
    public static final PersistentList<Character> toPersistentList(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        PersistentList.Builder builder = persistentListOf().builder();
        _Strings.m16530p1(charSequence, builder);
        return builder.build();
    }

    @NotNull
    public static final PersistentSet<Character> toPersistentSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        PersistentSet.Builder builder = persistentSetOf().builder();
        _Strings.m16530p1(charSequence, builder);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentList<E> minus(@NotNull PersistentList<? extends E> persistentList, @NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return (PersistentList<? extends E>) persistentList.removeAll((Collection) elements);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        MutableCollections.m17617K(builder, elements);
        return (PersistentList<? extends E>) builder.build();
    }

    @NotNull
    public static final <E> PersistentList<E> plus(@NotNull PersistentList<? extends E> persistentList, @NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return (PersistentList<? extends E>) persistentList.addAll((Collection) elements);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        MutableCollections.m17624D(builder, elements);
        return (PersistentList<? extends E>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Sequence<? extends Tuples<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        C37559r0.m17273u(builder, pairs);
        return (PersistentMap<? extends K, ? extends V>) builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<? extends E> persistentSet, E e) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        return (PersistentSet<? extends E>) persistentSet.remove((PersistentSet<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<? extends E> persistentSet, E e) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        return (PersistentSet<? extends E>) persistentSet.add((PersistentSet<? extends E>) e);
    }

    @NotNull
    public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return (PersistentSet<? extends E>) persistentSet.removeAll((Collection) elements);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        MutableCollections.m17617K(builder, elements);
        return (PersistentSet<? extends E>) builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return (PersistentSet<? extends E>) persistentSet.addAll((Collection) elements);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        MutableCollections.m17624D(builder, elements);
        return (PersistentSet<? extends E>) builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, K k) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        return (PersistentMap<? extends K, ? extends V>) persistentMap.remove((PersistentMap<? extends K, ? extends V>) k);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Tuples<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        return (PersistentMap<? extends K, ? extends V>) persistentMap.put((PersistentMap<? extends K, ? extends V>) ((K) pair.m17630c()), (V) pair.m17629d());
    }

    @NotNull
    public static final <E> PersistentList<E> minus(@NotNull PersistentList<? extends E> persistentList, @NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        MutableCollections.m17615M(builder, elements);
        return (PersistentList<? extends E>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Iterable<? extends Tuples<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return putAll(persistentMap, pairs);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Tuples<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return putAll(persistentMap, pairs);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Sequence<? extends Tuples<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return putAll(persistentMap, pairs);
    }

    @NotNull
    public static final <E> PersistentList<E> minus(@NotNull PersistentList<? extends E> persistentList, @NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        MutableCollections.m17616L(builder, elements);
        return (PersistentList<? extends E>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        return putAll(persistentMap, map);
    }

    @NotNull
    public static final <E> PersistentList<E> plus(@NotNull PersistentList<? extends E> persistentList, @NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        MutableCollections.m17622F(builder, elements);
        return (PersistentList<? extends E>) builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        MutableCollections.m17615M(builder, elements);
        return (PersistentSet<? extends E>) builder.build();
    }

    @NotNull
    public static final <E> PersistentList<E> plus(@NotNull PersistentList<? extends E> persistentList, @NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        MutableCollections.m17623E(builder, elements);
        return (PersistentList<? extends E>) builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        MutableCollections.m17616L(builder, elements);
        return (PersistentSet<? extends E>) builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        MutableCollections.m17622F(builder, elements);
        return (PersistentSet<? extends E>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        MutableCollections.m17617K(builder.keySet(), keys);
        return (PersistentMap<? extends K, ? extends V>) builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(persistentSet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        MutableCollections.m17623E(builder, elements);
        return (PersistentSet<? extends E>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        MutableCollections.m17615M(builder.keySet(), keys);
        return (PersistentMap<? extends K, ? extends V>) builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        MutableCollections.m17616L(builder.keySet(), keys);
        return (PersistentMap<? extends K, ? extends V>) builder.build();
    }
}
