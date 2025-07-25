package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.MainThread;
import androidx.annotation.StyleRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* loaded from: classes8.dex */
public class h50 extends FrameLayout {
    @Nullable

    /* renamed from: a */
    private b62 f79956a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final b62 getAdUiElements() {
        return this.f79956a;
    }

    public final void setAdUiElements(@Nullable b62 b62Var) {
        this.f79956a = b62Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
