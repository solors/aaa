package com.smaato.sdk.core.util.collections;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public final class Sets {
    private Sets() {
    }

    @NonNull
    /* renamed from: of */
    public static <E> Set<E> m39341of(@NonNull E... eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static <T> Set<T> retainToSet(Collection<T> collection, Predicate<T> predicate) {
        HashSet hashSet = new HashSet();
        for (T t : collection) {
            if (predicate.test(t)) {
                hashSet.add(t);
            }
        }
        return hashSet;
    }

    @NonNull
    public static <E> Set<E> toImmutableSet(@Nullable Collection<E> collection) {
        if (collection == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(collection));
    }

    @NonNull
    @SafeVarargs
    public static <E> Set<E> toImmutableSetOf(@NonNull E... eArr) {
        Objects.requireNonNull(eArr);
        return toImmutableSet(Arrays.asList(eArr));
    }

    @NonNull
    public static <E> Set<E> toSet(@NonNull Iterable<E> iterable) {
        HashSet hashSet = new HashSet();
        for (E e : iterable) {
            hashSet.add(e);
        }
        return hashSet;
    }

    @NonNull
    public static <E, R> Set<R> toSet(@NonNull Iterable<E> iterable, @NonNull Function<E, R> function) {
        HashSet hashSet = new HashSet();
        for (E e : iterable) {
            if (e != null) {
                hashSet.add(function.apply(e));
            }
        }
        return hashSet;
    }
}
