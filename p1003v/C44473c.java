package p1003v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import org.jetbrains.annotations.NotNull;

/* compiled from: Collections.kt */
@Metadata
/* renamed from: v.c */
/* loaded from: classes2.dex */
public final class C44473c {
    @NotNull
    /* renamed from: a */
    public static final <T> List<T> m2850a(@NotNull List<? extends T> list) {
        List<T> m17166m;
        Object m17531p0;
        int size = list.size();
        if (size == 0) {
            m17166m = C37563v.m17166m();
            return m17166m;
        } else if (size == 1) {
            m17531p0 = _Collections.m17531p0(list);
            return Collections.singletonList(m17531p0);
        } else {
            return Collections.unmodifiableList(new ArrayList(list));
        }
    }

    @NotNull
    /* renamed from: b */
    public static final <K, V> Map<K, V> m2849b(@NotNull Map<K, ? extends V> map) {
        Map<K, V> m17284j;
        Object m17532o0;
        int size = map.size();
        if (size == 0) {
            m17284j = C37559r0.m17284j();
            return m17284j;
        } else if (size == 1) {
            m17532o0 = _Collections.m17532o0(map.entrySet());
            Map.Entry entry = (Map.Entry) m17532o0;
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        } else {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
    }
}
