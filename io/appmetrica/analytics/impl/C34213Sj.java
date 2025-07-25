package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Sj */
/* loaded from: classes9.dex */
public final class C34213Sj extends AbstractC34053M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC34053M2
    /* renamed from: a */
    public final MessageNano mo20831a() {
        return new C34166Qj();
    }

    @NotNull
    /* renamed from: b */
    public final C34166Qj m22266b() {
        return new C34166Qj();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34053M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C34166Qj();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NotNull
    /* renamed from: a */
    public final C34166Qj toState(@NotNull byte[] bArr) {
        return (C34166Qj) MessageNano.mergeFrom(new C34166Qj(), bArr);
    }
}
