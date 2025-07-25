package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MetadataReader.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class MetadataReader<T> {
    @NotNull
    private final JsonStorage jsonStorage;
    @NotNull
    private final String key;

    public MetadataReader(@NotNull JsonStorage jsonStorage, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
        Intrinsics.checkNotNullParameter(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    @NotNull
    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final /* synthetic */ <T> T read(T t) {
        T t2 = (T) getJsonStorage().get(getKey());
        if (t2 != null) {
            Intrinsics.m17067n(3, "T");
            return t2;
        }
        return t;
    }

    public final /* synthetic */ <T> T readAndDelete(T t) {
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
            Intrinsics.m17067n(3, "T");
            t = obj;
        }
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            Intrinsics.checkNotNullExpressionValue(obj2, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return t;
    }
}
