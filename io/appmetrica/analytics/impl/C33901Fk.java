package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Fk */
/* loaded from: classes9.dex */
public final class C33901Fk implements ListConverter {

    /* renamed from: a */
    public final C33926Gk f92869a = new C33926Gk();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34500e6[] fromModel(@NonNull List<C33951Hk> list) {
        C34500e6[] c34500e6Arr = new C34500e6[list.size()];
        int i = 0;
        for (C33951Hk c33951Hk : list) {
            c34500e6Arr[i] = this.f92869a.fromModel(c33951Hk);
            i++;
        }
        return c34500e6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        C34500e6[] c34500e6Arr = (C34500e6[]) obj;
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: a */
    public final List<C33951Hk> m22612a(C34500e6[] c34500e6Arr) {
        throw new UnsupportedOperationException();
    }
}
