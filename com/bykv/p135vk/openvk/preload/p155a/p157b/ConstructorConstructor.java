package com.bykv.p135vk.openvk.preload.p155a.p157b;

import com.bykv.p135vk.openvk.preload.geckox.p167a.p168a.CleanListener;
import com.bykv.p135vk.openvk.preload.p155a.JsonIOException;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p160b.ReflectionAccessor;
import com.bykv.p135vk.openvk.preload.p155a.p161c.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.bykv.vk.openvk.preload.a.b.b */
/* loaded from: classes3.dex */
public final class ConstructorConstructor {

    /* renamed from: a */
    private final Map<Type, CleanListener<?>> f13733a;

    /* renamed from: b */
    private final ReflectionAccessor f13734b = ReflectionAccessor.m91605a();

    public ConstructorConstructor(Map<Type, CleanListener<?>> map) {
        this.f13733a = map;
    }

    /* renamed from: a */
    public final <T> ObjectConstructor<T> m91607a(TypeToken<T> typeToken) {
        ObjectConstructor<T> objectConstructor;
        final Type m91566b = typeToken.m91566b();
        final Class<? super T> m91569a = typeToken.m91569a();
        final CleanListener<?> cleanListener = this.f13733a.get(m91566b);
        if (cleanListener != null) {
            return new ObjectConstructor<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.1
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                /* renamed from: a */
                public final T mo91574a() {
                    return (T) cleanListener.m91408c();
                }
            };
        }
        final CleanListener<?> cleanListener2 = this.f13733a.get(m91569a);
        if (cleanListener2 != null) {
            return new ObjectConstructor<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.7
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                /* renamed from: a */
                public final T mo91574a() {
                    return (T) cleanListener2.m91408c();
                }
            };
        }
        ObjectConstructor<T> m91606a = m91606a(m91569a);
        if (m91606a != null) {
            return m91606a;
        }
        if (Collection.class.isAssignableFrom(m91569a)) {
            if (SortedSet.class.isAssignableFrom(m91569a)) {
                objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.9
                    @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                    /* renamed from: a */
                    public final Object mo91574a() {
                        return new TreeSet();
                    }
                };
            } else if (EnumSet.class.isAssignableFrom(m91569a)) {
                objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.10
                    @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                    /* renamed from: a */
                    public final Object mo91574a() {
                        Type type = m91566b;
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2 instanceof Class) {
                                return EnumSet.noneOf((Class) type2);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + m91566b.toString());
                        }
                        throw new JsonIOException("Invalid EnumSet type: " + m91566b.toString());
                    }
                };
            } else if (Set.class.isAssignableFrom(m91569a)) {
                objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.11
                    @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                    /* renamed from: a */
                    public final Object mo91574a() {
                        return new LinkedHashSet();
                    }
                };
            } else if (Queue.class.isAssignableFrom(m91569a)) {
                objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.12
                    @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                    /* renamed from: a */
                    public final Object mo91574a() {
                        return new ArrayDeque();
                    }
                };
            } else {
                objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.13
                    @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                    /* renamed from: a */
                    public final Object mo91574a() {
                        return new ArrayList();
                    }
                };
            }
        } else if (!Map.class.isAssignableFrom(m91569a)) {
            objectConstructor = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(m91569a)) {
            objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.14
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                /* renamed from: a */
                public final Object mo91574a() {
                    return new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(m91569a)) {
            objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.2
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                /* renamed from: a */
                public final Object mo91574a() {
                    return new ConcurrentHashMap();
                }
            };
        } else if (SortedMap.class.isAssignableFrom(m91569a)) {
            objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.3
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                /* renamed from: a */
                public final Object mo91574a() {
                    return new TreeMap();
                }
            };
        } else if ((m91566b instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.m91567a(((ParameterizedType) m91566b).getActualTypeArguments()[0]).m91569a())) {
            objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.4
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                /* renamed from: a */
                public final Object mo91574a() {
                    return new LinkedHashMap();
                }
            };
        } else {
            objectConstructor = new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.5
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                /* renamed from: a */
                public final Object mo91574a() {
                    return new LinkedTreeMap();
                }
            };
        }
        return objectConstructor != null ? objectConstructor : new ObjectConstructor() { // from class: com.bykv.vk.openvk.preload.a.b.b.6

            /* renamed from: a */
            private final UnsafeAllocator f13748a = UnsafeAllocator.m91573a();

            @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
            /* renamed from: a */
            public final Object mo91574a() {
                try {
                    return this.f13748a.mo91571a(m91569a);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + m91566b + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    public final String toString() {
        return this.f13733a.toString();
    }

    /* renamed from: a */
    private <T> ObjectConstructor<T> m91606a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f13734b.mo91604a(declaredConstructor);
            }
            return new ObjectConstructor<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.8
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.ObjectConstructor
                /* renamed from: a */
                public final T mo91574a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
