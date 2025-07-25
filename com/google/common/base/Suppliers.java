package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Suppliers {

    @VisibleForTesting
    /* loaded from: classes4.dex */
    static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {

        /* renamed from: b */
        final Supplier<T> f39467b;

        /* renamed from: c */
        final long f39468c;

        /* renamed from: d */
        volatile transient T f39469d;

        /* renamed from: f */
        volatile transient long f39470f;

        ExpiringMemoizingSupplier(Supplier<T> supplier, long j, TimeUnit timeUnit) {
            boolean z;
            this.f39467b = (Supplier) Preconditions.checkNotNull(supplier);
            this.f39468c = timeUnit.toNanos(j);
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "duration (%s %s) must be > 0", j, timeUnit);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            long j = this.f39470f;
            long m70043j = Platform.m70043j();
            if (j == 0 || m70043j - j >= 0) {
                synchronized (this) {
                    if (j == this.f39470f) {
                        T t = this.f39467b.get();
                        this.f39469d = t;
                        long j2 = m70043j + this.f39468c;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.f39470f = j2;
                        return t;
                    }
                }
            }
            return (T) NullnessCasts.m70058a(this.f39469d);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39467b);
            long j = this.f39468c;
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
            sb2.append("Suppliers.memoizeWithExpiration(");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(j);
            sb2.append(", NANOS)");
            return sb2.toString();
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    static class MemoizingSupplier<T> implements Supplier<T>, Serializable {

        /* renamed from: b */
        final Supplier<T> f39471b;

        /* renamed from: c */
        volatile transient boolean f39472c;

        /* renamed from: d */
        transient T f39473d;

        MemoizingSupplier(Supplier<T> supplier) {
            this.f39471b = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.f39472c) {
                synchronized (this) {
                    if (!this.f39472c) {
                        T t = this.f39471b.get();
                        this.f39473d = t;
                        this.f39472c = true;
                        return t;
                    }
                }
            }
            return (T) NullnessCasts.m70058a(this.f39473d);
        }

        public String toString() {
            Object obj;
            if (this.f39472c) {
                String valueOf = String.valueOf(this.f39473d);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(valueOf);
                sb2.append(">");
                obj = sb2.toString();
            } else {
                obj = this.f39471b;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(valueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {

        /* renamed from: b */
        volatile Supplier<T> f39474b;

        /* renamed from: c */
        volatile boolean f39475c;

        /* renamed from: d */
        T f39476d;

        NonSerializableMemoizingSupplier(Supplier<T> supplier) {
            this.f39474b = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.f39475c) {
                synchronized (this) {
                    if (!this.f39475c) {
                        Supplier<T> supplier = this.f39474b;
                        java.util.Objects.requireNonNull(supplier);
                        T t = supplier.get();
                        this.f39476d = t;
                        this.f39475c = true;
                        this.f39474b = null;
                        return t;
                    }
                }
            }
            return (T) NullnessCasts.m70058a(this.f39476d);
        }

        public String toString() {
            Object obj = this.f39474b;
            if (obj == null) {
                String valueOf = String.valueOf(this.f39476d);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(valueOf);
                sb2.append(">");
                obj = sb2.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(valueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static class SupplierComposition<F, T> implements Supplier<T>, Serializable {

        /* renamed from: b */
        final Function<? super F, T> f39477b;

        /* renamed from: c */
        final Supplier<F> f39478c;

        SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
            this.f39477b = (Function) Preconditions.checkNotNull(function);
            this.f39478c = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SupplierComposition)) {
                return false;
            }
            SupplierComposition supplierComposition = (SupplierComposition) obj;
            if (!this.f39477b.equals(supplierComposition.f39477b) || !this.f39478c.equals(supplierComposition.f39478c)) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.f39477b.apply((F) this.f39478c.get());
        }

        public int hashCode() {
            return Objects.hashCode(this.f39477b, this.f39478c);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39477b);
            String valueOf2 = String.valueOf(this.f39478c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
            sb2.append("Suppliers.compose(");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    /* loaded from: classes4.dex */
    private enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // com.google.common.base.Function
        public Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }
    }

    /* loaded from: classes4.dex */
    private static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        @ParametricNullness

        /* renamed from: b */
        final T f39480b;

        SupplierOfInstance(@ParametricNullness T t) {
            this.f39480b = t;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.f39480b, ((SupplierOfInstance) obj).f39480b);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.f39480b;
        }

        public int hashCode() {
            return Objects.hashCode(this.f39480b);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39480b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Suppliers.ofInstance(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {

        /* renamed from: b */
        final Supplier<T> f39481b;

        ThreadSafeSupplier(Supplier<T> supplier) {
            this.f39481b = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            T t;
            synchronized (this.f39481b) {
                t = this.f39481b.get();
            }
            return t;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39481b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
            sb2.append("Suppliers.synchronizedSupplier(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private Suppliers() {
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new SupplierComposition(function, supplier);
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        if (!(supplier instanceof NonSerializableMemoizingSupplier) && !(supplier instanceof MemoizingSupplier)) {
            if (supplier instanceof Serializable) {
                return new MemoizingSupplier(supplier);
            }
            return new NonSerializableMemoizingSupplier(supplier);
        }
        return supplier;
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j, TimeUnit timeUnit) {
        return new ExpiringMemoizingSupplier(supplier, j, timeUnit);
    }

    public static <T> Supplier<T> ofInstance(@ParametricNullness T t) {
        return new SupplierOfInstance(t);
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return SupplierFunctionImpl.INSTANCE;
    }

    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
        return new ThreadSafeSupplier(supplier);
    }
}
