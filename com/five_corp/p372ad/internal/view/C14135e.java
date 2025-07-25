package com.five_corp.p372ad.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.five_corp.p372ad.internal.layouter.C13831i;
import com.five_corp.p372ad.internal.layouter.InterfaceC13834l;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.p373ad.custom_layout.C13648i;

/* renamed from: com.five_corp.ad.internal.view.e */
/* loaded from: classes4.dex */
public final class C14135e extends View implements InterfaceC13834l {

    /* renamed from: a */
    public final Paint f26788a;

    /* renamed from: b */
    public final Paint f26789b;

    /* renamed from: c */
    public final Paint f26790c;

    /* renamed from: d */
    public float f26791d;

    /* renamed from: e */
    public RectF f26792e;

    /* renamed from: f */
    public final C13836a f26793f;

    public C14135e(Context context, C13648i c13648i, C13836a c13836a) {
        super(context);
        this.f26793f = c13836a;
        Paint paint = new Paint();
        this.f26788a = paint;
        paint.setColor(AbstractC14130I.m78062a(c13648i.f25315a));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f26789b = paint2;
        paint2.setColor(AbstractC14130I.m78062a(c13648i.f25317c));
        paint2.setStyle(style);
        paint2.setStrokeWidth(5.0f);
        Paint paint3 = new Paint();
        this.f26790c = paint3;
        paint3.setColor(AbstractC14130I.m78062a(c13648i.f25316b));
        this.f26792e = new RectF(5.0f, 5.0f, getWidth() - 5.0f, getHeight() - 5.0f);
        this.f26791d = 0.0f;
    }

    @Override // com.five_corp.p372ad.internal.layouter.InterfaceC13834l
    /* renamed from: a */
    public final void mo78061a(C13831i c13831i) {
        this.f26791d = c13831i.f25825d;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f26792e, this.f26790c);
        canvas.drawArc(this.f26792e, 270.0f, -(360.0f - (this.f26791d * 360.0f)), false, this.f26788a);
        canvas.drawArc(this.f26792e, -90.0f, this.f26791d * 360.0f, false, this.f26789b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.f26792e = new RectF(5.0f, 5.0f, i - 5.0f, i2 - 5.0f);
            invalidate();
        } catch (Throwable th) {
            this.f26793f.m78269a(th);
        }
    }
}
