package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class t11 implements r11 {
    @Override // com.yandex.mobile.ads.impl.r11
    @Nullable
    /* renamed from: a */
    public final ProgressBar mo29318a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ProgressBar) container.findViewWithTag("close_progress_view");
    }

    @Override // com.yandex.mobile.ads.impl.r11
    @Nullable
    /* renamed from: b */
    public final View mo29317b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewWithTag("skip_button");
    }

    @Override // com.yandex.mobile.ads.impl.r11
    @Nullable
    /* renamed from: c */
    public final View mo29316c(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewWithTag("close");
    }
}
