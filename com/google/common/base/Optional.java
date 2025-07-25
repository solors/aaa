package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

@DoNotMock("Use Optional.of(value) or Optional.absent()")
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class Optional<T> implements Serializable {
    public static <T> Optional<T> absent() {
        return Absent.m70112a();
    }

    public static <T> Optional<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new Present(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m70057of(T t) {
        return new Present(Preconditions.checkNotNull(t));
    }

    @Beta
    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterable<T>() { // from class: com.google.common.base.Optional.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new AbstractIterator<T>() { // from class: com.google.common.base.Optional.1.1

                    /* renamed from: d */
                    private final Iterator<? extends Optional<? extends T>> f39419d;

                    {
                        this.f39419d = (Iterator) Preconditions.checkNotNull(iterable.iterator());
                    }

                    @Override // com.google.common.base.AbstractIterator
                    /* renamed from: a */
                    protected T mo70009a() {
                        while (this.f39419d.hasNext()) {
                            Optional<? extends T> next = this.f39419d.next();
                            if (next.isPresent()) {
                                return next.get();
                            }
                        }
                        return m70111b();
                    }
                };
            }
        };
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo70027or(Optional<? extends T> optional);

    @Beta
    /* renamed from: or */
    public abstract T mo70026or(Supplier<? extends T> supplier);

    /* renamed from: or */
    public abstract T mo70025or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
