package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.s */
/* loaded from: classes7.dex */
public final class SafeObjectInputStream extends ObjectInputStream {
    @Nullable
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeObjectInputStream(@Nullable InputStream inputStream, @Nullable List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    @NotNull
    protected Class<?> resolveClass(@NotNull ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> c = super.resolveClass(desc);
        if (this.allowed != null && !Number.class.isAssignableFrom(c) && !Intrinsics.m17075f(String.class, c) && !Intrinsics.m17075f(Boolean.class, c) && !c.isArray() && !this.allowed.contains(c)) {
            throw new IOException("Deserialization is not allowed for " + desc.getName());
        }
        Intrinsics.checkNotNullExpressionValue(c, "c");
        return c;
    }
}
