package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class yk1 extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final Button f88249a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk1(@NotNull Context context, @NotNull Button replayButton) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(replayButton, "replayButton");
        this.f88249a = replayButton;
    }

    @NotNull
    /* renamed from: a */
    public final Button m26865a() {
        return this.f88249a;
    }
}
