package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ii */
/* loaded from: classes9.dex */
public final class C34620ii implements InterfaceC34827q9 {
    @Override // io.appmetrica.analytics.impl.InterfaceC34827q9
    @Nullable
    /* renamed from: a */
    public final Integer mo21087a(@NonNull C34011K8 c34011k8) {
        EnumC34324Xa enumC34324Xa = c34011k8.f93112h;
        if (enumC34324Xa == null) {
            Map map = AbstractC34536ff.f94380a;
            return null;
        }
        return (Integer) AbstractC34536ff.f94382c.get(enumC34324Xa);
    }
}
