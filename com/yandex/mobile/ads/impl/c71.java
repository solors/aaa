package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class c71 extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final yk1 f77534a;
    @Nullable

    /* renamed from: b */
    private final bt0 f77535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c71(@NotNull Context context, @NotNull yk1 replayActionView, @Nullable bt0 bt0Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
        this.f77534a = replayActionView;
        this.f77535b = bt0Var;
        addView(replayActionView);
        if (bt0Var != null && (bt0Var instanceof View)) {
            addView((View) bt0Var);
        }
    }

    @Nullable
    /* renamed from: a */
    public final bt0 m35347a() {
        return this.f77535b;
    }

    @NotNull
    /* renamed from: b */
    public final yk1 m35346b() {
        return this.f77534a;
    }
}
