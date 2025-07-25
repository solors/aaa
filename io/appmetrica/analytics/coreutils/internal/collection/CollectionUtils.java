package io.appmetrica.analytics.coreutils.internal.collection;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37551l;
import kotlin.collections.C37554o0;
import kotlin.collections.C37561t;
import kotlin.ranges.C37635g;
import kotlin.text.C37686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class CollectionUtils {
    @NotNull
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    public static final boolean areCollectionsEqual(@Nullable Collection<? extends Object> collection, @Nullable Collection<? extends Object> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        for (Object obj : collection) {
            if (!hashSet.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static final <T> List<T> arrayListCopyOfNullableCollection(@Nullable Collection<? extends T> collection) {
        if (collection != null) {
            return C37561t.m17226Z0(collection);
        }
        return null;
    }

    @NotNull
    public static final Map<String, byte[]> bundleToMap(@Nullable Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                byte[] byteArray = bundle.getByteArray(str);
                if (byteArray != null) {
                    hashMap.put(str, byteArray);
                }
            }
        }
        return hashMap;
    }

    @NotNull
    public static final <T> Map<String, T> convertMapKeysToLowerCase(@NotNull Map<String, ? extends T> map) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C37554o0.m17369f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            if (str2 != null) {
                str = str2.toLowerCase(Locale.getDefault());
            } else {
                str = null;
            }
            linkedHashMap.put(str, entry.getValue());
        }
        return linkedHashMap;
    }

    @Nullable
    public static final <K, V> Map<K, V> copyOf(@Nullable Map<K, V> map) {
        if (map != null && !map.isEmpty()) {
            return new HashMap(map);
        }
        return null;
    }

    @NotNull
    public static final List<String> createSortedListWithoutRepetitions(@NotNull String... strArr) {
        return unmodifiableListCopy(C37551l.m17476H(strArr));
    }

    @Nullable
    public static final <T> T getFirstOrNull(@Nullable List<? extends T> list) {
        if (list != null) {
            return (T) C37561t.m17192r0(list);
        }
        return null;
    }

    @Nullable
    public static final <T> T getFromMapIgnoreCase(@NotNull Map<String, ? extends T> map, @NotNull String str) {
        T t;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                t = it.next();
                Map.Entry entry = (Map.Entry) t;
                CharSequence charSequence = (CharSequence) entry.getKey();
                if (charSequence != null && charSequence.length() != 0 && C37686h.m16656y((String) entry.getKey(), str, true)) {
                    break;
                }
            } else {
                t = null;
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) t;
        if (entry2 == null) {
            return null;
        }
        return (T) entry2.getValue();
    }

    @Nullable
    public static final <K, V> List<Map.Entry<K, V>> getListFromMap(@Nullable Map<K, ? extends V> map) {
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
                arrayList.add(new AbstractMap.SimpleEntry(entry));
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> getMapFromList(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C37635g.m16939e(C37554o0.m17369f(C37561t.m17185x(list, 10)), 16));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }
        return new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <K, V> Map<K, V> getMapFromListOrNull(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C37635g.m16939e(C37554o0.m17369f(C37561t.m17185x(list, 10)), 16));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }
        return null;
    }

    public static final <K, V> V getOrDefault(@NotNull Map<K, ? extends V> map, K k, V v) {
        V v2 = map.get(k);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @NotNull
    public static final Set<Integer> hashSetFromIntArray(@NotNull int[] iArr) {
        return C37551l.m17488A0(iArr);
    }

    public static final boolean isNullOrEmpty(@Nullable Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    @Nullable
    public static final <K, V> Map<K, V> mapCopyOfNullableMap(@Nullable Map<K, ? extends V> map) {
        if (map != null) {
            return C37554o0.m17353y(map);
        }
        return null;
    }

    @NotNull
    public static final Bundle mapToBundle(@NotNull Map<String, byte[]> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            bundle.putByteArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> List<T> nullIfEmptyList(@Nullable List<? extends T> list) {
        if (list == 0 || !(!list.isEmpty())) {
            return null;
        }
        return list;
    }

    public static final <K, V> void putOpt(@NotNull Map<K, V> map, @Nullable K k, @Nullable V v) {
        if (k != null && v != null) {
            map.put(k, v);
        }
    }

    @NotNull
    public static final List<Integer> toIntList(@NotNull int[] iArr) {
        return C37551l.m17484C0(iArr);
    }

    @NotNull
    public static final <T> List<T> unmodifiableListCopy(@NotNull Collection<? extends T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    @NotNull
    public static final <K, V> Map<K, V> unmodifiableMapCopy(@NotNull Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    @NotNull
    public static final <K, V> Map<K, V> unmodifiableSameOrderMapCopy(@NotNull Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @NotNull
    public static final <T> Set<T> unmodifiableSetOf(@NotNull T... tArr) {
        return Collections.unmodifiableSet(C37551l.m17486B0(tArr));
    }
}
