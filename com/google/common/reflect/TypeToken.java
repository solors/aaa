package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.Types;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {

    /* renamed from: b */
    private final Type f41545b;

    /* renamed from: c */
    private transient TypeResolver f41546c;

    /* renamed from: d */
    private transient TypeResolver f41547d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class Bounds {

        /* renamed from: a */
        private final Type[] f41552a;

        /* renamed from: b */
        private final boolean f41553b;

        Bounds(Type[] typeArr, boolean z) {
            this.f41552a = typeArr;
            this.f41553b = z;
        }

        /* renamed from: a */
        boolean m67858a(Type type) {
            for (Type type2 : this.f41552a) {
                boolean isSubtypeOf = TypeToken.m67873of(type2).isSubtypeOf(type);
                boolean z = this.f41553b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f41553b;
        }

        /* renamed from: b */
        boolean m67857b(Type type) {
            TypeToken<?> m67873of = TypeToken.m67873of(type);
            for (Type type2 : this.f41552a) {
                boolean isSubtypeOf = m67873of.isSubtypeOf(type2);
                boolean z = this.f41553b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f41553b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        SimpleTypeToken(Type type) {
            super(type);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static abstract class TypeCollector<K> {

        /* renamed from: a */
        static final TypeCollector<TypeToken<?>> f41559a = new TypeCollector<TypeToken<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: i */
            public Iterable<? extends TypeToken<?>> mo67845e(TypeToken<?> typeToken) {
                return typeToken.m67871q();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: j */
            public Class<?> mo67844f(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: k */
            public TypeToken<?> mo67843g(TypeToken<?> typeToken) {
                return typeToken.m67870r();
            }
        };

        /* renamed from: b */
        static final TypeCollector<Class<?>> f41560b = new TypeCollector<Class<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: i */
            public Iterable<? extends Class<?>> mo67845e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: k */
            public Class<?> mo67843g(Class<?> cls) {
                return cls.getSuperclass();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: j */
            public Class<?> mo67844f(Class<?> cls) {
                return cls;
            }
        };

        /* loaded from: classes4.dex */
        private static class ForwardingTypeCollector<K> extends TypeCollector<K> {

            /* renamed from: c */
            private final TypeCollector<K> f41563c;

            ForwardingTypeCollector(TypeCollector<K> typeCollector) {
                super();
                this.f41563c = typeCollector;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: e */
            Iterable<? extends K> mo67845e(K k) {
                return this.f41563c.mo67845e(k);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: f */
            Class<?> mo67844f(K k) {
                return this.f41563c.mo67844f(k);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: g */
            K mo67843g(K k) {
                return this.f41563c.mo67843g(k);
            }
        }

        private TypeCollector() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        /* renamed from: b */
        private int m67855b(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = mo67844f(k).isInterface();
            int i = isInterface;
            for (K k2 : mo67845e(k)) {
                i = Math.max(i, m67855b(k2, map));
            }
            K mo67843g = mo67843g(k);
            int i2 = i;
            if (mo67843g != null) {
                i2 = Math.max(i, m67855b(mo67843g, map));
            }
            int i3 = i2 + 1;
            map.put(k, Integer.valueOf(i3));
            return i3;
        }

        /* renamed from: h */
        private static <K, V> ImmutableList<K> m67853h(final Map<K, V> map, final Comparator<? super V> comparator) {
            return (ImmutableList<K>) new Ordering<K>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.Ordering, java.util.Comparator
                public int compare(K k, K k2) {
                    Comparator comparator2 = comparator;
                    Object obj = map.get(k);
                    Objects.requireNonNull(obj);
                    Object obj2 = map.get(k2);
                    Objects.requireNonNull(obj2);
                    return comparator2.compare(obj, obj2);
                }
            }.immutableSortedCopy(map.keySet());
        }

        /* renamed from: a */
        final TypeCollector<K> m67856a() {
            return new ForwardingTypeCollector<K>(this, this) { // from class: com.google.common.reflect.TypeToken.TypeCollector.3
                @Override // com.google.common.reflect.TypeToken.TypeCollector
                /* renamed from: c */
                ImmutableList<K> mo67846c(Iterable<? extends K> iterable) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    for (K k : iterable) {
                        if (!mo67844f(k).isInterface()) {
                            builder.add((ImmutableList.Builder) k);
                        }
                    }
                    return super.mo67846c(builder.build());
                }

                @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
                /* renamed from: e */
                Iterable<? extends K> mo67845e(K k) {
                    return ImmutableSet.m69331of();
                }
            };
        }

        /* renamed from: c */
        ImmutableList<K> mo67846c(Iterable<? extends K> iterable) {
            HashMap newHashMap = Maps.newHashMap();
            for (K k : iterable) {
                m67855b(k, newHashMap);
            }
            return m67853h(newHashMap, Ordering.natural().reverse());
        }

        /* renamed from: d */
        final ImmutableList<K> m67854d(K k) {
            return mo67846c(ImmutableList.m69423of(k));
        }

        /* renamed from: e */
        abstract Iterable<? extends K> mo67845e(K k);

        /* renamed from: f */
        abstract Class<?> mo67844f(K k);

        /* renamed from: g */
        abstract K mo67843g(K k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum TypeFilter implements Predicate<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).f41545b instanceof TypeVariable) || (((TypeToken) typeToken).f41545b instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {

        /* renamed from: b */
        private transient ImmutableSet<TypeToken<? super T>> f41565b;

        TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new ClassSet();
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new InterfaceSet(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f41565b;
            if (immutableSet == null) {
                ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(TypeCollector.f41559a.m67854d(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
                this.f41565b = set;
                return set;
            }
            return immutableSet;
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) TypeCollector.f41560b.mo67846c(TypeToken.this.m67867u()));
        }
    }

    /* renamed from: A */
    private boolean m67897A(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = m67873of(parameterizedType).getRawType();
        if (!m67890H(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!m67873of(m67872p().resolveType(typeParameters[i])).m67864x(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        if (!Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) && parameterizedType.getOwnerType() != null && !m67863y(parameterizedType.getOwnerType())) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private boolean m67896B(GenericArrayType genericArrayType) {
        Type type = this.f41545b;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return cls.isAssignableFrom(Object[].class);
            }
            return m67873of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        } else if (type instanceof GenericArrayType) {
            return m67873of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.f41545b).getGenericComponentType());
        } else {
            return false;
        }
    }

    /* renamed from: C */
    private boolean m67895C() {
        return Primitives.allWrapperTypes().contains(this.f41545b);
    }

    /* renamed from: D */
    private static Type m67894D(Type type) {
        return Types.JavaVersion.JAVA7.mo67809d(type);
    }

    /* renamed from: F */
    private TypeToken<?> m67892F(Type type) {
        TypeToken<?> m67873of = m67873of(m67872p().resolveType(type));
        m67873of.f41547d = this.f41547d;
        m67873of.f41546c = this.f41546c;
        return m67873of;
    }

    /* renamed from: G */
    private Type m67891G(Class<?> cls) {
        if ((this.f41545b instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken m67889I = m67889I(cls);
        return new TypeResolver().where(m67889I.getSupertype(getRawType()).f41545b, this.f41545b).resolveType(m67889I.f41545b);
    }

    /* renamed from: H */
    private boolean m67890H(Class<?> cls) {
        UnmodifiableIterator<Class<? super T>> it = m67867u().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: I */
    static <T> TypeToken<? extends T> m67889I(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return (TypeToken<? extends T>) m67873of(Types.m67830j(m67889I(cls.getComponentType()).f41545b));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            type = m67889I(cls.getEnclosingClass()).f41545b;
        } else {
            type = null;
        }
        if (typeParameters.length <= 0 && (type == null || type == cls.getEnclosingClass())) {
            return m67874of((Class) cls);
        }
        return (TypeToken<? extends T>) m67873of(Types.m67827m(type, cls, typeParameters));
    }

    /* renamed from: f */
    private static Bounds m67884f(Type[] typeArr) {
        return new Bounds(typeArr, true);
    }

    /* renamed from: g */
    private TypeToken<? super T> m67883g(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) m67873of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    /* renamed from: h */
    private ImmutableList<TypeToken<? super T>> m67882h(Type[] typeArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : typeArr) {
            TypeToken<?> m67873of = m67873of(type);
            if (m67873of.getRawType().isInterface()) {
                builder.add((ImmutableList.Builder) m67873of);
            }
        }
        return builder.build();
    }

    /* renamed from: i */
    private static Type m67881i(TypeVariable<?> typeVariable, Type type) {
        if (type instanceof WildcardType) {
            return m67880j(typeVariable, (WildcardType) type);
        }
        return m67878l(type);
    }

    /* renamed from: j */
    private static WildcardType m67880j(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] upperBounds;
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!m67884f(bounds).m67858a(type)) {
                arrayList.add(m67878l(type));
            }
        }
        return new Types.WildcardTypeImpl(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    /* renamed from: k */
    private static ParameterizedType m67879k(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = m67881i(typeParameters[i], actualTypeArguments[i]);
        }
        return Types.m67827m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    /* renamed from: l */
    private static Type m67878l(Type type) {
        if (type instanceof ParameterizedType) {
            return m67879k((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return Types.m67830j(m67878l(((GenericArrayType) type).getGenericComponentType()));
        }
        return type;
    }

    /* renamed from: m */
    private static Bounds m67877m(Type[] typeArr) {
        return new Bounds(typeArr, false);
    }

    /* renamed from: n */
    private TypeToken<? extends T> m67876n(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            TypeToken<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? extends T>) m67873of(m67894D(componentType2.getSubtype(componentType).f41545b));
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 36 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(" does not appear to be a subtype of ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: o */
    private TypeToken<? super T> m67875o(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType != null) {
            Class componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? super T>) m67873of(m67894D(componentType.getSupertype(componentType2).f41545b));
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 23 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(" isn't a super type of ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: of */
    public static <T> TypeToken<T> m67874of(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public TypeResolver m67872p() {
        TypeResolver typeResolver = this.f41547d;
        if (typeResolver == null) {
            TypeResolver m67919d = TypeResolver.m67919d(this.f41545b);
            this.f41547d = m67919d;
            return m67919d;
        }
        return typeResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public TypeResolver m67869s() {
        TypeResolver typeResolver = this.f41546c;
        if (typeResolver == null) {
            TypeResolver m67917f = TypeResolver.m67917f(this.f41545b);
            this.f41546c = m67917f;
            return m67917f;
        }
        return typeResolver;
    }

    /* renamed from: t */
    private Type m67868t() {
        Type type = this.f41545b;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public ImmutableSet<Class<? super T>> m67867u() {
        final ImmutableSet.Builder builder = ImmutableSet.builder();
        new TypeVisitor(this) { // from class: com.google.common.reflect.TypeToken.4
            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: a */
            void mo67820a(Class<?> cls) {
                builder.add((ImmutableSet.Builder) cls);
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: b */
            void mo67819b(GenericArrayType genericArrayType) {
                builder.add((ImmutableSet.Builder) Types.m67832h(TypeToken.m67873of(genericArrayType.getGenericComponentType()).getRawType()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: c */
            void mo67840c(ParameterizedType parameterizedType) {
                builder.add((ImmutableSet.Builder) ((Class) parameterizedType.getRawType()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: d */
            void mo67818d(TypeVariable<?> typeVariable) {
                visit(typeVariable.getBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: e */
            void mo67817e(WildcardType wildcardType) {
                visit(wildcardType.getUpperBounds());
            }
        }.visit(this.f41545b);
        return builder.build();
    }

    /* renamed from: v */
    private TypeToken<? extends T> m67866v(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) m67873of(typeArr[0]).getSubtype(cls);
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(" isn't a subclass of ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: w */
    private TypeToken<? super T> m67865w(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> m67873of = m67873of(type);
            if (m67873of.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) m67873of.getSupertype(cls);
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 23 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(" isn't a super type of ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: x */
    private boolean m67864x(Type type, TypeVariable<?> typeVariable) {
        if (this.f41545b.equals(type)) {
            return true;
        }
        if (type instanceof WildcardType) {
            WildcardType m67880j = m67880j(typeVariable, (WildcardType) type);
            if (m67877m(m67880j.getUpperBounds()).m67857b(this.f41545b) && m67877m(m67880j.getLowerBounds()).m67858a(this.f41545b)) {
                return true;
            }
            return false;
        }
        return m67878l(this.f41545b).equals(m67878l(type));
    }

    /* renamed from: y */
    private boolean m67863y(Type type) {
        Iterator<TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type m67868t = it.next().m67868t();
            if (m67868t != null && m67873of(m67868t).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private boolean m67862z(GenericArrayType genericArrayType) {
        Type type = this.f41545b;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return false;
            }
            return m67874of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        } else if (!(type instanceof GenericArrayType)) {
            return false;
        } else {
            return m67873of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: E */
    public final TypeToken<T> m67893E() {
        new TypeVisitor() { // from class: com.google.common.reflect.TypeToken.3
            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: b */
            void mo67819b(GenericArrayType genericArrayType) {
                visit(genericArrayType.getGenericComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: c */
            void mo67840c(ParameterizedType parameterizedType) {
                visit(parameterizedType.getActualTypeArguments());
                visit(parameterizedType.getOwnerType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: d */
            void mo67818d(TypeVariable<?> typeVariable) {
                String valueOf = String.valueOf(TypeToken.this.f41545b);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 58);
                sb2.append(valueOf);
                sb2.append("contains a type variable and is not safe for the operation");
                throw new IllegalArgumentException(sb2.toString());
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: e */
            void mo67817e(WildcardType wildcardType) {
                visit(wildcardType.getLowerBounds());
                visit(wildcardType.getUpperBounds());
            }
        }.visit(this.f41545b);
        return this;
    }

    @Beta
    public final Invokable<T, T> constructor(Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == getRawType()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "%s not declared by %s", constructor, getRawType());
        return new Invokable.ConstructorInvokable<T>(constructor) { // from class: com.google.common.reflect.TypeToken.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            /* renamed from: a */
            public Type[] mo67861a() {
                return TypeToken.this.m67872p().m67912k(super.mo67861a());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            /* renamed from: b */
            public Type[] mo67860b() {
                return TypeToken.this.m67869s().m67912k(super.mo67860b());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            /* renamed from: c */
            public Type mo67859c() {
                return TypeToken.this.m67872p().resolveType(super.mo67859c());
            }

            @Override // com.google.common.reflect.Invokable
            public TypeToken<T> getOwnerType() {
                return TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public String toString() {
                String valueOf = String.valueOf(getOwnerType());
                String join = Joiner.m70067on(", ").join(mo67860b());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + String.valueOf(join).length());
                sb2.append(valueOf);
                sb2.append("(");
                sb2.append(join);
                sb2.append(")");
                return sb2.toString();
            }
        };
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.f41545b.equals(((TypeToken) obj).f41545b);
        }
        return false;
    }

    public final TypeToken<?> getComponentType() {
        Type m67831i = Types.m67831i(this.f41545b);
        if (m67831i == null) {
            return null;
        }
        return m67873of(m67831i);
    }

    public final Class<? super T> getRawType() {
        return m67867u().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        Preconditions.checkArgument(!(this.f41545b instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.f41545b;
        if (type instanceof WildcardType) {
            return m67866v(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return m67876n(cls);
        }
        Preconditions.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) m67873of(m67891G(cls));
        Preconditions.checkArgument(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        Preconditions.checkArgument(m67890H(cls), "%s is not a super class of %s", cls, this);
        Type type = this.f41545b;
        if (type instanceof TypeVariable) {
            return m67865w(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return m67865w(cls, ((WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            return m67875o(cls);
        }
        return (TypeToken<? super T>) m67892F(m67889I(cls).f41545b);
    }

    public final Type getType() {
        return this.f41545b;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.f41545b.hashCode();
    }

    public final boolean isArray() {
        if (getComponentType() != null) {
            return true;
        }
        return false;
    }

    public final boolean isPrimitive() {
        Type type = this.f41545b;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            return true;
        }
        return false;
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    @Beta
    public final Invokable<T, Object> method(Method method) {
        Preconditions.checkArgument(m67890H(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new Invokable.MethodInvokable<T>(method) { // from class: com.google.common.reflect.TypeToken.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            /* renamed from: a */
            public Type[] mo67861a() {
                return TypeToken.this.m67872p().m67912k(super.mo67861a());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            /* renamed from: b */
            public Type[] mo67860b() {
                return TypeToken.this.m67869s().m67912k(super.mo67860b());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            /* renamed from: c */
            public Type mo67859c() {
                return TypeToken.this.m67872p().resolveType(super.mo67859c());
            }

            @Override // com.google.common.reflect.Invokable
            public TypeToken<T> getOwnerType() {
                return TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public String toString() {
                String valueOf = String.valueOf(getOwnerType());
                String invokable = super.toString();
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(invokable).length());
                sb2.append(valueOf);
                sb2.append(".");
                sb2.append(invokable);
                return sb2.toString();
            }
        };
    }

    /* renamed from: q */
    final ImmutableList<TypeToken<? super T>> m67871q() {
        Type type = this.f41545b;
        if (type instanceof TypeVariable) {
            return m67882h(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return m67882h(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            builder.add((ImmutableList.Builder) m67892F(type2));
        }
        return builder.build();
    }

    /* renamed from: r */
    final TypeToken<? super T> m67870r() {
        Type type = this.f41545b;
        if (type instanceof TypeVariable) {
            return m67883g(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return m67883g(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (TypeToken<? super T>) m67892F(genericSuperclass);
    }

    public final TypeToken<?> resolveType(Type type) {
        Preconditions.checkNotNull(type);
        return m67873of(m67869s().resolveType(type));
    }

    public String toString() {
        return Types.m67821s(this.f41545b);
    }

    public final TypeToken<T> unwrap() {
        if (m67895C()) {
            return m67874of(Primitives.unwrap((Class) this.f41545b));
        }
        return this;
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, TypeToken<X> typeToken) {
        return new SimpleTypeToken(new TypeResolver().m67910m(ImmutableMap.m69396of(new TypeResolver.TypeVariableKey(typeParameter.f41533b), typeToken.f41545b)).resolveType(this.f41545b));
    }

    public final TypeToken<T> wrap() {
        if (isPrimitive()) {
            return m67874of(Primitives.wrap((Class) this.f41545b));
        }
        return this;
    }

    protected Object writeReplace() {
        return m67873of(new TypeResolver().resolveType(this.f41545b));
    }

    protected TypeToken() {
        Type m67923a = m67923a();
        this.f41545b = m67923a;
        Preconditions.checkState(!(m67923a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", m67923a);
    }

    /* renamed from: of */
    public static TypeToken<?> m67873of(Type type) {
        return new SimpleTypeToken(type);
    }

    public final boolean isSubtypeOf(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof WildcardType) {
            return m67884f(((WildcardType) type).getLowerBounds()).m67857b(this.f41545b);
        }
        Type type2 = this.f41545b;
        if (type2 instanceof WildcardType) {
            return m67884f(((WildcardType) type2).getUpperBounds()).m67858a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || m67884f(((TypeVariable) this.f41545b).getBounds()).m67858a(type);
        } else if (type2 instanceof GenericArrayType) {
            return m67873of(type).m67896B((GenericArrayType) this.f41545b);
        } else {
            if (type instanceof Class) {
                return m67890H((Class) type);
            }
            if (type instanceof ParameterizedType) {
                return m67897A((ParameterizedType) type);
            }
            if (type instanceof GenericArrayType) {
                return m67862z((GenericArrayType) type);
            }
            return false;
        }
    }

    public final boolean isSupertypeOf(Type type) {
        return m67873of(type).isSubtypeOf(getType());
    }

    private TypeToken(Type type) {
        this.f41545b = (Type) Preconditions.checkNotNull(type);
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, Class<X> cls) {
        return where(typeParameter, m67874of((Class) cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class ClassSet extends TypeToken<T>.TypeSet {

        /* renamed from: d */
        private transient ImmutableSet<TypeToken<? super T>> f41554d;

        private ClassSet() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f41554d;
            if (immutableSet == null) {
                ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(TypeCollector.f41559a.m67856a().m67854d(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
                this.f41554d = set;
                return set;
            }
            return immutableSet;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) TypeCollector.f41560b.m67856a().mo67846c(TypeToken.this.m67867u()));
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class InterfaceSet extends TypeToken<T>.TypeSet {

        /* renamed from: d */
        private final transient TypeToken<T>.TypeSet f41556d;

        /* renamed from: f */
        private transient ImmutableSet<TypeToken<? super T>> f41557f;

        InterfaceSet(TypeToken<T>.TypeSet typeSet) {
            super();
            this.f41556d = typeSet;
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f41557f;
            if (immutableSet == null) {
                ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(this.f41556d).filter(TypeFilter.INTERFACE_ONLY).toSet();
                this.f41557f = set;
                return set;
            }
            return immutableSet;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return FluentIterable.from(TypeCollector.f41560b.mo67846c(TypeToken.this.m67867u())).filter(new Predicate() { // from class: com.google.common.reflect.c
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).toSet();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }
    }
}
