package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cioccoiococ */
/* loaded from: classes8.dex */
public final class C32467cioccoiococ {
    private C32467cioccoiococ() {
    }

    public static boolean c2oc2i(Map map) {
        return coi222o222(map) == 0;
    }

    public static boolean cioccoiococ(Map map) {
        return !c2oc2i(map);
    }

    public static int coi222o222(Map map) {
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public static List coo2iico(List list) {
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public static boolean c2oc2i(Collection collection) {
        return !coi222o222(collection);
    }

    public static boolean coi222o222(Collection collection) {
        return coo2iico(collection) == 0;
    }

    public static Set coo2iico(Set set) {
        return set != null ? set : Collections.EMPTY_SET;
    }

    public static <T> boolean c2oc2i(T[] tArr) {
        return !coi222o222(tArr);
    }

    public static <T> boolean coi222o222(T[] tArr) {
        return coo2iico(tArr) == 0;
    }

    public static Map coo2iico(Map map) {
        return map != null ? map : Collections.EMPTY_MAP;
    }

    public static int coo2iico(Collection collection) {
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    public static <T> int coo2iico(T[] tArr) {
        if (tArr != null) {
            return tArr.length;
        }
        return 0;
    }

    public static <T> T coo2iico(List<T> list, int i) {
        if (list == null || i < 0 || coo2iico((Collection) list) <= i) {
            return null;
        }
        return list.get(i);
    }

    public static <K, V> V coo2iico(Map<K, V> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    public static <T> T coo2iico(T[] tArr, int i) {
        if (tArr == null || i < 0 || coo2iico(tArr) <= i) {
            return null;
        }
        return tArr[i];
    }
}
