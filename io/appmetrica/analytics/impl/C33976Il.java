package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Il */
/* loaded from: classes9.dex */
public final class C33976Il implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C35073zl fromModel(@NotNull C33952Hl c33952Hl) {
        C35073zl c35073zl = new C35073zl();
        c35073zl.f95700a = c33952Hl.f92978a;
        return c35073zl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C33952Hl(((C35073zl) obj).f95700a);
    }

    @NotNull
    /* renamed from: a */
    public final C33952Hl m22536a(@NotNull C35073zl c35073zl) {
        return new C33952Hl(c35073zl.f95700a);
    }
}
