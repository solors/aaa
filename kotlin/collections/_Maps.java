package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.collections.t0 */
/* loaded from: classes7.dex */
public class _Maps extends _MapsJvm {
    @NotNull
    /* renamed from: E */
    public static <K, V> Sequence<Map.Entry<K, V>> m17181E(@NotNull Map<? extends K, ? extends V> map) {
        Sequence<Map.Entry<K, V>> m17548e0;
        Intrinsics.checkNotNullParameter(map, "<this>");
        m17548e0 = _Collections.m17548e0(map.entrySet());
        return m17548e0;
    }

    @NotNull
    /* renamed from: F */
    public static <K, V> List<Tuples<K, V>> m17180F(@NotNull Map<? extends K, ? extends V> map) {
        List<Tuples<K, V>> m17175e;
        List<Tuples<K, V>> m17166m;
        List<Tuples<K, V>> m17166m2;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            m17166m2 = C37563v.m17166m();
            return m17166m2;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            m17175e = CollectionsJVM.m17175e(new Tuples(next.getKey(), next.getValue()));
            return m17175e;
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Tuples(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Tuples(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
