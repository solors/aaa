package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.C30338ft;
import com.yandex.mobile.ads.impl.C30412gt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class RoundImageView extends ImageView {
    @NotNull

    /* renamed from: a */
    private final C30338ft f66444a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f66444a.m34084a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f66444a.m34086a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @NotNull C30412gt cornerViewRenderingControllerFactory) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cornerViewRenderingControllerFactory, "cornerViewRenderingControllerFactory");
        cornerViewRenderingControllerFactory.getClass();
        this.f66444a = C30412gt.m33779a(context, this, attributeSet, i);
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i, C30412gt c30412gt, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new C30412gt() : c30412gt);
    }
}
