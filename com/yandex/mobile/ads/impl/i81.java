package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class i81 extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final g92 f80365a;
    @NotNull

    /* renamed from: b */
    private final TextureView f80366b;
    @NotNull

    /* renamed from: c */
    private final c71 f80367c;
    @Nullable

    /* renamed from: d */
    private q71 f80368d;
    @NotNull

    /* renamed from: e */
    private tr0 f80369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(@NotNull Context context, @NotNull g92 placeholderView, @NotNull TextureView textureView, @NotNull c71 actionViewsContainer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(actionViewsContainer, "actionViewsContainer");
        this.f80365a = placeholderView;
        this.f80366b = textureView;
        this.f80367c = actionViewsContainer;
        this.f80369e = new bu1();
    }

    @NotNull
    /* renamed from: a */
    public final c71 m33351a() {
        return this.f80367c;
    }

    @NotNull
    /* renamed from: b */
    public final g92 m33350b() {
        return this.f80365a;
    }

    @NotNull
    /* renamed from: c */
    public final TextureView m33349c() {
        return this.f80366b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q71 q71Var = this.f80368d;
        if (q71Var != null) {
            q71Var.mo30450b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q71 q71Var = this.f80368d;
        if (q71Var != null) {
            q71Var.mo30451a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        tr0.C31476a mo27438a = this.f80369e.mo27438a(i, i2);
        super.onMeasure(mo27438a.f85812a, mo27438a.f85813b);
    }

    public final void setAspectRatio(float f) {
        this.f80369e = new gi1(f);
    }

    public final void setOnAttachStateChangeListener(@Nullable q71 q71Var) {
        this.f80368d = q71Var;
    }
}
