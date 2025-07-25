package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapWithDefault.kt */
@Metadata
/* renamed from: kotlin.collections.p0 */
/* loaded from: classes7.dex */
public class C37557p0 {
    /* renamed from: a */
    public static <K, V> V m17298a(@NotNull Map<K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof MapWithDefault) {
            return (V) ((MapWithDefault) map).mo17409e(k);
        }
        V v = map.get(k);
        if (v == null && !map.containsKey(k)) {
            throw new NoSuchElementException("Key " + k + " is missing in the map.");
        }
        return v;
    }

    @NotNull
    /* renamed from: b */
    public static <K, V> Map<K, V> m17297b(@NotNull Map<K, ? extends V> map, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Map<K, V> m17297b;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (map instanceof MapWithDefault) {
            m17297b = m17297b(((MapWithDefault) map).mo17408k(), defaultValue);
            return m17297b;
        }
        return new C37553n0(map, defaultValue);
    }
}
