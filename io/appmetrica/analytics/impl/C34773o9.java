package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.o9 */
/* loaded from: classes9.dex */
public final class C34773o9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34719m9 fromModel(@NonNull C34746n9 c34746n9) {
        C34719m9 c34719m9 = new C34719m9();
        String str = c34746n9.f94994a;
        if (str != null) {
            c34719m9.f94919a = str.getBytes();
        }
        return c34719m9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34746n9 toModel(@NonNull C34719m9 c34719m9) {
        return new C34746n9(new String(c34719m9.f94919a));
    }
}
