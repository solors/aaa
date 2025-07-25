package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j80 {
    @NotNull

    /* renamed from: a */
    private final Context f80796a;

    public j80(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80796a = context;
    }

    @NotNull
    /* renamed from: a */
    public final FrameLayout m33022a() {
        FrameLayout frameLayout = new FrameLayout(this.f80796a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
