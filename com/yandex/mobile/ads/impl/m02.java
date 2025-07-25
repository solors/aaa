package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class m02 implements l02 {
    @Override // com.yandex.mobile.ads.impl.l02
    @Nullable
    /* renamed from: a */
    public final TextView mo32163a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("timer_value");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.l02
    @Nullable
    /* renamed from: b */
    public final View mo32162b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("timer_container");
        if (!(findViewWithTag instanceof View)) {
            return null;
        }
        return findViewWithTag;
    }
}
