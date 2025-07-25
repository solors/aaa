package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class Equivalence<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Equals extends Equivalence<Object> implements Serializable {

        /* renamed from: b */
        static final Equals f39375b = new Equals();

        Equals() {
        }

        private Object readResolve() {
            return f39375b;
        }

        @Override // com.google.common.base.Equivalence
        /* renamed from: a */
        protected boolean mo70056a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        /* renamed from: b */
        protected int mo70055b(Object obj) {
            return obj.hashCode();
        }
    }

    /* loaded from: classes4.dex */
    private static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        private final Equivalence<T> f39376b;

        /* renamed from: c */
        private final T f39377c;

        EquivalentToPredicate(Equivalence<T> equivalence, T t) {
            this.f39376b = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f39377c = t;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(T t) {
            return this.f39376b.equivalent(t, this.f39377c);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
            if (this.f39376b.equals(equivalentToPredicate.f39376b) && Objects.equal(this.f39377c, equivalentToPredicate.f39377c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f39376b, this.f39377c);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39376b);
            String valueOf2 = String.valueOf(this.f39377c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 15 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(".equivalentTo(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    static final class Identity extends Equivalence<Object> implements Serializable {

        /* renamed from: b */
        static final Identity f39378b = new Identity();

        Identity() {
        }

        private Object readResolve() {
            return f39378b;
        }

        @Override // com.google.common.base.Equivalence
        /* renamed from: a */
        protected boolean mo70056a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        /* renamed from: b */
        protected int mo70055b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Wrapper<T> implements Serializable {

        /* renamed from: b */
        private final Equivalence<? super T> f39379b;
        @ParametricNullness

        /* renamed from: c */
        private final T f39380c;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Wrapper) {
                Wrapper wrapper = (Wrapper) obj;
                if (this.f39379b.equals(wrapper.f39379b)) {
                    return this.f39379b.equivalent((T) this.f39380c, (T) wrapper.f39380c);
                }
                return false;
            }
            return false;
        }

        @ParametricNullness
        public T get() {
            return this.f39380c;
        }

        public int hashCode() {
            return this.f39379b.hash((T) this.f39380c);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39379b);
            String valueOf2 = String.valueOf(this.f39380c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 7 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(".wrap(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }

        private Wrapper(Equivalence<? super T> equivalence, @ParametricNullness T t) {
            this.f39379b = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f39380c = t;
        }
    }

    public static Equivalence<Object> equals() {
        return Equals.f39375b;
    }

    public static Equivalence<Object> identity() {
        return Identity.f39378b;
    }

    @ForOverride
    /* renamed from: a */
    protected abstract boolean mo70056a(T t, T t2);

    @ForOverride
    /* renamed from: b */
    protected abstract int mo70055b(T t);

    public final boolean equivalent(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t != null && t2 != null) {
            return mo70056a(t, t2);
        }
        return false;
    }

    public final Predicate<T> equivalentTo(T t) {
        return new EquivalentToPredicate(this, t);
    }

    public final int hash(T t) {
        if (t == null) {
            return 0;
        }
        return mo70055b(t);
    }

    public final <F> Equivalence<F> onResultOf(Function<? super F, ? extends T> function) {
        return new FunctionalEquivalence(function, this);
    }

    @GwtCompatible(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> wrap(@ParametricNullness S s) {
        return new Wrapper<>(s);
    }
}
