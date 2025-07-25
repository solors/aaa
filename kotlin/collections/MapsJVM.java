package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p820od.C39144d;

@Metadata
/* renamed from: kotlin.collections.q0 */
/* loaded from: classes7.dex */
public class MapsJVM extends C37557p0 {
    @NotNull
    /* renamed from: c */
    public static <K, V> Map<K, V> m17295c(@NotNull Map<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((C39144d) builder).m13786m();
    }

    @NotNull
    /* renamed from: d */
    public static <K, V> Map<K, V> m17294d() {
        return new C39144d();
    }

    @NotNull
    /* renamed from: e */
    public static <K, V> Map<K, V> m17293e(int i) {
        return new C39144d(i);
    }

    /* renamed from: f */
    public static int m17292f(int i) {
        if (i >= 0) {
            if (i < 3) {
                return i + 1;
            }
            if (i < 1073741824) {
                return (int) ((i / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }

    @NotNull
    /* renamed from: g */
    public static <K, V> Map<K, V> m17291g(@NotNull Tuples<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.m17630c(), pair.m17629d());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    @NotNull
    /* renamed from: h */
    public static <K extends Comparable<? super K>, V> SortedMap<K, V> m17290h(@NotNull Tuples<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        C37559r0.m17272v(treeMap, pairs);
        return treeMap;
    }

    @NotNull
    /* renamed from: i */
    public static final <K, V> Map<K, V> m17289i(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "with(...)");
        return singletonMap;
    }
}
