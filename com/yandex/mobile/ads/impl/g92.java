package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class g92 extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final ProgressBar f79577a;
    @Nullable

    /* renamed from: b */
    private final ImageView f79578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g92(@NotNull Context context, @NotNull ProgressBar progressBar, @Nullable ImageView imageView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f79577a = progressBar;
        this.f79578b = imageView;
    }

    @Nullable
    /* renamed from: a */
    public final ImageView m33902a() {
        return this.f79578b;
    }

    @NotNull
    /* renamed from: b */
    public final ProgressBar m33901b() {
        return this.f79577a;
    }
}
