package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.zy */
/* loaded from: classes8.dex */
public final class C32026zy implements vu1 {
    @Override // com.yandex.mobile.ads.impl.vu1
    /* renamed from: a */
    public final void mo25958a(@NotNull View skipView) {
        Intrinsics.checkNotNullParameter(skipView, "skipView");
        skipView.setVisibility(8);
        skipView.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    /* renamed from: b */
    public final void mo25957b(@NotNull View skipView) {
        Intrinsics.checkNotNullParameter(skipView, "skipView");
        skipView.setVisibility(0);
        skipView.setEnabled(true);
    }
}
