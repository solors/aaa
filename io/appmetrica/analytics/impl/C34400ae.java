package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ae */
/* loaded from: classes9.dex */
public final class C34400ae implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final byte[] fromModel(@NotNull String str) {
        if (Intrinsics.m17075f("native", str)) {
            str = "JVM";
        }
        return str.getBytes(Charsets.UTF_8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        byte[] bArr = (byte[]) obj;
        throw new UnsupportedOperationException();
    }

    @NotNull
    /* renamed from: a */
    public final String m21994a(@NotNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
