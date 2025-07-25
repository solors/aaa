package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
@Metadata
/* renamed from: kotlin.collections.r0 */
/* loaded from: classes7.dex */
public class C37559r0 extends MapsJVM {
    @NotNull
    /* renamed from: A */
    public static final <K, V, M extends Map<? super K, ? super V>> M m17288A(@NotNull Sequence<? extends Tuples<? extends K, ? extends V>> sequence, @NotNull M destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        m17273u(destination, sequence);
        return destination;
    }

    @NotNull
    /* renamed from: B */
    public static <K, V> Map<K, V> m17287B(@NotNull Tuples<? extends K, ? extends V>[] tuplesArr) {
        Map<K, V> m17284j;
        Map<K, V> m17291g;
        int m17292f;
        Intrinsics.checkNotNullParameter(tuplesArr, "<this>");
        int length = tuplesArr.length;
        if (length == 0) {
            m17284j = m17284j();
            return m17284j;
        } else if (length != 1) {
            m17292f = MapsJVM.m17292f(tuplesArr.length);
            return m17286C(tuplesArr, new LinkedHashMap(m17292f));
        } else {
            m17291g = MapsJVM.m17291g(tuplesArr[0]);
            return m17291g;
        }
    }

    @NotNull
    /* renamed from: C */
    public static final <K, V, M extends Map<? super K, ? super V>> M m17286C(@NotNull Tuples<? extends K, ? extends V>[] tuplesArr, @NotNull M destination) {
        Intrinsics.checkNotNullParameter(tuplesArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        m17272v(destination, tuplesArr);
        return destination;
    }

    @NotNull
    /* renamed from: D */
    public static <K, V> Map<K, V> m17285D(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }

    @NotNull
    /* renamed from: j */
    public static <K, V> Map<K, V> m17284j() {
        Maps maps = Maps.f99247b;
        Intrinsics.m17073h(maps, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return maps;
    }

    /* renamed from: k */
    public static <K, V> V m17283k(@NotNull Map<K, ? extends V> map, K k) {
        Object m17298a;
        Intrinsics.checkNotNullParameter(map, "<this>");
        m17298a = C37557p0.m17298a(map, k);
        return (V) m17298a;
    }

    @NotNull
    /* renamed from: l */
    public static <K, V> HashMap<K, V> m17282l(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        int m17292f;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        m17292f = MapsJVM.m17292f(pairs.length);
        HashMap<K, V> hashMap = new HashMap<>(m17292f);
        m17272v(hashMap, pairs);
        return hashMap;
    }

    @NotNull
    /* renamed from: m */
    public static <K, V> Map<K, V> m17281m(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        Map<K, V> m17284j;
        int m17292f;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length > 0) {
            m17292f = MapsJVM.m17292f(pairs.length);
            return m17286C(pairs, new LinkedHashMap(m17292f));
        }
        m17284j = m17284j();
        return m17284j;
    }

    @NotNull
    /* renamed from: n */
    public static <K, V> Map<K, V> m17280n(@NotNull Map<? extends K, ? extends V> map, K k) {
        Map m17285D;
        Intrinsics.checkNotNullParameter(map, "<this>");
        m17285D = m17285D(map);
        m17285D.remove(k);
        return m17278p(m17285D);
    }

    @NotNull
    /* renamed from: o */
    public static <K, V> Map<K, V> m17279o(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        int m17292f;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        m17292f = MapsJVM.m17292f(pairs.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m17292f);
        m17272v(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: p */
    public static final <K, V> Map<K, V> m17278p(@NotNull Map<K, ? extends V> map) {
        Map<K, V> m17284j;
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            m17284j = m17284j();
            return m17284j;
        } else if (size == 1) {
            return MapsJVM.m17289i(map);
        } else {
            return map;
        }
    }

    @NotNull
    /* renamed from: q */
    public static <K, V> Map<K, V> m17277q(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends Tuples<? extends K, ? extends V>> pairs) {
        Map<K, V> m17271w;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            m17271w = m17271w(pairs);
            return m17271w;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m17274t(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: r */
    public static <K, V> Map<K, V> m17276r(@NotNull Map<? extends K, ? extends V> map, @NotNull Map<? extends K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: s */
    public static <K, V> Map<K, V> m17275s(@NotNull Map<? extends K, ? extends V> map, @NotNull Tuples<? extends K, ? extends V> pair) {
        Map<K, V> m17291g;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            m17291g = MapsJVM.m17291g(pair);
            return m17291g;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.m17630c(), pair.m17629d());
        return linkedHashMap;
    }

    /* renamed from: t */
    public static <K, V> void m17274t(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends Tuples<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Tuples<? extends K, ? extends V> tuples : pairs) {
            map.put((K) tuples.m17632a(), (V) tuples.m17631b());
        }
    }

    /* renamed from: u */
    public static <K, V> void m17273u(@NotNull Map<? super K, ? super V> map, @NotNull Sequence<? extends Tuples<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Tuples<? extends K, ? extends V> tuples : pairs) {
            map.put((K) tuples.m17632a(), (V) tuples.m17631b());
        }
    }

    /* renamed from: v */
    public static <K, V> void m17272v(@NotNull Map<? super K, ? super V> map, @NotNull Tuples<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Tuples<? extends K, ? extends V> tuples : pairs) {
            map.put((K) tuples.m17632a(), (V) tuples.m17631b());
        }
    }

    @NotNull
    /* renamed from: w */
    public static <K, V> Map<K, V> m17271w(@NotNull Iterable<? extends Tuples<? extends K, ? extends V>> iterable) {
        Map<K, V> m17284j;
        Tuples<? extends K, ? extends V> next;
        Map<K, V> m17291g;
        int m17292f;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m17284j = m17284j();
                return m17284j;
            } else if (size != 1) {
                m17292f = MapsJVM.m17292f(collection.size());
                return m17270x(iterable, new LinkedHashMap(m17292f));
            } else {
                if (iterable instanceof List) {
                    next = (Tuples<? extends K, ? extends V>) ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                m17291g = MapsJVM.m17291g(next);
                return m17291g;
            }
        }
        return m17278p(m17270x(iterable, new LinkedHashMap()));
    }

    @NotNull
    /* renamed from: x */
    public static final <K, V, M extends Map<? super K, ? super V>> M m17270x(@NotNull Iterable<? extends Tuples<? extends K, ? extends V>> iterable, @NotNull M destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        m17274t(destination, iterable);
        return destination;
    }

    @NotNull
    /* renamed from: y */
    public static <K, V> Map<K, V> m17269y(@NotNull Map<? extends K, ? extends V> map) {
        Map<K, V> m17284j;
        Map<K, V> m17285D;
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            m17284j = m17284j();
            return m17284j;
        } else if (size != 1) {
            m17285D = m17285D(map);
            return m17285D;
        } else {
            return MapsJVM.m17289i(map);
        }
    }

    @NotNull
    /* renamed from: z */
    public static <K, V> Map<K, V> m17268z(@NotNull Sequence<? extends Tuples<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return m17278p(m17288A(sequence, new LinkedHashMap()));
    }
}
