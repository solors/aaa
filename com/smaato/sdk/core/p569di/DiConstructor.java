package com.smaato.sdk.core.p569di;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.smaato.sdk.core.di.DiConstructor */
/* loaded from: classes7.dex */
public final class DiConstructor {
    private final Map<DiKey, ClassFactory> holder = new HashMap();

    @SafeVarargs
    private DiConstructor(Map<DiKey, ClassFactory>... mapArr) {
        for (Map<DiKey, ClassFactory> map : mapArr) {
            for (Map.Entry<DiKey, ClassFactory> entry : map.entrySet()) {
                ensureUniqueKey(entry.getKey());
                this.holder.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @NonNull
    public static DiConstructor create(@NonNull DiRegistry diRegistry) {
        return new DiConstructor(diRegistry.holder());
    }

    private void ensureUniqueKey(DiKey diKey) {
        if (!this.holder.containsKey(diKey)) {
            return;
        }
        throw new IllegalStateException("There is already registered factory for " + diKey);
    }

    public DiConstructor addRegistry(@NonNull DiRegistry diRegistry) {
        Objects.requireNonNull(diRegistry);
        return create(this.holder, diRegistry.holder());
    }

    public <T> T get(Class<T> cls) {
        return (T) get(null, cls);
    }

    @Nullable
    public <T> T getOrNull(@NonNull Class<T> cls) {
        return (T) getOrNull(null, cls);
    }

    @NonNull
    public static DiConstructor create(@NonNull DiRegistry... diRegistryArr) {
        Objects.requireNonNull(diRegistryArr);
        if (diRegistryArr.length != 0) {
            ArrayList arrayList = new ArrayList(diRegistryArr.length);
            for (DiRegistry diRegistry : diRegistryArr) {
                arrayList.add(diRegistry.holder());
            }
            return create((Map[]) arrayList.toArray(new Map[0]));
        }
        throw new IllegalStateException("No registries passed");
    }

    @NonNull
    public <T> T get(@Nullable String str, @NonNull Class<T> cls) {
        Objects.requireNonNull(cls);
        try {
            ClassFactory classFactory = this.holder.get(new DiKey(str, cls));
            if (classFactory != null) {
                try {
                    return (T) Objects.requireNonNull(cls.cast(classFactory.get(this)), "FACTORY RETURNED NULL.");
                } catch (ClassCastException e) {
                    throw new CannotConstructInstanceException("FACTORY RETURNED WRONG INSTANCE. Cannot create instance of " + cls + " named '" + str + "'", e);
                }
            }
            throw new CannotConstructInstanceException("NO FACTORY PROVIDED. Cannot create instance of " + cls + " named '" + str + "'");
        } catch (Exception e2) {
            if (e2 instanceof CannotConstructInstanceException) {
                throw e2;
            }
            throw new CannotConstructInstanceException("Cannot create instance of " + cls + " named '" + str + "'", e2);
        }
    }

    @Nullable
    public <T> T getOrNull(@Nullable String str, @NonNull Class<T> cls) {
        try {
            return (T) get(str, cls);
        } catch (CannotConstructInstanceException unused) {
            return null;
        }
    }

    @NonNull
    public static DiConstructor create(@NonNull Set<DiRegistry> set) {
        return create((DiRegistry[]) set.toArray(new DiRegistry[0]));
    }

    @SafeVarargs
    private static DiConstructor create(Map<DiKey, ClassFactory>... mapArr) {
        return new DiConstructor(mapArr);
    }
}
