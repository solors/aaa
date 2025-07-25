package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class y20 implements InterfaceC30573io {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30573io
    /* renamed from: a */
    public final void mo27113a(@NotNull View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.setAlpha(0.4f);
        closeView.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30573io
    /* renamed from: b */
    public final void mo27112b(@NotNull View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.animate().alpha(1.0f).setDuration(200L);
        closeView.setEnabled(true);
    }
}
