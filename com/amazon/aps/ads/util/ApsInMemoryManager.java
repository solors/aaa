package com.amazon.aps.ads.util;

import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.C37611r;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.C37613u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveCompanionObjects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsInMemoryManager.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsInMemoryManager {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final ApsInMemoryManager INSTANCE = new ApsInMemoryManager();
    @NotNull
    private final HashMap<String, Object> map = new HashMap<>();

    /* compiled from: ApsInMemoryManager.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ApsInMemoryManager() {
    }

    public final synchronized boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.containsKey(key);
    }

    @Nullable
    public final synchronized Object get(@NotNull String key, @NotNull Class<?> type) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.map.containsKey(key) && (obj = this.map.get(key)) != null) {
            if (((obj instanceof Long) && Intrinsics.m17075f(Long.TYPE, type)) || (((obj instanceof Float) && Intrinsics.m17075f(Float.TYPE, type)) || (((obj instanceof Boolean) && Intrinsics.m17075f(Boolean.TYPE, type)) || (((obj instanceof Integer) && Intrinsics.m17075f(Integer.TYPE, type)) || (((obj instanceof String) && Intrinsics.m17075f(String.class, type)) || Intrinsics.m17075f(obj.getClass(), type)))))) {
                return obj;
            }
            throw new IllegalArgumentException("Default and storage type are not same");
        }
        return null;
    }

    @Nullable
    public final <T> Object getOrDefault(@NotNull String key, @NotNull Class<T> type, @Nullable T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = get(key, type);
        if (obj != null) {
            return obj;
        }
        return t;
    }

    @Nullable
    public final synchronized <T> T getPrefWithDefault(@NotNull String key, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (this.map.containsKey(key)) {
            return (T) get(key, clazz);
        }
        T t = null;
        if (!clazz.isAssignableFrom(String.class) && !clazz.isAssignableFrom(Set.class) && !clazz.isAssignableFrom(C37612s0.f99333a.getClass()) && !Intrinsics.m17075f(clazz, String.class)) {
            if (!clazz.isAssignableFrom(Boolean.TYPE) && !clazz.isAssignableFrom(PrimitiveCompanionObjects.f99308a.getClass()) && !Intrinsics.m17075f(clazz, Boolean.class)) {
                if (!clazz.isAssignableFrom(Long.TYPE) && !clazz.isAssignableFrom(C37613u.f99334a.getClass()) && !Intrinsics.m17075f(clazz, Long.class)) {
                    if (!clazz.isAssignableFrom(Integer.TYPE) && !clazz.isAssignableFrom(C37611r.f99331a.getClass()) && !Intrinsics.m17075f(clazz, Integer.class)) {
                        if (clazz.isAssignableFrom(Float.TYPE) || clazz.isAssignableFrom(C37606l.f99324a.getClass()) || Intrinsics.m17075f(clazz, Float.class)) {
                            t = (T) Float.valueOf(0.0f);
                        }
                    }
                    t = (T) 0;
                }
                t = (T) 0L;
            }
            t = (T) Boolean.FALSE;
        }
        return t;
    }

    public final synchronized void putPref(@NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            this.map.put(key, obj);
        }
    }

    public final synchronized void removePref(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.map.containsKey(key)) {
            this.map.remove(key);
        }
    }

    public final synchronized void reset() {
        this.map.clear();
    }
}
