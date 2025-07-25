package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Cl */
/* loaded from: classes9.dex */
public final class C33827Cl extends AbstractC34053M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC34053M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: b */
    public final C33802Bl defaultValue() {
        C33802Bl c33802Bl = new C33802Bl();
        c33802Bl.f92642i = new C34995wl();
        return c33802Bl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a */
    public final C33802Bl toState(@NonNull byte[] bArr) throws IOException {
        return (C33802Bl) MessageNano.mergeFrom(new C33802Bl(), bArr);
    }
}
