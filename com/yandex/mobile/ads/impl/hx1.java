package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hx1 extends TextView {
    @NotNull

    /* renamed from: a */
    private Rect f80231a;
    @NotNull

    /* renamed from: b */
    private Paint f80232b;

    /* renamed from: c */
    private int f80233c;

    /* renamed from: d */
    private int f80234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80231a = new Rect();
        this.f80232b = new Paint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f80233c = cc2.m35261a(context2, 1.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f80234d = cc2.m35261a(context3, 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int m35263a = cc2.m35263a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f80232b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f80233c);
        paint.setColor(m35263a);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i = 0; i < lineCount; i++) {
            int lineBounds = getLineBounds(i, this.f80231a);
            int lineStart = layout.getLineStart(i);
            int lineEnd = layout.getLineEnd(i);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd - 1) + (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal);
            float f = lineBounds + this.f80234d;
            canvas.drawLine(primaryHorizontal, f, primaryHorizontal2, f, paint);
        }
        super.onDraw(canvas);
    }
}
