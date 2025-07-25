package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Rd */
/* loaded from: classes9.dex */
public final class C34183Rd implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C35047yl fromModel(@NonNull C34160Qd c34160Qd) {
        C35047yl c35047yl = new C35047yl();
        c35047yl.f95663a = c34160Qd.f93401a;
        c35047yl.f95664b = c34160Qd.f93402b;
        return c35047yl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C35047yl c35047yl = (C35047yl) obj;
        return new C34160Qd(c35047yl.f95663a, c35047yl.f95664b);
    }

    @NonNull
    /* renamed from: a */
    public final C34160Qd m22315a(@NonNull C35047yl c35047yl) {
        return new C34160Qd(c35047yl.f95663a, c35047yl.f95664b);
    }
}
