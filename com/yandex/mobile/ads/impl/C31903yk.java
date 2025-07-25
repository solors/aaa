package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.yk */
/* loaded from: classes8.dex */
public final class C31903yk extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final C32027zz f88239a;
    @NotNull

    /* renamed from: b */
    private final tr0 f88240b;

    /* renamed from: c */
    private final int f88241c;
    @NotNull

    /* renamed from: d */
    private final Paint f88242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31903yk(@NotNull Context context, @NotNull C32027zz dimensionConverter, @NotNull tr0 emptySizeMeasureSpecProvider) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        Intrinsics.checkNotNullParameter(emptySizeMeasureSpecProvider, "emptySizeMeasureSpecProvider");
        this.f88239a = dimensionConverter;
        this.f88240b = emptySizeMeasureSpecProvider;
        dimensionConverter.getClass();
        this.f88241c = C32027zz.m25947a(context, 0.5f);
        this.f88242d = new Paint();
        m26871a(context);
    }

    /* renamed from: a */
    private final void m26871a(Context context) {
        this.f88239a.getClass();
        int m25947a = C32027zz.m25947a(context, 1.0f);
        this.f88242d.setStyle(Paint.Style.STROKE);
        this.f88242d.setStrokeWidth(m25947a);
        this.f88242d.setColor(SupportMenu.CATEGORY_MASK);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.f88241c;
        canvas.drawRect(f, f, getWidth() - this.f88241c, getHeight() - this.f88241c, this.f88242d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewParent parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            setLeft(0);
            setTop(0);
            setRight(measuredWidth);
            setBottom(measuredHeight);
            super.onLayout(z, 0, 0, measuredWidth, measuredHeight);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        tr0.C31476a mo27438a = this.f88240b.mo27438a(i, i2);
        super.onMeasure(mo27438a.f85812a, mo27438a.f85813b);
    }

    public final void setColor(int i) {
        if (this.f88242d.getColor() != i) {
            this.f88242d.setColor(i);
            requestLayout();
        }
    }
}
