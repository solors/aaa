package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.lg */
/* loaded from: classes8.dex */
public final class C30785lg {
    @NotNull

    /* renamed from: a */
    private final List<lk0> f81790a;

    /* JADX WARN: Multi-variable type inference failed */
    public C30785lg(@NotNull List<? extends lk0> assetViewConfigurators) {
        Intrinsics.checkNotNullParameter(assetViewConfigurators, "assetViewConfigurators");
        this.f81790a = assetViewConfigurators;
    }

    /* renamed from: a */
    public final void m32274a(@NotNull b62 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        for (lk0 lk0Var : this.f81790a) {
            lk0Var.mo27119a(uiElements);
        }
    }
}
