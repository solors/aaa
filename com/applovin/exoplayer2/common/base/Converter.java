package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;
    @LazyInit
    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    /* renamed from: com.applovin.exoplayer2.common.base.Converter$a */
    /* loaded from: classes2.dex */
    class C3899a implements Iterable {

        /* renamed from: a */
        final /* synthetic */ Iterable f4186a;

        /* renamed from: com.applovin.exoplayer2.common.base.Converter$a$a */
        /* loaded from: classes2.dex */
        class C3900a implements Iterator {

            /* renamed from: a */
            private final Iterator f4188a;

            C3900a() {
                this.f4188a = C3899a.this.f4186a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4188a.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public Object next() {
                return Converter.this.convert(this.f4188a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f4188a.remove();
            }
        }

        C3899a(Iterable iterable) {
            this.f4186a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C3900a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.Converter$b */
    /* loaded from: classes2.dex */
    public static final class C3901b extends Converter implements Serializable {

        /* renamed from: a */
        final Converter f4190a;

        /* renamed from: b */
        final Converter f4191b;

        C3901b(Converter converter, Converter converter2) {
            this.f4190a = converter;
            this.f4191b = converter2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        Object correctedDoBackward(Object obj) {
            return this.f4190a.correctedDoBackward(this.f4191b.correctedDoBackward(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        Object correctedDoForward(Object obj) {
            return this.f4191b.correctedDoForward(this.f4190a.correctedDoForward(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doBackward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doForward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof C3901b)) {
                return false;
            }
            C3901b c3901b = (C3901b) obj;
            if (!this.f4190a.equals(c3901b.f4190a) || !this.f4191b.equals(c3901b.f4191b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f4190a.hashCode() * 31) + this.f4191b.hashCode();
        }

        public String toString() {
            return this.f4190a + ".andThen(" + this.f4191b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Converter$c */
    /* loaded from: classes2.dex */
    private static final class C3902c extends Converter implements Serializable {

        /* renamed from: a */
        private final Function f4192a;

        /* renamed from: b */
        private final Function f4193b;

        /* synthetic */ C3902c(Function function, Function function2, C3899a c3899a) {
            this(function, function2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doBackward(Object obj) {
            return this.f4193b.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doForward(Object obj) {
            return this.f4192a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof C3902c)) {
                return false;
            }
            C3902c c3902c = (C3902c) obj;
            if (!this.f4192a.equals(c3902c.f4192a) || !this.f4193b.equals(c3902c.f4193b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f4192a.hashCode() * 31) + this.f4193b.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f4192a + ", " + this.f4193b + ")";
        }

        private C3902c(Function function, Function function2) {
            this.f4192a = (Function) Preconditions.checkNotNull(function);
            this.f4193b = (Function) Preconditions.checkNotNull(function2);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Converter$e */
    /* loaded from: classes2.dex */
    private static final class C3904e extends Converter implements Serializable {

        /* renamed from: a */
        final Converter f4195a;

        C3904e(Converter converter) {
            this.f4195a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        Object correctedDoBackward(Object obj) {
            return this.f4195a.correctedDoForward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        Object correctedDoForward(Object obj) {
            return this.f4195a.correctedDoBackward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doBackward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doForward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof C3904e) {
                return this.f4195a.equals(((C3904e) obj).f4195a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f4195a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter reverse() {
            return this.f4195a;
        }

        public String toString() {
            return this.f4195a + ".reverse()";
        }
    }

    protected Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new C3902c(function, function2, null);
    }

    public static <T> Converter<T, T> identity() {
        return C3903d.f4194a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @CanIgnoreReturnValue
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a) {
        return convert(a);
    }

    @CanIgnoreReturnValue
    @NullableDecl
    public final B convert(@NullableDecl A a) {
        return correctedDoForward(a);
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new C3899a(iterable);
    }

    @NullableDecl
    A correctedDoBackward(@NullableDecl B b) {
        if (this.handleNullAutomatically) {
            if (b == null) {
                return null;
            }
            return (A) Preconditions.checkNotNull(doBackward(b));
        }
        return doBackward(b);
    }

    @NullableDecl
    B correctedDoForward(@NullableDecl A a) {
        if (this.handleNullAutomatically) {
            if (a == null) {
                return null;
            }
            return (B) Preconditions.checkNotNull(doForward(a));
        }
        return doForward(a);
    }

    <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new C3901b(this, (Converter) Preconditions.checkNotNull(converter));
    }

    @ForOverride
    protected abstract A doBackward(B b);

    @ForOverride
    protected abstract B doForward(A a);

    @Override // com.applovin.exoplayer2.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter == null) {
            C3904e c3904e = new C3904e(this);
            this.reverse = c3904e;
            return c3904e;
        }
        return converter;
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Converter$d */
    /* loaded from: classes2.dex */
    private static final class C3903d extends Converter implements Serializable {

        /* renamed from: a */
        static final C3903d f4194a = new C3903d();

        private C3903d() {
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        Converter doAndThen(Converter converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public C3903d reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doBackward(Object obj) {
            return obj;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doForward(Object obj) {
            return obj;
        }
    }
}
