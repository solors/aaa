package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.applovin.exoplayer2.common.base.Optional$a */
    /* loaded from: classes2.dex */
    class C3911a implements Iterable {

        /* renamed from: a */
        final /* synthetic */ Iterable f4203a;

        /* renamed from: com.applovin.exoplayer2.common.base.Optional$a$a */
        /* loaded from: classes2.dex */
        class C3912a extends AbstractC3937b {

            /* renamed from: c */
            private final Iterator f4204c;

            C3912a() {
                this.f4204c = (Iterator) Preconditions.checkNotNull(C3911a.this.f4203a.iterator());
            }

            @Override // com.applovin.exoplayer2.common.base.AbstractC3937b
            /* renamed from: a */
            protected Object mo101266a() {
                while (this.f4204c.hasNext()) {
                    Optional optional = (Optional) this.f4204c.next();
                    if (optional.isPresent()) {
                        return optional.get();
                    }
                }
                return m101265b();
            }
        }

        C3911a(Iterable iterable) {
            this.f4203a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C3912a();
        }
    }

    public static <T> Optional<T> absent() {
        return C3936a.m101267a();
    }

    public static <T> Optional<T> fromNullable(@NullableDecl T t) {
        if (t == null) {
            return absent();
        }
        return new C3941d(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m101284of(T t) {
        return new C3941d(Preconditions.checkNotNull(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new C3911a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo101262or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo101261or(Supplier<? extends T> supplier);

    /* renamed from: or */
    public abstract T mo101260or(T t);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
