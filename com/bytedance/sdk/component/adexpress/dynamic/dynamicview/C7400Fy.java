package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Fy */
/* loaded from: classes3.dex */
public class C7400Fy extends Drawable {

    /* renamed from: IL */
    private int f16021IL;

    /* renamed from: bX */
    private int f16022bX;

    /* renamed from: bg */
    private Paint f16023bg;
    private RectF eqN;

    public C7400Fy(int i, int i2) {
        this.f16022bX = i;
        this.f16021IL = i2;
        Paint paint = new Paint();
        this.f16023bg = paint;
        paint.setColor(0);
        this.f16023bg.setAntiAlias(true);
        this.f16023bg.setShadowLayer(i2, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.f16023bg.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.eqN;
        int i = this.f16022bX;
        canvas.drawRoundRect(rectF, i, i, this.f16023bg);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f16023bg.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f16021IL;
        this.eqN = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f16023bg.setColorFilter(colorFilter);
    }
}
