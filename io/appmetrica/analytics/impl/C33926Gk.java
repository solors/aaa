package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Gk */
/* loaded from: classes9.dex */
public final class C33926Gk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34500e6 fromModel(@NonNull C33951Hk c33951Hk) {
        C34500e6 c34500e6 = new C34500e6();
        c34500e6.f94237a = (String) WrapUtils.getOrDefault(c33951Hk.f92972a, c34500e6.f94237a);
        c34500e6.f94238b = (String) WrapUtils.getOrDefault(c33951Hk.f92973b, c34500e6.f94238b);
        c34500e6.f94239c = ((Integer) WrapUtils.getOrDefault(c33951Hk.f92974c, Integer.valueOf(c34500e6.f94239c))).intValue();
        c34500e6.f94242f = ((Integer) WrapUtils.getOrDefault(c33951Hk.f92975d, Integer.valueOf(c34500e6.f94242f))).intValue();
        c34500e6.f94240d = (String) WrapUtils.getOrDefault(c33951Hk.f92976e, c34500e6.f94240d);
        c34500e6.f94241e = ((Boolean) WrapUtils.getOrDefault(c33951Hk.f92977f, Boolean.valueOf(c34500e6.f94241e))).booleanValue();
        return c34500e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34500e6 c34500e6 = (C34500e6) obj;
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: a */
    public final C33951Hk m22578a(@NonNull C34500e6 c34500e6) {
        throw new UnsupportedOperationException();
    }
}
