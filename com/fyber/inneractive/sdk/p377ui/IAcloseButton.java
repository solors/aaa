package com.fyber.inneractive.sdk.p377ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.AbstractC15459m;

/* renamed from: com.fyber.inneractive.sdk.ui.IAcloseButton */
/* loaded from: classes4.dex */
public class IAcloseButton extends View {

    /* renamed from: a */
    public final Paint f30521a;

    /* renamed from: b */
    public final Path f30522b;

    public IAcloseButton(Context context, int i) {
        super(context);
        int m76491a = AbstractC15459m.m76491a(10);
        int i2 = ((i - (m76491a * 2)) / 4) + m76491a;
        Point point = new Point(i2, i2);
        int i3 = i - i2;
        Point point2 = new Point(i2, i3);
        Point point3 = new Point(i3, i3);
        Point point4 = new Point(i3, i2);
        Path path = new Path();
        this.f30522b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point.x, point.y);
        path.lineTo(point3.x, point3.y);
        path.moveTo(point2.x, point2.y);
        path.lineTo(point4.x, point4.y);
        path.close();
        Paint paint = new Paint(1);
        this.f30521a = paint;
        paint.setStrokeWidth(AbstractC15459m.m76491a(2));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1436657061);
        gradientDrawable.setStroke(AbstractC15459m.m76491a(2), -1);
        AbstractC15459m.m76486a(this, gradientDrawable);
        setPadding(m76491a, m76491a, m76491a, m76491a);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f30522b, this.f30521a);
    }
}
