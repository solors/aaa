package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Interners {

    /* loaded from: classes4.dex */
    public static class InternerBuilder {

        /* renamed from: a */
        private final MapMaker f40183a;

        /* renamed from: b */
        private boolean f40184b;

        public <E> Interner<E> build() {
            if (!this.f40184b) {
                this.f40183a.weakKeys();
            }
            return new InternerImpl(this.f40183a);
        }

        public InternerBuilder concurrencyLevel(int i) {
            this.f40183a.concurrencyLevel(i);
            return this;
        }

        public InternerBuilder strong() {
            this.f40184b = true;
            return this;
        }

        @GwtIncompatible("java.lang.ref.WeakReference")
        public InternerBuilder weak() {
            this.f40184b = false;
            return this;
        }

        private InternerBuilder() {
            this.f40183a = new MapMaker();
            this.f40184b = true;
        }
    }

    /* loaded from: classes4.dex */
    private static class InternerFunction<E> implements Function<E, E> {

        /* renamed from: b */
        private final Interner<E> f40185b;

        public InternerFunction(Interner<E> interner) {
            this.f40185b = interner;
        }

        @Override // com.google.common.base.Function
        public E apply(E e) {
            return this.f40185b.intern(e);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof InternerFunction) {
                return this.f40185b.equals(((InternerFunction) obj).f40185b);
            }
            return false;
        }

        public int hashCode() {
            return this.f40185b.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static final class InternerImpl<E> implements Interner<E> {
        @VisibleForTesting

        /* renamed from: a */
        final MapMakerInternalMap<E, MapMaker.Dummy, ?, ?> f40186a;

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.collect.MapMakerInternalMap$InternalEntry] */
        @Override // com.google.common.collect.Interner
        public E intern(E e) {
            E e2;
            do {
                ?? m69150f = this.f40186a.m69150f(e);
                if (m69150f != 0 && (e2 = (E) m69150f.getKey()) != null) {
                    return e2;
                }
            } while (this.f40186a.putIfAbsent(e, MapMaker.Dummy.VALUE) != null);
            return e;
        }

        private InternerImpl(MapMaker mapMaker) {
            this.f40186a = MapMakerInternalMap.m69151d(mapMaker.m69158f(Equivalence.equals()));
        }
    }

    private Interners() {
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
        return new InternerFunction((Interner) Preconditions.checkNotNull(interner));
    }

    public static InternerBuilder newBuilder() {
        return new InternerBuilder();
    }

    public static <E> Interner<E> newStrongInterner() {
        return newBuilder().strong().build();
    }

    @GwtIncompatible("java.lang.ref.WeakReference")
    public static <E> Interner<E> newWeakInterner() {
        return newBuilder().weak().build();
    }
}
