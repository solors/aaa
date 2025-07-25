package com.smaato.sdk.core.util.collections;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p574fi.BiFunction;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class Iterables {

    /* renamed from: com.smaato.sdk.core.util.collections.Iterables$a */
    /* loaded from: classes7.dex */
    public class C27304a extends MappedIterator {

        /* renamed from: c */
        final /* synthetic */ Function f71943c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27304a(Iterator it, Function function) {
            super(it);
            this.f71943c = function;
        }

        @Override // com.smaato.sdk.core.util.collections.MappedIterator
        /* renamed from: a */
        public Object mo39339a(Object obj) {
            return this.f71943c.apply(obj);
        }
    }

    private Iterables() {
    }

    /* renamed from: a */
    public static /* synthetic */ Iterator m39344a(Iterable iterable, Function function) {
        return lambda$map$0(iterable, function);
    }

    @Nullable
    public static <T> T filterFirst(@NonNull Iterable<T> iterable, @NonNull Predicate<T> predicate) {
        for (T t : iterable) {
            if (predicate.test(t)) {
                return t;
            }
        }
        return null;
    }

    public static <T> void forEach(@NonNull Iterable<T> iterable, @NonNull Consumer<T> consumer) {
        Objects.requireNonNull(iterable);
        Objects.requireNonNull(consumer);
        for (T t : iterable) {
            consumer.accept(t);
        }
    }

    public static /* synthetic */ Iterator lambda$map$0(Iterable iterable, Function function) {
        return new C27304a(iterable.iterator(), function);
    }

    @NonNull
    public static <F, T> Iterable<T> map(final Iterable<F> iterable, final Function<F, T> function) {
        return new Iterable() { // from class: r7.a
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return Iterables.m39344a(iterable, function);
            }
        };
    }

    @NonNull
    public static <K, R> R reduce(@NonNull Iterable<K> iterable, @NonNull R r, @NonNull BiFunction<K, R, R> biFunction) {
        Objects.requireNonNull(biFunction);
        for (K k : iterable) {
            r = biFunction.apply(k, r);
        }
        return r;
    }
}
