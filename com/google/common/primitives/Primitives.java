package com.google.common.primitives;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Primitives {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f41488a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f41489b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        m67975a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        m67975a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        m67975a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        m67975a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        m67975a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        m67975a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        m67975a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        m67975a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        m67975a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f41488a = Collections.unmodifiableMap(linkedHashMap);
        f41489b = Collections.unmodifiableMap(linkedHashMap2);
    }

    private Primitives() {
    }

    /* renamed from: a */
    private static void m67975a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static Set<Class<?>> allPrimitiveTypes() {
        return f41488a.keySet();
    }

    public static Set<Class<?>> allWrapperTypes() {
        return f41489b.keySet();
    }

    public static boolean isWrapperType(Class<?> cls) {
        return f41489b.containsKey(Preconditions.checkNotNull(cls));
    }

    public static <T> Class<T> unwrap(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        Class<T> cls2 = (Class<T>) f41489b.get(cls);
        if (cls2 != null) {
            return cls2;
        }
        return cls;
    }

    public static <T> Class<T> wrap(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        Class<T> cls2 = (Class<T>) f41488a.get(cls);
        if (cls2 != null) {
            return cls2;
        }
        return cls;
    }
}
