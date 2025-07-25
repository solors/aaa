package com.smaato.sdk.core.p569di;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.di.DiRegistry */
/* loaded from: classes7.dex */
public final class DiRegistry {
    private Map<DiKey, ClassFactory> holder = new HashMap();

    private DiRegistry() {
    }

    private void ensureUniqueKey(DiKey diKey) {
        if (!this.holder.containsKey(diKey)) {
            return;
        }
        throw new IllegalStateException("There is already registered factory for " + diKey);
    }

    /* renamed from: of */
    public static DiRegistry m39638of(Consumer<DiRegistry> consumer) {
        DiRegistry diRegistry = new DiRegistry();
        consumer.accept(diRegistry);
        return diRegistry;
    }

    @NonNull
    public DiRegistry addFrom(@Nullable DiRegistry diRegistry) {
        if (diRegistry != null) {
            for (Map.Entry<DiKey, ClassFactory> entry : diRegistry.holder.entrySet()) {
                DiKey key = entry.getKey();
                ensureUniqueKey(key);
                this.holder.put(key, entry.getValue());
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<DiKey, ClassFactory> holder() {
        return this.holder;
    }

    public <T> void registerFactory(Class<T> cls, ClassFactory<T> classFactory) {
        registerFactory(null, cls, classFactory);
    }

    public <T> void registerSingletonFactory(@NonNull Class<T> cls, @NonNull ClassFactory<T> classFactory) {
        registerSingletonFactory(null, cls, classFactory);
    }

    public <T> void registerFactory(@Nullable String str, @NonNull Class<T> cls, @NonNull ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        Objects.requireNonNull(cls);
        DiKey diKey = new DiKey(str, cls);
        ensureUniqueKey(diKey);
        this.holder.put(diKey, classFactory);
    }

    public <T> void registerSingletonFactory(@Nullable String str, @NonNull Class<T> cls, @NonNull ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        Objects.requireNonNull(cls);
        DiKey diKey = new DiKey(str, cls);
        ensureUniqueKey(diKey);
        this.holder.put(diKey, SingletonFactory.m39637a(classFactory));
    }
}
