package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Ae */
/* loaded from: classes9.dex */
public final class C33770Ae extends AbstractC34053M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC34053M2
    @NonNull
    /* renamed from: a */
    public final MessageNano mo20831a() {
        return new C33895Fe();
    }

    @NonNull
    /* renamed from: b */
    public final C33895Fe m22777b() {
        return new C33895Fe();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34053M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C33895Fe();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a */
    public final C33895Fe toState(@NonNull byte[] bArr) throws IOException {
        return (C33895Fe) MessageNano.mergeFrom(new C33895Fe(), bArr);
    }
}
