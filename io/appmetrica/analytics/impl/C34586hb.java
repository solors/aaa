package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.hb */
/* loaded from: classes9.dex */
public final class C34586hb implements Converter {

    /* renamed from: a */
    public final C35038yc f94529a;

    public C34586hb() {
        this(new C35038yc(new C34169Qm()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final byte[] fromModel(@NonNull C34145Pm c34145Pm) {
        return MessageNano.toByteArray((MessageNano) this.f94529a.f95657a.fromModel(c34145Pm));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        byte[] bArr = (byte[]) obj;
        throw new UnsupportedOperationException();
    }

    public C34586hb(C35038yc c35038yc) {
        this.f94529a = c35038yc;
    }

    @NonNull
    /* renamed from: a */
    public final C34145Pm m21587a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
