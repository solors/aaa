package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class Converter<A, B> implements Function<A, B> {

    /* renamed from: b */
    private final boolean f39359b;
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient Converter<B, A> f39360c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {

        /* renamed from: d */
        final Converter<A, B> f39365d;

        /* renamed from: f */
        final Converter<B, C> f39366f;

        ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.f39365d = converter;
            this.f39366f = converter2;
        }

        @Override // com.google.common.base.Converter
        /* renamed from: a */
        A mo70084a(C c) {
            return this.f39365d.mo70084a(this.f39366f.mo70084a(c));
        }

        @Override // com.google.common.base.Converter
        /* renamed from: b */
        C mo70083b(A a) {
            return this.f39366f.mo70083b(this.f39365d.mo70083b(a));
        }

        @Override // com.google.common.base.Converter
        /* renamed from: d */
        protected A mo67968d(C c) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        /* renamed from: e */
        protected C mo67967e(A a) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof ConverterComposition)) {
                return false;
            }
            ConverterComposition converterComposition = (ConverterComposition) obj;
            if (!this.f39365d.equals(converterComposition.f39365d) || !this.f39366f.equals(converterComposition.f39366f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f39365d.hashCode() * 31) + this.f39366f.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39365d);
            String valueOf2 = String.valueOf(this.f39366f);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 10 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(".andThen(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {

        /* renamed from: d */
        private final Function<? super A, ? extends B> f39367d;

        /* renamed from: f */
        private final Function<? super B, ? extends A> f39368f;

        @Override // com.google.common.base.Converter
        /* renamed from: d */
        protected A mo67968d(B b) {
            return this.f39368f.apply(b);
        }

        @Override // com.google.common.base.Converter
        /* renamed from: e */
        protected B mo67967e(A a) {
            return this.f39367d.apply(a);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof FunctionBasedConverter)) {
                return false;
            }
            FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
            if (!this.f39367d.equals(functionBasedConverter.f39367d) || !this.f39368f.equals(functionBasedConverter.f39368f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f39367d.hashCode() * 31) + this.f39368f.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39367d);
            String valueOf2 = String.valueOf(this.f39368f);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
            sb2.append("Converter.from(");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }

        private FunctionBasedConverter(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.f39367d = (Function) Preconditions.checkNotNull(function);
            this.f39368f = (Function) Preconditions.checkNotNull(function2);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {

        /* renamed from: d */
        final Converter<A, B> f39370d;

        ReverseConverter(Converter<A, B> converter) {
            this.f39370d = converter;
        }

        @Override // com.google.common.base.Converter
        /* renamed from: a */
        B mo70084a(A a) {
            return this.f39370d.mo70083b(a);
        }

        @Override // com.google.common.base.Converter
        /* renamed from: b */
        A mo70083b(B b) {
            return this.f39370d.mo70084a(b);
        }

        @Override // com.google.common.base.Converter
        /* renamed from: d */
        protected B mo67968d(A a) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        /* renamed from: e */
        protected A mo67967e(B b) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.f39370d.equals(((ReverseConverter) obj).f39370d);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f39370d.hashCode();
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
            return this.f39370d;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39370d);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
            sb2.append(valueOf);
            sb2.append(".reverse()");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Converter() {
        this(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private A m70087f(B b) {
        return (A) mo67968d(NullnessCasts.m70058a(b));
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new FunctionBasedConverter(function, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private B m70086g(A a) {
        return (B) mo67967e(NullnessCasts.m70058a(a));
    }

    public static <T> Converter<T, T> identity() {
        return IdentityConverter.f39369d;
    }

    /* renamed from: a */
    A mo70084a(B b) {
        if (this.f39359b) {
            if (b == null) {
                return null;
            }
            return (A) Preconditions.checkNotNull(mo67968d(b));
        }
        return m70087f(b);
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return mo70085c(converter);
    }

    @Override // com.google.common.base.Function
    @CanIgnoreReturnValue
    @InlineMe(replacement = "this.convert(a)")
    @Deprecated
    public final B apply(A a) {
        return convert(a);
    }

    /* renamed from: b */
    B mo70083b(A a) {
        if (this.f39359b) {
            if (a == null) {
                return null;
            }
            return (B) Preconditions.checkNotNull(mo67967e(a));
        }
        return m70086g(a);
    }

    /* renamed from: c */
    <C> Converter<A, C> mo70085c(Converter<B, C> converter) {
        return new ConverterComposition(this, (Converter) Preconditions.checkNotNull(converter));
    }

    @CanIgnoreReturnValue
    public final B convert(A a) {
        return mo70083b(a);
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>() { // from class: com.google.common.base.Converter.1
            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.google.common.base.Converter.1.1

                    /* renamed from: b */
                    private final Iterator<? extends A> f39363b;

                    {
                        this.f39363b = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.f39363b.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) Converter.this.convert(this.f39363b.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.f39363b.remove();
                    }
                };
            }
        };
    }

    @ForOverride
    /* renamed from: d */
    protected abstract A mo67968d(B b);

    @ForOverride
    /* renamed from: e */
    protected abstract B mo67967e(A a);

    @Override // com.google.common.base.Function
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @CheckReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.f39360c;
        if (converter == null) {
            ReverseConverter reverseConverter = new ReverseConverter(this);
            this.f39360c = reverseConverter;
            return reverseConverter;
        }
        return converter;
    }

    Converter(boolean z) {
        this.f39359b = z;
    }

    /* loaded from: classes4.dex */
    private static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {

        /* renamed from: d */
        static final IdentityConverter<?> f39369d = new IdentityConverter<>();

        private IdentityConverter() {
        }

        private Object readResolve() {
            return f39369d;
        }

        @Override // com.google.common.base.Converter
        /* renamed from: c */
        <S> Converter<T, S> mo70085c(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // com.google.common.base.Converter
        /* renamed from: d */
        protected T mo67968d(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        /* renamed from: e */
        protected T mo67967e(T t) {
            return t;
        }
    }
}
