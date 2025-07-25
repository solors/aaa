package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Enums {
    @GwtIncompatible

    /* renamed from: a */
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f39373a = new WeakHashMap();

    /* loaded from: classes4.dex */
    private static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {

        /* renamed from: d */
        private final Class<T> f39374d;

        StringConverter(Class<T> cls) {
            this.f39374d = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                return this.f39374d.equals(((StringConverter) obj).f39374d);
            }
            return false;
        }

        @Override // com.google.common.base.Converter
        /* renamed from: h */
        public String mo67968d(T t) {
            return t.name();
        }

        public int hashCode() {
            return this.f39374d.hashCode();
        }

        @Override // com.google.common.base.Converter
        /* renamed from: i */
        public T mo67967e(String str) {
            return (T) Enum.valueOf(this.f39374d, str);
        }

        public String toString() {
            String name = this.f39374d.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 29);
            sb2.append("Enums.stringConverter(");
            sb2.append(name);
            sb2.append(".class)");
            return sb2.toString();
        }
    }

    private Enums() {
    }

    @GwtIncompatible
    /* renamed from: a */
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m70082a(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> map;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map2 = f39373a;
        synchronized (map2) {
            map = map2.get(cls);
            if (map == null) {
                map = m70081b(cls);
            }
        }
        return map;
    }

    @GwtIncompatible
    /* renamed from: b */
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> m70081b(Class<T> cls) {
        HashMap hashMap = new HashMap();
        Iterator it = EnumSet.allOf(cls).iterator();
        while (it.hasNext()) {
            Enum r2 = (Enum) it.next();
            hashMap.put(r2.name(), new WeakReference(r2));
        }
        f39373a.put(cls, hashMap);
        return hashMap;
    }

    @GwtIncompatible
    public static Field getField(Enum<?> r1) {
        try {
            return r1.getDeclaringClass().getDeclaredField(r1.name());
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static <T extends Enum<T>> Optional<T> getIfPresent(Class<T> cls, String str) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(str);
        return Platform.m70049d(cls, str);
    }

    public static <T extends Enum<T>> Converter<String, T> stringConverter(Class<T> cls) {
        return new StringConverter(cls);
    }
}
