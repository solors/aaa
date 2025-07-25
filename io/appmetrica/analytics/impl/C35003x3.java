package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.x3 */
/* loaded from: classes9.dex */
public final class C35003x3 implements ProtobufConverter {
    @NonNull
    /* renamed from: a */
    public final C34917tl m20792a(@NonNull C34951v3 c34951v3) {
        C34917tl c34917tl = new C34917tl();
        c34917tl.f95420a = c34951v3.f95499a;
        return c34917tl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C34917tl c34917tl = new C34917tl();
        c34917tl.f95420a = ((C34951v3) obj).f95499a;
        return c34917tl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C34951v3(((C34917tl) obj).f95420a);
    }

    @NonNull
    /* renamed from: a */
    public final C34951v3 m20793a(@NonNull C34917tl c34917tl) {
        return new C34951v3(c34917tl.f95420a);
    }
}
