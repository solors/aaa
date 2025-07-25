package com.applovin.exoplayer2.common.base;

import com.learnings.abcenter.util.AbCenterConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public final class Predicates {

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$b */
    /* loaded from: classes2.dex */
    private static class C3914b implements Predicate, Serializable {

        /* renamed from: a */
        private final List f4206a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i = 0; i < this.f4206a.size(); i++) {
                if (!((Predicate) this.f4206a.get(i)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof C3914b) {
                return this.f4206a.equals(((C3914b) obj).f4206a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4206a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper(AbCenterConstant.CONDITION_TYPE_AND, this.f4206a);
        }

        private C3914b(List list) {
            this.f4206a = list;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$c */
    /* loaded from: classes2.dex */
    private static class C3915c implements Predicate, Serializable {

        /* renamed from: a */
        final Predicate f4207a;

        /* renamed from: b */
        final Function f4208b;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f4207a.apply(this.f4208b.apply(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof C3915c)) {
                return false;
            }
            C3915c c3915c = (C3915c) obj;
            if (!this.f4208b.equals(c3915c.f4208b) || !this.f4207a.equals(c3915c.f4207a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f4208b.hashCode() ^ this.f4207a.hashCode();
        }

        public String toString() {
            return this.f4207a + "(" + this.f4208b + ")";
        }

        private C3915c(Predicate predicate, Function function) {
            this.f4207a = (Predicate) Preconditions.checkNotNull(predicate);
            this.f4208b = (Function) Preconditions.checkNotNull(function);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$d */
    /* loaded from: classes2.dex */
    private static class C3916d implements Predicate, Serializable {

        /* renamed from: a */
        private final Collection f4209a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            try {
                return this.f4209a.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof C3916d) {
                return this.f4209a.equals(((C3916d) obj).f4209a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4209a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f4209a + ")";
        }

        private C3916d(Collection collection) {
            this.f4209a = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$e */
    /* loaded from: classes2.dex */
    private static class C3917e implements Predicate, Serializable {

        /* renamed from: a */
        private final Class f4210a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f4210a.isInstance(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof C3917e) || this.f4210a != ((C3917e) obj).f4210a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f4210a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f4210a.getName() + ")";
        }

        private C3917e(Class cls) {
            this.f4210a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$f */
    /* loaded from: classes2.dex */
    private static class C3918f implements Predicate, Serializable {

        /* renamed from: a */
        private final Object f4211a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f4211a.equals(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof C3918f) {
                return this.f4211a.equals(((C3918f) obj).f4211a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4211a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f4211a + ")";
        }

        private C3918f(Object obj) {
            this.f4211a = obj;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$g */
    /* loaded from: classes2.dex */
    private static class C3919g implements Predicate, Serializable {

        /* renamed from: a */
        final Predicate f4212a;

        C3919g(Predicate predicate) {
            this.f4212a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return !this.f4212a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof C3919g) {
                return this.f4212a.equals(((C3919g) obj).f4212a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f4212a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f4212a + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$i */
    /* loaded from: classes2.dex */
    private static class C3925i implements Predicate, Serializable {

        /* renamed from: a */
        private final List f4218a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i = 0; i < this.f4218a.size(); i++) {
                if (((Predicate) this.f4218a.get(i)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof C3925i) {
                return this.f4218a.equals(((C3925i) obj).f4218a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4218a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper(AbCenterConstant.CONDITION_TYPE_OR, this.f4218a);
        }

        private C3925i(List list) {
            this.f4218a = list;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$j */
    /* loaded from: classes2.dex */
    private static class C3926j implements Predicate, Serializable {

        /* renamed from: a */
        private final Class f4219a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof C3926j) || this.f4219a != ((C3926j) obj).f4219a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f4219a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f4219a.getName() + ")";
        }

        private C3926j(Class cls) {
            this.f4219a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Class cls) {
            return this.f4219a.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return EnumC3920h.f4214b.m101278b();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return EnumC3920h.f4213a.m101278b();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new C3914b(defensiveCopy(iterable));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new C3915c(predicate, function);
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t) {
        if (t == null) {
            return isNull();
        }
        return new C3918f(t);
    }

    /* renamed from: in */
    public static <T> Predicate<T> m101283in(Collection<? extends T> collection) {
        return new C3916d(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new C3917e(cls);
    }

    public static <T> Predicate<T> isNull() {
        return EnumC3920h.f4215c.m101278b();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new C3919g(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return EnumC3920h.f4216d.m101278b();
    }

    /* renamed from: or */
    public static <T> Predicate<T> m101281or(Iterable<? extends Predicate<? super T>> iterable) {
        return new C3925i(defensiveCopy(iterable));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new C3926j(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb2.append(',');
            }
            sb2.append(obj);
            z = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new C3914b(defensiveCopy(predicateArr));
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(Preconditions.checkNotNull(t));
        }
        return arrayList;
    }

    @SafeVarargs
    /* renamed from: or */
    public static <T> Predicate<T> m101280or(Predicate<? super T>... predicateArr) {
        return new C3925i(defensiveCopy(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new C3914b(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    /* renamed from: or */
    public static <T> Predicate<T> m101282or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new C3925i(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$h */
    /* loaded from: classes2.dex */
    public static abstract class EnumC3920h implements Predicate {

        /* renamed from: a */
        public static final EnumC3920h f4213a = new C3921a("ALWAYS_TRUE", 0);

        /* renamed from: b */
        public static final EnumC3920h f4214b = new C3922b("ALWAYS_FALSE", 1);

        /* renamed from: c */
        public static final EnumC3920h f4215c = new C3923c("IS_NULL", 2);

        /* renamed from: d */
        public static final EnumC3920h f4216d = new C3924d("NOT_NULL", 3);

        /* renamed from: f */
        private static final /* synthetic */ EnumC3920h[] f4217f = m101279a();

        /* renamed from: com.applovin.exoplayer2.common.base.Predicates$h$a */
        /* loaded from: classes2.dex */
        enum C3921a extends EnumC3920h {
            C3921a(String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* renamed from: com.applovin.exoplayer2.common.base.Predicates$h$b */
        /* loaded from: classes2.dex */
        enum C3922b extends EnumC3920h {
            C3922b(String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* renamed from: com.applovin.exoplayer2.common.base.Predicates$h$c */
        /* loaded from: classes2.dex */
        enum C3923c extends EnumC3920h {
            C3923c(String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                if (obj == null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        /* renamed from: com.applovin.exoplayer2.common.base.Predicates$h$d */
        /* loaded from: classes2.dex */
        enum C3924d extends EnumC3920h {
            C3924d(String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                if (obj != null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        private EnumC3920h(String str, int i) {
        }

        /* renamed from: a */
        private static /* synthetic */ EnumC3920h[] m101279a() {
            return new EnumC3920h[]{f4213a, f4214b, f4215c, f4216d};
        }

        public static EnumC3920h valueOf(String str) {
            return (EnumC3920h) Enum.valueOf(EnumC3920h.class, str);
        }

        public static EnumC3920h[] values() {
            return (EnumC3920h[]) f4217f.clone();
        }

        /* renamed from: b */
        Predicate m101278b() {
            return this;
        }
    }
}
