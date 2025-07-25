package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.N8 */
/* loaded from: classes9.dex */
public final class C34083N8 extends AbstractC34053M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC34053M2
    @NonNull
    /* renamed from: a */
    public final MessageNano mo20831a() {
        return new C34853r9();
    }

    @NonNull
    /* renamed from: b */
    public final C34853r9 m22395b() {
        return new C34853r9();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34053M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C34853r9();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a */
    public final C34853r9 toState(@NonNull byte[] bArr) throws IOException {
        return (C34853r9) MessageNano.mergeFrom(new C34853r9(), bArr);
    }
}
