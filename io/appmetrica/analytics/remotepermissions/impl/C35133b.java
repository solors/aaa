package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.b */
/* loaded from: classes9.dex */
public final class C35133b implements Converter {

    /* renamed from: a */
    public final C35134c f95948a = new C35134c();

    @NotNull
    /* renamed from: a */
    public final byte[] m20652a(@NotNull C35132a c35132a) {
        return MessageNano.toByteArray(this.f95948a.fromModel(c35132a));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f95948a.fromModel((C35132a) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C35132a toModel(@NotNull byte[] bArr) {
        return this.f95948a.toModel((C35137f) MessageNano.mergeFrom(new C35137f(), bArr));
    }
}
