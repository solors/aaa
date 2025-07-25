package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.nl */
/* loaded from: classes8.dex */
public final class C30954nl extends View {

    /* renamed from: a */
    private final float f82811a;

    /* renamed from: b */
    private final float f82812b;
    @NotNull

    /* renamed from: c */
    private final Paint f82813c;
    @NotNull

    /* renamed from: d */
    private final Paint f82814d;
    @NotNull

    /* renamed from: e */
    private final Paint f82815e;

    /* renamed from: f */
    private float f82816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30954nl(@NotNull Context context, @NotNull C32027zz dimensionConverter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        dimensionConverter.getClass();
        this.f82811a = C32027zz.m25947a(context, 34.0f);
        float m25947a = C32027zz.m25947a(context, 3.0f);
        this.f82812b = m25947a;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f82813c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(m25947a);
        paint2.setAntiAlias(true);
        this.f82814d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(C32027zz.m25947a(context, 20.0f));
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f82815e = paint3;
        this.f82816f = 40.0f;
        m31485a();
    }

    /* renamed from: a */
    private final void m31485a() {
        this.f82814d.setColor(cc2.m35263a((int) SupportMenu.CATEGORY_MASK, this.f82816f));
        this.f82813c.setColor(cc2.m35263a(-1, this.f82816f));
        this.f82815e.setColor(cc2.m35263a((int) SupportMenu.CATEGORY_MASK, this.f82816f));
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = 2;
        float f2 = this.f82811a / f;
        canvas.drawCircle(f2, f2, f2, this.f82813c);
        canvas.drawCircle(f2, f2, f2 - (this.f82812b / f), this.f82814d);
        float f3 = this.f82811a / f;
        canvas.drawText("!", f3, f3 - ((this.f82815e.ascent() + this.f82815e.descent()) / f), this.f82815e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = (int) this.f82811a;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        float f;
        super.setSelected(z);
        if (z) {
            f = 0.0f;
        } else {
            f = 40.0f;
        }
        this.f82816f = f;
        m31485a();
        invalidate();
    }
}
