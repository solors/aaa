package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p41;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hv1 extends h11 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv1(@NotNull List<? extends C31034of<?>> assets, @NotNull l41 configuration) {
        super(assets, configuration);
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    @Override // com.yandex.mobile.ads.impl.h11
    /* renamed from: a */
    public final boolean mo33458a(@NotNull p41.InterfaceC31087a validator, @NotNull List<? extends C31034of<?>> assets) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(assets, "assets");
        m33734b().m32348c();
        return validator.isValid(assets);
    }
}
