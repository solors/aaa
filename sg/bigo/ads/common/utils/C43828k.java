package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: sg.bigo.ads.common.utils.k */
/* loaded from: classes10.dex */
public final class C43828k {
    /* renamed from: a */
    public static <T> T m4875a(List<T> list) {
        if (m4877a((Collection) list)) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }

    /* renamed from: b */
    public static <T> T m4870b(T[] tArr) {
        if (m4872a(tArr)) {
            return null;
        }
        for (T t : tArr) {
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public static <T> List<T> m4876a(Collection<T> collection, Comparable<T> comparable) {
        if (m4877a(collection)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            if (comparable.compareTo(t) > 0) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> boolean m4877a(@Nullable Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: a */
    public static <K, V> boolean m4873a(@Nullable Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    /* renamed from: a */
    public static <T> boolean m4872a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /* renamed from: a */
    public static boolean m4871a(boolean[] zArr) {
        return zArr == null || zArr.length == 0;
    }

    @Nullable
    /* renamed from: a */
    public static <T> T[] m4874a(List<T> list, T[] tArr) {
        if (m4877a((Collection) list)) {
            return null;
        }
        return (T[]) list.toArray(tArr);
    }
}
