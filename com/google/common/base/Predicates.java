package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.learnings.abcenter.util.AbCenterConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Predicates {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class AndPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        private final List<? extends Predicate<? super T>> f39424b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            for (int i = 0; i < this.f39424b.size(); i++) {
                if (!this.f39424b.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.f39424b.equals(((AndPredicate) obj).f39424b);
            }
            return false;
        }

        public int hashCode() {
            return this.f39424b.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.m70035e(AbCenterConstant.CONDITION_TYPE_AND, this.f39424b);
        }

        private AndPredicate(List<? extends Predicate<? super T>> list) {
            this.f39424b = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {

        /* renamed from: b */
        final Predicate<B> f39425b;

        /* renamed from: c */
        final Function<A, ? extends B> f39426c;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness A a) {
            return this.f39425b.apply(this.f39426c.apply(a));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            if (!this.f39426c.equals(compositionPredicate.f39426c) || !this.f39425b.equals(compositionPredicate.f39425b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f39426c.hashCode() ^ this.f39425b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39425b);
            String valueOf2 = String.valueOf(this.f39426c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }

        private CompositionPredicate(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f39425b = (Predicate) Preconditions.checkNotNull(predicate);
            this.f39426c = (Function) Preconditions.checkNotNull(function);
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        ContainsPatternFromStringPredicate(String str) {
            super(Platform.m70052a(str));
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
            String pattern = this.f39427b.pattern();
            StringBuilder sb2 = new StringBuilder(String.valueOf(pattern).length() + 28);
            sb2.append("Predicates.containsPattern(");
            sb2.append(pattern);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {

        /* renamed from: b */
        final CommonPattern f39427b;

        ContainsPatternPredicate(CommonPattern commonPattern) {
            this.f39427b = (CommonPattern) Preconditions.checkNotNull(commonPattern);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof ContainsPatternPredicate)) {
                return false;
            }
            ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
            if (!Objects.equal(this.f39427b.pattern(), containsPatternPredicate.f39427b.pattern()) || this.f39427b.flags() != containsPatternPredicate.f39427b.flags()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.f39427b.pattern(), Integer.valueOf(this.f39427b.flags()));
        }

        public String toString() {
            String toStringHelper = MoreObjects.toStringHelper(this.f39427b).add("pattern", this.f39427b.pattern()).add("pattern.flags", this.f39427b.flags()).toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(toStringHelper).length() + 21);
            sb2.append("Predicates.contains(");
            sb2.append(toStringHelper);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(CharSequence charSequence) {
            return this.f39427b.matcher(charSequence).find();
        }
    }

    /* loaded from: classes4.dex */
    private static class InPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        private final Collection<?> f39428b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            try {
                return this.f39428b.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.f39428b.equals(((InPredicate) obj).f39428b);
            }
            return false;
        }

        public int hashCode() {
            return this.f39428b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39428b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 15);
            sb2.append("Predicates.in(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        private InPredicate(Collection<?> collection) {
            this.f39428b = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        private final Class<?> f39429b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            return this.f39429b.isInstance(t);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof InstanceOfPredicate) || this.f39429b != ((InstanceOfPredicate) obj).f39429b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f39429b.hashCode();
        }

        public String toString() {
            String name = this.f39429b.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 23);
            sb2.append("Predicates.instanceOf(");
            sb2.append(name);
            sb2.append(")");
            return sb2.toString();
        }

        private InstanceOfPredicate(Class<?> cls) {
            this.f39429b = (Class) Preconditions.checkNotNull(cls);
        }
    }

    /* loaded from: classes4.dex */
    private static class IsEqualToPredicate implements Predicate<Object>, Serializable {

        /* renamed from: b */
        private final Object f39430b;

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f39430b.equals(obj);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.f39430b.equals(((IsEqualToPredicate) obj).f39430b);
            }
            return false;
        }

        public int hashCode() {
            return this.f39430b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39430b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Predicates.equalTo(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        private IsEqualToPredicate(Object obj) {
            this.f39430b = obj;
        }

        /* renamed from: a */
        <T> Predicate<T> m70030a() {
            return this;
        }
    }

    /* loaded from: classes4.dex */
    private static class NotPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        final Predicate<T> f39431b;

        NotPredicate(Predicate<T> predicate) {
            this.f39431b = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            return !this.f39431b.apply(t);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.f39431b.equals(((NotPredicate) obj).f39431b);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f39431b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39431b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16);
            sb2.append("Predicates.not(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static class OrPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        private final List<? extends Predicate<? super T>> f39433b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
            for (int i = 0; i < this.f39433b.size(); i++) {
                if (this.f39433b.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                return this.f39433b.equals(((OrPredicate) obj).f39433b);
            }
            return false;
        }

        public int hashCode() {
            return this.f39433b.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.m70035e(AbCenterConstant.CONDITION_TYPE_OR, this.f39433b);
        }

        private OrPredicate(List<? extends Predicate<? super T>> list) {
            this.f39433b = list;
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {

        /* renamed from: b */
        private final Class<?> f39434b;

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof SubtypeOfPredicate) || this.f39434b != ((SubtypeOfPredicate) obj).f39434b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f39434b.hashCode();
        }

        public String toString() {
            String name = this.f39434b.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 22);
            sb2.append("Predicates.subtypeOf(");
            sb2.append(name);
            sb2.append(")");
            return sb2.toString();
        }

        private SubtypeOfPredicate(Class<?> cls) {
            this.f39434b = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Class<?> cls) {
            return this.f39434b.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysFalse() {
        return ObjectPredicate.ALWAYS_FALSE.m70028c();
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysTrue() {
        return ObjectPredicate.ALWAYS_TRUE.m70028c();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new AndPredicate(m70037c(iterable));
    }

    /* renamed from: b */
    private static <T> List<Predicate<? super T>> m70038b(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    /* renamed from: c */
    static <T> List<T> m70037c(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(Preconditions.checkNotNull(t));
        }
        return arrayList;
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new CompositionPredicate(predicate, function);
    }

    @GwtIncompatible("java.util.regex.Pattern")
    public static Predicate<CharSequence> contains(Pattern pattern) {
        return new ContainsPatternPredicate(new JdkPattern(pattern));
    }

    @GwtIncompatible
    public static Predicate<CharSequence> containsPattern(String str) {
        return new ContainsPatternFromStringPredicate(str);
    }

    /* renamed from: d */
    private static <T> List<T> m70036d(T... tArr) {
        return m70037c(Arrays.asList(tArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static String m70035e(String str, Iterable<?> iterable) {
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

    public static <T> Predicate<T> equalTo(@ParametricNullness T t) {
        if (t == null) {
            return isNull();
        }
        return new IsEqualToPredicate(t).m70030a();
    }

    /* renamed from: in */
    public static <T> Predicate<T> m70034in(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    @GwtIncompatible
    public static <T> Predicate<T> instanceOf(Class<?> cls) {
        return new InstanceOfPredicate(cls);
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> isNull() {
        return ObjectPredicate.IS_NULL.m70028c();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new NotPredicate(predicate);
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> notNull() {
        return ObjectPredicate.NOT_NULL.m70028c();
    }

    /* renamed from: or */
    public static <T> Predicate<T> m70032or(Iterable<? extends Predicate<? super T>> iterable) {
        return new OrPredicate(m70037c(iterable));
    }

    @Beta
    @GwtIncompatible
    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new SubtypeOfPredicate(cls);
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new AndPredicate(m70036d(predicateArr));
    }

    @SafeVarargs
    /* renamed from: or */
    public static <T> Predicate<T> m70031or(Predicate<? super T>... predicateArr) {
        return new OrPredicate(m70036d(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new AndPredicate(m70038b((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    /* renamed from: or */
    public static <T> Predicate<T> m70033or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new OrPredicate(m70038b((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
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
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
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
        };

        /* renamed from: c */
        <T> Predicate<T> m70028c() {
            return this;
        }
    }
}
