package com.smaato.sdk.core.util.collections;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.core.util.p574fi.NullableFunction;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes7.dex */
public final class Lists {

    /* renamed from: com.smaato.sdk.core.util.collections.Lists$a */
    /* loaded from: classes7.dex */
    private static class C27305a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        @NonNull

        /* renamed from: b */
        final List<F> f71944b;
        @NonNull

        /* renamed from: c */
        final NullableFunction<? super F, ? extends T> f71945c;

        /* renamed from: com.smaato.sdk.core.util.collections.Lists$a$a */
        /* loaded from: classes7.dex */
        class C27306a extends MappedListIterator<F, T> {
            C27306a(ListIterator listIterator) {
                super(listIterator);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.smaato.sdk.core.util.collections.MappedIterator
            /* renamed from: a */
            public T mo39339a(F f) {
                return C27305a.this.f71945c.apply(f);
            }
        }

        C27305a(@NonNull List<F> list, @NonNull NullableFunction<? super F, ? extends T> nullableFunction) {
            this.f71944b = (List) Objects.requireNonNull(list);
            this.f71945c = (NullableFunction) Objects.requireNonNull(nullableFunction);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f71944b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.f71945c.apply((F) this.f71944b.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f71944b.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NonNull
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        @NonNull
        public ListIterator<T> listIterator(int i) {
            return new C27306a(this.f71944b.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.f71945c.apply((F) this.f71944b.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f71944b.size();
        }
    }

    /* renamed from: com.smaato.sdk.core.util.collections.Lists$b */
    /* loaded from: classes7.dex */
    private static class C27307b<F, T> extends AbstractSequentialList<T> implements Serializable {
        @NonNull

        /* renamed from: b */
        final List<F> f71947b;
        @NonNull

        /* renamed from: c */
        final NullableFunction<? super F, ? extends T> f71948c;

        /* renamed from: com.smaato.sdk.core.util.collections.Lists$b$a */
        /* loaded from: classes7.dex */
        class C27308a extends MappedListIterator<F, T> {
            C27308a(ListIterator listIterator) {
                super(listIterator);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.smaato.sdk.core.util.collections.MappedIterator
            /* renamed from: a */
            public T mo39339a(F f) {
                return C27307b.this.f71948c.apply(f);
            }
        }

        C27307b(@NonNull List<F> list, @NonNull NullableFunction<? super F, ? extends T> nullableFunction) {
            this.f71947b = (List) Objects.requireNonNull(list);
            this.f71948c = (NullableFunction) Objects.requireNonNull(nullableFunction);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f71947b.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        @NonNull
        public ListIterator<T> listIterator(int i) {
            return new C27308a(this.f71947b.listIterator(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f71947b.size();
        }
    }

    private Lists() {
    }

    public static <T> boolean all(@NonNull Iterable<T> iterable, @NonNull Predicate<T> predicate) {
        for (T t : iterable) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(@NonNull Iterable<T> iterable, @NonNull Predicate<T> predicate) {
        for (T t : iterable) {
            if (predicate.test(t)) {
                return true;
            }
        }
        return false;
    }

    public static <T> List<T> filter(@NonNull Iterable<T> iterable, @NonNull Predicate<T> predicate) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (predicate.test(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NonNull
    @SafeVarargs
    public static <T> List<T> join(@NonNull List<T>... listArr) {
        int i = 0;
        for (List<T> list : listArr) {
            i += list.size();
        }
        if (i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(i);
        for (List<T> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return toImmutableList((Collection) arrayList);
    }

    @NonNull
    public static <F, T> List<T> map(@NonNull List<F> list, @NonNull Function<? super F, ? extends T> function) {
        Objects.requireNonNull(list);
        Objects.requireNonNull(function);
        ArrayList arrayList = new ArrayList();
        for (F f : list) {
            if (f != null) {
                arrayList.add(function.apply(f));
            }
        }
        return toImmutableList((Collection) arrayList);
    }

    @NonNull
    public static <F, T> List<T> mapLazy(@NonNull List<F> list, @NonNull NullableFunction<? super F, ? extends T> nullableFunction) {
        if (list instanceof RandomAccess) {
            return new C27305a(list, nullableFunction);
        }
        return new C27307b(list, nullableFunction);
    }

    @NonNull
    @SafeVarargs
    /* renamed from: of */
    public static <T> List<T> m39343of(@NonNull T... tArr) {
        return Arrays.asList(tArr);
    }

    @NonNull
    public static <T> List<T> toImmutableList(@Nullable Collection<T> collection) {
        if (collection != null && !collection.isEmpty()) {
            return Collections.unmodifiableList(new ArrayList(collection));
        }
        return Collections.emptyList();
    }

    @NonNull
    public static <T> List<T> toImmutableListOf(@NonNull T... tArr) {
        Objects.requireNonNull(tArr);
        return toImmutableList((Collection) Arrays.asList(tArr));
    }

    @NonNull
    @SafeVarargs
    /* renamed from: of */
    public static <T> List<T> m39342of(@NonNull Collection<T>... collectionArr) {
        final ArrayList arrayList = new ArrayList();
        for (Collection<T> collection : collectionArr) {
            Objects.onNotNull(collection, new Consumer() { // from class: r7.b
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    arrayList.addAll((Collection) obj);
                }
            });
        }
        return arrayList;
    }

    @NonNull
    public static <T> List<T> toImmutableList(@NonNull Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return toImmutableList((Collection) arrayList);
    }
}
