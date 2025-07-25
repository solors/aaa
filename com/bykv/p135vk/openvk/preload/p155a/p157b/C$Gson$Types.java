package com.bykv.p135vk.openvk.preload.p155a.p157b;

import com.bykv.p135vk.openvk.preload.falconx.p166a.WebResourceUtils;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.bykv.vk.openvk.preload.a.b.a  reason: invalid class name */
/* loaded from: classes3.dex */
public final class C$Gson$Types {

    /* renamed from: a */
    static final Type[] f13601a = new Type[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a$a */
    /* loaded from: classes3.dex */
    public static final class C6527a implements Serializable, GenericArrayType {

        /* renamed from: a */
        private final Type f13602a;

        public C6527a(Type type) {
            this.f13602a = C$Gson$Types.m91660a(type);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && C$Gson$Types.m91655a(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f13602a;
        }

        public final int hashCode() {
            return this.f13602a.hashCode();
        }

        public final String toString() {
            return C$Gson$Types.m91651c(this.f13602a) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a$b */
    /* loaded from: classes3.dex */
    public static final class C6528b implements Serializable, ParameterizedType {

        /* renamed from: a */
        private final Type f13603a;

        /* renamed from: b */
        private final Type f13604b;

        /* renamed from: c */
        private final Type[] f13605c;

        public C6528b(Type type, Type type2, Type... typeArr) {
            Type m91660a;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                WebResourceUtils.m91431a(z2);
            }
            if (type == null) {
                m91660a = null;
            } else {
                m91660a = C$Gson$Types.m91660a(type);
            }
            this.f13603a = m91660a;
            this.f13604b = C$Gson$Types.m91660a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f13605c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                WebResourceUtils.m91432a(this.f13605c[i]);
                C$Gson$Types.m91649e(this.f13605c[i]);
                Type[] typeArr3 = this.f13605c;
                typeArr3[i] = C$Gson$Types.m91660a(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && C$Gson$Types.m91655a(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f13605c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f13603a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f13604b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f13605c) ^ this.f13604b.hashCode()) ^ C$Gson$Types.m91661a((Object) this.f13603a);
        }

        public final String toString() {
            int length = this.f13605c.length;
            if (length == 0) {
                return C$Gson$Types.m91651c(this.f13604b);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(C$Gson$Types.m91651c(this.f13604b));
            sb2.append("<");
            sb2.append(C$Gson$Types.m91651c(this.f13605c[0]));
            for (int i = 1; i < length; i++) {
                sb2.append(", ");
                sb2.append(C$Gson$Types.m91651c(this.f13605c[i]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: $Gson$Types.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a$c */
    /* loaded from: classes3.dex */
    public static final class C6529c implements Serializable, WildcardType {

        /* renamed from: a */
        private final Type f13606a;

        /* renamed from: b */
        private final Type f13607b;

        public C6529c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            WebResourceUtils.m91431a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            WebResourceUtils.m91431a(z2);
            if (typeArr2.length == 1) {
                WebResourceUtils.m91432a(typeArr2[0]);
                C$Gson$Types.m91649e(typeArr2[0]);
                WebResourceUtils.m91431a(typeArr[0] == Object.class);
                this.f13607b = C$Gson$Types.m91660a(typeArr2[0]);
                this.f13606a = Object.class;
                return;
            }
            WebResourceUtils.m91432a(typeArr[0]);
            C$Gson$Types.m91649e(typeArr[0]);
            this.f13607b = null;
            this.f13606a = C$Gson$Types.m91660a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && C$Gson$Types.m91655a(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f13607b;
            return type != null ? new Type[]{type} : C$Gson$Types.f13601a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f13606a};
        }

        public final int hashCode() {
            int i;
            Type type = this.f13607b;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f13606a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f13607b != null) {
                return "? super " + C$Gson$Types.m91651c(this.f13607b);
            } else if (this.f13606a == Object.class) {
                return "?";
            } else {
                return "? extends " + C$Gson$Types.m91651c(this.f13606a);
            }
        }
    }

    /* renamed from: a */
    public static Type m91660a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C6527a(m91660a((Type) cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C6528b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C6527a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new C6529c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    /* renamed from: b */
    public static Class<?> m91654b(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                WebResourceUtils.m91431a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m91654b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    String name = type == null ? "null" : type.getClass().getName();
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
                }
            }
        }
        return (Class) type;
    }

    /* renamed from: c */
    public static String m91651c(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: d */
    public static Type m91650d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: e */
    static void m91649e(Type type) {
        boolean z;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z = false;
        } else {
            z = true;
        }
        WebResourceUtils.m91431a(z);
    }

    /* renamed from: f */
    private static GenericArrayType m91648f(Type type) {
        return new C6527a(type);
    }

    /* renamed from: a */
    public static boolean m91655a(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type ownerType2 = parameterizedType2.getOwnerType();
                    return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    WildcardType wildcardType2 = (WildcardType) type2;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                return false;
            } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static Type m91652b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        WebResourceUtils.m91431a(cls2.isAssignableFrom(cls));
        return m91657a(type, cls, m91658a(type, cls, cls2));
    }

    /* renamed from: b */
    public static Type[] m91653b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m91652b = m91652b(type, cls, Map.class);
        return m91652b instanceof ParameterizedType ? ((ParameterizedType) m91652b).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: a */
    static int m91661a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    private static Type m91658a(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    Class<?> cls3 = interfaces[i];
                    if (cls3 == cls2) {
                        return cls.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        genericSuperclass = cls.getGenericInterfaces()[i];
                        superclass = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    /* renamed from: a */
    public static Type m91659a(Type type, Class<?> cls) {
        Type m91652b = m91652b(type, cls, Collection.class);
        if (m91652b instanceof WildcardType) {
            m91652b = ((WildcardType) m91652b).getUpperBounds()[0];
        }
        if (m91652b instanceof ParameterizedType) {
            return ((ParameterizedType) m91652b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: a */
    public static Type m91657a(Type type, Class<?> cls, Type type2) {
        return m91656a(type, cls, type2, new HashSet());
    }

    /* renamed from: a */
    private static Type m91656a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (collection.contains(typeVariable)) {
                    return type2;
                }
                collection.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type m91658a = m91658a(type, cls, (Class<?>) cls2);
                    if (m91658a instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) m91658a).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type m91656a = m91656a(type, cls, componentType, collection);
                        return componentType == m91656a ? cls3 : m91648f(m91656a);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type m91656a2 = m91656a(type, cls, genericComponentType, collection);
                    return genericComponentType == m91656a2 ? genericArrayType : m91648f(m91656a2);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type m91656a3 = m91656a(type, cls, ownerType, collection);
                    boolean z = m91656a3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type m91656a4 = m91656a(type, cls, actualTypeArguments[i], collection);
                        if (m91656a4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = m91656a4;
                        }
                        i++;
                    }
                    return z ? new C6528b(m91656a3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                } else {
                    boolean z2 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type m91656a5 = m91656a(type, cls, lowerBounds[0], collection);
                            wildcardType = wildcardType2;
                            if (m91656a5 != lowerBounds[0]) {
                                return new C6529c(new Type[]{Object.class}, m91656a5 instanceof WildcardType ? ((WildcardType) m91656a5).getLowerBounds() : new Type[]{m91656a5});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type m91656a6 = m91656a(type, cls, upperBounds[0], collection);
                                wildcardType = wildcardType2;
                                if (m91656a6 != upperBounds[0]) {
                                    return new C6529c(m91656a6 instanceof WildcardType ? ((WildcardType) m91656a6).getUpperBounds() : new Type[]{m91656a6}, f13601a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }
}
