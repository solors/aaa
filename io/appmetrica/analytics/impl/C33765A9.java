package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.A9 */
/* loaded from: classes9.dex */
public final class C33765A9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34969vl fromModel(@Nullable C35061z9 c35061z9) {
        C34969vl c34969vl = new C34969vl();
        if (c35061z9 != null) {
            c34969vl.f95524a = c35061z9.f95690a;
        }
        return c34969vl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C35061z9(((C34969vl) obj).f95524a);
    }

    @NotNull
    /* renamed from: a */
    public final C35061z9 m22782a(@NotNull C34969vl c34969vl) {
        return new C35061z9(c34969vl.f95524a);
    }
}
