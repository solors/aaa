package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Q3 */
/* loaded from: classes9.dex */
public final class C34150Q3 extends AbstractC34053M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC34053M2
    /* renamed from: a */
    public final MessageNano mo20831a() {
        return new C34126P3();
    }

    @NotNull
    /* renamed from: b */
    public final C34126P3 m22343b() {
        return new C34126P3();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34053M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C34126P3();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NotNull
    /* renamed from: a */
    public final C34126P3 toState(@NotNull byte[] bArr) {
        return (C34126P3) MessageNano.mergeFrom(new C34126P3(), bArr);
    }
}
