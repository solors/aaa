package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public abstract class Equivalence<T> {

    /* loaded from: classes2.dex */
    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        @NullableDecl
        private final T reference;

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Wrapper) {
                Wrapper wrapper = (Wrapper) obj;
                if (this.equivalence.equals(wrapper.equivalence)) {
                    return this.equivalence.equivalent((T) this.reference, (T) wrapper.reference);
                }
                return false;
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash((T) this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Equivalence$b */
    /* loaded from: classes2.dex */
    static final class C3906b extends Equivalence implements Serializable {

        /* renamed from: a */
        static final C3906b f4196a = new C3906b();

        C3906b() {
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Equivalence$c */
    /* loaded from: classes2.dex */
    private static final class C3907c implements Predicate, Serializable {

        /* renamed from: a */
        private final Equivalence f4197a;

        /* renamed from: b */
        private final Object f4198b;

        C3907c(Equivalence equivalence, Object obj) {
            this.f4197a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f4198b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f4197a.equivalent(obj, this.f4198b);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3907c)) {
                return false;
            }
            C3907c c3907c = (C3907c) obj;
            if (this.f4197a.equals(c3907c.f4197a) && Objects.equal(this.f4198b, c3907c.f4198b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f4197a, this.f4198b);
        }

        public String toString() {
            return this.f4197a + ".equivalentTo(" + this.f4198b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Equivalence$d */
    /* loaded from: classes2.dex */
    static final class C3908d extends Equivalence implements Serializable {

        /* renamed from: a */
        static final C3908d f4199a = new C3908d();

        C3908d() {
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    public static Equivalence<Object> equals() {
        return C3906b.f4196a;
    }

    public static Equivalence<Object> identity() {
        return C3908d.f4199a;
    }

    @ForOverride
    protected abstract boolean doEquivalent(T t, T t2);

    @ForOverride
    protected abstract int doHash(T t);

    public final boolean equivalent(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t != null && t2 != null) {
            return doEquivalent(t, t2);
        }
        return false;
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t) {
        return new C3907c(this, t);
    }

    public final int hash(@NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s) {
        return new Wrapper<>(s);
    }
}
