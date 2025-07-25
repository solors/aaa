package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Functions {

    /* loaded from: classes4.dex */
    private static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        @ParametricNullness

        /* renamed from: b */
        private final E f39389b;

        public ConstantFunction(@ParametricNullness E e) {
            this.f39389b = e;
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public E apply(Object obj) {
            return this.f39389b;
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ConstantFunction) {
                return Objects.equal(this.f39389b, ((ConstantFunction) obj).f39389b);
            }
            return false;
        }

        public int hashCode() {
            E e = this.f39389b;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39389b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Functions.constant(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {

        /* renamed from: b */
        final Map<K, ? extends V> f39390b;
        @ParametricNullness

        /* renamed from: c */
        final V f39391c;

        ForMapWithDefault(Map<K, ? extends V> map, @ParametricNullness V v) {
            this.f39390b = (Map) Preconditions.checkNotNull(map);
            this.f39391c = v;
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k) {
            V v = this.f39390b.get(k);
            if (v == null && !this.f39390b.containsKey(k)) {
                return this.f39391c;
            }
            return (V) NullnessCasts.m70058a(v);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof ForMapWithDefault)) {
                return false;
            }
            ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
            if (!this.f39390b.equals(forMapWithDefault.f39390b) || !Objects.equal(this.f39391c, forMapWithDefault.f39391c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.f39390b, this.f39391c);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39390b);
            String valueOf2 = String.valueOf(this.f39391c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
            sb2.append("Functions.forMap(");
            sb2.append(valueOf);
            sb2.append(", defaultValue=");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {

        /* renamed from: b */
        private final Function<B, C> f39392b;

        /* renamed from: c */
        private final Function<A, ? extends B> f39393c;

        public FunctionComposition(Function<B, C> function, Function<A, ? extends B> function2) {
            this.f39392b = (Function) Preconditions.checkNotNull(function);
            this.f39393c = (Function) Preconditions.checkNotNull(function2);
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public C apply(@ParametricNullness A a) {
            return this.f39392b.apply(this.f39393c.apply(a));
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof FunctionComposition)) {
                return false;
            }
            FunctionComposition functionComposition = (FunctionComposition) obj;
            if (!this.f39393c.equals(functionComposition.f39393c) || !this.f39392b.equals(functionComposition.f39392b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f39393c.hashCode() ^ this.f39392b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39392b);
            String valueOf2 = String.valueOf(this.f39393c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {

        /* renamed from: b */
        final Map<K, V> f39394b;

        FunctionForMapNoDefault(Map<K, V> map) {
            this.f39394b = (Map) Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k) {
            boolean z;
            V v = this.f39394b.get(k);
            if (v == null && !this.f39394b.containsKey(k)) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "Key '%s' not present in map", k);
            return (V) NullnessCasts.m70058a(v);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.f39394b.equals(((FunctionForMapNoDefault) obj).f39394b);
            }
            return false;
        }

        public int hashCode() {
            return this.f39394b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39394b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
            sb2.append("Functions.forMap(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {

        /* renamed from: b */
        private final Predicate<T> f39396b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Boolean apply(@ParametricNullness Object obj) {
            return apply((PredicateFunction<T>) obj);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.f39396b.equals(((PredicateFunction) obj).f39396b);
            }
            return false;
        }

        public int hashCode() {
            return this.f39396b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39396b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("Functions.forPredicate(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        private PredicateFunction(Predicate<T> predicate) {
            this.f39396b = (Predicate) Preconditions.checkNotNull(predicate);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public Boolean apply(@ParametricNullness T t) {
            return Boolean.valueOf(this.f39396b.apply(t));
        }
    }

    /* loaded from: classes4.dex */
    private static class SupplierFunction<F, T> implements Function<F, T>, Serializable {

        /* renamed from: b */
        private final Supplier<T> f39397b;

        @Override // com.google.common.base.Function
        @ParametricNullness
        public T apply(@ParametricNullness F f) {
            return this.f39397b.get();
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof SupplierFunction) {
                return this.f39397b.equals(((SupplierFunction) obj).f39397b);
            }
            return false;
        }

        public int hashCode() {
            return this.f39397b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39397b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Functions.forSupplier(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        private SupplierFunction(Supplier<T> supplier) {
            this.f39397b = (Supplier) Preconditions.checkNotNull(supplier);
        }
    }

    /* loaded from: classes4.dex */
    private enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // com.google.common.base.Function
        public String apply(Object obj) {
            Preconditions.checkNotNull(obj);
            return obj.toString();
        }
    }

    private Functions() {
    }

    public static <A, B, C> Function<A, C> compose(Function<B, C> function, Function<A, ? extends B> function2) {
        return new FunctionComposition(function, function2);
    }

    public static <E> Function<Object, E> constant(@ParametricNullness E e) {
        return new ConstantFunction(e);
    }

    public static <K, V> Function<K, V> forMap(Map<K, V> map) {
        return new FunctionForMapNoDefault(map);
    }

    public static <T> Function<T, Boolean> forPredicate(Predicate<T> predicate) {
        return new PredicateFunction(predicate);
    }

    public static <F, T> Function<F, T> forSupplier(Supplier<T> supplier) {
        return new SupplierFunction(supplier);
    }

    public static <E> Function<E, E> identity() {
        return IdentityFunction.INSTANCE;
    }

    public static Function<Object, String> toStringFunction() {
        return ToStringFunction.INSTANCE;
    }

    public static <K, V> Function<K, V> forMap(Map<K, ? extends V> map, @ParametricNullness V v) {
        return new ForMapWithDefault(map, v);
    }

    /* loaded from: classes4.dex */
    private enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return obj;
        }
    }
}
