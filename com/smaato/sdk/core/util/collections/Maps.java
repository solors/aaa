package com.smaato.sdk.core.util.collections;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.BiConsumer;
import com.smaato.sdk.core.util.p574fi.BiFunction;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Maps {
    private Maps() {
    }

    @NonNull
    public static <K, V> Map.Entry<K, V> entryOf(@NonNull K k, @NonNull V v) {
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    @NonNull
    public static <K, V> Map<K, V> filter(@NonNull Map<K, V> map, @NonNull Predicate<V> predicate) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            if (predicate.test(value)) {
                hashMap.put(entry.getKey(), value);
            }
        }
        return hashMap;
    }

    @NonNull
    public static <K, V> List<K> filteredKeys(@NonNull Map<K, V> map, @NonNull Predicate<V> predicate) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry.getValue())) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    @Nullable
    public static <K, V> Map.Entry<K, V> firstMatchedEntry(@NonNull Map<K, V> map, @NonNull Predicate<V> predicate) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry.getValue())) {
                return entry;
            }
        }
        return null;
    }

    @Nullable
    public static <K, V> K firstMatchedKey(@NonNull Map<K, V> map, @NonNull Predicate<V> predicate) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static <K, V> void forEach(@NonNull Map<K, V> map, @NonNull BiConsumer<? super K, ? super V> biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException e) {
                throw new ConcurrentModificationException(e.getMessage());
            }
        }
    }

    @NonNull
    @SafeVarargs
    public static <K, V> Map<K, V> mapOf(@NonNull Map.Entry<K, V>... entryArr) {
        return Collections.unmodifiableMap(mutableMapOf(entryArr));
    }

    @NonNull
    @SafeVarargs
    public static <K, V> Map<K, V> merge(@NonNull Map<K, V>... mapArr) {
        HashMap hashMap = new HashMap();
        for (Map<K, V> map : mapArr) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    @NonNull
    @SafeVarargs
    private static <K, V> Map<K, V> mutableMapOf(@NonNull Map.Entry<K, V>... entryArr) {
        Objects.requireNonNull(entryArr, "entries is null");
        HashMap hashMap = new HashMap();
        for (int i = 0; i < entryArr.length; i++) {
            Map.Entry<K, V> entry = entryArr[i];
            Objects.requireNonNull(entry, "entry at index " + i + "is null");
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    @NonNull
    public static <K, V, R> R reduce(@NonNull Map<K, V> map, @NonNull R r, @NonNull BiFunction<Map.Entry<K, V>, R, R> biFunction) {
        Objects.requireNonNull(biFunction);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            r = biFunction.apply(entry, r);
        }
        return r;
    }

    @NonNull
    public static <K, V> Map<K, V> toImmutableMap(@Nullable Map<? extends K, ? extends V> map) {
        if (map != null && !map.isEmpty()) {
            return Collections.unmodifiableMap(new HashMap(map));
        }
        return Collections.emptyMap();
    }

    @NonNull
    public static <F, K, V> Map<K, V> toMap(@NonNull Iterable<F> iterable, @NonNull Function<F, K> function, @NonNull Function<F, V> function2) {
        HashMap hashMap = new HashMap();
        for (F f : iterable) {
            hashMap.put(function.apply(f), function2.apply(f));
        }
        return hashMap;
    }

    @NonNull
    public static <F, K, V> Map<K, V> toMapWithOrder(@NonNull Iterable<F> iterable, @NonNull Function<F, K> function, @NonNull Function<F, V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (F f : iterable) {
            linkedHashMap.put(function.apply(f), function2.apply(f));
        }
        return linkedHashMap;
    }
}
