package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.TypedValue;
import androidx.core.view.ViewCompat;
import be.MathJVM;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z10 {
    @NotNull

    /* renamed from: a */
    private final C32027zz f88659a = new C32027zz();

    @NotNull
    /* renamed from: a */
    public final LayerDrawable m26480a(@NotNull Context context, int i, int i2) {
        int m103791d;
        int m103791d2;
        int m103791d3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88659a.getClass();
        int m25947a = C32027zz.m25947a(context, 6.0f);
        this.f88659a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d = MathJVM.m103791d(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        this.f88659a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d2 = MathJVM.m103791d(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f88659a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d3 = MathJVM.m103791d(TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
        int i3 = ((i2 + 1) * m103791d) + (m25947a * i2);
        float f = m103791d3;
        RectF rectF = new RectF(0.0f, 0.0f, i3, f);
        float[] fArr = new float[8];
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
        shapeDrawable.setIntrinsicWidth(i3);
        shapeDrawable.setIntrinsicHeight(m103791d3);
        shapeDrawable.getPaint().setColor(ViewCompat.MEASURED_STATE_MASK);
        shapeDrawable.setAlpha(102);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i2];
        for (int i6 = 0; i6 < i2; i6++) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.setIntrinsicHeight(m25947a);
            shapeDrawable2.setIntrinsicWidth(m25947a);
            shapeDrawable2.getPaint().setColor(-1);
            if (i6 != i) {
                shapeDrawable2.setAlpha(102);
            }
            Unit unit = Unit.f99208a;
            shapeDrawableArr[i6] = shapeDrawable2;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.m17015a(shapeDrawable);
        spreadBuilder.m17014b(shapeDrawableArr);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) spreadBuilder.m17012d(new ShapeDrawable[spreadBuilder.m17013c()]));
        while (i4 < i2) {
            int i7 = m103791d + m25947a;
            int i8 = i4 + 1;
            layerDrawable.setLayerInset(i8, (i7 * i4) + m103791d, m103791d2, i3 - (i7 * i8), m103791d2);
            i4 = i8;
        }
        return layerDrawable;
    }
}
