package com.p551my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: com.my.target.p9 */
/* loaded from: classes7.dex */
public class C26012p9 extends View {

    /* renamed from: a */
    public static final Paint f67553a;

    /* renamed from: b */
    public static final Path f67554b;

    static {
        Paint paint = new Paint();
        f67553a = paint;
        f67554b = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    public C26012p9(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static Path m43197a(float f) {
        Path path = f67554b;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f2 = 0.45f * f;
        double d = f;
        float f3 = f * 2.0f;
        path.moveTo((float) ((Math.sin(0.0d) * d) + d), f3 - ((float) ((Math.cos(0.0d) * d) + d)));
        double d2 = f2;
        path.lineTo((float) ((Math.sin(0.6283185307179586d) * d2) + d), f3 - ((float) ((Math.cos(0.6283185307179586d) * d2) + d)));
        for (int i = 1; i < 5; i++) {
            Path path2 = f67554b;
            double d3 = i * 1.2566370614359172d;
            path2.lineTo((float) ((Math.sin(d3) * d) + d), f3 - ((float) ((Math.cos(d3) * d) + d)));
            double d4 = d3 + 0.6283185307179586d;
            path2.lineTo((float) ((Math.sin(d4) * d2) + d), f3 - ((float) ((Math.cos(d4) * d2) + d)));
        }
        Path path3 = f67554b;
        path3.close();
        return path3;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (measuredHeight == 0.0f) {
            return;
        }
        canvas.drawPath(m43197a(measuredHeight), f67553a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        setMeasuredDimension(min, min);
    }

    public void setColor(int i) {
        f67553a.setColor(i);
        invalidate();
    }
}
